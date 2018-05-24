package test;
public class Ave extends Animal {  //EXTENSÃO DA CLASSE ANIMAL	  
       private String corPena;
       //GET E SET
       public String getCorPena()
        {
            return corPena;
        }
        public void setCorPena(String corPena)
        {
            this.corPena = corPena;
        }
        public void fazerNinho()
        {
            System.out.println("Ave fazendo ninho!");
        }
       //METODOS SOBREESCRITOS DA CLASSE ANIMAL
        //COM UMA MENSAGEM ESPECIFICA PARA AVE
        public  void locomover()
        {
            System.out.println("Ave se locomovendo");
        }
        public  void alimentar()
        {
            System.out.println("Ave se alimentando");
        }
        public void emitirSom()
        {
            System.out.println("Ave emitindo som");
        }


    
}

