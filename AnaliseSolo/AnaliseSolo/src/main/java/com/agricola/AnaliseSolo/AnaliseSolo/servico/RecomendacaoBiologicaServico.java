package com.agricola.AnaliseSolo.AnaliseSolo.servico;

import com.agricola.AnaliseSolo.AnaliseSolo.Model.AnaliseSolo;

public class RecomendacaoBiologicaServico {
	public String gerarRecomendacao(AnaliseSolo analiseSolo) {
        StringBuilder recomendacao = new StringBuilder();
        
        if (analiseSolo.getTeorMateriaOrganica() < 3) {
            recomendacao.append("Recomenda-se aumentar o teor de matéria orgânica.\n");
        }
        if (analiseSolo.getAtividadeMicrobiologica() < 5) {
            recomendacao.append("Recomenda-se estimular a atividade microbiológica.\n");
        }
        
        return recomendacao.toString();
    }
}


