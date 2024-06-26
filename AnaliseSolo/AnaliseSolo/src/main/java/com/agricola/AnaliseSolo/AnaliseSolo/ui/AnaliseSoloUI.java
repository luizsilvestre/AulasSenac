package com.agricola.AnaliseSolo.AnaliseSolo.ui;



import com.agricola.AnaliseSolo.AnaliseSolo.Model.Amostra;
import com.agricola.AnaliseSolo.AnaliseSolo.Model.AnaliseSolo;
import com.agricola.AnaliseSolo.AnaliseSolo.servico.AnaliseSoloServico;
import com.agricola.AnaliseSolo.AnaliseSolo.servico.RecomendacaoBiologicaServico;
import com.agricola.AnaliseSolo.AnaliseSolo.servico.RecomendacaoQuimicaServico;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class AnaliseSoloUI extends JFrame {
   
	private static final long serialVersionUID = 1L;
	private JTextField idField;
    private JTextArea resultadoArea;
    private AnaliseSoloServico analiseSoloService;
    private RecomendacaoBiologicaServico recomendacaoBiologicaService;
    private RecomendacaoQuimicaServico recomendacaoQuimicaService;

    public AnaliseSoloUI() {
        analiseSoloService = new AnaliseSoloServico();
        recomendacaoBiologicaService = new RecomendacaoBiologicaServico();
        recomendacaoQuimicaService = new RecomendacaoQuimicaServico();

        setTitle("Análise de Solo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("ID da Amostra:"));
        idField = new JTextField();
        panel.add(idField);

        JButton analisarButton = new JButton("Analisar");
        analisarButton.addActionListener(e -> realizarAnalise());
        panel.add(analisarButton);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);
    }

    private void realizarAnalise() {
        try {
            long id = Long.parseLong(idField.getText());
            Amostra amostra = new Amostra(id, LocalDate.now());
            AnaliseSolo analiseSolo = new AnaliseSolo(id, amostra);

            analiseSoloService.realizarAnalise(analiseSolo);

            String recomendacaoBiologica = recomendacaoBiologicaService.gerarRecomendacao(analiseSolo);
            String recomendacaoQuimica = recomendacaoQuimicaService.gerarRecomendacao(analiseSolo);

            resultadoArea.setText("Resultado da Análise:\n" + analiseSolo.toString() +
                                  "\n\nRecomendação Biológica:\n" + recomendacaoBiologica +
                                  "\n\nRecomendação Química:\n" + recomendacaoQuimica);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + e.getMessage());
        }
    }
}
