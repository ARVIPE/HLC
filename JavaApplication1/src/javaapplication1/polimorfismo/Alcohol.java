public class Alcohol extends Traficante{

	public Alcohol(String nombre, String apodo, String banda, int edad, float operaciones) {
		super(nombre, apodo, banda, edad, operaciones);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void aLaTrena() {
		
		carcel = (float) (operaciones * 2.5);
		
		System.out.println(carcel + " años");
		
	}


	@Override
	public String toString() {
		return "Alcohol [operaciones=" + operaciones + ", getNombre()=" + getNombre() + ", getApodo()=" + getApodo()
				+ ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}
	
	
    
}
