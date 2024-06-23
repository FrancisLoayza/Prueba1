import java.util.ArrayList;
import users.*;
public class Sistema {
    private ArrayList<Usuario> listaUsuario=new ArrayList<Usuario>();
    private ArrayList<Articulo> listaArticulo=new ArrayList<Articulo>();
    
    //Getter
    public ArrayList<Usuario> getListaUsuarios(){
        return this.listaUsuario;
    }
    public ArrayList<Articulo> getListaArticulo(){
        return this.listaArticulo;
    }

    //Setter
    public void setListaUsuario(ArrayList<Usuario> listaUsuarios){
        this.listaUsuario=listaUsuarios;
    }
    public void setListaArticulo(ArrayList<Articulo> listaArticulos){
        this.listaArticulo=listaArticulos;
    }

    //Metodos
    public void AgergarListaUsuario(Usuario user){
        this.getListaUsuarios().add(user);
    }
    public void AgergarListaArticulo(Articulo articulo){
        this.getListaArticulo().add(articulo);
    }
}
