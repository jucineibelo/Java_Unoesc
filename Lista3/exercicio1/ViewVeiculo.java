package exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class ViewVeiculo {

	private JFrame frame;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtKm;
	private JTextField ResultadoCor;
	private JTextField txtResultadoKm;
	private JTextField txtAlterarCor;

	Veiculo veiculo = new Veiculo() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVeiculo window = new ViewVeiculo();
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
	public ViewVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Manuten\u00E7\u00E3o de  Veiculos");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(99, 0, 230, 62);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ano:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 63, 81, 26);
		frame.getContentPane().add(lblNewLabel_1);

		txtAno = new JTextField();
		txtAno.setHorizontalAlignment(SwingConstants.CENTER);
		txtAno.setBounds(81, 63, 98, 26);
		frame.getContentPane().add(txtAno);
		txtAno.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Cor:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(0, 100, 81, 26);
		frame.getContentPane().add(lblNewLabel_1_1);

		txtCor = new JTextField();
		txtCor.setHorizontalAlignment(SwingConstants.CENTER);
		txtCor.setColumns(10);
		txtCor.setBounds(81, 100, 98, 26);
		frame.getContentPane().add(txtCor);

		JLabel lblNewLabel_1_1_1 = new JLabel("KM:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(0, 133, 81, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		txtKm = new JTextField();
		txtKm.setHorizontalAlignment(SwingConstants.CENTER);
		txtKm.setColumns(10);
		txtKm.setBounds(81, 137, 98, 26);
		frame.getContentPane().add(txtKm);

		ResultadoCor = new JTextField();
		ResultadoCor.setHorizontalAlignment(SwingConstants.CENTER);
		ResultadoCor.setBackground(new Color(204, 255, 255));
		ResultadoCor.setBounds(142, 235, 214, 34);
		frame.getContentPane().add(ResultadoCor);
		ResultadoCor.setColumns(10);

		txtResultadoKm = new JTextField();
		txtResultadoKm.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoKm.setBackground(new Color(204, 255, 255));
		txtResultadoKm.setBounds(142, 193, 214, 31);
		frame.getContentPane().add(txtResultadoKm);
		txtResultadoKm.setColumns(10);

		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(350, 320, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Limpar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAno.setText(null);
				txtCor.setText(null);
				txtAlterarCor.setText(null);
				ResultadoCor.setText(null);
				txtKm.setText(null);
				txtResultadoKm.setText(null);
			}
		});

		JButton btnNewButton = new JButton("Alterar Cor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veiculo.setNovaCor(txtAlterarCor.getText());
				ResultadoCor.setText("Cor alterada para: " + veiculo.mudarCor());

			}
		});
		btnNewButton.setBounds(298, 79, 98, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnExibircor = new JButton("Exibir Cor");
		btnExibircor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veiculo.setAno(Integer.parseInt(txtAno.getText()));
				veiculo.setCor(txtCor.getText());
				ResultadoCor.setText(veiculo.exibirCor());
			}
		});
		btnExibircor.setBounds(24, 239, 98, 23);
		frame.getContentPane().add(btnExibircor);

		btnNewButton_1_1.setBounds(10, 320, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);

		txtAlterarCor = new JTextField();
		txtAlterarCor.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlterarCor.setColumns(10);
		txtAlterarCor.setBounds(298, 114, 98, 26);
		frame.getContentPane().add(txtAlterarCor);

		JButton btnVerificarKm = new JButton("Verificar KM");
		btnVerificarKm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				veiculo.setQuilometragem(Double.parseDouble(txtKm.getText()));
				txtResultadoKm.setText(veiculo.verificarManutencao());
			}
		});
		btnVerificarKm.setBounds(24, 197, 108, 23);
		frame.getContentPane().add(btnVerificarKm);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 178, 449, 17);
		frame.getContentPane().add(separator);

	}
}
