import java.util.Vector;

public class IRepositorioUsuario {
    Vector<Perfil> repositorio;

    public IRepositorioUsuario(){
        repositorio = new Vector<Perfil>();
    }

    public void cadastrar(Perfil usuario){
        repositorio.add(usuario);
    }

    public Perfil buscar(String usuario){
        for(Perfil perfil : repositorio){
            if(perfil.getUsuario().equals(usuario)){
                return perfil;
            }
        }
        return null;
    }
    public void atualizar(Perfil usuario){
    //faltando implementação
    }

}