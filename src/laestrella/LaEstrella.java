
package laestrella;

import c.Controlador;
import m.Modelo;
import v.Vista;
        
public class LaEstrella {

    public static void main(String[] args) {
        Modelo modelo =new Modelo();
        Vista vista =new Vista();
        Controlador controlador =new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
    
}
