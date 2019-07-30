package iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiaTelefonica guia = new GuiaTelefonica();
		guia.add("111");
		guia.add("211");
		guia.add("311");
		guia.add("411");
		guia.add("511");
		guia.add("611");
		
		Iterador iterador = new IteradorGuia(guia);
		
		while(iterador.contieneSiguiente()) {
			System.out.println(iterador.siguiente());
		}
	}

}
