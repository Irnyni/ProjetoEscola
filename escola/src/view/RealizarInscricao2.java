package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Disciplina;
import model.Turma;

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
import javax.swing.JScrollPane;

import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTable;

public class RealizarInscricao2 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private Disciplina a;
	private JLabel lblProfessor;
	private JLabel lblHorrio;
	private JLabel lblDisciplinas_2;
	private JTable table;
	ArrayList<Disciplina> listas = new ArrayList<Disciplina>();
	private String[][] matrizes;
	private ArrayList<Disciplina> dados;
	public void enviaDados(ArrayList<Disciplina> lista) {
	
	  dados=lista;

          // Faça algo com cada disciplina
        
          table = new JTable();
          table.setBounds(20, 203, 723, 341);
          contentPane.add(table);

          String[] columnNames = {"Nome", "Sigla", "Descrição", "Status"};
          DefaultTableModel model = new DefaultTableModel(columnNames, 0);
          table.setModel(model);

          if (dados != null) {
              for (Disciplina disciplina : dados) {
                  Object[] rowData = {disciplina.getNomeDisc(), disciplina.getSigla(), disciplina.getDescricao(), disciplina.getNomeDisc()};
                  model.addRow(rowData);
              }
          }
	  }
	
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
		
		lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(333, 123, 164, 70);
		contentPane.add(lblProfessor);
		
		lblHorrio = new JLabel("HORÁRIO");
		lblHorrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorrio.setForeground(Color.WHITE);
		lblHorrio.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblHorrio.setAutoscrolls(true);
		lblHorrio.setAlignmentY(1.0f);
		lblHorrio.setBounds(536, 123, 86, 70);
		contentPane.add(lblHorrio);
		
		lblDisciplinas_2 = new JLabel("LOCAL");
		lblDisciplinas_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas_2.setForeground(Color.WHITE);
		lblDisciplinas_2.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDisciplinas_2.setAutoscrolls(true);
		lblDisciplinas_2.setAlignmentY(1.0f);
		lblDisciplinas_2.setBounds(659, 123, 84, 70);
		contentPane.add(lblDisciplinas_2);
		
		
	
//	    if (dados != null) {
//	    	
//	    	 for (Disciplina disciplina : dados) {
//	    	        Object[] rowData = {disciplina.getNomeDisc(), disciplina.getSigla(), disciplina.getDescricao()};
//	    	        model.addRow(rowData);
//	    	    }
//
//	    
//	    	    table.setModel(model);
//	    	
//	    	
//	        }
//		
		
         
 
			
	
        
		

		
	}


}

