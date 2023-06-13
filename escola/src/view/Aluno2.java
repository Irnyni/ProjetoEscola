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
import java.awt.TextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JEditorPane;



public class Aluno2 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno2 frame = new Aluno2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public Aluno2() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("SALVAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login frame = new login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(601, 690, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnVoltar_2 = new JButton("VOLTAR");
		btnVoltar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gestao frame = new Gestao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2.setBackground(Color.WHITE);
		btnVoltar_2.setBounds(32, 690, 148, 39);
		contentPane.add(btnVoltar_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane.setBounds(224, 211, 391, 39);
		contentPane.add(editorPane);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblNome.setAutoscrolls(true);
		lblNome.setAlignmentY(1.0f);
		lblNome.setBounds(103, 209, 87, 53);
		contentPane.add(lblNome);
		
		JLabel lblInserirGuich = new JLabel("ALUNO");
		lblInserirGuich.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirGuich.setForeground(Color.WHITE);
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 99));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setAlignmentY(1.0f);
		lblInserirGuich.setBounds(167, 25, 455, 145);
		contentPane.add(lblInserirGuich);
		
		JLabel lblSigla = new JLabel("PRONTUÁRIO");
		lblSigla.setHorizontalAlignment(SwingConstants.CENTER);
		lblSigla.setForeground(Color.WHITE);
		lblSigla.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblSigla.setAutoscrolls(true);
		lblSigla.setAlignmentY(1.0f);
		lblSigla.setBounds(10, 373, 189, 51);
		contentPane.add(lblSigla);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane_1.setBounds(224, 373, 148, 39);
		contentPane.add(editorPane_1);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblCpf.setAutoscrolls(true);
		lblCpf.setAlignmentY(1.0f);
		lblCpf.setBounds(134, 457, 56, 51);
		contentPane.add(lblCpf);
		
		JEditorPane editorPane_1_1 = new JEditorPane();
		editorPane_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		editorPane_1_1.setBounds(224, 457, 212, 39);
		contentPane.add(editorPane_1_1);
		
		JLabel lblDataNasc = new JLabel("DATA NASC.");
		lblDataNasc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataNasc.setForeground(Color.WHITE);
		lblDataNasc.setFont(new Font("Javanese Text", Font.BOLD, 25));
		lblDataNasc.setAutoscrolls(true);
		lblDataNasc.setAlignmentY(1.0f);
		lblDataNasc.setBounds(32, 289, 166, 51);
		contentPane.add(lblDataNasc);
		
		JEditorPane editorPane_1_2 = new JEditorPane();
		editorPane_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane_1_2.setBounds(224, 289, 148, 39);
		contentPane.add(editorPane_1_2);
	}
}

