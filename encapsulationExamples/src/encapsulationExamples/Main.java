package encapsulationExamples;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(4);
		product.setName("Laptop");
		product.setDescription("Apple");
		product.setPrice(1000);
		product.setStockInAmoun(5);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Sil(product);

		System.out.println(product.getDescription());
		System.out.println(product.getKod());

	}

}
