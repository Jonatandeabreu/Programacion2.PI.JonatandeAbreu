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
public class Usuarios {
    public String nick;
    public String contra;
    public String Nombre;
    public String Direccion;
    public int TLF;
    public String FechaI;
    public String Tarea;

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

    public void setFechaI(String FechaI) {
        this.FechaI = FechaI;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }
    
   
    public static int Verificaradmin(String user,String contra){
        if(user.equals("Admin") && contra.equals("admin")){
            return 1;
        }
       return -1;
    }
    
    @Override
    public String toString(){
        return nick+"\n"+contra+"\n"+Nombre+"\n"+Direccion+"\n"+TLF+"\n"+FechaI+"\n"+Tarea+"\n";
    }
    
}
