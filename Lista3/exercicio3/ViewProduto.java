package exercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewProduto {

	private JFrame frame;
	private JTextField txtProduto;
	private JTextField txtPeso;
	private JTextField txtPreco;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProduto window = new ViewProduto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Produto produto = new Produto() {
	};

	/**
	 * Create the application.
	 */
	public ViewProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Aumento de Produtos");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 203, 27);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Produto:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 50, 89, 27);
		frame.getContentPane().add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 163, 438, 13);
		frame.getContentPane().add(separator);

		txtProduto = new JTextField();
		txtProduto.setHorizontalAlignment(SwingConstants.CENTER);
		txtProduto.setBounds(86, 50, 113, 27);
		frame.getContentPane().add(txtProduto);
		txtProduto.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Peso:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(0, 81, 89, 27);
		frame.getContentPane().add(lblNewLabel_1_1);

		txtPeso = new JTextField();
		txtPeso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPeso.setColumns(10);
		txtPeso.setBounds(86, 84, 113, 27);
		frame.getContentPane().add(txtPeso);

		JLabel lblNewLabel_1_1_1 = new JLabel("Pre\u00E7o:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(0, 119, 89, 27);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		txtPreco = new JTextField();
		txtPreco.setHorizontalAlignment(SwingConstants.CENTER);
		txtPreco.setColumns(10);
		txtPreco.setBounds(86, 119, 113, 27);
		frame.getContentPane().add(txtPreco);

		JButton btnNewButton = new JButton("Calcular Reajuste");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produto.setNome(txtProduto.getText());
				produto.setPeso(Double.parseDouble(txtPeso.getText()));
				produto.setPreco(Double.parseDouble(txtPreco.getText()));
				txtResultado.setText(produto.aumentarPreco(produto));
			}
		});
		btnNewButton.setBounds(257, 75, 142, 39);
		frame.getContentPane().add(btnNewButton);

		txtResultado = new JTextField();
		txtResultado.setForeground(Color.RED);
		txtResultado.setBackground(new Color(255, 255, 153));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(10, 175, 414, 70);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtProduto.setText(null);
				txtPeso.setText(null);
				txtPreco.setText(null);
			}
		});
		btnNewButton_1.setBounds(10, 264, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sair");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setBounds(335, 264, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 39, 438, 13);
		frame.getContentPane().add(separator_1);
	}
}
