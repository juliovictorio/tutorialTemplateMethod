package bolo;

public abstract class Bolo {
	
	//aqui vai o método de template
	public void fazerBolo(){
		separaIngredientes();
		preparaMassa();
		assaBolo();
		System.out.println("Servindo o bolo");
	}

	protected abstract void assaBolo();
	protected abstract void preparaMassa();
	protected abstract void separaIngredientes() ;

}
