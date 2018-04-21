package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.Tablero;
/**
 * @author yo otra vez xD
 */
public class COntrolles
{
	private Tablero tableroView;
	private Modelo model;

	private int col, col2, col3, col4 , col5, col6, col7, turno;
	private String jugador;

	private ActionListener oyenteCabeza;
	
	public COntrolles()
	{
		this.setTableroView(new Tablero());
		this.setModel(new Modelo());
		this.setCol(5);
		this.setCol2(5);
		this.setCol3(5);
		this.setCol4(5);
		this.setCol5(5);
		this.setCol6(5);
		this.setCol7(5);
		this.setTurno(0);
		this.setJugador("");
		this.getTableroView().ver();
		
		
		this.setOyenteCabeza(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e)
			{
				eventoDelBoton(e);	
			}
		});
		
		this.getTableroView().getBtnCabeza(0).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(1).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(2).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(3).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(4).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(5).addActionListener(this.getOyenteCabeza());
		this.getTableroView().getBtnCabeza(6).addActionListener(this.getOyenteCabeza());
	}

	protected void eventoDelBoton(ActionEvent e)
	{
		this.setTurno(this.getTurno()+1);
	    if (this.getTurno() % 2 == 0)
	        this.setJugador("X");
	    else
	    	this.setJugador("O");

	    if (e.getSource() ==this.getTableroView().getBtnCabeza(0))
		{
	        this.getTableroView().getBtnTablero(this.getCol(), 0).setText(this.getJugador());
	        this.setCol(this.getCol()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(1))
		{
	        this.getTableroView().getBtnTablero(this.getCol2(), 1).setText(this.getJugador());
	        this.setCol2(this.getCol2()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(2))
		{
	        this.getTableroView().getBtnTablero(this.getCol3(), 2).setText(this.getJugador());
	        this.setCol3(this.getCol3()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(3))
		{
	        this.getTableroView().getBtnTablero(this.getCol4(), 3).setText(this.getJugador());
	        this.setCol4(this.getCol4()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(4))
		{
	        this.getTableroView().getBtnTablero(this.getCol5(), 4).setText(this.getJugador());
	        this.setCol5(this.getCol5()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(5))
		{
	        this.getTableroView().getBtnTablero(this.getCol6(), 5).setText(this.getJugador());
	        this.setCol6(this.getCol6()-1);
	    }
	    if (e.getSource() ==this.getTableroView().getBtnCabeza(6))
		{
	        this.getTableroView().getBtnTablero(this.getCol7(), 6).setText(this.getJugador());
	        this.setCol7(this.getCol7()-1);
	    }
	    
	    if (this.getTableroView().getBtnTablero(0, 0).getText().equals("O")||this.getTableroView().getBtnTablero(0, 0).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(0).setEnabled(false);
	    }
	    if (this.getTableroView().getBtnTablero(0, 1).getText().equals("O")||this.getTableroView().getBtnTablero(0, 1).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(1).setEnabled(false);
	    }
	    if (this.getTableroView().getBtnTablero(0, 2).getText().equals("O")||this.getTableroView().getBtnTablero(0, 2).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(2).setEnabled(false);
	    }
	    if (this.getTableroView().getBtnTablero(0, 3).getText().equals("O")||this.getTableroView().getBtnTablero(0, 3).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(3).setEnabled(false);
	    }
	    if (this.getTableroView().getBtnTablero(0, 4).getText().equals("O")||this.getTableroView().getBtnTablero(0, 4).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(4).setEnabled(false);
	    }
	    if (this.getTableroView().getBtnTablero(0, 5).getText().equals("O")||this.getTableroView().getBtnTablero(0, 5).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(5).setEnabled(false);
	    }                       
	    if (this.getTableroView().getBtnTablero(0, 6).getText().equals("O")||this.getTableroView().getBtnTablero(0, 6).getText().equals("X"))
	    {
	        this.getTableroView().getBtnCabeza(6).setEnabled(false);
	    }
	    
	    this.getModel().cargarMatriz(this.getTableroView().getBtnTablero());
	    
	    if(this.getModel().horiGanador(this.getJugador())||this.getModel().vertiGanador(this.getJugador())
	    	||this.getModel().diagoIZQUIERDAganador(this.getJugador())||this.getModel().diagoDereGanador(this.getJugador())	
	      )
	    {
	    	JOptionPane.showMessageDialog(null, this.getJugador() + " GANOOO xDDDDDD");
            System.exit(0);
	    }	
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getCol2() {
		return col2;
	}

	public void setCol2(int col2) {
		this.col2 = col2;
	}

	public int getCol3() {
		return col3;
	}

	public void setCol3(int col3) {
		this.col3 = col3;
	}

	public int getCol4() {
		return col4;
	}

	public void setCol4(int col4) {
		this.col4 = col4;
	}

	public int getCol5() {
		return col5;
	}

	public void setCol5(int col5) {
		this.col5 = col5;
	}

	public int getCol6() {
		return col6;
	}

	public void setCol6(int col6) {
		this.col6 = col6;
	}

	public int getCol7() {
		return col7;
	}

	public void setCol7(int col7) {
		this.col7 = col7;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	private Tablero getTableroView() {
		return tableroView;
	}

	private void setTableroView(Tablero tableroView) {
		this.tableroView = tableroView;
	}

	private Modelo getModel() {
		return model;
	}

	private void setModel(Modelo model) {
		this.model = model;
	}

	public ActionListener getOyenteCabeza() {
		return oyenteCabeza;
	}

	public void setOyenteCabeza(ActionListener oyenteCabeza) {
		this.oyenteCabeza = oyenteCabeza;
	}

}
