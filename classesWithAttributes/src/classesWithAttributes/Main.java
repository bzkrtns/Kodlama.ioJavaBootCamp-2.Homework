package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.name = "Laptop";
		product.id = "1245";
		product.decription = "Asus Laptop";
		product.price = 1023.32;
		product.stockInAmount = 5;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
