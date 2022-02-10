import java.util.Vector;

public class Perfil {
    String usuario;
    Vector<Perfil> seguidos;
    Vector<Perfil> seguidores;
    Vector<Tweet> timeline;
    boolean ativo;

    public Perfil(){

    }

    public Perfil(String usuario){
        this.usuario = usuario;
        seguidos = new Vector<Perfil>();
        seguidores = new Vector<Perfil>();
        timeline = new Vector<Tweet>();
        ativo = true;
        System.out.println("Perfil de "+usuario+" criado");
    }

    public void addSeguido(Perfil usuario){
        seguidos.add(usuario);
    }

    public void addSeguidor(Perfil usuario){
        seguidores.add(usuario);
    }

    public void addTweet(Tweet tweet){
        timeline.add(tweet);
    }

    public void setUsuario(String usuario){

    }

    public String getUsuario(){
        return usuario;
    }

    public Vector<Perfil> getSeguidos(){
        return seguidos;
    }

    public Vector<Perfil> getSeguidores(){
        return seguidores;
    }

    public Vector<Tweet> getTimeline(){
        return timeline;
    }

    public void setAtivo(boolean valor){
        this.ativo = valor;
    }

    public boolean isAtivo(){
        return ativo;
    }

}
