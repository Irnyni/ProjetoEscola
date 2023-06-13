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
import javax.swing.JToggleButton;
import java.awt.Choice;
import java.awt.Checkbox;



public class Aluno3 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JToggleButton tglbtnBuscar_2;
	private JToggleButton tglbtnBuscar_3;
	private JToggleButton tglbtnBuscar_4;
	private JToggleButton tglbtnBuscar_5;
	private JToggleButton tglbtnBuscar_6;
	private JToggleButton tglbtnBuscar_7;
	private JToggleButton tglbtnBuscar_8;
	private JToggleButton tglbtnBuscar_9;
	private JToggleButton tglbtnBuscar_10;
	private JToggleButton tglbtnBuscar_11;
	private JToggleButton tglbtnBuscar_12;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aluno3 frame = new Aluno3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public Aluno3() {
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

		JLabel lblInserirGuich = new JLabel("ALUNO");
		lblInserirGuich.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirGuich.setBounds(55, 11, 645, 145);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 99));
		contentPane.add(lblInserirGuich);
		
		JButton btnVoltar = new JButton("EDITAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno2 frame = new Aluno2();
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
		
		TextField textField = new TextField();
		textField.setBounds(50, 162, 497, 39);
		contentPane.add(textField);
		
		JToggleButton tglbtnBuscar = new JToggleButton("BUSCAR");
		tglbtnBuscar.setForeground(new Color(64, 0, 0));
		tglbtnBuscar.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar.setBackground(Color.WHITE);
		tglbtnBuscar.setBounds(575, 162, 148, 39);
		contentPane.add(tglbtnBuscar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setForeground(new Color(64, 0, 0));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setBounds(314, 690, 148, 39);
		contentPane.add(btnExcluir);
		
		JLabel lblTurmasParaLanamento = new JLabel("LISTA DOS ALUNOS");
		lblTurmasParaLanamento.setForeground(Color.WHITE);
		lblTurmasParaLanamento.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblTurmasParaLanamento.setAutoscrolls(true);
		lblTurmasParaLanamento.setAlignmentY(1.0f);
		lblTurmasParaLanamento.setBounds(101, 225, 153, 70);
		contentPane.add(lblTurmasParaLanamento);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(349, 496, 75, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(349, 467, 75, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(349, 438, 75, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(349, 409, 75, 19);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(349, 380, 75, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(349, 351, 75, 19);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(349, 322, 75, 19);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(349, 293, 75, 19);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(472, 293, 109, 19);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(472, 322, 109, 19);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(472, 351, 109, 19);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(472, 380, 109, 19);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(472, 409, 109, 19);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(472, 438, 109, 19);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(472, 467, 109, 19);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(472, 496, 109, 19);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(622, 496, 109, 19);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(622, 467, 109, 19);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(622, 438, 109, 19);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(622, 409, 109, 19);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(622, 351, 109, 19);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(622, 380, 109, 19);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(622, 322, 109, 19);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(622, 293, 109, 19);
		contentPane.add(textField_32);
		
		JLabel lblDataNasc = new JLabel("DATA NASC.");
		lblDataNasc.setForeground(Color.WHITE);
		lblDataNasc.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDataNasc.setAutoscrolls(true);
		lblDataNasc.setAlignmentY(1.0f);
		lblDataNasc.setBounds(337, 225, 97, 70);
		contentPane.add(lblDataNasc);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblCpf.setAutoscrolls(true);
		lblCpf.setAlignmentY(1.0f);
		lblCpf.setBounds(472, 225, 109, 70);
		contentPane.add(lblCpf);
		
		JLabel lblProntuario = new JLabel("PRONTUÁRIO");
		lblProntuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblProntuario.setForeground(Color.WHITE);
		lblProntuario.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblProntuario.setAutoscrolls(true);
		lblProntuario.setAlignmentY(1.0f);
		lblProntuario.setBounds(622, 225, 109, 70);
		contentPane.add(lblProntuario);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(349, 525, 75, 19);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(349, 554, 75, 19);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(349, 583, 75, 19);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(349, 612, 75, 19);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(472, 612, 109, 19);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(472, 583, 109, 19);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(472, 554, 109, 19);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(472, 525, 109, 19);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(622, 525, 109, 19);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(622, 554, 109, 19);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(622, 583, 109, 19);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(622, 612, 109, 19);
		contentPane.add(textField_48);
		
		JToggleButton tglbtnBuscar_1 = new JToggleButton("");
		tglbtnBuscar_1.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_1.setBackground(Color.WHITE);
		tglbtnBuscar_1.setBounds(50, 293, 243, 19);
		contentPane.add(tglbtnBuscar_1);
		
		tglbtnBuscar_2 = new JToggleButton("");
		tglbtnBuscar_2.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_2.setBackground(Color.WHITE);
		tglbtnBuscar_2.setBounds(50, 321, 243, 19);
		contentPane.add(tglbtnBuscar_2);
		
		tglbtnBuscar_3 = new JToggleButton("");
		tglbtnBuscar_3.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_3.setBackground(Color.WHITE);
		tglbtnBuscar_3.setBounds(50, 350, 243, 19);
		contentPane.add(tglbtnBuscar_3);
		
		tglbtnBuscar_4 = new JToggleButton("");
		tglbtnBuscar_4.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_4.setBackground(Color.WHITE);
		tglbtnBuscar_4.setBounds(50, 379, 243, 19);
		contentPane.add(tglbtnBuscar_4);
		
		tglbtnBuscar_5 = new JToggleButton("");
		tglbtnBuscar_5.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_5.setBackground(Color.WHITE);
		tglbtnBuscar_5.setBounds(50, 408, 243, 19);
		contentPane.add(tglbtnBuscar_5);
		
		tglbtnBuscar_6 = new JToggleButton("");
		tglbtnBuscar_6.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_6.setBackground(Color.WHITE);
		tglbtnBuscar_6.setBounds(50, 437, 243, 19);
		contentPane.add(tglbtnBuscar_6);
		
		tglbtnBuscar_7 = new JToggleButton("");
		tglbtnBuscar_7.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_7.setBackground(Color.WHITE);
		tglbtnBuscar_7.setBounds(50, 466, 243, 19);
		contentPane.add(tglbtnBuscar_7);
		
		tglbtnBuscar_8 = new JToggleButton("");
		tglbtnBuscar_8.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_8.setBackground(Color.WHITE);
		tglbtnBuscar_8.setBounds(50, 495, 243, 19);
		contentPane.add(tglbtnBuscar_8);
		
		tglbtnBuscar_9 = new JToggleButton("");
		tglbtnBuscar_9.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_9.setBackground(Color.WHITE);
		tglbtnBuscar_9.setBounds(50, 524, 243, 19);
		contentPane.add(tglbtnBuscar_9);
		
		tglbtnBuscar_10 = new JToggleButton("");
		tglbtnBuscar_10.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_10.setBackground(Color.WHITE);
		tglbtnBuscar_10.setBounds(50, 553, 243, 19);
		contentPane.add(tglbtnBuscar_10);
		
		tglbtnBuscar_11 = new JToggleButton("");
		tglbtnBuscar_11.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_11.setBackground(Color.WHITE);
		tglbtnBuscar_11.setBounds(50, 582, 243, 19);
		contentPane.add(tglbtnBuscar_11);
		
		tglbtnBuscar_12 = new JToggleButton("");
		tglbtnBuscar_12.setForeground(new Color(64, 0, 0));
		tglbtnBuscar_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBuscar_12.setBackground(Color.WHITE);
		tglbtnBuscar_12.setBounds(50, 611, 243, 19);
		contentPane.add(tglbtnBuscar_12);
	}
}

