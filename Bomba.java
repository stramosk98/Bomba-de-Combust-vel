package BombaGasolina;

public class Bomba {

	double quantidade;
	double pre�o;
	double litrosVendidos;
	
	public Bomba(double quantidade, double pre�o) {
		setPre�o(pre�o);
		setQuantidade(quantidade);
	}
	
	public Bomba() {
		
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		if(quantidade >= 0)
		this.quantidade = quantidade;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		if(pre�o >= 0)
		this.pre�o = pre�o;
	}

	public double getLitrosVendidos() {
		return litrosVendidos;
	}

	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}
	

	private double valorParaLitros(double valor) {
		return (valor/pre�o);
	}
	
	public boolean abastecerPorLitro(double litros){
		if(litros <= getQuantidade()) {
			setQuantidade(getQuantidade()-litros);
			setLitrosVendidos(getLitrosVendidos()+litros);
			return true;
		}
			
		return false;
	}
		
	public boolean abastecerPorValor(double valor){
		double valorLitros=valorParaLitros(valor);
			return abastecerPorLitro(valorLitros);
		}
	
	
	public double faturamento() {
		return (getLitrosVendidos()*getPre�o());
		
}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [quantidade=");
		builder.append(quantidade);
		builder.append(", pre�o=");
		builder.append(pre�o);
		builder.append(", litrosVendidos=");
		builder.append(litrosVendidos);
		builder.append(", getQuantidade()=");
		builder.append(getQuantidade());
		builder.append(", getPre�o()=");
		builder.append(getPre�o());
		builder.append(", getLitrosVendidos()=");
		builder.append(getLitrosVendidos());
		builder.append(", faturamento()=");
		builder.append(faturamento());
		builder.append("]");
		return builder.toString();
	}
}
