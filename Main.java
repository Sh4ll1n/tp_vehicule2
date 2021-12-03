package tp_vehicule_2;

public class Main {

	public static void main(String[] args) {
		Vehicule v = new Vehicule("honda",2006,7500);
		v.calculePrix(2021);
		System.out.println("==========================");

		Voiture v1 = new Voiture ("honda",2006,7500,2500, 4, 2500, 554846);
		v1.calculePrix(2021);
		
		System.out.println("==========================");
		Voiture v2 = new Voiture ("Fiat",2006,7500,2500, 4, 2500, 554846);
		v2.calculePrix(2021);
		System.out.println("==========================");
		Avion a = new Avion("Airbus", 2010, 500000, "reaction", 1000000);
		a.calculePrix(2010);
		
		
	}

}
