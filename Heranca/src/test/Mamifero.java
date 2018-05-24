package test;
public class Mamifero extends Animal {//EXTENSÃO DA CLASSE ANIMAL		     
	        private String corpelo;   
	        private String raca;      
	        //GET E SET
	        public String getCorPelo()
	        {
	            return corpelo;
	        }
	        public void setCorPelo(String corpelo)
	        {
	            this.corpelo = corpelo;
	        }

	        public String getRaca()
	        {
	            return raca;
	        }
	        public void setRaca(String raca)
	        {
	            this.raca = raca;
	        }
	        //METODOS SOBREESCRITOS DA CLASSE ANIMAL
	        //COM UMA MENSAGEM ESPECIFICA PARA MAMIFEROS
	        public void locomover()
	        {
	            System.out.println("Mamifero se locomovendo");
	        }

	        public  void alimentar()
	        {
	            System.out.println("Mamifero se alimentando");
	        }
	        public void emitirSom()
	        {
	            System.out.println("Mamifero emitindo som");
	        }


	    
	}

