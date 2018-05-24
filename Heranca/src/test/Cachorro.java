package test;
public class Cachorro extends Mamifero { //EXTENSÃO DA CLASSE MAMIFERO	
	        private String atitude;
	        private int hora, min;
	       //GET E SET 
	        public int getHora() {
				return hora;
			}
			public void setHora(int hora) {
				this.hora = hora;
			}
			public int getMin() {
				return min;
			}
			public void setMin(int min) {
				this.min = min;
			}
			//METODOS SOBREESCRITOS DA CLASSE MAMIFERO
	        //COM UMA MENSAGEM ESPECIFICA PARA CACHORRO		
			public  void locomover()
	        {
	            System.out.println("Cachorro se locomovendo"); ;
	        }
	        public  void alimentar()
	        {
	            System.out.println("Cachorro se Alimentando!");
	        }
	        public  void emitirSom()
	        {
	            System.out.println("Cachorro latindo!");
	        }
	        // METODOS DA CLASSE CACHORRO
	        public void enterrarOsso()
	        {
	            System.out.println("Cachorro enterrando o osso!");
	        }

	        public void abanarRabo()
	        {
	            System.out.println("Cachorro abanando o rabo!");
	        }

	       
	        //METODOS DE SOBRECARGA DA CLASSE CACHORRO
	        public void reagir(String atitude) {
	            if (atitude == "brincar" || atitude == "acariciar"){
	                System.out.println("Abana o rabo");
	            }
	           }
	        public void reagir(int hora) { 
	        if (hora <= 12) {
	            System.out.println("Abana o rabo e late");
	            }
	        else if  (hora>=18){
	            System.out.println("Não liga para o dono");  
	            }
	            else {
	            System.out.println ("Abana o rabo");
	            }

	   

	        }
	    
	}


