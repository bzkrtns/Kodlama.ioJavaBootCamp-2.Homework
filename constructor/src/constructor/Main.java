package constructor;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Asus Laptop", 1234, 4, "gri");

		// product.setDescription("Asus Laptop");
		// product.setId(7);
		// product.setName("Laptop");
		// product.setPrice(12974);
		// product.setRenk("gri");
		// product.setStockInAmount(97);

		ProductManager productManager = new ProductManager();
		productManager.MusteriEkleme(product);
		System.out.println(product.getKod());
	}

}
