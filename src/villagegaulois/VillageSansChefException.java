package villagegaulois;

public class VillageSansChefException extends Exception {
	private static final long serialVersionUID = 1L;

	public VillageSansChefException() {
		super("Le village ne possède pas de chef !");
	}

	public VillageSansChefException(String message) {
		super(message);
	}
}
