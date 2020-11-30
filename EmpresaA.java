
package javaapplication15;


public class EmpresaA {

   
   
    public static void main(String[] args) {
        
       Imprime imp = new Imprime();
        imp.imprime(15);
        
        for (int i=0; i<10; i++){
            imp.imprime(i);
        }
        
    }
    
}
