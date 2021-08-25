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
public class Itinerarios {
   private String Nombrei;
   private int CI;
   private int Duracion;
   private int Longitud;
   private int Maxdevisitantes;
   private int NumEspecies;
   
public Itinerarios (String s,int ci,int d,int l,int m,int n){
  Nombrei = s;
  CI = ci;
  Duracion = d;
  Longitud = l;
  Maxdevisitantes = m;
  NumEspecies = n;
}

   @Override
public String toString(){
return Nombrei+"<p>"+"Codigo de Itinerario: "+CI+"<p>"+"Duracion del recorrido: "+Duracion+" min"+"<p>"+"Longitud: "+Longitud+" Metros"+"<p>"+"Maximo de visitantes: "+Maxdevisitantes+" Personas"+"<p>"+"Numero de especies: "+NumEspecies;
}
    
}
