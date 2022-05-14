package Sea.Com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Clientes cli1 = new Clientes();
        cli1.setClienteNome("Fernando A");
        cli1.setClienteSobrenome("Souza Serra");

        Conta cp1 = new ContaPoupanca(cli1);
        Conta cc1 = new ContaCorrente(cli1);

        cc1.depositar(300);
        cc1.transferir(120, cp1);
        cc1.imprimeExtrato();
    }

}
