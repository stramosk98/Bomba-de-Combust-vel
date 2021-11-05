package BombaGasolina;

public class BombaEtanol extends Bomba {
	
	String fonte;
	
	public BombaEtanol(double quantidade, double pre�o) {
		super(quantidade, pre�o);
	}
	public BombaEtanol() {
		// TODO Auto-generated constructor stub
	}
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		if("cana-de-a�ucar".equalsIgnoreCase(fonte)||"milho".equalsIgnoreCase(fonte))
		this.fonte = fonte;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [fonte=");
		builder.append(fonte);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
