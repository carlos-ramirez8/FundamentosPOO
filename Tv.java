public class Tv {
	
	public boolean encendido;
	public int volumen;
	public int canal;
	
	
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
	}
	
	public void aumentarCanal() {
		if(encendido)
		canal++;
	}
	public void restarCanal() {
		if(encendido && canal>0)
			canal--;
	}
	public void subirVolumen() {
		if(encendido && volumen <=100)
			volumen++;
	}
	public void bajarVolumen() {
		if(encendido && volumen>0)
			volumen--;
	}
}