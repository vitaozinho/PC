package test;
public class Tucano extends Ave {	//EXTENSÃO DA CLASSE AVE
        
		//METODOS SOBREESCRITOS DA CLASSE REPTIL
		//COM UMA MENSAGEM ESPECIFICA PARA TARTARUGA 
        public  void locomover()
        {
            System.out.println("Tucano voando"); ;
        }
        public  void alimentar()
        {
            System.out.println("Tucano se Alimentando!");
        }
        public  void emitirSom()
        {
            System.out.println("Tucano emitindo som!");
        }
        //METODOS DA CLASSE TUCANO
    	public  void fazerNinho()
        {
            System.out.println("Tucano fazendo ninho!");
        }
      
}
