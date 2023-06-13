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

public class CancelarInscricao extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelarInscricao frame = new CancelarInscricao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public CancelarInscricao() {
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
		
		JLabel lblCancelarInscrio = new JLabel("CANCELAMENTO");
		lblCancelarInscrio.setForeground(Color.WHITE);
		lblCancelarInscrio.setFont(new Font("Javanese Text", Font.BOLD, 75));
		lblCancelarInscrio.setAutoscrolls(true);
		lblCancelarInscrio.setAlignmentY(1.0f);
		lblCancelarInscrio.setBounds(56, 27, 672, 98);
		contentPane.add(lblCancelarInscrio);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscricoes frame = new Inscricoes();
				frame.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(new Color(64, 0, 0));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(20, 682, 148, 39);
		contentPane.add(btnVoltar);
		
		JButton btnSeguir = new JButton("SALVAR");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeguir.setForeground(new Color(64, 0, 0));
		btnSeguir.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSeguir.setBackground(Color.WHITE);
		btnSeguir.setBounds(611, 682, 148, 39);
		contentPane.add(btnSeguir);
		
		JToggleButton btnSalvar = new JToggleButton("BIOLOGIA 5 ANO TURMA D");
		btnSalvar.setHideActionText(true);
		btnSalvar.setForeground(new Color(64, 0, 0));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSalvar.setFocusPainted(false);
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(155, 221, 455, 39);
		contentPane.add(btnSalvar);
		
		JToggleButton tglbtnMatemticaAno = new JToggleButton("MATEMÁTICA 5 ANO TURMA A");
		tglbtnMatemticaAno.setForeground(new Color(64, 0, 0));
		tglbtnMatemticaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnMatemticaAno.setFocusPainted(false);
		tglbtnMatemticaAno.setBackground(Color.WHITE);
		tglbtnMatemticaAno.setBounds(155, 292, 455, 39);
		contentPane.add(tglbtnMatemticaAno);
		
		JToggleButton tglbtnHistoriaAno = new JToggleButton("HISTORIA 5 ANO TURMA D");
		tglbtnHistoriaAno.setForeground(new Color(64, 0, 0));
		tglbtnHistoriaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnHistoriaAno.setFocusPainted(false);
		tglbtnHistoriaAno.setBackground(Color.WHITE);
		tglbtnHistoriaAno.setBounds(155, 360, 455, 39);
		contentPane.add(tglbtnHistoriaAno);
		
		JToggleButton tglbtnGeografiaAno = new JToggleButton("GEOGRAFIA 5 ANO TURMA D");
		tglbtnGeografiaAno.setForeground(new Color(64, 0, 0));
		tglbtnGeografiaAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnGeografiaAno.setFocusPainted(false);
		tglbtnGeografiaAno.setBackground(Color.WHITE);
		tglbtnGeografiaAno.setBounds(155, 427, 455, 39);
		contentPane.add(tglbtnGeografiaAno);
		
		JToggleButton tglbtnArtesAno = new JToggleButton("ARTES 5 ANO TURMA A");
		tglbtnArtesAno.setForeground(new Color(64, 0, 0));
		tglbtnArtesAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnArtesAno.setFocusPainted(false);
		tglbtnArtesAno.setBackground(Color.WHITE);
		tglbtnArtesAno.setBounds(155, 497, 455, 39);
		contentPane.add(tglbtnArtesAno);
		
		JToggleButton tglbtnPortugsAno = new JToggleButton("PORTUGÊS 5 ANO TURMA D");
		tglbtnPortugsAno.setForeground(new Color(64, 0, 0));
		tglbtnPortugsAno.setFont(new Font("Tahoma", Font.BOLD, 25));
		tglbtnPortugsAno.setFocusPainted(false);
		tglbtnPortugsAno.setBackground(Color.WHITE);
		tglbtnPortugsAno.setBounds(155, 566, 455, 39);
		contentPane.add(tglbtnPortugsAno);
		
		JLabel lblTurmas = new JLabel("INSCRIÇÕES REALIZADAS");
		lblTurmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurmas.setForeground(Color.WHITE);
		lblTurmas.setFont(new Font("Javanese Text", Font.BOLD, 40));
		lblTurmas.setAutoscrolls(true);
		lblTurmas.setAlignmentY(1.0f);
		lblTurmas.setBounds(76, 123, 620, 98);
		contentPane.add(lblTurmas);
	}
}

