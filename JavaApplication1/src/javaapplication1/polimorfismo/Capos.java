public class Capos extends Mafioso{
	
	public int barrios;
	public int carcel;
    
	public Capos(String nombre, String apodo, String banda, int edad, int barrios) {
		super(nombre, apodo, banda, edad);
	
		this.barrios = barrios;
		
	
	
	}

	




	@Override
	public String toString() {
		return "Capos [barrios=" + barrios + ", getNombre()=" + getNombre() + ", getApodo()=" + getApodo()
				+ ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}






	@Override
	public void aLaTrena() {
		
		carcel = barrios * 5;
		
		System.out.println(carcel + " años");
		
	}
    

}
	