package graficos;

import graficos.Rectangle;

		public class Semaforo_calculos {

			public static void main(String[] args) {
				Rectangle caja, palo;
				Ellipse verde,ambar,rojo;
				int ancho, alto,centro_x, centro_y, diametro_disco;
				
				ancho= 150;
				alto= 300;
				centro_x= 300;
				centro_y= 300;
				diametro_disco= ancho/2;
				
				caja = new Rectangle(centro_x - ancho/2, centro_y - ancho/2, ancho, alto );
				caja.setColor(new Color(0,0,0));
				caja.draw();
				caja.fill();
				
				palo = new Rectangle(centro_x - ancho/10, centro_y + alto/2, ancho/5, alto  );
				palo.draw();
				
				palo.fill();
				
				verde = new Ellipse(centro_x - ancho/4, centro_y + alto/2.3, diametro_disco, diametro_disco   );
				verde.setColor(new Color(0,200,0));
				verde.draw();
				verde.fill();
				
				ambar= new Ellipse(centro_x - ancho/4, centro_y + alto/8, diametro_disco, diametro_disco);
				ambar.setColor(new Color(255,255,0));
				ambar.draw();
				ambar.fill();
				
				rojo= new Ellipse(centro_x - ancho/4, centro_y - alto/5.7, diametro_disco, diametro_disco);
				rojo.setColor(new Color(255,0,0));
				rojo.draw();
				rojo.fill();
				
				
			
			
			
			}

		}
 
