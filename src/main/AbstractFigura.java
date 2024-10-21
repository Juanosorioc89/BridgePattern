package main;

import interfaces.IColor;

public abstract class AbstractFigura {
	
	protected IColor icolor;
	
	public AbstractFigura(IColor icolor) {
		this.icolor = icolor;
	}
	
	public abstract void dibujar();
	

}
