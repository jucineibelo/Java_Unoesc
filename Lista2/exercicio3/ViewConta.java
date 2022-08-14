package exercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class ViewConta {

	private JFrame frame;
	private JTextField txtNum;
	private JTextField txtTipo;
	private JTextField txtTitular;
	private JTextField txtDepositar;
	private JTextField txtSacar;

	Contas contas = new Contas() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewConta window = new ViewConta();
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
	public ViewConta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 426, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero da Conta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 11, 129, 39);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblTipoDaConta = new JLabel("Tipo da Conta:");
		lblTipoDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDaConta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTipoDaConta.setBounds(27, 48, 129, 39);
		frame.getContentPane().add(lblTipoDaConta);

		JLabel lblTitularDaConta = new JLabel("Titular da Conta:");
		lblTitularDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitularDaConta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTitularDaConta.setBounds(27, 89, 129, 39);
		frame.getContentPane().add(lblTitularDaConta);

		JTextArea txtVerificar = new JTextArea();
		txtVerificar.setBackground(new Color(204, 255, 255));
		txtVerificar.setEditable(false);
		txtVerificar.setBounds(99, 269, 224, 67);
		frame.getContentPane().add(txtVerificar);

		txtNum = new JTextField();
		txtNum.setHorizontalAlignment(SwingConstants.LEFT);
		txtNum.setBackground(new Color(204, 255, 255));
		txtNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				contas.setNumeroConta(Integer.parseInt(txtNum.getText()));
			}
		});
		txtNum.setBounds(147, 20, 95, 20);
		frame.getContentPane().add(txtNum);
		txtNum.setColumns(10);

		txtTipo = new JTextField();
		txtTipo.setBackground(new Color(204, 255, 255));
		txtTipo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				contas.setTipoConta(txtTipo.getText());
			}
		});
		txtTipo.setHorizontalAlignment(SwingConstants.LEFT);
		txtTipo.setColumns(10);
		txtTipo.setBounds(147, 61, 95, 20);
		frame.getContentPane().add(txtTipo);

		txtTitular = new JTextField();
		txtTitular.setHorizontalAlignment(SwingConstants.LEFT);
		txtTitular.setBackground(new Color(204, 255, 255));
		txtTitular.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				contas.setTitularConta(txtTitular.getText());
			}
		});
		txtTitular.setColumns(10);
		txtTitular.setBounds(147, 98, 200, 20);
		frame.getContentPane().add(txtTitular);

		txtDepositar = new JTextField();
		txtDepositar.setHorizontalAlignment(SwingConstants.CENTER);
		txtDepositar.setBackground(new Color(204, 255, 255));
		txtDepositar.setBounds(46, 187, 86, 20);
		frame.getContentPane().add(txtDepositar);
		txtDepositar.setColumns(10);

		txtSacar = new JTextField();
		txtSacar.setHorizontalAlignment(SwingConstants.CENTER);
		txtSacar.setBackground(new Color(204, 255, 255));
		txtSacar.setColumns(10);
		txtSacar.setBounds(277, 187, 86, 20);
		frame.getContentPane().add(txtSacar);

		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(311, 364, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Verificar Saldo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVerificar.setText(String.valueOf(contas.verificarSaldo()));
			}
		});
		btnNewButton_1.setBounds(147, 235, 118, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum.setText(null);
				txtTipo.setText(null);
				txtTitular.setText(null);
				txtDepositar.setText(null);
				txtSacar.setText(null);
				txtVerificar.setText(null);
			}
		});
		btnLimpar.setBounds(10, 364, 89, 23);
		frame.getContentPane().add(btnLimpar);

		JButton btnNewButton_2 = new JButton("Depositar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contas.depositar(Double.parseDouble(txtDepositar.getText()));

			}
		});
		btnNewButton_2.setBounds(46, 153, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Sacar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contas.sacar(Double.parseDouble(txtSacar.getText()));
			}
		});
		btnNewButton_3.setBounds(274, 153, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

	}
}
