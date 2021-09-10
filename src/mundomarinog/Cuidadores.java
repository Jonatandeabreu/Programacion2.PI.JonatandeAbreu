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
public class Cuidadores extends Usuarios{
    
    private static Vector<Cuidadores> datos = new Vector<Cuidadores>();
    
    public static void agregar(Cuidadores obj){
        datos.addElement(obj);
    }
    
    public static Vector mostrarcuidador(){
        return datos;
    }
    public static int Verificarnewuser(String usuario) {
        Vector lista = mostrarcuidador();
        Cuidadores obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Cuidadores) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
         
        return -1;
    }
    
    public static int Verificar(String user, String contra) {
        Vector lista = mostrarcuidador();
        Cuidadores obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Cuidadores) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(user) && obj.getContra().equalsIgnoreCase(contra)) {
                return i;
            }
        }
        return -1;
    }
    
}

