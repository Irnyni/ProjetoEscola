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
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Component;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.TextArea;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;

import org.junit.Assert;

import controller.Inscricao_Controller;
import model.Disciplina;
import model.Turma;

import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class RealizarInscricao extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	private JToggleButton tglbtnGeografiaAno;
	ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
	ArrayList<Turma> listaTurma = new ArrayList<Turma>();
	ArrayList<Turma> turmasComValoresIguais = new ArrayList<Turma>(); 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarInscricao frame = new RealizarInscricao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public RealizarInscricao() {
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
				Inscricoes frame = new Inscricoes();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(20, 693, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JLabel lblInserirGuich = new JLabel("REALIZAR INSCRIÇÃO");
		lblInserirGuich.setForeground(Color.WHITE);
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 65));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setAlignmentY(1.0f);
		lblInserirGuich.setBounds(20, 22, 739, 112);
		contentPane.add(lblInserirGuich);
		
		JToggleButton btnSalvar = new JToggleButton("BIOLOGIA 5 ANO TURMA D");

		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Disciplina d = new Disciplina("Biologia", "BIO", "Biologia médio", true);
			    Turma t = new Turma("Juliano", 2, 2022, 20, "SALA 5", "DIURNO2");
		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
				
			}
		});


		btnSalvar.setHideActionText(true);
		btnSalvar.setFocusPainted(false);
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar.setBackground(new Color(255, 255, 255));
		btnSalvar.setBounds(154, 203, 455, 39);
		contentPane.add(btnSalvar);
		
		JToggleButton tglbtnMatemticaAno = new JToggleButton("MATEMÁTICA 5 ANO TURMA A");
		tglbtnMatemticaAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Disciplina d = new Disciplina("Matemática", "MT", "Matemática básica", true);	
			    Turma t = new Turma("João", 1, 2022, 22, "SALA 3", "DIURNO1");
		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
		          
			}
		});
		tglbtnMatemticaAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnMatemticaAno.setFocusPainted(false);
		tglbtnMatemticaAno.setForeground(new Color(64, 0, 0));
		tglbtnMatemticaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnMatemticaAno.setBackground(Color.WHITE);
		tglbtnMatemticaAno.setBounds(154, 260, 455, 39);
		contentPane.add(tglbtnMatemticaAno);
		
		JToggleButton tglbtnHistoriaAno = new JToggleButton("FILOSOFIA 5 ANO TURMA D");
		tglbtnHistoriaAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Disciplina d = new Disciplina("Filosofia", "FIL", "Filosofia Médio", true);
			    Turma t = new Turma("Maria", 1, 2022, 24, "SALA 7", "VESPERTINO3");
		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
		        int quantidadeAlunos = t.getQtdeAlunos();

				
			}
		});
		tglbtnHistoriaAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnHistoriaAno.setFocusPainted(false);
		tglbtnHistoriaAno.setForeground(new Color(64, 0, 0));
		tglbtnHistoriaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnHistoriaAno.setBackground(Color.WHITE);
		tglbtnHistoriaAno.setBounds(154, 319, 455, 39);
		contentPane.add(tglbtnHistoriaAno);
		
		tglbtnGeografiaAno = new JToggleButton("GEOGRAFIA 5 ANO TURMA D");
		tglbtnGeografiaAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = new Disciplina("Geografia", "GEO", "Geografia básica", true);
				Turma t = new Turma("Carlos", 2, 2022, 20, "SALA 3", "VESPERTINO2");
		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
			}
		});
		tglbtnGeografiaAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnGeografiaAno.setFocusPainted(false);
		tglbtnGeografiaAno.setForeground(new Color(64, 0, 0));
		tglbtnGeografiaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnGeografiaAno.setBackground(Color.WHITE);
		tglbtnGeografiaAno.setBounds(154, 378, 455, 39);
		contentPane.add(tglbtnGeografiaAno);
		
		JToggleButton tglbtnArtesAno = new JToggleButton("INGLÊS 5 ANO TURMA A");
		tglbtnArtesAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = new Disciplina("Inglês", "ING", "Inglês Intermediário", true);
				Turma t = new Turma("Lucia", 2, 2022, 15, "SALA 8", "VESPERTINO1");

		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
			}
		});
		tglbtnArtesAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnArtesAno.setFocusPainted(false);
		tglbtnArtesAno.setForeground(new Color(64, 0, 0));
		tglbtnArtesAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnArtesAno.setBackground(Color.WHITE);
		tglbtnArtesAno.setBounds(154, 436, 455, 39);
		contentPane.add(tglbtnArtesAno);
		
		JToggleButton tglbtnPortugsAno = new JToggleButton("QUÍMICA 5 ANO TURMA D");
		tglbtnPortugsAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = new Disciplina("Química Orgânica", "QUI", "Química Avançada", true);
				Turma t = new Turma("Mariana", 1, 2023, 35, "LAB 2", "DIURNO2");

		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
			}
		});
		tglbtnPortugsAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnPortugsAno.setFocusPainted(false);
		tglbtnPortugsAno.setForeground(new Color(64, 0, 0));
		tglbtnPortugsAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnPortugsAno.setBackground(Color.WHITE);
		tglbtnPortugsAno.setBounds(154, 494, 455, 39);
		contentPane.add(tglbtnPortugsAno);
		
		JToggleButton tglbtnPortugusAno = new JToggleButton("BIOLOGIA  ANO TURMA C");
		tglbtnPortugusAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = new Disciplina("Biologia Avançada", "BIO", "Biologia médio", true);
				Turma t = new Turma("Luciana", 2, 2022, 25, "SALA 7", "DIURNO1");

		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
			}
		});
		tglbtnPortugusAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnPortugusAno.setFocusPainted(false);
		tglbtnPortugusAno.setForeground(new Color(64, 0, 0));
		tglbtnPortugusAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnPortugusAno.setBackground(Color.WHITE);
		tglbtnPortugusAno.setBounds(154, 555, 455, 39);
		contentPane.add(tglbtnPortugusAno);
		
		JToggleButton tglbtnBiologiaAno = new JToggleButton("BIOLOGIA AV 6 ANO TURMA D");
		tglbtnBiologiaAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Disciplina d = new Disciplina("Biologia", "BIO", "Biologia médio", true);
			    Turma t = new Turma("Glauber", 2, 2022, 25, "SALA 5", "NOTURNO");
		        lista.addAll(Arrays.asList(d));
		        listaTurma.addAll(Arrays.asList(t));
		        System.out.println(lista);
		        System.out.println(listaTurma);
			}
		});
		tglbtnBiologiaAno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnBiologiaAno.setFocusPainted(false);
		tglbtnBiologiaAno.setForeground(new Color(64, 0, 0));
		tglbtnBiologiaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnBiologiaAno.setBackground(Color.WHITE);
		tglbtnBiologiaAno.setBounds(154, 613, 455, 39);
		contentPane.add(tglbtnBiologiaAno);
		
		JButton btnSeguir = new JButton("SEGUIR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantidade = lista.size();
				if(quantidade>4) {
					Excessodisc frame = new Excessodisc();
					frame.setVisible(true);
					dispose();
				     dispose();
					
					
				}
				

				else {
		          Iterator<Turma> iterator = listaTurma.iterator();
		            while (iterator.hasNext()) {
		                Turma turma = iterator.next();
		                int quantidadeAlunos = turma.getQtdeAlunos();
		                System.out.println(quantidadeAlunos);
		                
		                // Verifica se a quantidade de alunos é igual a 25
		                if (quantidadeAlunos >= 25) {
		                    ExListaEspera frame = new ExListaEspera();
		                   
		                    frame.setVisible(true);
		                    dispose();   
		                    iterator.remove(); // Remove o item da lista
		                }
		                
		                
		                else {
		                	
		                	Inscricao_Controller controll = new Inscricao_Controller();
		                	controll.apresentarDiscipina(listaTurma,lista);
				            dispose();
				        	
			            }
		                
		                
		                boolean haValoresIguais = false;
			            for (int i = 0; i < listaTurma.size() - 1; i++) {
			                for (int j = i + 1; j < listaTurma.size(); j++) {
			                    if (listaTurma.get(i).getHorarioAula() == listaTurma.get(j).getHorarioAula()) {
			                        haValoresIguais = true;
			                        if (haValoresIguais) {
			                        	
					                    turmasComValoresIguais.add(turma); // Adiciona a turma à lista de turmas com valores iguais
					                    System.out.println("turma repetidas"+turmasComValoresIguais);
					                }
			                        break;
			                    }
			                }
			                if (haValoresIguais) {
			                    break;
			                }
			                
			               
			            }

			            if (haValoresIguais) {
			            	ExcessaoHorario frame = new ExcessaoHorario();
			            	frame.enviaDados(listaTurma,lista);
			            	frame.setVisible(true);
			                dispose();
			            } 
		            }
				

			}
			}
		});
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(611, 693, 148, 39);
		contentPane.add(btnSeguir);
		
		JLabel lblTurmas = new JLabel("TURMAS");
		lblTurmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurmas.setForeground(Color.WHITE);
		lblTurmas.setFont(new Font("Javanese Text", Font.BOLD, 45));
		lblTurmas.setAutoscrolls(true);
		lblTurmas.setAlignmentY(1.0f);
		lblTurmas.setBounds(154, 126, 455, 98);
		contentPane.add(lblTurmas);
	}
}

