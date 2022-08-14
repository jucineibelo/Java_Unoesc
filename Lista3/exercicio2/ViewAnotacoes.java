package exercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class ViewAnotacoes {

	private JFrame frame;
	private JTextField txtAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAnotacoes window = new ViewAnotacoes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	CadernoAnotacoes anota = new CadernoAnotacoes() {
	};

	/**
	 * Create the application.
	 */
	public ViewAnotacoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Caderno de Anota\u00E7\u00F5es");
		lblNewLabel.setBounds(10, 0, 215, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JTextArea txtLista = new JTextArea();
		txtLista.setTabSize(10);
		txtLista.setBackground(new Color(255, 255, 204));
		txtLista.setBounds(10, 139, 396, 85);
		frame.getContentPane().add(txtLista);

		txtAdd = new JTextField();
		txtAdd.setHorizontalAlignment(SwingConstants.LEFT);
		txtAdd.setBackground(new Color(255, 255, 204));
		txtAdd.setBounds(219, 40, 190, 20);
		frame.getContentPane().add(txtAdd);
		txtAdd.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anota.setAnotacao((txtAdd.getText()));
				anota.adicionarAnotacao();
			}
		});
		btnNewButton.setBounds(219, 12, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLista.setText(anota.visualizarAnotacoes());
			}
		});
		btnVisualizar.setBounds(10, 105, 137, 23);
		frame.getContentPane().add(btnVisualizar);

		JButton btnNewButton_1 = new JButton("Apagar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anota.apagarAnotacoes();
			}
		});
		btnNewButton_1.setBounds(312, 105, 78, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(320, 235, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 71, 416, 11);
		frame.getContentPane().add(separator);
	}
}
