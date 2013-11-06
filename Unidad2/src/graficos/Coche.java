package graficos;

	import graficos.Rectangle;
	import graficos.Ellipse;
	import graficos.Color;
public class Coche {

	public static void main(String[] args) {
		Rectangle chasis, torreta, cañon;
		Ellipse rueda;
		
		
		chasis = new Rectangle(100,150,350,75);
		chasis.setColor(new Color(170,150,0));
		chasis.draw();
		chasis.fill();
		
		torreta=new Rectangle(200,75,100,100);
		torreta.setColor(new Color(170,150,0));
		torreta.draw();
		torreta.fill();
		
		cañon=new Rectangle(300,100,200,25);
		cañon.setColor(new Color(170,150,0));
		cañon.draw();
		cañon.fill();
		
		rueda = new Ellipse(125,200,75,75);
		rueda.setColor(new Color(0,0,0));
		rueda.draw();
		rueda.fill();
		
		rueda = new Ellipse(200,200,75,75);
		rueda.setColor(new Color(0,0,0));
		rueda.draw();
		rueda.fill();
		
		rueda = new Ellipse(275,200,75,75);
		rueda.setColor(new Color(0,0,0));
		rueda.draw();
		rueda.fill();
		
		rueda = new Ellipse(350,200,75,75);
		rueda.setColor(new Color(0,0,0));
		rueda.draw();
		rueda.fill();


		
		
		
		
		
		rueda.translate(5, 0);


	}

}
