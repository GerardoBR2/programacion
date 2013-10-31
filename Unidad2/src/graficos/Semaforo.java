package graficos;

import graficos.Rectangle;
public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde,ambar,rojo;
		
		
		caja = new Rectangle(10,10,60,110);
		caja.setColor(new Color(0,0,0));
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(37,110,10,100);
		palo.draw();
		
		palo.fill();
		
		verde = new Ellipse(30,80,20,20);
		verde.setColor(new Color(0,200,0));
		verde.draw();
		verde.fill();
		
		ambar= new Ellipse(30,50,20,20);
		ambar.setColor(new Color(255,255,0));
		ambar.draw();
		ambar.fill();
		
		rojo= new Ellipse(30,20,20,20);
		rojo.setColor(new Color(255,0,0));
		rojo.draw();
		rojo.fill();
		
	
	}

}
