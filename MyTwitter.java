import java.util.Vector;

public class MyTwitter implements ITwitter {
    IRepositorioUsuario repositorio;

    public MyTwitter(){
        repositorio = new IRepositorioUsuario();
    }

    public void criarPerfil(String usuario){
        Perfil novoPerfil = new Perfil(usuario);
        repositorio.cadastrar(novoPerfil);
    }

    public void cancelarPerfil(String usuario){
        repositorio.buscar(usuario).setAtivo(false);
    }

    public void tweetar(String usuario, String mensagem){
        Tweet tweet = new Tweet(usuario, mensagem);
        repositorio.buscar(usuario).addTweet(tweet);
        for(Perfil seguidor : repositorio.buscar(usuario).getSeguidores()){
            seguidor.addTweet(tweet);
        }
        System.out.println(usuario+" tweetou: "+mensagem);
    }

    public Vector<Tweet> timeline(String usuario){
        for(Tweet tweet : repositorio.buscar(usuario).getTimeline()){
            System.out.println(tweet.getUsuario()+" tweetou: "+tweet.getMensagem());
        }
        return repositorio.buscar(usuario).getTimeline();
    }

    public Vector<Tweet> tweets(String usuario){
        Vector<Tweet> tweets = new Vector<Tweet>();
        for(Tweet tweet : repositorio.buscar(usuario).getTimeline()){
            if(tweet.getUsuario().equals(usuario)){
                tweets.add(tweet);
                System.out.println(usuario+" tweetou: "+tweet.getMensagem());
            }
        }
        return tweets;
    }

    public void seguir(String seguidor, String seguido){
        repositorio.buscar(seguidor).addSeguido(repositorio.buscar(seguido));
        repositorio.buscar(seguido).addSeguidor(repositorio.buscar(seguidor));
        System.out.println(seguidor+" começou a seguir "+ seguido);
    }

    public int numeroSeguidores(String usuario){
        int numSeguidores = repositorio.buscar(usuario).getSeguidores().size();
        System.out.println(usuario+" tem "+numSeguidores+ " seguidores.");
        return numSeguidores;
    }

    public Vector<Perfil> seguidores(String usuario){
        System.out.print("Os seguidores de "+usuario+" são: ");
        for(Perfil seguidor : repositorio.buscar(usuario).getSeguidores()){
            System.out.print(seguidor.getUsuario()+" ");
        }
        System.out.print("\n");
        return repositorio.buscar(usuario).getSeguidores();
    }

    public Vector<Perfil> seguidos(String usuario){
        System.out.print(usuario+" está seguindo: ");
        for(Perfil seguidor : repositorio.buscar(usuario).getSeguidos()){
            System.out.print(seguidor.getUsuario()+" ");
        }
        System.out.print("\n");
        return repositorio.buscar(usuario).getSeguidos();
    }
}
