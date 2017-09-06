import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Eai World!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha:");
		String senha = sc.nextLine();
		
		Conta c;
		if(senha.equals("123")){	
			c = new ContaPremium();
		}else{	
			c = new Conta();
		}
		
		//Atribuindo um Cliente
		c.setCliente("Gabriel Santos");
		//Depositando na Conta do Cliente
		c.deposito(500d);
		c.visualizarSaldo();
		//Sacando um valor da conta do Cliente
		c.saque(200d);
		c.saque(600d);
		
		c.visualizarSaldo();
	}
}

