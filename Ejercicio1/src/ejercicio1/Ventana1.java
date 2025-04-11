package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JTextArea txtS;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer Numero :");
		lblNewLabel.setBounds(10, 22, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Numero : ");
		lblNewLabel_1.setBounds(10, 47, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tercer Numero (opcional) :");
		lblNewLabel_2.setBounds(10, 72, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(220, 19, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(220, 44, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		txtN3 = new JTextField();
		txtN3.setBounds(220, 69, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);
		
		btnNewButton = new JButton("Suma 2 enteros");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(143, 99, 125, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Suma 3 enteros");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(143, 140, 125, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Suma 2 reales");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(143, 174, 125, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 214, 369, 120);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	
		try {			
		    int n1=Integer.parseInt(txtN1.getText());
	        int n2=Integer.parseInt(txtN2.getText());
	        Calculadora c=new Calculadora(n1,n2);
	        txtS.setText("");
	        txtS.append("La suma es: "+c.Sumar(n1, n2));
	        
		}catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
		}
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {			
		    int n1=Integer.parseInt(txtN1.getText());
	        int n2=Integer.parseInt(txtN2.getText());
	        int n3=Integer.parseInt(txtN3.getText());
	        Calculadora c=new Calculadora(n1,n2,n3);
	        txtS.setText("");
	        txtS.append("La suma es: "+c.Sumar(n1, n2, n3));
	        
		}catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {			
		    double num1=Double.parseDouble(txtN1.getText());
	        double num2=Double.parseDouble(txtN2.getText());
	        
	        Calculadora c=new Calculadora(num1,num2);
	        txtS.setText("");
	        txtS.append("La suma es: "+c.Sumar(num1, num2));
	        
		}catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros reales");
		}
	}
}
