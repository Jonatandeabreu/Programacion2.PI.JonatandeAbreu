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
public class Guias {
    
    private String nick;
    private String contra;
    private String Nombre;
    private String Direccion;
    private int TLF;
    private String FechaI;
    private String Tareag;

    public String getTareag() {
        return Tareag;
    }

    public void setTareag(String Tareag) {
        this.Tareag = Tareag;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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
        Vector lista = mostrar();
        Guias obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Guias) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public static int VerificarG(String user, String contra) {
        Vector lista = mostrar();
        Guias obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Guias) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(user) && obj.getContra().equalsIgnoreCase(contra)) {
                return i;
            }
        }
        return -1;
    }

    public void setFechaI(String FechaI) {
        this.FechaI = FechaI;
    }

    public static Vector mostrar() {
        return Listadeusuarios.mostrarg();
    }
    
    @Override
    public String toString(){
        return nick+"\n"+contra+"\n"+Nombre+"\n"+Direccion+"\n"+TLF+"\n"+FechaI+"\n"+Tareag+"\n";
    }
    
}
