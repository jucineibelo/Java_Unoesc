package exercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ViewIdade {

	private JFrame frame;
	private JTextField txtChico;
	private JTextField txtZe;
	private JButton btnNewButton;
	private JTextField txtResultado;
	private JButton btnNewButton_2;

	Idade idade = new Idade() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIdade window = new ViewIdade();
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
	public ViewIdade() {
		initialize();
		txtChico.setText(String.valueOf(idade.getChicoMetros()));
		txtZe.setText(String.valueOf(idade.getZeMetros()));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 339, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Metragem \r\nChico");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 115, 41);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblIdadeDeZ = new JLabel("Metragem Z\u00E9");
		lblIdadeDeZ.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdadeDeZ.setBounds(178, 11, 115, 41);
		frame.getContentPane().add(lblIdadeDeZ);

		txtChico = new JTextField();
		txtChico.setHorizontalAlignment(SwingConstants.CENTER);
		txtChico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		txtChico.setBounds(20, 52, 86, 20);
		frame.getContentPane().add(txtChico);
		txtChico.setColumns(10);

		txtZe = new JTextField();
		txtZe.setHorizontalAlignment(SwingConstants.CENTER);
		txtZe.setColumns(10);
		txtZe.setBounds(188, 52, 86, 20);
		frame.getContentPane().add(txtZe);

		btnNewButton = new JButton("Calcular Idade");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idade.setChicoMetros(Double.parseDouble(txtChico.getText()));
				idade.setZeMetros(Double.parseDouble(txtZe.getText()));
				txtResultado.setText(idade.idade());

			}
		});
		btnNewButton.setBounds(93, 83, 115, 41);
		frame.getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setBackground(new Color(204, 204, 153));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(10, 135, 303, 41);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(209, 198, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
