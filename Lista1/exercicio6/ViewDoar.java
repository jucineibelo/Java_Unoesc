package exercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ViewDoar {

	private JFrame frame;
	private JTextField txtIdade;
	private JTextField txtResultado;
	private JTextField txtLimpar;
	private JTextField txtSair;
	
	Sangue sangue = new Sangue() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDoar window = new ViewDoar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewDoar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 265, 266);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Insira sua idade:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 24, 93, 32);
		frame.getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(113, 27, 86, 26);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton possoVotar = new JButton("Posso doar sangue?");
		possoVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sangue.setIdade((Integer.parseInt(txtIdade.getText())));
				txtResultado.setText(sangue.doar());
				
				
			}
		});
		possoVotar.setBounds(49, 67, 160, 45);
		frame.getContentPane().add(possoVotar);

		txtResultado = new JTextField();
		txtResultado.setBackground(new Color(255, 250, 205));
		txtResultado.setForeground(Color.RED);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(23, 123, 203, 47);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		txtLimpar = new JTextField();
		txtLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIdade.setText(null);
				txtResultado.setText(null);
			}
		});
		txtLimpar.setHorizontalAlignment(SwingConstants.CENTER);
		txtLimpar.setText("Limpar");
		txtLimpar.setBounds(10, 196, 86, 20);
		frame.getContentPane().add(txtLimpar);
		txtLimpar.setColumns(10);

		txtSair = new JTextField();
		txtSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		txtSair.setHorizontalAlignment(SwingConstants.CENTER);
		txtSair.setText("Sair");
		txtSair.setColumns(10);
		txtSair.setBounds(153, 196, 86, 20);
		frame.getContentPane().add(txtSair);
	}
}
