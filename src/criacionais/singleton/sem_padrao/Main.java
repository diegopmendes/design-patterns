package criacionais.singleton.sem_padrao;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Diego");
        System.out.println(usuario.getNome()); //lento a primeira vez

        Usuario usuarioNovamente = new Usuario("Diego");
        System.out.println(usuario.getNome()); //rapido porque reaproveita a instancia

        Usuario usuarioNovamente2 = new Usuario("Diego");
        System.out.println(usuario.getNome()); //rapido porque reaproveita a instancia
    }
}
