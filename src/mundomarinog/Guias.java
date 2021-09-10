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
public class Guias extends Usuarios{
   
    private static Vector<Guias> datosg = new Vector<Guias>();
    
    public static void agregarguia(Guias obj){
        datosg.addElement(obj);
    }
    
    public static Vector mostrarguia(){
        return datosg;
    }
    
    public static int Verificarnewuser(String usuario) {
        Vector lista = mostrarguia();
        Guias obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Guias) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
         
        return -1;
    }
    
    public static int Verificar(String user, String contra) {
        Vector lista = mostrarguia();
        Guias obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Guias) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(user) && obj.getContra().equalsIgnoreCase(contra)) {
                return i;
            }
        }
        
        return -1;
    }
    
    
}
