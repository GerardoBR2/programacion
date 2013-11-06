package graficos;


		import graficos.Color;
		import graficos.Canvas;  
		import graficos.Rectangle;

		public class Grafico {

		        public static void main(String[] args) {
		                
		          Canvas lienzo;
		          Rectangle rectangulo;
		          lienzo =  Canvas.getInstance();
		         
		         
		          rectangulo = new Rectangle(30,200,20,350);
		          rectangulo.setColor(new Color(0, 0, 255));
		          rectangulo.draw();
		          rectangulo.fill();
		          
		          
		          rectangulo = new Rectangle(80,300,20,250);
		          rectangulo.setColor(new Color(0, 255, 255));
		          rectangulo.draw();
		          rectangulo.fill();
		          
		          rectangulo = new Rectangle(130,400,20,150);
		          rectangulo.setColor(new Color(255, 0, 255));
		          rectangulo.draw();
		          rectangulo.fill();
		          
		          rectangulo = new Rectangle(180,250,20,300);
		          rectangulo.setColor(new Color(255, 0, 0));
		          rectangulo.draw();
		          rectangulo.fill();
		          
		          
		          rectangulo = new Rectangle(230,500,20,50);
		          rectangulo.setColor(new Color( 0, 0, 0));
		          rectangulo.draw();
		          rectangulo.fill();
		          
		          
		        }



	}

