
public class SistemaInterno {
	
	private int senha = 2222;

	public SistemaInterno(Autenticou fa){
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou){
			System.out.println("Seu acesso foi permitido");
		
		}else {
			System.out.println("Seu acesso foi negado");
			
		}
		
		
		
	}

}
