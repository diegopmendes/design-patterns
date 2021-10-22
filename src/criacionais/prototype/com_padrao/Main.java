package criacionais.prototype.com_padrao;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(10, "Diego"); // quero criar um objeto clone com os mesmo atributos
        System.out.println(usuario);

        Usuario usuarioClone = usuario.clone(); // quero criar um objeto clone com os mesmo atributos
        System.out.println(usuarioClone);
    }
}
