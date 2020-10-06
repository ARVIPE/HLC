public abstract class Mafioso {
 
    private String nombre;
    private String apodo;
    private String banda;
    private int edad;
    private Sicarios nombreEjecutor;

    	
	public Mafioso(String nombre, String apodo, String banda, int edad) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.banda = banda;
		this.edad = edad;
	}
	
	public void haSidoAsesinado(Sicarios sicario) {
		
		this.nombreEjecutor = sicario;
		
		int asesinato = (int) (Math.round(Math.random() * (100)));
		if(asesinato > 50) {
			System.out.println(nombreEjecutor.getApodo() + " ha asesinado a: " + apodo);
		}
		System.out.println();
	}

	public abstract void aLaTrena();

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
