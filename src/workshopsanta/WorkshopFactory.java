package workshopsanta;

public abstract class WorkshopFactory {

	public abstract WorkshopToy createToy(String toy);
	
	public WorkshopToy produceProduct(String toy) {
		WorkshopToy product = createToy(toy);
		product.prepare();
		return product;
	}

}
