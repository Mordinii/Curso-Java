
public class Teste {
	
	
	
	public static void main(String[] args){
	
		
			GuardaConta guarda = new GuardaConta();
	
			Conta cc = new ContaCorrente(11,22);
			guarda.adiciona(cc);
 
			Conta cc2 = new ContaCorrente(22,22);
			guarda.adiciona(cc2);
			
			int quantidade = guarda.getQuantidadeDeElementos();
			
			System.out.println(quantidade);
			
			Conta ref = guarda.getReferencia(0);
			
			System.out.println();
	
	
	}
	

}
