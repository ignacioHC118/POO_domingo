package caso1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUItri extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JTextArea Cuadrito;
	private JTextField txtb;
	private JTextField txta;
	private JButton btnp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUItri frame = new GUItri();
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
	public GUItri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("base");
			lblNewLabel.setBounds(10, 43, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("altura");
			lblNewLabel_1.setBounds(10, 107, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 155, 280, 95);
			contentPane.add(scrollPane);
			{
				Cuadrito = new JTextArea();
				Cuadrito.setText("2do commit");
				scrollPane.setViewportView(Cuadrito);
			}
		}
		{
			txtb = new JTextField();
			txtb.setBounds(89, 40, 86, 20);
			contentPane.add(txtb);
			txtb.setColumns(10);
		}
		{
			txta = new JTextField();
			txta.setBounds(89, 104, 86, 20);
			contentPane.add(txta);
			txta.setColumns(10);
		}
		{
			btnp = new JButton("Procesar");
			btnp.addActionListener(this);
			btnp.setBounds(281, 56, 89, 23);
			contentPane.add(btnp);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnp) {
			do_btnp_actionPerformed(e);
		}
	}
	protected void do_btnp_actionPerformed(ActionEvent e) {
		double b=Double.parseDouble(txtb.getText());
		double a=Double.parseDouble(txta.getText());
		Triangulo tri=new Triangulo(b, a);
		Listado(tri);
	}
	void Imprimir(String s) {
		Cuadrito.append(s+"\n");
	}
	void Listado(Triangulo tri) {
		Imprimir("la base es: " + tri.getBase());
		Imprimir("la altura es: " + tri.getAltura());
		Imprimir("el area es: " + tri.Area());
	}
}
