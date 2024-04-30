package janela01;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	

public class TelasAlterada extends JFrame {
	private int andar = 1;
	
	
	public TelasAlterada() {
		
		super("Simulador de Elevador");
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

	    openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chamarElevador(andar);
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chamarElevador(andar);
            }
        });

        floor1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chamarElevador(1);
            }
        });

        floor2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chamarElevador(2);
            }
        });

        floor3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chamarElevador(3);
            }
        });

        add(controlPanel, BorderLayout.CENTER);
    }

    public void chamarElevador(int andarChamado) {
        System.out.println("Chamando o elevador para o andar " + andarChamado);
        System.out.println("O elevador está no andar " + andar);
    }


	}


