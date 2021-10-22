package estruturais.proxy.com_padrao;

public class Conta {

    private String codigo;

    public Conta(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
