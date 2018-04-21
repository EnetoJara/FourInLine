package App;

import Controlador.COntrolles;

/**
 * @author Ernesto xD
 */

public class GameApp {

	private static COntrolles c;

	public static void main(String[] args) 
	{
		setC(new COntrolles());
	}

	public static COntrolles getC() {
		return c;
	}

	public static void setC(COntrolles c) {
		GameApp.c = c;
	}

}
