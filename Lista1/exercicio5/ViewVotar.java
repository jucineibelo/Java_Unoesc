package exercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class ViewVotar {

	private JFrame frame;
	private JTextField txtIdade;
	private JTextField txtResultado;

	Votar votar = new Votar() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVotar window = new ViewVotar();
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
	public ViewVotar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Insira a Idade:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 24, 124, 36);
		frame.getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdade.setBounds(144, 32, 86, 20);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnNewButton = new JButton("Posso votar?");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				votar.setIdade(Integer.parseInt(txtIdade.getText()));
				txtResultado.setText(votar.podeVotar());
			}
		});
		btnNewButton.setBounds(71, 71, 124, 36);
		frame.getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setForeground(Color.BLACK);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBackground(new Color(173, 216, 230));
		txtResultado.setBounds(23, 118, 230, 55);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtIdade.setText(null);
			}
		});
		btnNewButton_1.setBounds(20, 184, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sair");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setBounds(167, 184, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
