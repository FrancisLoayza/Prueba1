package src;
import java.util.Scanner;

import users.Revisor;
import users.Rol;


public class Interfaz {
    
    public void inicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese A si es Autor, R si es Revisor o E si es editor");
        String tipo = sc.nextLine().toUpperCase();

        switch (tipo) {
            case "R":
                break;
            
            case "A":
                break;

            case "E":

                break;
        
            default:
                break;
        }

        
        
    }
    
    
}
