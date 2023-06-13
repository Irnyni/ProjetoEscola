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

public class ListaEspera4 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEspera4 frame = new ListaEspera4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public ListaEspera4() {
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
		
		JButton btnSeguir = new JButton("AVANÇAR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaEspera5 frame = new ListaEspera5();
				frame.setVisible(true);
				dispose();
			}
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
		
		JLabel lblProfessor = new JLabel("PROFESSORES DISPONÍVIES");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(55, 193, 261, 70);
		contentPane.add(lblProfessor);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(55, 273, 261, 39);
		contentPane.add(textField);
		
		JLabel lblDisciplinas = new JLabel("LOCAL");
		lblDisciplinas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas.setForeground(Color.WHITE);
		lblDisciplinas.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDisciplinas.setAutoscrolls(true);
		lblDisciplinas.setAlignmentY(1.0f);
		lblDisciplinas.setBounds(390, 193, 96, 70);
		contentPane.add(lblDisciplinas);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 328, 261, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(55, 386, 261, 39);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(55, 444, 261, 39);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(55, 500, 261, 39);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(55, 562, 261, 39);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(390, 273, 96, 39);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(390, 328, 96, 39);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(390, 386, 96, 39);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(390, 499, 96, 39);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(390, 444, 96, 39);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(390, 557, 96, 39);
		contentPane.add(textField_11);
	}
}

