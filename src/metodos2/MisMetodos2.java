
package metodos2;

import java.util.Scanner;

public class MisMetodos2 {
public  void main(String[] args) {
        // TODO code application logic here
   
    Scanner entrada = new Scanner(System.in);    
    String nombre;
    
    System.out.println("¿Cual es tu Nombre? ");
    nombre = entrada.nextLine();
    mensaje(nombre);
        
        
        
    imprimir(28, 12);
    imprimir(67, 6);
    imprimir(84, 16);
    imprimir(57, 23);
    imprimir(92, 12);
     
    

   
    int resultado=sumar(1, 2);
    System.out.println(
            concatenar("El resultado es", "" +resultado));
    
    int resultado2= sumar(sumar(1, 2), 7);

 boolean mayor= comprobar(resultado2);
   
if(comprobar(resultado2))
        System.out.println("Es mayor");
    else
        System.out.println("No es mayor");
}
    
 public  void imprimir(int n1, int n2){
     int resultado=n1-n2;
     System.out.println("Resultado: "+ resultado);
 }

   
  public  int sumar(int n1,int n2) {
  return n1 + n2;
  }       
          
          
public void mensaje(String nombre){  
     System.out.println("Hola " + nombre + " Bienvenido");
 
 }
 
 public  boolean comprobar(int numero){
        return numero > 10;

 }
 public  String concatenar (String cadena1, String cadena2){
        return cadena1.concat(" ".concat(cadena2));

}
public static  String separar(String cadena1, String cadena2) {
    
        return cadena1.concat(" ").concat(cadena2);
}
public  void imprimir(int a){
System.out.println("Ingresaste un Entero");

}
public  void imprimir(double b){
System.out.println("Ingresaste un Float");

}

public  int sumar2(int a, int b){
return a+b;
}
    private  void imprimir(double n1, double n2) {
      double resultado=n1-n2;
     System.out.println("Resultado: "+ resultado);  
    } 

}