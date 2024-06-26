package users;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Editor extends Usuario {
    protected String especialidad;
    protected String nombreJournal;
    protected String userName;
    protected String contrasenia;

    //Constructor
    public Editor(String nombre, String apellido, String correo, Rol rol, String especialidad, String nombreJournal, String userName, String contrasenia){
        super(nombre, apellido, correo,rol,userName,contrasenia);
        this.especialidad=especialidad;
        this.nombreJournal=nombreJournal;
        
    }
    

    //Getters
    public String getEspecialidad(){ return this.especialidad;}
    public String getNombreJournal(){ return this.nombreJournal;}
    public String getUserName(){ return this.userName;}
    public String getContrasenia(){ return this.contrasenia;}

    //Setters
    public void setEspecialidad(String especialidad){this.especialidad=especialidad;}
    public void setNombreJournal(String nombreJournal){this.nombreJournal=nombreJournal;}
    public void setUserName(String userName){this.userName=userName;}
    public void setContrasenia(String contrasenia){this.contrasenia=contrasenia;}

    //Metodos
    public void guardarUsuario(){
        
    }
    
}
