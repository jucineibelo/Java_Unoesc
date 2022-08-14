package exercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class ViewGastoCombustivel {

	private JFrame frame;
	private JTextField distancia;
	private JTextField litros;
	private JTextField resposta;
	private JButton Limpar;
	private JButton Sair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGastoCombustivel window = new ViewGastoCombustivel();
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
	public ViewGastoCombustivel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(" Informe a dist\u00E2ncia: \r\n");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(10, 11, 124, 32);
		frame.getContentPane().add(lblNewLabel);

		distancia = new JTextField();
		distancia.setHorizontalAlignment(SwingConstants.CENTER);
		distancia.setBackground(Color.YELLOW);
		distancia.setBounds(144, 17, 86, 20);
		frame.getContentPane().add(distancia);
		distancia.setColumns(10);

		JLabel lblGastoEmLitros = new JLabel(" Gasto em litros:\r\n");
		lblGastoEmLitros.setForeground(Color.BLUE);
		lblGastoEmLitros.setBackground(Color.WHITE);
		lblGastoEmLitros.setBounds(10, 54, 117, 32);
		frame.getContentPane().add(lblGastoEmLitros);

		litros = new JTextField();
		litros.setHorizontalAlignment(SwingConstants.CENTER);
		litros.setBackground(Color.YELLOW);
		litros.setBounds(144, 60, 86, 20);
		litros.setColumns(10);
		frame.getContentPane().add(litros);

		JButton btnNewButton = new JButton("Calcular Consumo");
		btnNewButton.setBounds(93, 97, 141, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double consumo;
				consumo = (Double.parseDouble(distancia.getText()) / (Double.parseDouble(litros.getText())));
				resposta.setText(Double.toString(consumo));
			}
		});
		frame.getContentPane().add(btnNewButton);

		resposta = new JTextField();
		resposta.setHorizontalAlignment(SwingConstants.CENTER);
		resposta.setBackground(Color.CYAN);
		resposta.setBounds(28, 141, 182, 32);
		frame.getContentPane().add(resposta);
		resposta.setColumns(10);

		Limpar = new JButton("Limpar");
		Limpar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Limpar.setHorizontalAlignment(SwingConstants.LEFT);
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distancia.setText(null);

			}
		});
		Limpar.setBounds(10, 97, 65, 23);
		frame.getContentPane().add(Limpar);

		Sair = new JButton(" Sair");
		Sair.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Sair.setHorizontalAlignment(SwingConstants.LEFT);
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Sair.setBounds(168, 200, 65, 23);
		frame.getContentPane().add(Sair);
	}

}
