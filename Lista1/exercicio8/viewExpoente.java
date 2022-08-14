package exercicio8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewExpoente {

	private JFrame frame;
	private JTextField txtBase;
	private JTextField txtExpoente;
	private JTextField txtResultado;

	Expoente expoente = new Expoente() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewExpoente window = new viewExpoente();
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
	public viewExpoente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 234, 273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Insira a Base:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 115, 28);
		frame.getContentPane().add(lblNewLabel);

		txtBase = new JTextField();
		txtBase.setHorizontalAlignment(SwingConstants.CENTER);
		txtBase.setBounds(125, 15, 86, 20);
		frame.getContentPane().add(txtBase);
		txtBase.setColumns(10);

		JLabel lblInsiraOExpoente = new JLabel("Insira o Expoente:");
		lblInsiraOExpoente.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraOExpoente.setBounds(10, 50, 105, 28);
		frame.getContentPane().add(lblInsiraOExpoente);

		txtExpoente = new JTextField();
		txtExpoente.setHorizontalAlignment(SwingConstants.CENTER);
		txtExpoente.setColumns(10);
		txtExpoente.setBounds(125, 54, 86, 20);
		frame.getContentPane().add(txtExpoente);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expoente.setBase(Integer.parseInt(txtBase.getText()));
				expoente.setExpoente(Integer.parseInt(txtExpoente.getText()));
				txtResultado.setText(String.valueOf(expoente.calcularExpoente()));
			}
		});
		btnNewButton.setBounds(35, 88, 141, 35);
		frame.getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(10, 134, 186, 45);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText(null);
				txtExpoente.setText(null);
				txtResultado.setText(null);
			}
		});
		btnNewButton_1.setBounds(11, 190, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sair");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setBounds(110, 190, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
