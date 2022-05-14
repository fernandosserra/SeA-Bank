package Sea.Com;

public class Clientes {
    private static int CLIENTE_ID = 1;
    public int clienteId;
    public String clienteNome;
    public String clienteSobrenome;

    public Clientes(){
        this.clienteId = CLIENTE_ID++;
    }

    public int getClienteId() {
        return clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteSobrenome() {
        return clienteSobrenome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public void setClienteSobrenome(String clienteSobrenome) {
        this.clienteSobrenome = clienteSobrenome;
    }
}
