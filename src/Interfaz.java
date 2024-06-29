import users.*;
import java.util.Scanner;

import users.Revisor;
import users.Rol;


public class Interfaz {
    
    public static void inicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1: Someter Articulo \n "+"2: Iniciar Secion");
        String tipo = sc.nextLine().toUpperCase();
        if(tipo.equals("2")){
            Usuario user2 = new Usuario();
            user2.iniciarSecion();
            

        }

        
        
    }
    
    
}
