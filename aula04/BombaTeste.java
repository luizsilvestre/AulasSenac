package Bomba;

public class BombaTeste {
	public static void main(String[]args) {
	     Bomba bomba = new Bomba(100,1,5);
		 System.out.println("Abasteceu? resposta " + bomba.abastecerPorLitros(10));
		 System.out.println("Combustivel restante na Bomba: " +bomba.getQuantidade());
	//	System.out.println bd2 = new BombaDiesel(200,1.0,5);
		
		
	}

}
