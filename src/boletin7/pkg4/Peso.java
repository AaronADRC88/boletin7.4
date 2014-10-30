
package boletin7.pkg4;

import javax.swing.JOptionPane;


public class Peso {
 public String nome1;
 public String nome2;  
 public double peso1;
 public double peso2;
 
 public Peso(){
 }
 public Peso(String n1,String n2,double p1,double p2){
     n1=this.nome1;
     n2=this.nome2;
     p1=this.peso1;
     p2=this.peso2;
 }
 public String pedirNome(){
     String resposta=JOptionPane.showInputDialog("introduce nome");
     return resposta;
 }
 public double pedirPeso(){
     String resposta=JOptionPane.showInputDialog("introduce peso");
     double b= Double.parseDouble(resposta);
     return b;
}
 public void comparacion(String nome1, double peso1, String nome2 , double peso2){
     if(peso1>peso2){
         JOptionPane.showMessageDialog(null, "pesa máis"+nome1+"diferencia de peso = "+(peso1-peso2));
     }
     else{
         JOptionPane.showMessageDialog(null, "pesa máis"+nome2+"diferencia de peso ="+(peso2-peso1));
     }
         
 }
}
