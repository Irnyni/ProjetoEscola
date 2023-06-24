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
import javax.swing.border.LineBorder;

public class RealizarInscricao2 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private Disciplina a;
	private JLabel lblProfessor;
	private JLabel lblHorrio;
	private JTable table;
	ArrayList<Disciplina> listas = new ArrayList<Disciplina>();
	private String[][] matrizes;
	private ArrayList<Turma> dados;
	private ArrayList<Disciplina> dados1;
	private JTable table_1;
	public void enviaDados(ArrayList<Turma> listaTurma, ArrayList<Disciplina> lista) {
	
	  dados=listaTurma;
	  dados1=lista;
	  ArrayList<Disciplina> dados2 = lista;
          table.setBounds(20, 203, 723, 341);
          contentPane.add(table);
         
          String[] columnNames = {"Materia", "Professor", "Sigla", "Descrição", "Status"};
          DefaultTableModel model = new DefaultTableModel(columnNames, 0);
          table.setModel(model);

          if (dados != null && dados1 != null) {
              int tamanho = Math.min(dados.size(), dados1.size()); // Obtém o tamanho mínimo entre as duas listas

              for (int i = 0; i < tamanho; i++) {
                  Disciplina disciplina = dados1.get(i);
                  Turma turma = dados.get(i);

                  Object[] rowData = {disciplina.getNomeDisc(), turma.getNomeProf(), turma.getQtdeAlunos(), turma.getHorarioAula(), turma.getLocalAula()};
                  model.addRow(rowData);
              }

              if (dados.size() > tamanho) {
                  for (int i = tamanho; i < dados.size(); i++) {
                      Disciplina disciplina = dados1.get(i);
                      Object[] rowData = {disciplina.getNomeDisc(), "", "", "", ""}; // Turma não disponível
                      model.addRow(rowData);
                  }
              } else if (dados1.size() > tamanho) {
                  for (int i = tamanho; i < dados1.size(); i++) {
                      Turma turma = dados.get(i);
                      Object[] rowData = {"", turma.getNomeProf(), turma.getQtdeAlunos(), turma.getHorarioAula(), turma.getLocalAula()}; // Disciplina não disponível
                      model.addRow(rowData);
                  }
              }
          }

	  }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarInscricao2 frame = new RealizarInscricao2();
					
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
		
		JLabel lblDisciplinas = new JLabel("PROFESSOR");
		lblDisciplinas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas.setForeground(Color.WHITE);
		lblDisciplinas.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblDisciplinas.setAutoscrolls(true);
		lblDisciplinas.setAlignmentY(1.0f);
		lblDisciplinas.setBounds(133, 123, 164, 70);
		contentPane.add(lblDisciplinas);
		
		JLabel lblTurma = new JLabel("ALUNOS");
		lblTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurma.setForeground(Color.WHITE);
		lblTurma.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblTurma.setAutoscrolls(true);
		lblTurma.setAlignmentY(1.0f);
		lblTurma.setBounds(297, 123, 97, 70);
		contentPane.add(lblTurma);
		
		lblProfessor = new JLabel("HORÁRIO");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(Color.WHITE);
		lblProfessor.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblProfessor.setAutoscrolls(true);
		lblProfessor.setAlignmentY(1.0f);
		lblProfessor.setBounds(415, 123, 164, 70);
		contentPane.add(lblProfessor);
		
		lblHorrio = new JLabel("LOCAL");
		lblHorrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorrio.setForeground(Color.WHITE);
		lblHorrio.setFont(new Font("Javanese Text", Font.BOLD, 15));
		lblHorrio.setAutoscrolls(true);
		lblHorrio.setAlignmentY(1.0f);
		lblHorrio.setBounds(581, 123, 86, 70);
		contentPane.add(lblHorrio);
		
		JButton btnRevisar = new JButton("REVISAR");
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
		btnRevisar.setBounds(33, 687, 148, 39);
		contentPane.add(btnRevisar);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IncrOK frame = new IncrOK();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFinalizar.setForeground(new Color(64, 0, 0));
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnFinalizar.setBackground(Color.WHITE);
		btnFinalizar.setBounds(562, 687, 193, 39);
		contentPane.add(btnFinalizar);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setForeground(new Color(64, 0, 0));
		table.setColumnSelectionAllowed(true);
		table.setFont(new Font("Serif", Font.BOLD, 17));
		table.setBounds(20, 203, 739, 444);
		contentPane.add(table);
        
        
        // Define o fundo preto e letras brancas
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        
        JLabel lblMatria = new JLabel("MATÉRIA");
        lblMatria.setHorizontalAlignment(SwingConstants.CENTER);
        lblMatria.setForeground(Color.WHITE);
        lblMatria.setFont(new Font("Javanese Text", Font.BOLD, 15));
        lblMatria.setAutoscrolls(true);
        lblMatria.setAlignmentY(1.0f);
        lblMatria.setBounds(-13, 123, 164, 70);
        contentPane.add(lblMatria);
	
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

