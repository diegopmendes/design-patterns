package criacionais.prototype.sem_padrao;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(10, "Diego"); // quero criar um objeto clone com os mesmo atributos
        System.out.println(usuario);
        Usuario usuarioClone = clone(usuario); // quero criar um objeto clone com os mesmo atributos
        System.out.println(usuarioClone);
    }

    //vou ter que percorrer todos os atributos, imagine uma classe de 30 fields :(
    private static Usuario clone(Usuario usuario) {
        return new Usuario(usuario.getId(), usuario.getNome());
    }
}
