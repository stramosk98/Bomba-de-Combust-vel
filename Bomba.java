package BombaGasolina;

public class Bomba {

	double quantidade;
	double preço;
	double litrosVendidos;
	
	public Bomba(double quantidade, double preço) {
		setPreço(preço);
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

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		if(preço >= 0)
		this.preço = preço;
	}

	public double getLitrosVendidos() {
		return litrosVendidos;
	}

	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}
	

	private double valorParaLitros(double valor) {
		return (valor/preço);
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
		return (getLitrosVendidos()*getPreço());
		
}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [quantidade=");
		builder.append(quantidade);
		builder.append(", preço=");
		builder.append(preço);
		builder.append(", litrosVendidos=");
		builder.append(litrosVendidos);
		builder.append(", getQuantidade()=");
		builder.append(getQuantidade());
		builder.append(", getPreço()=");
		builder.append(getPreço());
		builder.append(", getLitrosVendidos()=");
		builder.append(getLitrosVendidos());
		builder.append(", faturamento()=");
		builder.append(faturamento());
		builder.append("]");
		return builder.toString();
	}
}
