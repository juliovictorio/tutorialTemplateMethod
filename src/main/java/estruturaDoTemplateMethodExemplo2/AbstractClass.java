package estruturaDoTemplateMethodExemplo2;

public abstract class AbstractClass {
	
	public final void templateMethod() {
		if (condicao()) {
			fazAlgo();
		}else{
			fazOutraCoisa();
		}
	}

	protected abstract boolean condicao();
	protected abstract void fazAlgo();
	protected abstract void fazOutraCoisa();

}
