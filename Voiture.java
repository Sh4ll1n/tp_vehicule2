package tp_vehicule_2;

public class Voiture extends Vehicule {
	//Attributes
	
	private int cm3;
	private int door;
	private int power;
	private int km;
	//Constructor
	
	// Getter Setter
	public int getCm3() {
		return cm3;
	}

	public Voiture(String brand, int dateOfPurchase, int purchasePrice, int cm3, int door, int power, int km) {
		super(brand, dateOfPurchase, purchasePrice);
		this.cm3 = cm3;
		this.door = door;
		this.power = power;
		this.km = km;
	}

	public int getDoor() {
		return door;
	}
	public int getPower() {
		return power;
	}
	public int getKm() {
		return km;
	}
	
	// Method 
	public void calculePrix(int anneActuelle) {
		// Periode d'usure. 
		
		int timeOfUse = anneActuelle - this.getDateOfPurchase();
		int totalLoss = timeOfUse * 2;
		System.out.println("La voiture a été utilisé pendant " +timeOfUse+ " ans. Sa valeur baisse de "+totalLoss+"%.");
		// Perte du au kM.
		int totalLoss2 = (this.getKm() / 100000)*5;
		System.out.println("La voiture perd à cause de ses kilométrages "+ totalLoss2+"% de sa valeur");
		// Perte si brand = 
		
		if (this.getBrand() == "Renault" || this.getBrand() == "Fiat") 
		{
			System.out.println("La voiture est de marque " + this.getBrand() + " elle perd 10% en valeur.");
			int totaloss3 = 10;
			int currentPrice = this.getPurchasePrice() * (100 - totalLoss - totalLoss2 - totaloss3 )/100;
			if(currentPrice <= 0) {
				currentPrice = 0;
			}
			System.out.println("Le prix courant de la voiture est de "+currentPrice+ " euros.");
			
		} else if (this.getBrand() == "Porsche" || this.getBrand() == "Ferrari") 
		{
			System.out.println("La voiture est de marque " + this.getBrand() + " elle perd 20% en valeur.");
			int totaloss3 = 20;
			int currentPrice = this.getPurchasePrice() * (100 - totalLoss - totalLoss2 - totaloss3 )/100;
			if(currentPrice <= 0) {
				currentPrice = 0;
			}
			System.out.println("Le prix courant de la voiture est de "+currentPrice+ " euros.");
		} else 
		{
				// Formule du prix courant du véhicule avec 2% par an. 
				int currentPrice = this.getPurchasePrice() * (100 - totalLoss - totalLoss2 )/100;
				if(currentPrice <= 0) {
					currentPrice = 0;
				}
				System.out.println("Le prix courant de la voiture est de "+currentPrice+ " euros.");
		}
		
	}
}

