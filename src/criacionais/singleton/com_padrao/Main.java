package criacionais.singleton.com_padrao;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = Usuario.getInstance("Diego");
        System.out.println(usuario.getNome()); //lento a primeira vez

        Usuario usuarioNovamente = Usuario.getInstance("Diego");
        System.out.println(usuario.getNome()); //rapido porque reaproveita a instancia

        Usuario usuarioNovamente2 = Usuario.getInstance("Diego");
        System.out.println(usuario.getNome()); //rapido porque reaproveita a instancia
    }
}
