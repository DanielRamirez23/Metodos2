
package metodos2;


import java.util.Scanner;



public class Metodos2 {

    public static void main(String[] args) {
        // TODO code application logic here

   
    Scanner entrada = new Scanner(System.in);    
    String nombre;
    
    System.out.println("¿Cual es tu Nombre? ");
    nombre = entrada.nextLine();
    mensaje(nombre);
        
        
        
    imprimir(28.8, 12.9);
    imprimir(67, 6);
    imprimir(84.5, 16.7);
    imprimir(57, 23);
    imprimir(92.90, 12.45);
    imprimir(50, 60); 
    imprimir(15, 16.5);

   
    int resultado=sumar(1, 10);
    System.out.println(
            concatenar("El resultado es", "" +resultado));
    
    int resultado2= sumar(sumar(1, 2), 7);

 boolean mayor= comprobar(resultado2
 );
   
if(comprobar(resultado))
        System.out.println("Es mayor a 10");
    else
        System.out.println("No es mayor a a 10");

    
  MisMetodos2 tn = new  MisMetodos2 ();
   tn.imprimir(5);   
  
  
    }
    
    
 public static void imprimir(int n1, int n2){
     int resultado=n1-n2;
     if (comprobar(resultado))
     System.out.println("Es mayor a 10");
     else
        System.out.println("No es mayor a a 10");
     System.out.println("Resultado: "+ resultado);
 }

    
    
  public static int sumar(int n1,int n2) {
  return n1 + n2;
  }       
          
          
public static void mensaje(String nombre){  
     System.out.println("¡¡Hola " + nombre + " Bienvenido!!");
 
 }
 
 public static boolean comprobar(int resultado){
        return resultado > 10;

 }
 public static String concatenar (String cadena1, String cadena2){
        return cadena1.concat(" ".concat(cadena2));

}
public static  String separar(String cadena1, String cadena2) {
    
        return cadena1.concat(" ").concat(cadena2);
}

    private static void imprimir(double n1, double n2) {
      double resultado=n1-n2;
     System.out.println("Resultado: "+ resultado);  
    }
 

}
    


        
