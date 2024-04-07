package banco;

public class testeconta extends conta {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(1, 1000.0, "João");
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 5000.0, "Maria");

        contaCorrente.sacar(200.0);
        contaPoupanca.depositar(1000.0);


	}

}
