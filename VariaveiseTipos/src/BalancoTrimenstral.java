
public class BalancoTrimenstral {

	public static void main(String[] args) {
		// declaração das variaveis
		
		int gastosJaneiro= 15000;
		int gastosFevereiro =23000;
		int	gastosMarco =17000;
		
		//Soma das variaveis 
		
		int GastosTrimestre= gastosJaneiro + gastosFevereiro+ gastosMarco;
		
		
		//impressao na tela dos resultados
		System.out.println("Os gastos foram " + GastosTrimestre);
		
		//Media dos valores
		int media = (gastosJaneiro+ gastosFevereiro + gastosMarco)/3;
				System.out.println(" Valor da média mensal é " + media);
				
				
			
	}

}
