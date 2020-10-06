public class Traficante extends Mafioso {

	public float operaciones;
	public float carcel;
	
	public Traficante(String nombre, String apodo, String banda, int edad, float operaciones) {
		super(nombre, apodo, banda, edad);
		
		this.operaciones = operaciones;
		
	
	
	}
	
	

	@Override
	public String toString() {
		return "Traficante [operaciones=" + operaciones + ", getNombre()=" + getNombre() + ", getApodo()=" + getApodo()
				+ ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}



	@Override
	public void aLaTrena() {
		// TODO Auto-generated method stub
		
	}
	
	
}
