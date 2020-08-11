public class Practica1 {

	public static void main(String[] args) {
		Tv tv1;
		tv1 = new Tv();
		
		tv1.encender();
		System.out.println("Encendido: " + tv1.encendido);
		
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.bajarVolumen();
		
		System.out.println("Volumen: " + tv1.volumen);

		tv1.aumentarCanal();
		tv1.aumentarCanal();
		tv1.aumentarCanal();
		tv1.apagar();
		tv1.aumentarCanal();
		tv1.aumentarCanal();
		
		System.out.println("Canal: "+tv1.canal);
		
		Tv tv2 = new Tv();
		tv2.encender();
		tv2.subirVolumen();
		tv2.subirVolumen();
		tv2.subirVolumen();
		tv2.subirVolumen();
		
		System.out.println("Volumen: "+ tv2.volumen);
		
	}
		
	}