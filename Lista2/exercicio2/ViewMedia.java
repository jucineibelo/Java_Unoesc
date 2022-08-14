package exercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JSlider;

public class ViewMedia {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JTextField txtMedia;
	private JButton btnVerificarAprovao;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblInsiraSeuNome;
	private JLabel lblInsiraSuaIdade;
	private JTextField txtNome;
	private JTextField txtIdade;

	MediaAluno media = new MediaAluno() {
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMedia window = new ViewMedia();
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
	public ViewMedia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Informe a primeira Nota :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 123, 153, 43);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Informe a segunda Nota:\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 158, 153, 43);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Informe a terceira Nota:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 195, 153, 43);
		frame.getContentPane().add(lblNewLabel_2);

		txtN1 = new JTextField();
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(157, 129, 121, 31);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setColumns(10);
		txtN2.setBounds(157, 164, 121, 31);
		frame.getContentPane().add(txtN2);

		txtN3 = new JTextField();
		txtN3.setHorizontalAlignment(SwingConstants.CENTER);
		txtN3.setColumns(10);
		txtN3.setBounds(157, 201, 121, 31);
		frame.getContentPane().add(txtN3);

		JTextArea txtVerificar = new JTextArea();
		txtVerificar.setForeground(Color.RED);
		txtVerificar.setFont(new Font("Monospaced", Font.BOLD, 16));
		txtVerificar.setEditable(false);
		txtVerificar.setBounds(266, 249, 213, 118);
		frame.getContentPane().add(txtVerificar);

		btnNewButton = new JButton("Calcule Media");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				media.setN1(Double.parseDouble(txtN1.getText()));
				media.setN2(Double.parseDouble(txtN2.getText()));
				media.setN3(Double.parseDouble(txtN3.getText()));
				txtMedia.setText(String.valueOf(media.calcularMedia()));
			}
		});
		btnNewButton.setBounds(346, 135, 133, 43);
		frame.getContentPane().add(btnNewButton);

		txtMedia = new JTextField();
		txtMedia.setBackground(SystemColor.inactiveCaptionBorder);
		txtMedia.setHorizontalAlignment(SwingConstants.CENTER);
		txtMedia.setBounds(355, 189, 111, 31);
		frame.getContentPane().add(txtMedia);
		txtMedia.setColumns(10);

		btnVerificarAprovao = new JButton("Verificar Aprova\u00E7\u00E3o");
		btnVerificarAprovao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				media.setNome(String.valueOf(txtNome.getText()));
				media.setIdade(Integer.parseInt(txtIdade.getText()));
				txtVerificar.setText(media.verificarAprovacao());
			}
		});
		btnVerificarAprovao.setBounds(54, 278, 151, 43);
		frame.getContentPane().add(btnVerificarAprovao);

		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(392, 403, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtIdade.setText(null);
				txtN1.setText(null);
				txtN2.setText(null);
				txtN3.setText(null);
				txtMedia.setText(null);
				txtVerificar.setText(null);
			}
		});
		btnNewButton_2.setBounds(34, 403, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		lblInsiraSeuNome = new JLabel("Insira seu nome:");
		lblInsiraSeuNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraSeuNome.setBounds(10, 11, 153, 43);
		frame.getContentPane().add(lblInsiraSeuNome);

		lblInsiraSuaIdade = new JLabel("Insira sua Idade:");
		lblInsiraSuaIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsiraSuaIdade.setBounds(10, 55, 153, 43);
		frame.getContentPane().add(lblInsiraSuaIdade);

		txtNome = new JTextField();
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setBounds(140, 16, 252, 32);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdade.setBounds(140, 55, 47, 33);
		frame.getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

	}
}
