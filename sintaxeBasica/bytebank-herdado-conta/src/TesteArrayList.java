/** Tipos de lista - interface List -  Mãe Class Collection
 *  	Filhos - ArrayList,Vector threadsafe  e LinkedList;
 * 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(11,22);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref =lista.get(0);
		
		System.out.println(ref.getNumero());
		
		System.out.println("tamanho " + lista.size());
	
		lista.remove(0);
		
		System.out.println("tamanho " + lista.size());
		
			
	
		
		
	}
	
} 
