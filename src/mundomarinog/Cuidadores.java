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
public class Cuidadores {
    private String Nick;
    private String Contra;
    private String Nombre;
    private String Direccion;
    private int TLF;
    private String FechaI;
    private String Tarea;

    public String getTareag() {
        return Tarea;
    }

    public void setTareag(String Tareac) {
        this.Tarea = Tareac;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        this.Nick = nick;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String contra) {
        this.Contra = contra;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTLF() {
        return TLF;
    }

    public void setTLF(int TLF) {
        this.TLF = TLF;
    }

    public String getFechaI() {
        return FechaI;
    }

    public static int Verificarnewuser(String usuario) {
        Vector lista = mostrarc();
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
        Vector lista = mostrarc();
        Cuidadores obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Cuidadores) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(user) && obj.getContra().equalsIgnoreCase(contra)) {
                return i;
            }
        }
        return -1;
    }

    public void setFechaI(String FechaI) {
        this.FechaI = FechaI;
    }

    public static Vector mostrarc() {
        return Listadeusuarios.mostrar();
    }
    
    public static int Verificaradmin(String user,String contra){
        if(user.equals("Admin") && contra.equals("admin")){
            return 1;
        }
       return -1;
    }
   
    
    @Override
    public String toString(){
        return Nick+"\n"+Contra+"\n"+Nombre+"\n"+Direccion+"\n"+TLF+"\n"+FechaI+"\n"+Tarea+"\n";
    }
}
