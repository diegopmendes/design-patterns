package criacionais.singleton.sem_padrao;

public final class Usuario {
    public String nome;

    public Usuario(String nome) {
        try {
            Thread.sleep(2000); //so para mostrar que na primeira vez vai demorar 2 segundos para criar um usuario
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}