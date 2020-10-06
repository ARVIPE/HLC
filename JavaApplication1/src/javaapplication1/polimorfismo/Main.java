import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		
		Capos capo = new Capos("Al capone", "el chungo", "chicago squad", 60, 3);
		Alcohol alcohol = new Alcohol("Concha", "la dibujos", "ppd group", 80, 7);
		Sicarios sicario = new Sicarios("Paco", "El navajas", "bronx", 35, 5);
		Sicarios sicario2 = new Sicarios("Manuel", "El portaminas", "bronx", 26, 9);
		Drogas droga = new Drogas("Raul", "El drogas","camellos", 28, 9);
		Soplones soplon = new Soplones("Pablo", "El soplos", "Los avichuela", 42, 5);
		Traficante traficante = new Traficante("CJ", "El drogas", "los ambulantes", 20, 5);
		
		System.out.println(capo);
		capo.aLaTrena();
		capo.haSidoAsesinado(sicario);
		
		System.out.println(alcohol);
		alcohol.aLaTrena();
		alcohol.haSidoAsesinado(sicario);
		
		System.out.println(sicario);
		sicario.aLaTrena();
		sicario.haSidoAsesinado(sicario2);
		
		System.out.println(sicario2);
		sicario2.aLaTrena();
		sicario2.haSidoAsesinado(sicario);
		
		System.out.println(droga);
		droga.aLaTrena();
		droga.haSidoAsesinado(sicario2);
		
		System.out.println(soplon);
		soplon.aLaTrena();
		soplon.haSidoAsesinado(sicario2);
		
		System.out.println(traficante);
		traficante.aLaTrena();
		traficante.haSidoAsesinado(sicario2);
		
		

		
		
	}

}
