package criacionais.singleton.com_padrao;

public final class Usuario {
    private static Usuario instance;
    public String nome;

    private Usuario(String nome) {
        try {
            Thread.sleep(2000); //so para mostrar que na primeira vez vai demorar 2 segundos para criar um usuario
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nome = nome;
    }

    public static Usuario getInstance(String nome) {
        if (instance == null) {
            instance = new Usuario(nome);
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }
}