package exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JLabel;

public class ViewCalc {

	private JFrame frame;
	private JTextField txtResultado;
	private JTextField txtN1;
	private JTextField txtN2;

	Calculadora calc = new Calculadora() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCalc window = new ViewCalc();
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
	public ViewCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setForeground(Color.RED);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtResultado.setBackground(SystemColor.info);
		txtResultado.setBounds(21, 161, 398, 59);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btntSomar = new JButton("+");
		btntSomar.setFont(new Font("Tahoma", Font.BOLD, 22));
		btntSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setN1(Double.parseDouble(txtN1.getText()));
				calc.setN2(Double.parseDouble(txtN2.getText()));
				txtResultado.setText(String.valueOf(calc.somar()));
				
			

			}
		});
		btntSomar.setBounds(21, 115, 103, 35);
		frame.getContentPane().add(btntSomar);

		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(330, 231, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Limpar");
		btnNewButton_1_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtN1.setText(null);
				txtN2.setText(null);
				txtResultado.setText(null);
			}
		});
		btnNewButton_1_1.setBounds(10, 231, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);

		txtN1 = new JTextField();
		txtN1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(21, 69, 192, 35);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setBounds(223, 69, 196, 35);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JButton btnDiminuir = new JButton("-");
		btnDiminuir.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnDiminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setN1(Double.parseDouble(txtN1.getText()));
				calc.setN2(Double.parseDouble(txtN2.getText()));
				txtResultado.setText(String.valueOf(calc.subtrair()));
			}
		});
		btnDiminuir.setBounds(116, 115, 103, 35);
		frame.getContentPane().add(btnDiminuir);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setN1(Double.parseDouble(txtN1.getText()));
				calc.setN2(Double.parseDouble(txtN2.getText()));
				txtResultado.setText(String.valueOf(calc.multiplicar()));
			}
		});
		btnMultiplicar.setBounds(217, 115, 103, 35);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("\u00F7");
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setN1(Double.parseDouble(txtN1.getText()));
				calc.setN2(Double.parseDouble(txtN2.getText()));
				txtResultado.setText(String.valueOf(calc.dividir()));
			}
		});
		btnDividir.setBounds(316, 115, 103, 35);
		frame.getContentPane().add(btnDividir);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DO JUCI");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 23));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 11, 308, 35);
		frame.getContentPane().add(lblNewLabel);
	}
}
