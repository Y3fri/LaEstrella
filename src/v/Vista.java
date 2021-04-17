
package v;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Vista extends JFrame{
public JPanel p;
public JLabel l,l1;
public JButton b;
public JTextArea t;
public JTextField f;
public JComboBox c;
String [] carro ={"Automovil","Camioneta"};
    public Vista(){
        this.setSize(500, 400);
        setTitle("La Estrella");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        p =new JPanel();
        p.setLayout(null);
         this.getContentPane().add(p);
         l =new JLabel("LAVADO DE AUTOS LA ESTRELLA",SwingConstants.CENTER);
         l.setBounds(10, 10, 460 , 15);
         l.setOpaque(true);
         l.setBackground(Color.BLACK);
         l.setForeground(Color.WHITE);
         p.add(l);
         t = new JTextArea("Los servicios ofertados son:\n"+"1). Lavado Básico:depende del tipo de auto existe una tarifa. Incluye\nlavado exterior, lavado interior y aspirada\n" +
                 "2). Lavado especial:incluye  lavado  básico  más  polichado  con  \nmaquina  y  las mejores ceras de calidad \n" +
                 "3). Desinfección básica: con maquina generadora de ozono.\n" +
                 "4). Desinfección avanzada: además de la desinfección básica, limpieza \ninterior con máquina de vapor.\n" +
                 "5). Combos\n"+"      Combo 1 Lavado, polichado y desengrasante por debajo\n      Combo 2: combo 1 + grafitado de chasis\n      Combo 3: combo 2 + tapicería\n      (desmontado de sillas para un aseo más profundo)");
         t.setBounds(20, 40, 420, 218);
         p.add(t);
         l1 =new JLabel("Escoja del 1 al 5 el servicio que desea");
         l1.setBounds(30,260 , 300 , 15);
         l1.setBackground(Color.WHITE);
         l1.setForeground(Color.BLACK);
         p.add(l1);
         f= new JTextField();
         f.setBounds(30, 280, 100, 25);
         p.add(f);
         c=new JComboBox(carro);
         c.setBounds(300, 280, 100, 25);
         p.add(c);
         b=new JButton("Valor");
         b.setBounds(190, 310, 100, 40);
         p.add(b);
       
    }
}
