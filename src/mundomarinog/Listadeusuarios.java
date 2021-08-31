/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundomarinog;

import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Listadeusuarios {
     private static Vector<Cuidadores> datos = new Vector<Cuidadores>();
    
    public static void agregar(Cuidadores obj){
        datos.addElement(obj);
    }
    
    public static Vector mostrarcuidador(){
        return datos;
    }
    
    
    private static Vector<Guias> datosg = new Vector<Guias>();
    
    public static void agregarguia(Guias obj){
        datosg.addElement(obj);
    }
    
    public static Vector mostrarguia(){
        return datosg;
    }
    
}
