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

public class ListaEspera5 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEspera5 frame = new ListaEspera5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ListaEspera5() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
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
		
		JLabel lblListaDeTurmas = new JLabel("ORGANIZAR NOVA TURMA");
		lblListaDeTurmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeTurmas.setForeground(Color.WHITE);
		lblListaDeTurmas.setFont(new Font("Javanese Text", Font.BOLD, 45));
		lblListaDeTurmas.setAutoscrolls(true);
		lblListaDeTurmas.setAlignmentY(1.0f);
		lblListaDeTurmas.setBounds(55, 125, 663, 58);
		contentPane.add(lblListaDeTurmas);
		
		JButton btnSeguir = new JButton("SALVAR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCoord frame = new TelaCoord();
				frame.setVisible(true);
				dispose();			}
		});
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(561, 672, 181, 39);
		contentPane.add(btnSeguir);
		
		JButton btnVoltar_2 = new JButton("VOLTAR");
		btnVoltar_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2.setBackground(Color.WHITE);
		btnVoltar_2.setBounds(25, 672, 148, 39);
		contentPane.add(btnVoltar_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInserirGuich_1 = new JLabel("LISTA DE ESPERA");
		lblInserirGuich_1.setForeground(Color.WHITE);
		lblInserirGuich_1.setFont(new Font("Javanese Text", Font.BOLD, 80));
		lblInserirGuich_1.setAutoscrolls(true);
		lblInserirGuich_1.setAlignmentY(1.0f);
		lblInserirGuich_1.setBounds(25, 17, 734, 98);
		contentPane.add(lblInserirGuich_1);
		
		JToggleButton tglbtnBiologia_2 = new JToggleButton("BIOLOGIA 2");
		tglbtnBiologia_2.setForeground(new Color(64, 0, 0));
		tglbtnBiologia_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBiologia_2.setBackground(Color.WHITE);
		tglbtnBiologia_2.setBounds(183, 226, 388, 39);
		contentPane.add(tglbtnBiologia_2);
		
		JLabel lblListaDeTurmas_1 = new JLabel("ORGANIZAR NOVA TURMA");
		lblListaDeTurmas_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeTurmas_1.setForeground(Color.WHITE);
		lblListaDeTurmas_1.setFont(new Font("Javanese Text", Font.BOLD, 45));
		lblListaDeTurmas_1.setAutoscrolls(true);
		lblListaDeTurmas_1.setAlignmentY(1.0f);
		lblListaDeTurmas_1.setBounds(55, 125, 663, 58);
		contentPane.add(lblListaDeTurmas_1);
		
		JButton btnSeguir_1 = new JButton("AVANÇAR");
		btnSeguir_1.setForeground(new Color(64, 0, 0));
		btnSeguir_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir_1.setBackground(Color.WHITE);
		btnSeguir_1.setBounds(561, 672, 181, 39);
		contentPane.add(btnSeguir_1);
		
		JButton btnVoltar_2_1 = new JButton("VOLTAR");
		btnVoltar_2_1.setForeground(new Color(64, 0, 0));
		btnVoltar_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2_1.setBackground(Color.WHITE);
		btnVoltar_2_1.setBounds(25, 672, 148, 39);
		contentPane.add(btnVoltar_2_1);
		
		JLabel lblTurma = new JLabel("TURMA");
		lblTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurma.setForeground(Color.WHITE);
		lblTurma.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblTurma.setAutoscrolls(true);
		lblTurma.setAlignmentY(1.0f);
		lblTurma.setBounds(0, 233, 181, 39);
		contentPane.add(lblTurma);
		
		textField = new JTextField();
		textField.setText("BIO2");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBounds(183, 296, 88, 39);
		contentPane.add(textField);
		
		JLabel lblCdigo = new JLabel("CÓDIGO");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblCdigo.setAutoscrolls(true);
		lblCdigo.setAlignmentY(1.0f);
		lblCdigo.setBounds(0, 298, 181, 49);
		contentPane.add(lblCdigo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 369, 261, 39);
		contentPane.add(textField_1);
		
		JLabel lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(0, 369, 181, 49);
		contentPane.add(lblProfessor);
		
		JLabel lblProfessor_1 = new JLabel("LOCAL");
		lblProfessor_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor_1.setForeground(Color.WHITE);
		lblProfessor_1.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblProfessor_1.setAutoscrolls(true);
		lblProfessor_1.setAlignmentY(1.0f);
		lblProfessor_1.setBounds(0, 444, 181, 49);
		contentPane.add(lblProfessor_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 444, 111, 39);
		contentPane.add(textField_2);
		
		JButton btnVoltar_2_2 = new JButton("NOVO LOCAL");
		btnVoltar_2_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2_2.setBackground(Color.WHITE);
		btnVoltar_2_2.setBounds(337, 444, 207, 39);
		contentPane.add(btnVoltar_2_2);
		
		JLabel lblProfessor_1_1 = new JLabel("ALUNOS");
		lblProfessor_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor_1_1.setForeground(Color.WHITE);
		lblProfessor_1_1.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblProfessor_1_1.setAutoscrolls(true);
		lblProfessor_1_1.setAlignmentY(1.0f);
		lblProfessor_1_1.setBounds(0, 521, 181, 49);
		contentPane.add(lblProfessor_1_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("22");
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(182, 521, 59, 39);
		contentPane.add(textField_3);
	}
}

