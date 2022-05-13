package Sea.Com;

import static Sea.Com.Banco.AGENCIA_PADRAO;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 12000000;
    protected int agencia;
    protected int numero;
    protected double saldo;

    private Clientes cliente;

    public Conta(Clientes cliente) {
       this.agencia = AGENCIA_PADRAO;
       this.numero = SEQUENCIAL++;
       this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimeInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println("Cliente: " + cliente.getClienteNome() + " " + cliente.getClienteSobrenome());
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}
