public class Drogas extends Traficante {

	public Drogas(String nombre, String apodo, String banda, int edad, float operaciones) {
		super(nombre, apodo, banda, edad, operaciones);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aLaTrena() {
		
		carcel = operaciones * 4;
		
		System.out.println(carcel + " años");
		
	}

	@Override
	public String toString() {
		return "Drogas [operaciones=" + operaciones + ", getNombre()=" + getNombre() + ", getApodo()=" + getApodo()
				+ ", getBanda()=" + getBanda() + ", getEdad()=" + getEdad() + "]";
	}
    
	
    
}
