package bolo;

public class BoloChocolate extends Bolo{

	@Override
	public void separaIngredientes() {
		System.out.println("separando farinha");
		System.out.println("separando ...");
		System.out.println("separando chocolate");
		System.out.println("separando outros....");
	}
	
	@Override
	public void preparaMassa() {
		System.out.println("preparando a massa de chocolate....");
	}
	
	@Override
	public void assaBolo() {
		System.out.println("Assando o bolo em 180 °C, preaquecido por 40 minutos");
	}

}
