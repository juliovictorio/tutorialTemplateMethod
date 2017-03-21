package bolo;

public class BoloFuba extends Bolo{

	@Override
	protected void separaIngredientes() {
		System.out.println("separando farinha");
		System.out.println("separando ...");
		System.out.println("separando fubá");
		System.out.println("separando outros....");
	}
	
	@Override
	protected void preparaMassa() {
		System.out.println("preparando a massa do bolo de fubá....");
	}
	
	@Override
	protected void assaBolo() {
		System.out.println("Assando o bolo em 180 °C, preaquecido por 30 minutos");
	}

}
