package encapsulationExamples;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("Ürün eklendi: " + product.getName());
	}

	public void Sil(Product product) {
		System.out.println("Ürün silindi ıd: " + product.getId());
	}
}
