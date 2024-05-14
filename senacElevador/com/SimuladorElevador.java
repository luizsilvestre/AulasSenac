package senacElevador.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;



public class SimuladorElevador {
	private static int floor;
	private static int destinationFloor;
	private static Timer timer;
	private static JButton openButton;
	private static JButton[] floorButtons;
	

	public static void main(String[] args) {
		//criação das telas 
		
		JFrame window = new JFrame ("Elevador Senac");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300,300);
		window.setLocationRelativeTo(null);
		
		//Criação das configuração do layout
		
		Container caixa = new Container();
		caixa.setLayout(new BorderLayout());
		window.setContentPane(caixa);
		
		// Criando a configuração do Painel
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		
		//Criando o Botão de Abrir
		
		JButton OpenButtton = new JButton("Abrir");
		panel.add(OpenButtton);
		
		// Criando o botão de fechar
		
		JButton CloseButton = new JButton("Fechar");
		panel.add(CloseButton);
		
		//Criando as configuração dos botão 
		
		for (int i = 1; i <= 10; i++) {
			final int currentFloor = i;
			JButton floorButton = new JButton ("andar " + currentFloor);
			floorButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					floor = currentFloor;
					callElevator(floor);
					moveElevador();
				}
			});
			floorButtons[i -1] = floorButton;
			panel.add(floorButton);
			}
		// adcionando o painel no windows
			caixa.add(panel, BorderLayout.CENTER);
			
			window.setVisible(true);
	}
	// Mostrar na janela
	
			

		/*
		 * nessa parte ira mostrar o tempo usando o timer com um delay de 1000 segundo
		 */
		public static void moveElevador() {
			if(timer != null) {
				timer.cancel();
			}
			timer = new Timer();
			timer.schedule(new TimerTask(){
				@Override
				public void run() {
					if(floor > destinationFloor) {
						floor--;
						System.out.println(" O elevador está no andar" + floor);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						timer.cancel();
						updateButtonColors();
						System.out.println(" O elevador chegou no andar" +destinationFloor);
						
					}
				}

				

				
				
				}, 0,1000);
			}
			public static void callElevator(int floor) {
				System.out.println("Elevator Chamado " + floor + 
		                " e ele está parado no andar  " + SimuladorElevador.floor);
				if (SimuladorElevador.floor == floor) {
		            setButtonColor(floor, Color.GREEN);
		        } else {
		            setButtonColor(floor, Color.YELLOW);
		        }
		    }

		    public static void openDoor() {
		        openButton.setBackground(Color.RED);
		    }

		    public static void closeDoor() {
		        openButton.setBackground(Color.GRAY);
		    }

		    public static void setButtonColor(int floor, Color color) {
		        for (JButton button : floorButtons) {
		        	if (button.getText().equals("andar" + floor )) {
		        		if (button.getText().equals("andar "+ floor)) {
		        			button.setBackground(color);
		        			break;
		        			
		        		}
		        		
		        		
		        	}
		    }
		        private void updateButtonColors() {
					// TODO Auto-generated method stub
		        	for (int i = 1; i <= 10; i++) {
		                if (i == floor) {
		                    setButtonColor(i, Color.GREEN);
		                } else if (i == destinationFloor) {
		                    setButtonColor(i, Color.YELLOW);
		                } else {
		                    setButtonColor(i, Color.GRAY);
				}
	        	}
	        
		    }			
		  
}
			
			
				
			
		

	
