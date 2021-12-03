package tp_vehicule_2;

public class Vehicule {
	// Attributes
	private String brand;
	private int dateOfPurchase;
	private int purchasePrice; 
	private double currentPrice; 
	// Constructor
	public Vehicule(String brand, int dateOfPurchase, int purchasePrice) {
		super();
		this.brand = brand;
		this.dateOfPurchase = dateOfPurchase;
		this.purchasePrice = purchasePrice;
	}
	// Getter Setter 
	public String getBrand() {
		return brand;
	}

	public int getDateOfPurchase() {
		return dateOfPurchase;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	
	// toString
	@Override
	public String toString() {
		return "Vehicule [brand=" + brand + ", dateOfPurchase=" + dateOfPurchase + ", purchasePrice=" + purchasePrice
				+ ", currentPrice=" + currentPrice + "]";
	}
	
	// Method 
	// Fixer le prix courant au prix d'achat moins 1% par année ( entre la date d'achat et la date actuelle). 
	public void calculePrix(int anneActuelle) {
		// Periode d'usure. 
		int timeOfUse = anneActuelle - this.getDateOfPurchase();
		System.out.println("Le véhicule a été utilisé pendant " +timeOfUse+ " ans.");
		// Formule du prix courant du véhicule avec 1% par an. 
		currentPrice = this.getPurchasePrice() * (100 - timeOfUse)/100;
		if(currentPrice <= 0) {
			currentPrice = 0;
		}
		System.out.println("Le prix courant du véhicule est de "+currentPrice+" euros.");
	}
	

	

	
	
}
