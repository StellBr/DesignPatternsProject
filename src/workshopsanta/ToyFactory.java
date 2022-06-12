package workshopsanta;

public class ToyFactory extends WorkshopFactory {

	@Override
	public WorkshopToy createToy(String toy) {
		if (toy == "кукла") {
			return new Doll();
		}
		if (toy == "колело") {
			return new Bicycle();
		}
		System.out.println("Дядо Коледа, нямаме такъв вид играчка!");
		return null;
	}

}
