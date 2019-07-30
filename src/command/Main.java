package command;

public class Main {

	public static void main(String[] args) {
		IDevise tv = new TV();

		ICommand on = new OnDevise(tv);
		ICommand off = new OffDevise(tv);
		
		on.operacion();
		off.operacion();
	}

}
