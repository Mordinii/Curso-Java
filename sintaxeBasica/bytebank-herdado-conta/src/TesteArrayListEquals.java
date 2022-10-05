import java.util.ArrayList;

public class TesteArrayListEquals {
	
	public static void main(String[] args){

	    ArrayList<Conta> lista = new ArrayList<Conta>();

	    Conta cc1 = new ContaCorrente(22, 22);
	    Conta cc2 = new ContaCorrente(22, 22);

	    lista.add(cc1);

	    boolean existe = lista.contains(cc2); //novo deve ser modificado direto na Class contains

	    System.out.println("Já existe? " + existe);

	    for(Conta conta : lista){  // verificar um Array todo;
	        System.out.println(conta);
	    }

	    boolean igual = cc1.ehIgual(cc2);
	    System.out.println(igual); //deve imprimir true, pois as contas são de numeros iguais;
	    
	    
	    
	    
	}
}
