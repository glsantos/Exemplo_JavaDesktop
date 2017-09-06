
public class ContaPremium extends Conta{
	
	private Double limite=500d;
	
	@Override
	public void visualizarSaldo() {
		
		System.out.println("O saldo dispon�vel �: R$ " + saldo);
		System.out.println("O limite disponivel �: R$ " + limite);
		
	}
	
	
	@Override
	public Double saque(Double valor){
		
		if(valor > saldo){
			
			Double diferenca = valor - saldo;
			
			if(limite >= diferenca){
				
				saldo=  0d;
				limite -= diferenca;
				return valor;
			}else{
				
				return 0d;
			}
		}else{
			
			super.saque(valor);
		}
		
		return 0d;
	}
}
