package Controlador;

import javax.swing.JButton;
/**
 * @author Yo xD
 */
public class Modelo 
{
	
	private JButton[][] btnTablero;
	
	public void cargarMatriz(JButton[][] btnTablero)
	{
		this.btnTablero=btnTablero;
	}
	
	public boolean horiGanador(String jugador) 
	{
		for (int y = 0; y < btnTablero.length; y++) 
		{        
		    for (int x = 0; x < btnTablero[y].length - 3; x++) 
		    {
		        if (btnTablero[y][x].getText().equals(jugador)
		            && btnTablero[y][x + 1].getText().equals(jugador)
		            && btnTablero[y][x + 2].getText().equals(jugador)
		            && btnTablero[y][x + 3].getText().equals(jugador)
		            )
		        {
		            return true;
		        }
		    }
		}
		return false;
		}
	
	public boolean vertiGanador(String jugador)
	{
	    for (int y = 0; y < btnTablero.length - 3; y++)
	    {
	        for (int x = 0; x < btnTablero[y].length; x++) 
	        {
	            if (btnTablero[y][x].getText().equals(jugador)
	                && btnTablero[y + 1][x].getText().equals(jugador)
	                && btnTablero[y + 2][x].getText().equals(jugador)
	                && btnTablero[y + 3][x].getText().equals(jugador)
	            	) 
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public boolean diagoIZQUIERDAganador(String jugador)
	{
	    for (int y = 0; y < btnTablero.length - 3; y++) 
	    {
	        for (int x = 0; x < btnTablero[y].length - 3; x++) 
	        {
	            if (btnTablero[y][x].getText().equals(jugador)
	                && btnTablero[y + 1][x + 1].getText().equals(jugador)
	                && btnTablero[y + 2][x + 2].getText().equals(jugador)
	                && btnTablero[y + 3][x + 3].getText().equals(jugador)
	                )
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	
	public boolean diagoDereGanador(String jugador)
	{
	    for (int y = 0; y < btnTablero.length - 3; y++)
	    {
	        for (int x = 3; x < btnTablero[y].length; x++) 
	        {
	            if (btnTablero[y][x].getText().equals(jugador)
	                && btnTablero[y + 1][x - 1].getText().equals(jugador)
	                && btnTablero[y + 2][x - 2].getText().equals(jugador)
	                && btnTablero[y + 3][x - 3].getText().equals(jugador)
	               )
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
}