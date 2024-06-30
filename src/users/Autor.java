package users;


import java.util.Scanner;
import java.util.ArrayList;
public class Autor extends Usuario {
    protected int id;
    protected String institucion;
    protected String campoDeInvestgacion;
    protected ArrayList<Articulo> articulo=new ArrayList<Articulo>();
    
    //Constructor
    public Autor(String nombre, String apellido, String correo, Rol rol, String especialidad, int id, String institucion, String campoDeInvestigacion, ArrayList<Articulo> articulo){
        super(nombre,apellido,correo,rol,null, null);
        this.id=id;
        this.institucion=institucion;
        this.campoDeInvestgacion=campoDeInvestigacion;
        this.articulo=articulo;
    }
    
    //Getters
    public int getId(){return this.id;}
    public String getInstitucion(){return this.institucion;}
    public String getCampoDeInvestigacion(){return this.campoDeInvestgacion;}
    public ArrayList<Articulo> getArticulo(){return this.articulo;}

    //Setters
    public void setId(int id){this.id=id;}
    public void setInstitucion(String institucion){this.institucion=institucion;}
    public void setCampoDeInvestigacion(String campoDeInvestgacion){this.campoDeInvestgacion=campoDeInvestgacion;}
    public void setArticulo(ArrayList<Articulo> articulo){this.articulo=articulo;}

    public void someterArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Escriba su apellido");
        String apellido = sc.nextLine();
        System.out.println("Escriba su correo");
        String correo = sc.nextLine();
        System.out.println("");
    }


}
