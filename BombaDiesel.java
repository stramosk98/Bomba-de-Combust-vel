package BombaGasolina;

public class BombaDiesel extends Bomba {
	
	String tipo;

	
	public BombaDiesel(double quantidade, double preço) {
		super(quantidade, preço);
	}

	public BombaDiesel() {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if("S10".equalsIgnoreCase(tipo)||"S50".equalsIgnoreCase(tipo)||"S500".equalsIgnoreCase(tipo)||"S1800".equalsIgnoreCase(tipo))
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDiesel [tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

	

	

	

	

}
