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

public class Inscricoes extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscricoes frame = new Inscricoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public Inscricoes() {
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
		
				JButton btnSalvar = new JButton("ANDAMENTO");
				btnSalvar.setBounds(159, 225, 451, 39);
				btnSalvar.setForeground(new Color(64, 0, 0));
				btnSalvar.setBackground(new Color(255, 255, 255));
				btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AndamentoInscricoes frame = new AndamentoInscricoes();
						frame.setVisible(true);
                        dispose();					
			
	
					}
				});
				btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
				contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("INSCRIÇÕES");
		lblInserirGuich.setBounds(148, 21, 482, 130);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 75));
		contentPane.add(lblInserirGuich);
		
		JButton btnCancelarInscricao = new JButton("CANCELAMENTO");
		btnCancelarInscricao.setBounds(159, 302, 451, 39);
		btnCancelarInscricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelarInscricao frame = new CancelarInscricao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCancelarInscricao.setForeground(new Color(64, 0, 0));
		btnCancelarInscricao.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCancelarInscricao.setBackground(new Color(255, 255, 255));
		contentPane.add(btnCancelarInscricao);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAluno frame = new TelaAluno();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(600, 696, 148, 39);
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVoltar);
		
		JButton btnBoletim = new JButton("REALIZAR INSCRIÇÃO");
		btnBoletim.setBounds(159, 376, 451, 39);
		btnBoletim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarInscricao frame = new RealizarInscricao();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnBoletim.setForeground(new Color(64, 0, 0));
		btnBoletim.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBoletim.setBackground(new Color(255, 255, 255));
		contentPane.add(btnBoletim);
		
		JButton btnSolicitarHistorico = new JButton("VISUALIZAR INSCRIÇÃO");
		btnSolicitarHistorico.setBounds(159, 453, 451, 39);
		btnSolicitarHistorico.setForeground(new Color(64, 0, 0));
		btnSolicitarHistorico.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSolicitarHistorico.setBackground(new Color(255, 255, 255));
		contentPane.add(btnSolicitarHistorico);
		
		JButton btnVisualizarGrade = new JButton("HABILITACOES");
		btnVisualizarGrade.setBounds(159, 519, 451, 39);
		btnVisualizarGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVisualizarGrade.setForeground(new Color(64, 0, 0));
		btnVisualizarGrade.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVisualizarGrade.setBackground(new Color(255, 255, 255));
		contentPane.add(btnVisualizarGrade);
	}
}

