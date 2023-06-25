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



public class ExListaEspera extends JFrame {

	private JPanel contentPane;
	private int cont;
	private int a;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public ExListaEspera() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 50, 800, 800);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(30, 10));
		contentPane.setBackground(new Color(47, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JLabel lblInserirGuich = new JLabel("TURMA FECHADA!");
		lblInserirGuich.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirGuich.setBounds(21, 78, 744, 239);
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Javanese Text", Font.BOLD, 73));
		contentPane.add(lblInserirGuich);
		
		JButton btnVoltar_2 = new JButton("VOLTAR");
		btnVoltar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarInscricao frame = new RealizarInscricao ();
				frame.setVisible(true);
				dispose();
			    dispose();
			}
		});
		btnVoltar_2.setForeground(new Color(64, 0, 0));
		btnVoltar_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2.setBackground(Color.WHITE);
		btnVoltar_2.setBounds(136, 428, 148, 39);
		contentPane.add(btnVoltar_2);
		
		JButton btnVoltar_2_1 = new JButton("LISTA DE ESPERA");
		btnVoltar_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListaEspera frame = new ListaEspera();
				frame.setVisible(true);
				dispose();			}
		});
		btnVoltar_2_1.setForeground(new Color(64, 0, 0));
		btnVoltar_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnVoltar_2_1.setBackground(Color.WHITE);
		btnVoltar_2_1.setBounds(399, 428, 308, 39);
		contentPane.add(btnVoltar_2_1);
	}
}

