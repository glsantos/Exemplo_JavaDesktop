
public class Conta {
	
	private String cliente;
	protected Double saldo=0d;
	
	public Double saque(Double valor){
		
		if(this.saldo>=valor){
			
			this.saldo -= valor;
			return valor;
		}
		
		return 0d;
	}
	
	public void deposito(Double valor){
		
		this.saldo =+ valor;
	}
	
	public void visualizarSaldo(){
		
		System.out.println("O saldo disponivel de "+ getCliente() +" �: R$ "+ saldo);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
