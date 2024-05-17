package com.senac.elevador;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

public class Janela extends JFrame {

	// Criação das variaveis para todos os metodos

	private JButton btnAbrir, btnFechar;
	private JButton[] btnAndar;
	private JLabel lblInicio;

	public Janela() {
		inicio();

	}

	private void inicio() {
		setTitle("Elevador KXPO");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		criarpainel();
		setLayout(null);
		setVisible(true);

	}

	private void criarpainel() {
		add(criarLabel());
		criarBtnAbrirFechar();
		criarBtnAndares();
		setLayout(null);
		

	}

	
	private void criarBtnAndares() {
		btnAndar = new JButton[5];
		int x = 45;
		for (int i = 0; i < btnAndar.length; i++) {
			btnAndar[i] = new JButton("" + (i + 1));

			btnAndar[i].setBounds(x, 460, 120, 60);
			x += 145;
			add(btnAndar[i]);
		}

	}

	private void criarBtnAbrirFechar() {
		btnAbrir =  new JButton("Abrir");
		btnFechar =  new JButton("Fechar");
		btnAbrir.setBounds(160, 285, 220, 60);
		btnFechar.setBounds(400, 285, 220, 60);
		add(btnAbrir);
		add(btnFechar);

	}

	private Component criarLabel() {
		lblInicio = new JLabel("Escolha o andar");
		lblInicio.setFont(new Font("Arial", Font.PLAIN, 38));
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setBounds(0, 60, 600, 30);
		return lblInicio;
	}

}
