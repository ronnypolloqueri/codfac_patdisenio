package iterator;

public class IteradorGuia implements Iterador {

	private GuiaTelefonica guia;
	private int posicion;
	
	public IteradorGuia(GuiaTelefonica guia) {
		this.guia = guia;
	}
	@Override
	public String siguiente() {
		// TODO Auto-generated method stub
		return this.guia.getNumeros().get(this.posicion++);
	}

	@Override
	public boolean contieneSiguiente() {
		// TODO Auto-generated method stub
		return this.posicion < this.guia.getNumeros().size()
				&& this.guia.getNumeros().get(this.posicion) != null;
	}

}
