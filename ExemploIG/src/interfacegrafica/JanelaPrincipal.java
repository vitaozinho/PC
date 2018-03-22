package interfacegrafica;

import javax.swing.JLabel;
import javax.swing.JFrame;
//extends o JFRAME para dar import no JFRAME thanks james gosling
public class JanelaPrincipal extends JFrame {
	//Nova label/instancia
	 JLabel lblnome = new JLabel("Nome: ");
	 //metodo construtor 
	 public JanelaPrincipal() {
		//Fica na parte superior da janela
		 super("Janelinha do Vitão");
		 
		 
		 // Resizable para deixar ou não que mudem o tamanho da janela
		 this.setResizable(true);
		 //Deixar a janela visivel
		 this.setVisible(true);
		 //Tamanho da janela
		 this.setSize(600, 800);
		 //Sair ao apertar o X
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	 }
	 //Nova instancia para janela
	public static void main (String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		
	}
}
