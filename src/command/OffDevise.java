package command;

public class OffDevise implements ICommand {
	private IDevise devise;
	
	
	public OffDevise(IDevise devise) {
		this.devise = devise;
	}
	
	public void operacion() {
		this.devise.off();
	}
}