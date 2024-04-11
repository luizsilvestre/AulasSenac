package detetive;

public class ParticipacaoNoCrime {
	    private boolean telefonouParaAVitima;
	    private boolean esteveNoLocalDoCrime;
	    private boolean moraPertoDaVitima;
	    private boolean deviaParaAVitima;
	    private boolean trabalhouComAVitima;

	    public ParticipacaoNoCrime(boolean telefonou, boolean esteveNoLocal, boolean moraPerto, boolean devia, boolean trabalhou) {
	        telefonouParaAVitima = telefonou;
	        esteveNoLocalDoCrime = esteveNoLocal;
	        moraPertoDaVitima = moraPerto;
	        deviaParaAVitima = devia;
	        trabalhouComAVitima = trabalhou;
	        String classificacao = getClassificacao();
	        System.out.println("Classificação: " + classificacao);
	    }

	    private String getClassificacao() {
	        int contador = 0;

	        if (telefonouParaAVitima) {
	            contador++;
	        }
	        if (esteveNoLocalDoCrime) {
	            contador++;
	        }
	        if (moraPertoDaVitima) {
	            contador++;
	        }
	        if (deviaParaAVitima) {
	            contador++;
	        }
	        if (trabalhouComAVitima) {
	            contador++;
	        }

	        if (contador == 5) {
	            return "Assassino";
	        } else if (contador == 4 || contador == 3) {
	            return "Cúmplice";
	        } else if (contador == 2) {
	            return "Suspeito";
	        } else {
	            return "Inocente";
	        }
	    }
	}
