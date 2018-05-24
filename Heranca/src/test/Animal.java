package test;
public class Animal {
        private float peso; //VARAIVEIS UTILIZADAS NA CLASSE ANIMAL
        private int idade;  //QUE IRÃO SER
        private int membros;//SOBREESCRITAS EM OUTRAS CLASSES
        //GET E SET	
        public float getPeso()
        {
            return peso;
        }
        public void setPeso(float peso) 
        {
            this.peso = peso;
        }
        public int getIdade()
        {
            return idade;
        }
        public void setIdade(int idade)
        {
            this.idade = idade;
        }
        public int getMembros()
        {
            return membros;
        }
        public void setMembros(int membros)
        {
            this.membros = membros;
        }
        //METODOS QUE IRÃO SER SOBREESCRITOS 
        public void locomover()
        {
            System.out.println("Animal se locomovendo");
        }
        public void alimentar()
        {
            System.out.println("Animal se alimentando");
        }
        public void emitirSom()
        {
            System.out.println("Animal emitindo som");
        }
    
}


