package BombaGasolina;

public class BombaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BombaDiesel bd = new BombaDiesel(500, 6);
		bd.setTipo("S50");
		System.out.println(bd.abastecerPorLitro(58));
		System.out.println(bd.abastecerPorValor(88));
		System.out.println(bd);
		
		BombaGasolina bg = new BombaGasolina(10, 6);
		bg.setTipo("normal");
		System.out.println(bg.abastecerPorLitro(18));
		System.out.println(bg.abastecerPorValor(38));
		System.out.println(bg);
				
		BombaEtanol be = new BombaEtanol(250, 7.99);
		be.setFonte("milho");
		System.out.println(be.abastecerPorLitro(28));
		System.out.println(be.abastecerPorValor(48));
		System.out.println(be);		
	}

}
