package test;
public class Reptil extends Animal {//EXTENSÃO DA CLASSE ANIMAL		 	    
	        private String corEscama;
	        public String getCorEscama()
	        {
	            return corEscama;
	        }
	        public void setCorEscama(String corEscama)
	        {
	            this.corEscama = corEscama;
	        }	     
	        //METODOS SOBREESCRITOS DA CLASSE ANIMAL
	        //COM UMA MENSAGEM ESPECIFICA PARA REPTIL
	        public  void locomover()
	        {
	            System.out.println("Réptil se locomovendo");
	        }
	        public  void alimentar()
	        {
	            System.out.println("Réptil se alimentando");
	        }
	        public  void emitirSom()
	        {
	            System.out.println("Réptil emitindo som");
	        }


	    
	}

