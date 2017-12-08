import java.io.Serializable;


public class Veiculo implements Serializable {
	private String seller;
	private float price;
	private String model;
	private int year;
	
	public Veiculo(String v, float p, String m, int a) { 
		seller = v;
		price = p;
		model = m;
		year = a;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
