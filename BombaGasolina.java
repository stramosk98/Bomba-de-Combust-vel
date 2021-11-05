package BombaGasolina;

public class BombaGasolina extends Bomba {

		String tipo;
		
		public BombaGasolina(double quantidade, double preço) {
			super(quantidade, preço);
		}
		
		public BombaGasolina() {
			
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			if("normal".equalsIgnoreCase(tipo)||"aditivada".equalsIgnoreCase(tipo))
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BombaGasolina [tipo=");
			builder.append(tipo);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}
		

}
