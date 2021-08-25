/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundomarinog;

/**
 *
 * @author Usuario
 */
public class Especies {
   private String Nombre;
   private String NombreC;
   private String Descripcion;
   private String Habitat; 
   
public Especies (String n,String nc,String d, String h){
  Nombre = n;
  NombreC = nc;
  Descripcion = d;
  Habitat = h;
}

   @Override
  public String toString(){
    return Nombre+"\n\n"+"Nombre cientifico: "+NombreC+"\n\n"+"Descripsion: "+Descripcion+"\n\n"+"Habitat: "+Habitat;  
  }
 
    
}
