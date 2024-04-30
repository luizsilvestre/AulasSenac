package janela01;
	import javax.swing.*;
	import java.awt.*;

public class Telas extends JFrame {
	public Telas() {
		
		super("Simulador de Eleveador");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3,1));
		
		JButton openButton = new JButton("Abrir");
		JButton closeButton = new JButton("Fechar");
		JButton floor1Button = new JButton("1º Andar"); 
	    JButton floor2Button = new JButton("2º Andar"); 
	    JButton floor3Button = new JButton("3º Andar"); 
		
	    controlPanel.add(openButton); 
	    controlPanel.add(closeButton);
	    controlPanel.add(floor1Button); 
	    controlPanel.add(floor2Button); 
	    controlPanel.add(floor3Button); 

	    add(controlPanel, BorderLayout.CENTER);
		
	}

}
