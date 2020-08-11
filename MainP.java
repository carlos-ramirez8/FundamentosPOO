import java.util.Scanner;

public class MainP {

	public static void main(String[] args) {
		
		Punto pt1 = new Punto();
		pt1.x = 1;
		pt1.y =2;
		
		Punto pt2 = new Punto();
		pt2.x =10;
		pt2.y =5;
		
		double distancia = pt1.distancia(pt2);
		System.out.println(distancia);
		
		pt1.x = 1;
		pt1.y = 2;
		pt2.x = 4;
		pt2.y = 3;
		
		Punto r = pt1.suma(pt2);
		System.out.println(r.x+" , "+r.y);
		
		
		Punto pt11 = new Punto();
		pt11.x =1;
		pt11.y =2;
		
		Punto pt21 = new Punto();
		pt21.x =10;
		pt21.y =5;
		
		double Producto = pt11.Producto(pt21);
		System.out.println(Producto);
		
		
	}

}