/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;


import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import m.Modelo;
import v.Vista;

public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;
    private int servicio,combo;
    public Controlador(Modelo modelo, Vista vista){
        this.modelo= modelo;
        this.vista= vista;
        this.vista.b.addActionListener(this);
    }
    public void iniciarVista(){
        vista.setVisible(true);
    }
    public void actionPerformed(ActionEvent evento){
        if(vista.b== evento.getSource()){
            if(!"".equals(vista.f.getText())){
                    servicio=Integer.parseInt(vista.f.getText());
                    int op=vista.c.getSelectedIndex();
            if(op == 0){   
                try{
                OUTER:
            do {
            switch (servicio) {
                case 1:
                    modelo.Auto1();
                    break OUTER;
                case 2:
                    modelo.Auto2();
                    break OUTER;
                case 3:
                    modelo.Auto3();
                    break OUTER;
                case 4:
                    modelo.Auto4();
                    break OUTER;
                case 5:
                     combo =Integer.parseInt(JOptionPane.showInputDialog("¿Que combo desea?\n1.\n2.\n3."));
                     do{
                     switch(combo){
                         case 1:
                             modelo.AutoC1();
                             break OUTER;
                         case 2:
                             modelo.AutoC2();
                             break OUTER;
                         case 3:
                             modelo.AutoC3();
                             break OUTER;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break OUTER;
                     }    
                     }while(combo>=1 || combo <=3);
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                    break OUTER; 
            }
        } while (servicio >= 1 || servicio <= 5);  
            }
      catch (HeadlessException | NumberFormatException errorMain) {
    JOptionPane.showMessageDialog(null,"Error en la digitación: ");
}
               }else if(op == 1){
                   try{
                    OUTER:
                   do {
            switch (servicio) {
                case 1:
                    modelo.camioneta1();
                    break OUTER;
                case 2:
                    modelo.camioneta2();
                    break OUTER;
                case 3:
                    modelo.camioneta3();
                    break OUTER;
                case 4:
                    modelo.camioneta4();
                    break OUTER;
                case 5:
                     combo =Integer.parseInt(JOptionPane.showInputDialog("¿Que combo desea?\n1.\n2.\n3."));
                     do{
                     switch(combo){
                         case 1:
                             modelo.camionetaC1();
                             break OUTER;
                         case 2:
                             modelo.camionetaC2();
                             break OUTER;
                         case 3:
                             modelo.camionetaC3();
                             break OUTER;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break OUTER;
                     }    
                     }while(combo >=1 || combo <=3);
                
                default:
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                    break OUTER; 
            }
        } while (servicio >= 1 || servicio <= 5);  
        } 
     catch (HeadlessException | NumberFormatException errorMain) {
    JOptionPane.showMessageDialog(null,"Error en la digitación: ");
}
               }
                }
        }
    }
}

        
        
    
