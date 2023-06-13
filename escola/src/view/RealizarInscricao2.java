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
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class RealizarInscricao2 extends JFrame {

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
	private JLabel lblProfessor;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
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
	private JLabel lblHorrio;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JLabel lblDisciplinas_2;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JButton btnRevisar;
	private JButton btnFinalizar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarInscricao2 frame = new RealizarInscricao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public RealizarInscricao2() {
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
		
		JLabel lblInserirGuich = new JLabel("REALIZAR INSCRIÇÃO");
		lblInserirGuich.setForeground(Color.WHITE);
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 65));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setAlignmentY(1.0f);
		lblInserirGuich.setBounds(20, 22, 739, 112);
		contentPane.add(lblInserirGuich);
		
		JLabel lblDisciplinas = new JLabel("DISCIPLINA");
		lblDisciplinas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas.setForeground(Color.WHITE);
		lblDisciplinas.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDisciplinas.setAutoscrolls(true);
		lblDisciplinas.setAlignmentY(1.0f);
		lblDisciplinas.setBounds(20, 123, 164, 70);
		contentPane.add(lblDisciplinas);
		
		JLabel lblTurma = new JLabel("TURMA");
		lblTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurma.setForeground(Color.WHITE);
		lblTurma.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblTurma.setAutoscrolls(true);
		lblTurma.setAlignmentY(1.0f);
		lblTurma.setBounds(215, 123, 97, 70);
		contentPane.add(lblTurma);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 421, 163, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 450, 163, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 479, 163, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 508, 163, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(20, 537, 163, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(20, 566, 163, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(20, 595, 163, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(20, 624, 163, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(227, 624, 75, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(227, 595, 75, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(227, 566, 75, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(227, 537, 75, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(227, 508, 75, 19);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(227, 479, 75, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(227, 450, 75, 19);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(227, 421, 75, 19);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(20, 191, 163, 19);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(20, 220, 163, 19);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(20, 249, 163, 19);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(20, 278, 163, 19);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(20, 307, 163, 19);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(20, 336, 163, 19);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(20, 365, 163, 19);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(20, 394, 163, 19);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(227, 394, 75, 19);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(227, 365, 75, 19);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(227, 336, 75, 19);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(227, 307, 75, 19);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(227, 278, 75, 19);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(227, 249, 75, 19);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(227, 220, 75, 19);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(227, 191, 75, 19);
		contentPane.add(textField_31);
		
		lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(333, 123, 164, 70);
		contentPane.add(lblProfessor);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(333, 421, 163, 19);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(333, 450, 163, 19);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(333, 479, 163, 19);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(333, 508, 163, 19);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(333, 537, 163, 19);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(333, 566, 163, 19);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(333, 595, 163, 19);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(333, 624, 163, 19);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(333, 191, 163, 19);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(333, 220, 163, 19);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(333, 249, 163, 19);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(333, 278, 163, 19);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(333, 307, 163, 19);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(333, 336, 163, 19);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(333, 365, 163, 19);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(333, 394, 163, 19);
		contentPane.add(textField_47);
		
		lblHorrio = new JLabel("HORÁRIO");
		lblHorrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorrio.setForeground(Color.WHITE);
		lblHorrio.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblHorrio.setAutoscrolls(true);
		lblHorrio.setAlignmentY(1.0f);
		lblHorrio.setBounds(536, 123, 86, 70);
		contentPane.add(lblHorrio);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(536, 421, 86, 19);
		contentPane.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(536, 450, 86, 19);
		contentPane.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(536, 479, 86, 19);
		contentPane.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(536, 508, 86, 19);
		contentPane.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(536, 537, 86, 19);
		contentPane.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(536, 566, 86, 19);
		contentPane.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(536, 595, 86, 19);
		contentPane.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(536, 624, 86, 19);
		contentPane.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(536, 191, 86, 19);
		contentPane.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(536, 220, 86, 19);
		contentPane.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(536, 249, 86, 19);
		contentPane.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(536, 278, 86, 19);
		contentPane.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(536, 307, 86, 19);
		contentPane.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(536, 336, 86, 19);
		contentPane.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(536, 365, 86, 19);
		contentPane.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(536, 394, 86, 19);
		contentPane.add(textField_63);
		
		lblDisciplinas_2 = new JLabel("LOCAL");
		lblDisciplinas_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas_2.setForeground(Color.WHITE);
		lblDisciplinas_2.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDisciplinas_2.setAutoscrolls(true);
		lblDisciplinas_2.setAlignmentY(1.0f);
		lblDisciplinas_2.setBounds(659, 123, 84, 70);
		contentPane.add(lblDisciplinas_2);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(659, 421, 84, 19);
		contentPane.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(659, 450, 84, 19);
		contentPane.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(659, 479, 84, 19);
		contentPane.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(659, 508, 84, 19);
		contentPane.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(659, 537, 84, 19);
		contentPane.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(659, 566, 84, 19);
		contentPane.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(659, 595, 84, 19);
		contentPane.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(659, 624, 84, 19);
		contentPane.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(659, 191, 84, 19);
		contentPane.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(659, 220, 84, 19);
		contentPane.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(659, 249, 84, 19);
		contentPane.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(659, 278, 84, 19);
		contentPane.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(659, 307, 84, 19);
		contentPane.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(659, 336, 84, 19);
		contentPane.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(659, 365, 84, 19);
		contentPane.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(659, 394, 84, 19);
		contentPane.add(textField_79);
		
		btnRevisar = new JButton("REVISAR");
		btnRevisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarInscricao frame = new RealizarInscricao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRevisar.setForeground(new Color(64, 0, 0));
		btnRevisar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnRevisar.setBackground(Color.WHITE);
		btnRevisar.setBounds(31, 691, 148, 39);
		contentPane.add(btnRevisar);
		
		btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaAluno frame = new TelaAluno ();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFinalizar.setForeground(new Color(64, 0, 0));
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnFinalizar.setBackground(Color.WHITE);
		btnFinalizar.setBounds(557, 691, 193, 39);
		contentPane.add(btnFinalizar);
	}
}

