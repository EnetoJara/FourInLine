package View;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class Tablero extends JFrame {

	/**
	 * @author Yo xD
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel jpCabeza;
	private JPanel jpTablero;
	
	
	private JButton[][] btnTablero;
	private JButton[] btnCabeza;
	
	

	public Tablero() 
	{
		super("Neto's COMPANY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		jpCabeza = new JPanel();
		contentPane.add(jpCabeza, BorderLayout.NORTH);
		jpCabeza.setLayout(new GridLayout(1, 0));
		jpTablero = new JPanel();
		contentPane.add(jpTablero, BorderLayout.CENTER);
		jpTablero.setLayout(new GridLayout(6, 7));
		this.ponerBotones();
	}
	
	public void ver()
	{
		this.setVisible(true);
	}
	
	/**
	 * Pones los botones en el tablero troll, son muchos so no los voy a poner de uno por uno trolazo xDDDDDD
	 */
	private void ponerBotones()
	{
		this.setBtnCabeza(new JButton[7]);
		this.setBtnTablero(new JButton[6][7]);
		
		for (int i = 0; i < this.getBtnCabeza().length; i++) {
			this.setBtnCabeza(new JButton(), i);
			this.jpCabeza.add(this.getBtnCabeza(i));
		}
		for (int i = 0; i < this.getBtnTablero().length; i++) {
			for (int j = 0; j < this.getBtnTablero()[0].length; j++) {
				this.setBtnTablero(new JButton(), i, j);
				this.jpTablero.add(this.getBtnTablero(i, j));
			}
		}
	}


	public JButton[][] getBtnTablero() {
		return btnTablero;
	}

	public JButton getBtnTablero(int fila, int col) {
		return btnTablero[fila][col];
	}


	public void setBtnTablero(JButton[][] btnTablero) {
		this.btnTablero = btnTablero;
	}

	public void setBtnTablero(JButton btnTablero, int fila, int col) {
		this.btnTablero[fila][col] = btnTablero;
	}

	public JButton[] getBtnCabeza() {
		return btnCabeza;
	}

	public JButton getBtnCabeza(int fila) {
		return btnCabeza[fila];
	}

	public void setBtnCabeza(JButton[] btnCabeza) {
		this.btnCabeza = btnCabeza;
	}
	
	public void setBtnCabeza(JButton btnCabeza, int fila) {
		this.btnCabeza[fila] = btnCabeza;
	}
	

}
