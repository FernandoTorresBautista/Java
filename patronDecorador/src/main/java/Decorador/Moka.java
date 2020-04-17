package Decorador;

import patronDecorador.Bebida;

public class Moka extends CondimentoDecorador{
	Bebida bebida;
	public Moka(Bebida bebida) {
		this.bebida = bebida;
	}
	public String getDescription() {
		return bebida.getDescription() + ", Moka";
	}
	public double cost() {
		return 0.20 + bebida.cost();
	}
}
