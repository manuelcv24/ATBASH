/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciberseguridad;

import java.util.Scanner;


/**
 *
 * @author iluma
 */
public class CiberSeguridad {
       

    
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
      
      
       
       while (true){
       System.out.println("Bienvenido press 1 para continuar y 5 para salir");
       int  n = scan.nextInt();
        
        if (n ==1){
            cibersegurid();
            
        }
         if (n ==5){
            System.out.println("Gracias por participar......!!");
            break;
        }
        
        else{
            System.out.println("Vuelve a elegir");
             }
         
     
        }
               
     }

    private static void cibersegurid() {
        Scanner scan = new Scanner (System.in);
        
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reverso = "";
        
         for(int i = letras.length() -1; i > -1; i--)
        {
       
           reverso += letras.charAt(i);
        }
         
         System.out.println("Ingrese su palabra a cifrar");
            String   palabra = scan.nextLine();
              
              palabra = palabra.toUpperCase();
            
               String encryText ="";
              for(int i =0; i < palabra.length(); i++)
              {
              
              if(palabra.charAt(i) == (char)32)
              {
              encryText += " ";
              }else {
                         int count = 0;
                         
                                 for (int j =0; j < letras.length(); j++)
                                 {
                                         if(palabra.charAt(i) == letras.charAt(j))
                                         {
                         
                                            encryText += reverso.charAt(j);
                                            break;
                         
                                         }
                         
                         
                                }
                         
                   }
              }
              
              
              System.out.println("Su palabra cifrada es:  "  + encryText);
    }
}

                      
    
              
         
  
            
        
    
    



