public class Main {
    public static void main(String[] args){
        MyTwitter twitter = new MyTwitter();

        twitter.criarPerfil("Joab");
        twitter.criarPerfil("Joaquim");
        twitter.criarPerfil("Rodrigo");
        twitter.criarPerfil("Vitor");
        twitter.criarPerfil("Guilherme");
        twitter.criarPerfil("Mateus");

        twitter.seguir("Mateus", "Rodrigo");
        twitter.seguir("Mateus", "Guilherme");
        twitter.seguir("Guilherme", "Mateus");
        twitter.seguir("Vitor", "Joaquim");
        twitter.seguir("Vitor", "Rodrigo");
        twitter.seguir("Guilherme", "Vitor");
        twitter.seguir("Guilherme", "Rodrigo");

        twitter.tweetar("Rodrigo", "Olá a todos do meu twitter!!!");
        twitter.timeline("Guilherme");
        twitter.timeline("Vitor");
        twitter.timeline("Mateus");

        twitter.tweetar("Rodrigo", "Aulas presenciais voltando...");

        twitter.tweets("Rodrigo");

        twitter.seguir("Rodrigo", "Guilherme");
        twitter.seguir("Rodrigo", "Vitor");

        twitter.numeroSeguidores("Rodrigo");
        twitter.seguidores("Rodrigo");
        twitter.seguidos("Rodrigo");



        // twitter.criarPerfil("Edu");
        // twitter.criarPerfil("Maria");
        // twitter.criarPerfil("Pedro");
        // twitter.criarPerfil("ZueiraNeverEnds");

        // twitter.seguir("Edu", "Pedro");

        // twitter.tweetar("Pedro", "Presidenciaveis incompetentes!!!");

        // twitter.timeline("Edu");

        // twitter.seguir("Edu", "ZueiraNeverEnds");

        // twitter.seguir("Maria", "Pedro");

        // twitter.seguir("Pedro", "ZueiraNeverEnds");

        // twitter.seguir("Maria", "Edu");

        // twitter.numeroSeguidores("Edu");
        // twitter.seguidores("Edu");
        // twitter.seguidos("Edu");

        // twitter.tweetar("Edu", "Cidadãos participem da política!!!");

        // twitter.tweetar("Edu", "O Brasil precisa de pessoas competentes no governo!!!");

        // twitter.tweets("Edu");

    }
}