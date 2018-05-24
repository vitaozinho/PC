package test;
public class Program {
	public static void main(String[] args) {	//METODO PRINCIPAL
		{   //INSTANCIANDO AS CLASSES	
			Animal      a1 = new Animal();		
            Mamifero    a2 = new Mamifero();
            Reptil      a3 = new Reptil();
            Ave         a4 = new Ave();
            Canguru     a5 = new Canguru();
            Cachorro    a6 = new Cachorro();
            Tartaruga   a7 = new Tartaruga();
            Tucano      a8 = new Tucano();

            //ATRIBUINDO OS VALORES DOS MÉTODOS AS CLASSES INSTANCIADAS
            a1.setIdade(10);
            a1.setMembros(2);
            a1.setPeso(50);

            a2.setIdade(30);
            a2.setMembros(4);
            a2.setPeso(60);
            a2.setCorPelo("Amarelo");
            a2.setRaca("Felino");

            a3.setIdade(5);
            a3.setMembros(0);
            a3.setPeso(15);
            a3.setCorEscama("Azul");

            a4.setIdade(7);
            a4.setMembros(2);
            a4.setPeso(15);
            a4.setCorPena("Cinza");

            a5.setIdade(3);
            a5.setMembros(4);
            a5.setPeso(80);
            a5.setCorPelo("Vermelho");
                      
            a6.setIdade(5);
            a6.setMembros(4);
            a6.setPeso(23);
            a6.setCorPelo("Branco");
            a6.setRaca("Husky");
           
            a7.setIdade(8);
            a7.setMembros(4);
            a7.setPeso(9);
      
            a8.setIdade(3);
            a8.setMembros(2);
            a8.setPeso(0.7f);
            a8.setCorPena("Azul");

        }
	}
}


