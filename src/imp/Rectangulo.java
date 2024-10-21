package imp;

import interfaces.IColor;
import main.AbstractFigura;

public class Rectangulo extends AbstractFigura{
	
	public Rectangulo(IColor icolor) {
		super(icolor);
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando ...");
		icolor.pintar();		
	}
	
	

}
