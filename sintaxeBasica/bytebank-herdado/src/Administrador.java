
public class Administrador extends Funcionario implements Autenticou {
	
	private int senha;

	public Administrador() {

	}
	@Override
	public double getBonificacao() {
		return 50;
		
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}
	}

}