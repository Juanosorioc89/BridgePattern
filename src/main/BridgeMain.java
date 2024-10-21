package main;
import imp.Circulo;
import imp.Negro;
import imp.Rojo;
import imp.Rectangulo;

public class BridgeMain {
	
	public static void main(String args[]) {
		
		AbstractFigura af = new Circulo(new Negro());
		af.dibujar();
		af.icolor = new Rojo();
		af.dibujar();
		
	}

}
