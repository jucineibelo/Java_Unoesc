package exercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ViewMaiorOuMenor {

	private JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;

	Leia leia = new Leia() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMaiorOuMenor window = new ViewMaiorOuMenor();
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
	public ViewMaiorOuMenor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 238, 252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Informe n\u00FAmero 1 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 127, 24);
		frame.getContentPane().add(lblNewLabel);

		txtNum1 = new JTextField();
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setBounds(147, 15, 60, 20);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);

		JLabel lblInformeNmero = new JLabel("Informe n\u00FAmero 2 :");
		lblInformeNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformeNmero.setBounds(10, 46, 127, 24);
		frame.getContentPane().add(lblInformeNmero);

		txtNum2 = new JTextField();
		txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2.setColumns(10);
		txtNum2.setBounds(147, 50, 60, 20);
		frame.getContentPane().add(txtNum2);

		JButton btnNewButton = new JButton("Qual \u00E9 maior?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leia.setNum1(Integer.parseInt(txtNum1.getText()));
				leia.setNum2(Integer.parseInt(txtNum2.getText()));
				txtResultado.setText(Integer.toString(leia.maiorMenor()));

			}
		});
		btnNewButton.setBounds(10, 93, 127, 30);
		frame.getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setForeground(Color.RED);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(147, 92, 60, 30);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum1.setText(null);
				txtNum2.setText(null);
			}
		});
		btnLimpar.setBounds(10, 159, 89, 23);
		frame.getContentPane().add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(128, 159, 89, 23);
		frame.getContentPane().add(btnSair);
	}
}
