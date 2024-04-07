package banco;

public class conta {
	private int id;
	private double saldo;
	private String nomeTitular;
	
	public conta(int id, double saldo, String nomeTitular) {
		this.id=id;
		this.saldo=saldo;
		this.nomeTitular=nomeTitular;
	}
	
	public int getId() {
		return id;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void sacar(double valor) {
		saldo -=valor;
		System.out.println("Saque de " + valor + 
				"realizado com sucesso na conta " + id);
		
	}
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito de " +valor + 
				"realizado com sucesso na conta " +id);  
	}

}
