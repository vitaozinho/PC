package test;
public class Reptil extends Animal {//EXTENS�O DA CLASSE ANIMAL		 	    
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
	            System.out.println("R�ptil se locomovendo");
	        }
	        public  void alimentar()
	        {
	            System.out.println("R�ptil se alimentando");
	        }
	        public  void emitirSom()
	        {
	            System.out.println("R�ptil emitindo som");
	        }


	    
	}

