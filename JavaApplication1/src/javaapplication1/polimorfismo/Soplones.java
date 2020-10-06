public class Soplones extends Mafioso{

	public int soplos;
	public int carcel;
	
	public Soplones(String nombre, String apodo, String banda, int edad, int soplos) {
		super(nombre, apodo, banda, edad);
	
		this.soplos = soplos;
		
	
	
	}
	
	@Override
	public void aLaTrena() {
		
		carcel = soplos * 1;
		
		System.out.println(carcel + "mes");
		
	}

	@Override
	public String toString() {
		return "Soplones [soplos=" + soplos + ", carcel=" + carcel + ", getNombre()=" + getNombre() + ", getApodo()="
				+ getApodo() + ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	
    
}
