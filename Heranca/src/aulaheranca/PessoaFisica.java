package aulaheranca;

public class PessoaFisica extends Pessoa {

	private String rg;
	private String cpf;
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public static void main (String args []){
	
		PessoaFisica pessoa1= new PessoaFisica();
		
		pessoa1.setNome("Vitão");
		pessoa1.setBairro("Itaim Paulista");
		pessoa1.setCpf("35003635800");
		pessoa1.setEndereco("R Milagre dos Peixes");
		pessoa1.setRg("000.000.000/0");
		
		System.out.println("Nome: " + pessoa1.getNome()+"\nBairro: " + pessoa1.getBairro()+"\nCpf:"+pessoa1.getCpf()+"\nEndereço:" + pessoa1.getEndereco()+"\nRG: "+pessoa1.getRg());
		
		

	}
}
