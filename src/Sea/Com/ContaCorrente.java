package Sea.Com;

import static Sea.Com.Banco.NOME_BANCO;

public class ContaCorrente extends Conta {


    public ContaCorrente(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println(NOME_BANCO);
        System.out.println("==== EXTRATO CONTA CORRENTE ====");
        super.imprimeInfosComuns();
    }
}