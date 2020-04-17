package patronDecorador;

public abstract class Bebida {
	String description = "Unknown Beverage";
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
