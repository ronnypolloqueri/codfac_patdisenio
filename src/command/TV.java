package command;

public class TV implements IDevise{

	@Override
	public void on() {
		System.out.println("TV ecendida");
		
	}

	@Override
	public void off() {
		System.out.println("TV apagada");
		
	}

}
