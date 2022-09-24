package constructor;

public class Product {

	public Product(int id, String name, String description, double price, int stockInAmount, String renk) {
		System.out.println("Yapıcı Blok Çalıştı.");
		this.description = description;
		this.id = id;
		this.kod = kod;
		this.name = name;
		this.price = price;
		this.renk = renk;
		this.stockInAmount = stockInAmount;
	}

	public Product() {

	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockInAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockInAmount() {
		return stockInAmount;
	}

	public void setStockInAmount(int stockInAmount) {
		this.stockInAmount = stockInAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return name.substring(0, 1) + id;
	}

}
