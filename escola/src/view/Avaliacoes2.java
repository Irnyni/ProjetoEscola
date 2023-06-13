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
import java.awt.Choice;

public class Avaliacoes2 extends JFrame {
	

	private JPanel contentPane;
	private int cont;
	private int a;
	private JLabel lblTurmas;
	private JLabel lblInserirGuich;
	private JLabel lblMatruicula;
	private JLabel lblN;
	private JTextField textField;
	private JLabel lblTurmasParaLanamento;
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avaliacoes2 frame = new Avaliacoes2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public Avaliacoes2() {
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
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avaliacoes frame = new Avaliacoes();
				frame.setVisible(true);
				dispose();			
				}
		});
		btnVoltar.setBounds(30, 686, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnSeguir = new JButton("SAIR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAluno frame = new TelaAluno();
				frame.setVisible(true);
				dispose();		
			}
		});
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(601, 686, 148, 39);
		contentPane.add(btnSeguir);
		
		lblTurmas = new JLabel("AVALIAÇÕES");
		lblTurmas.setForeground(Color.WHITE);
		lblTurmas.setFont(new Font("Javanese Text", Font.BOLD, 50));
		lblTurmas.setAutoscrolls(true);
		lblTurmas.setAlignmentY(1.0f);
		lblTurmas.setBounds(405, 135, 344, 70);
		contentPane.add(lblTurmas);
		
		lblInserirGuich = new JLabel("VISUALIZAR");
		lblInserirGuich.setForeground(Color.WHITE);
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 99));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setAlignmentY(1.0f);
		lblInserirGuich.setBounds(10, 11, 638, 169);
		contentPane.add(lblInserirGuich);
		
		lblMatruicula = new JLabel("PERÍODO");
		lblMatruicula.setForeground(Color.WHITE);
		lblMatruicula.setFont(new Font("Javanese Text", Font.BOLD, 30));
		lblMatruicula.setAutoscrolls(true);
		lblMatruicula.setAlignmentY(1.0f);
		lblMatruicula.setBounds(383, 243, 158, 70);
		contentPane.add(lblMatruicula);
		
		lblN = new JLabel("NOTA");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setForeground(Color.WHITE);
		lblN.setFont(new Font("Javanese Text", Font.BOLD, 30));
		lblN.setAutoscrolls(true);
		lblN.setAlignmentY(1.0f);
		lblN.setBounds(602, 249, 105, 58);
		contentPane.add(lblN);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(71, 311, 243, 39);
		contentPane.add(textField);
		
		lblTurmasParaLanamento = new JLabel("AVALIAÇÃO");
		lblTurmasParaLanamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurmasParaLanamento.setForeground(Color.WHITE);
		lblTurmasParaLanamento.setFont(new Font("Javanese Text", Font.BOLD, 30));
		lblTurmasParaLanamento.setAutoscrolls(true);
		lblTurmasParaLanamento.setAlignmentY(1.0f);
		lblTurmasParaLanamento.setBounds(71, 243, 243, 70);
		contentPane.add(lblTurmasParaLanamento);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 369, 243, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(71, 427, 243, 39);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(71, 485, 243, 39);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(71, 541, 243, 39);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(404, 311, 105, 39);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(404, 369, 105, 39);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(404, 427, 105, 39);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(404, 485, 105, 39);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(404, 541, 105, 39);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(625, 311, 53, 39);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(625, 369, 53, 39);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(625, 427, 53, 39);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(625, 485, 53, 39);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(625, 541, 53, 39);
		contentPane.add(textField_14);
	}
}

