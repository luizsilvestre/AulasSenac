package com.agricola.AnaliseSolo.AnaliseSolo.servico;

import com.agricola.AnaliseSolo.AnaliseSolo.Model.AnaliseSolo;

public class RecomendacaoQuimicaServico {
	
	public String gerarRecomendacao(AnaliseSolo analiseSolo) {
    StringBuilder recomendacao = new StringBuilder();
    
    if (analiseSolo.getId() < 6.0) {
        recomendacao.append("Recomenda-se a aplicação de calcário.\n");
    }
    if (analiseSolo.getTeorNitrogenio() < 40) {
        recomendacao.append("Recomenda-se a adubação nitrogenada.\n");
    }
    // Adicione mais recomendações conforme necessário
    
    return recomendacao.toString();
}
}


