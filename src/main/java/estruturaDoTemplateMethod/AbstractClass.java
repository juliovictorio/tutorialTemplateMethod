package estruturaDoTemplateMethod;

public abstract class AbstractClass {
	
	public final void templateMethod() {
		operacao1();
		operacao2();
		operacao3();

	}

	protected abstract void operacao1();
	protected abstract void operacao2();
	protected abstract void operacao3();

}
