package tp_vehicule_2;

public class Avion extends Vehicule {
	// Attributes
	private String type;
	private int hfly;
	// Constructor 
	public Avion(String brand, int dateOfPurchase, int purchasePrice, String type, int hfly) {
		super(brand, dateOfPurchase, purchasePrice);
		this.type = type;
		this.hfly = hfly;
	}

	// Getter Setter
	public String getType() {
		return type;
	}
	
	public int getHfly() {
		return hfly;
	}
	
	// Method 
	public void calculePrix(int anneActuelle) {
		if (this.getType() == "reaction")
		{
			int totalLoss = (this.getHfly()/1000)*10;
			System.out.println("L'avion est de type "+this.getType()+".");
			int currentPrice = this.getPurchasePrice() * (100 - totalLoss)/100;
			if(currentPrice <= 0) {
				currentPrice = 0;
			}
			System.out.println("Le prix courant de cette avion est "+ currentPrice + " euros.");
			
		} else if (this.getType() == "helices")
		{
			int totalLoss = (this.getHfly()/100)*10;
			System.out.println("L'avion est de type "+this.getType()+".");
			int currentPrice = this.getPurchasePrice() * (100 - totalLoss)/100;
			if(currentPrice <= 0) {
				currentPrice = 0;
			}
			System.out.println("Le prix courant de cette avion est "+ currentPrice +" euros.");
			
		} 
	}
}
