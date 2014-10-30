
package boletin7.pkg4;

public class Boletin74 {

    public static void main(String[] args) {
      double peso1;
      double peso2;
      String nome1;
      String nome2;
      Peso obx=new Peso();
      nome1=obx.pedirNome();
      nome2=obx.pedirNome();
      peso1=obx.pedirPeso();
      peso2=obx.pedirPeso();
      obx.comparacion(nome1,peso1,nome2,peso2);
      
    }
    
}
