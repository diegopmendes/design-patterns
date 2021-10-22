package criacionais.prototype.com_padrao;

public class Usuario implements Cloneable { // interface

    private int id;
    private String nome;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario clone() {
        try {
            Usuario usuarioClone = (Usuario) super.clone();
            return usuarioClone;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
