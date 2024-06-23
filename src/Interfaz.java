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
                /*Revisor r1=new Revisor("Francis", "Loayza", "loayzafrancis@gmail.com",Rol.valueOf(tipo), tipo, 0, tipo, tipo);*/
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
