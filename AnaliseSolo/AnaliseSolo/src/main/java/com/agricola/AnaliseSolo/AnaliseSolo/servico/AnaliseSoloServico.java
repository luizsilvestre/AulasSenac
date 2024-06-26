package com.agricola.AnaliseSolo.AnaliseSolo.servico;

import com.agricola.AnaliseSolo.AnaliseSolo.Model.AnaliseSolo;
 
public class AnaliseSoloServico {
	public void realizarAnalise(AnaliseSolo analiseSolo) {
		analiseSolo.setId(Math.random() * 7);
        analiseSolo.setTeorNitrogenio(Math.random() * 100);
        analiseSolo.setTeorFosforo(Math.random() * 100);
        analiseSolo.setTeorPotassio(Math.random() * 100);
        analiseSolo.setTeorMateriaOrganica(Math.random() * 10);
        analiseSolo.setAtividadeMicrobiologica(Math.random() * 10);
	}

}
