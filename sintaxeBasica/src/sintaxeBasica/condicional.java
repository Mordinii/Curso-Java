package sintaxeBasica;

public class condicional {
	
	public static void main(String[] args) {
							
			
			int idade = 18;
			
			int quantidadePessoas = 1;
			
			boolean acompanhado = true;
			
			if (quantidadePessoas >= 2) {
				
				acompanhado = true;
				
			} else {
				
				acompanhado = false;
				
			}
					
		
			System.out.println("Voce esta acompanhado ?? " + acompanhado );
			
			if( idade >= 18 && acompanhado != false ) {
				
				System.out.println("Voce esta acompanhado e também e maior de 18.");
				
			}else { 
				
				System.out.println("Voce nao cumpre as normas da casa.");
				
			}	
			
			
	}		
}
