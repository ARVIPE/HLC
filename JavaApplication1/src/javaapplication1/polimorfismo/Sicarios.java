public class Sicarios extends Mafioso {

	public int asesinatos;
	public int carcel;
	
	public Sicarios(String nombre, String apodo, String banda, int edad, int asesinatos) {
		super(nombre, apodo, banda, edad);
		
		this.asesinatos = asesinatos;
		
	
	
	}

	@Override
	public void aLaTrena() {
		
		carcel = asesinatos * 15;
		
		System.out.println(carcel + "años");
		
	}

	@Override
	public String toString() {
		return "Sicarios [asesinatos=" + asesinatos + ", getNombre()=" + getNombre() + ", getApodo()=" + getApodo()
				+ ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}
    
	
}
