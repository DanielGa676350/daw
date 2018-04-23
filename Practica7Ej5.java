/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7ej5;
import java.util.*;
/**
 *
 * @author admin
 */
public class Practica7Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char dia,otra;
        int edad;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Anota día de la semana:");
            dia=sc.nextLine().charAt(0);
            if (esValidoDia(dia)==false)
                System.out.println("Día incorrecto");
        }while(esValidoDia(dia)==false);
        
        do{
            edad=0;
            if (dia=='M' || dia=='S' || dia=='D'){
                do{
                    System.out.println("Anota edad:");
                    edad=sc.nextInt();
                    if (edad<0)
                        System.out.println("Edad incorrecta");
                }while(edad<0);
            }
            
            double precio=calculaPrecio(edad,dia);
            System.out.println("Tiene que pagar:"+precio);
            System.out.println("Otra persona?");
            sc.nextLine();
            otra=sc.nextLine().charAt(0);
        }while(otra=='S');
    }
    
    static boolean esValidoDia(char d){
        if (d=='L' || d=='M' || d=='X' || d=='J' || d=='V' || d=='S' || d=='D')
            return true;
        return false;
    } 
    
    static double calculaPrecio(int edad,char dia){
        double precio=5;
        
        if (dia=='M' && edad>65){
            precio=precio/2;
        }
        else
            if (dia=='X'){
                precio=precio*0.8;
            }
            else
                if ((dia=='S' || dia=='D' )&& edad<18){
                    precio=precio*0.85;
                }        
        return precio;
    }
    
}
