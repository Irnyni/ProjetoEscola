package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import java.awt.TextField;

public class ListaEspera extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEspera frame = new ListaEspera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ListaEspera() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JLabel lblInserirGuich = new JLabel("LISTA DE ESPERA");
		lblInserirGuich.setBounds(25, 17, 734, 98);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 80));
		contentPane.add(lblInserirGuich);
		
		JLabel lblListaDeTurmas = new JLabel("POSIÇÃO");
		lblListaDeTurmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeTurmas.setForeground(Color.WHITE);
		lblListaDeTurmas.setFont(new Font("Javanese Text", Font.BOLD, 45));
		lblListaDeTurmas.setAutoscrolls(true);
		lblListaDeTurmas.setAlignmentY(1.0f);
		lblListaDeTurmas.setBounds(104, 128, 522, 78);
		contentPane.add(lblListaDeTurmas);
		
		JButton btnVoltar_2 = new JButton("VOLTAR");
		btnVoltar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarInscricao frame =new RealizarInscricao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2.setBackground(Color.WHITE);
		btnVoltar_2.setBounds(294, 450, 148, 39);
		contentPane.add(btnVoltar_2);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setEditable(false);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(40, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 99));
		Random random = new Random();

		// Gerar um número aleatório entre 1 e 25
		int numeroAleatorio = random.nextInt(25) + 1;

		// Definir o número aleatório como o texto do campo de texto
		textField.setText(String.valueOf(numeroAleatorio));
		textField.setBounds(246, 230, 245, 148);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

