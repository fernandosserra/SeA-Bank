package Sea.Com;

import static Sea.Com.Banco.NOME_BANCO;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println(NOME_BANCO);
        System.out.println("==== EXTRATO CONTA POUPANCA ====");
        super.imprimeInfosComuns();
    }

}
