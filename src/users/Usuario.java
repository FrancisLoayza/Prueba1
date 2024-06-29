package users;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected Rol rol;
    protected String usuario;
    protected String contrasena;


    //Constructor
    public Usuario(String nombre, String apellido, String correo, Rol rol, String usuario,String contrasena){
        this.nombre= nombre;
        this.apellido= apellido;
        this.correo= correo;
        this.rol = rol;
        this.usuario=usuario;
        this.contrasena=contrasena;

    }


    public Usuario(){

    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Metodo toString
    @Override
    public String toString(){
        return this.nombre+" "+this.apellido+" "+this.correo+" "+this.rol;
    }


    public ArrayList<Usuario> cargarUsuarios(){
         ArrayList<Usuario> usuarios = new ArrayList<>();

        
        try (BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(" ");
                String nombre=datos[0];
                String apellido= datos[1];
                String correo = datos[2];
                String rolr = datos[3];
                String usua=datos[4];
                String cont=datos[5];

                Rol rol = Rol.valueOf(rolr);

                Usuario usuario= new Usuario(nombre, apellido, correo, rol, usua, cont);
                usuarios.add(usuario);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuarios;
    }


    

    public Rol iniciarSecion(){
        
        boolean acceso = false;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su usuario: ");
            String usu = sc.nextLine();
            System.out.println("Ingrese su contrasena:");
            String con = sc.nextLine();

            Usuario admin = new Usuario();
            List<Usuario> listaDeUsuarios= new ArrayList<>();
            listaDeUsuarios=admin.cargarUsuarios();
            for(Usuario datos :listaDeUsuarios){
                //System.out.println(datos.usuario);
                //System.out.println(datos.contrasena);
                if((datos.usuario).equals(usu) && datos.contrasena.equals(con)){
                    System.out.println("ent2rada");
                    acceso=true;
                    return datos.rol;
                }                    
                

            }
            System.out.println("Los datos ingresados son incorrectos, vuelva a ingresar");





        }while(acceso!=true);

        return Rol.R;

    }



}
