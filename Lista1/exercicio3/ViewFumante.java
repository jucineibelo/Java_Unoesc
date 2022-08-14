package exercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;

public class ViewFumante {

	private JFrame frame;
	private JTextField txtDia;
	private JTextField resposta;
	private JTextField txtAno;
	private JTextField txtCarteira;
	private JButton btnLimpar;
	private JButton btnSair;

	Fumante fumante = new Fumante() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFumante window = new ViewFumante();
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
	public ViewFumante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 367, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel texto1 = new JLabel("Informe a quantos anos voc\u00EA fuma?");
		texto1.setForeground(SystemColor.textHighlight);
		texto1.setFont(new Font("Tahoma", Font.BOLD, 11));
		texto1.setBounds(0, 11, 218, 28);
		texto1.setHorizontalAlignment(SwingConstants.CENTER);
		texto1.setBackground(Color.PINK);
		frame.getContentPane().add(texto1);

		JLabel lblQuantosCigarrosVoc = new JLabel("Quantos Cigarros voc\u00EA fuma por dia?");
		lblQuantosCigarrosVoc.setForeground(SystemColor.textHighlight);
		lblQuantosCigarrosVoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantosCigarrosVoc.setBounds(0, 50, 218, 28);
		lblQuantosCigarrosVoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantosCigarrosVoc.setBackground(Color.PINK);
		frame.getContentPane().add(lblQuantosCigarrosVoc);

		txtDia = new JTextField();
		txtDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtDia.setBackground(new Color(175, 238, 238));
		txtDia.setBounds(228, 52, 86, 20);
		txtDia.setColumns(10);
		frame.getContentPane().add(txtDia);

		JLabel lblQualOValor = new JLabel("Qual o valor m\u00E9dio da Carteira?");
		lblQualOValor.setForeground(SystemColor.textHighlight);
		lblQualOValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQualOValor.setBounds(0, 89, 208, 28);
		lblQualOValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualOValor.setBackground(Color.PINK);
		frame.getContentPane().add(lblQualOValor);

		JButton btnCalcular = new JButton("Calcular Gasto");
		btnCalcular.setForeground(Color.RED);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fumante.setNumAnos(Integer.parseInt(txtAno.getText()));
				fumante.setCigarrosDia(Integer.parseInt(txtDia.getText()));
				fumante.setPrecoCarteirra(Double.parseDouble(txtCarteira.getText()));
				resposta.setText(Double.toString(fumante.calculo()));
			}
		});
		btnCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		btnCalcular.setBounds(31, 135, 117, 53);
		frame.getContentPane().add(btnCalcular);

		resposta = new JTextField();
		resposta.setFont(new Font("Tahoma", Font.BOLD, 14));
		resposta.setHorizontalAlignment(SwingConstants.CENTER);
		resposta.setBackground(new Color(255, 255, 0));
		resposta.setBounds(191, 141, 138, 41);
		frame.getContentPane().add(resposta);
		resposta.setColumns(10);

		txtAno = new JTextField();
		txtAno.setHorizontalAlignment(SwingConstants.CENTER);
		txtAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		txtAno.setColumns(10);
		txtAno.setBackground(new Color(175, 238, 238));
		txtAno.setBounds(228, 15, 86, 20);
		frame.getContentPane().add(txtAno);

		txtCarteira = new JTextField();
		txtCarteira.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarteira.setColumns(10);
		txtCarteira.setBackground(new Color(175, 238, 238));
		txtCarteira.setBounds(228, 93, 86, 20);
		frame.getContentPane().add(txtCarteira);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.GRAY);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAno.setText(null);
				txtDia.setText(null);
				txtCarteira.setText(null);
			}
		});
		btnLimpar.setBounds(31, 207, 89, 23);
		frame.getContentPane().add(btnLimpar);

		btnSair = new JButton("Sair");
		btnSair.setForeground(Color.GRAY);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(240, 207, 89, 23);
		frame.getContentPane().add(btnSair);
	}
}
