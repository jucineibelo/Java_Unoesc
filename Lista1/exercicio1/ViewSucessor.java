package exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class ViewSucessor {

	private JFrame frame;
	private JTextField inserir;
	private JTextField resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSucessor window = new ViewSucessor();
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
	public ViewSucessor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 287, 123);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel(" Insira um n\u00FAmero:");
		lblNewLabel.setBounds(10, 13, 118, 14);
		
		JButton btnNewButton = new JButton("Sucessor");
		btnNewButton.setBounds(138, 9, 93, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sucessor;
				sucessor = Integer.parseInt(inserir.getText());
				sucessor += 1;
				resposta.setText(Integer.toString(sucessor));


			}
		});
		
		inserir = new JTextField();
		inserir.setBounds(22, 38, 67, 23);
		inserir.setHorizontalAlignment(SwingConstants.CENTER);
		inserir.setColumns(10);
		
		resposta = new JTextField();
		resposta.setForeground(Color.RED);
		resposta.setFont(new Font("Tahoma", Font.BOLD, 15));
		resposta.setBounds(138, 38, 93, 35);
		resposta.setHorizontalAlignment(SwingConstants.CENTER);
		resposta.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(inserir);
		frame.getContentPane().add(resposta);
	}
}
