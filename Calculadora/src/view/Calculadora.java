package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	JTextField txtVisor = new JTextField();
		
		
		
		JMenuBar menu 			= new JMenuBar();
		JMenu exibir			= new JMenu	("Exibir");
		JMenu editar			= new JMenu	("Editar");
		JMenu ajuda 			= new JMenu	("Ajuda");   
	    
		//Menu exibir
		JMenuItem padrao 		= new JMenuItem	("Padrão	");
		JMenuItem cienti 		= new JMenuItem	("Científica");
        	JMenuItem program		= new JMenuItem	("Programador");
		JMenuItem statis 		= new JMenuItem	("Estastística");
		JMenuItem historico		= new JMenuItem	("Histórico");
       		JMenuItem agrup			= new JMenuItem	("Agrupamento de digítos");
        	JMenuItem basico 		= new JMenuItem	("Básico");
        	JMenuItem conversor 		= new JMenuItem	("Conversão de Unidades");
        	JMenuItem data 			= new JMenuItem	("Cálculo de data");
        	JMenuItem planilha 		= new JMenuItem	("Planilhas");
        
        	//Menu editar
        	JMenuItem copiar 		= new JMenuItem	("Copiar  CTRL+C");
        	JMenuItem colar 		= new JMenuItem	("Colar CTRL+V");
        	JMenuItem historico2 		= new JMenuItem	("Histórico");
        
        	//Menu ajuda

        	JMenuItem exibirAjuda 		= new JMenuItem	("Exibir Ajuda");
        	JMenuItem sobre			= new JMenuItem	("Sobre a Calculadora");
        


		JButton btnMC 			= new 	JButton	("MC");
		JButton btnMR 			= new 	JButton	("MR");
		JButton btnMS 			= new 	JButton	("MS");
		JButton btnMais 		= new 	JButton	("M+");
		JButton btnMenos		= new 	JButton	("M-");
		JButton btnSeta 		= new 	JButton	("←");
		JButton btnCE 			= new 	JButton	("CE");
		JButton btnC 			= new 	JButton	("C");
		JButton btnMaisMenos	= new 	JButton	("±");
		JButton btnRaiz 		= new 	JButton	("V");
		JButton btnOne 			= new 	JButton	("1");
		JButton btnTwo 			= new 	JButton	("2");
		JButton btnThree		= new 	JButton	("3");
		JButton btnFour 		= new 	JButton	("4");
		JButton btnFive 		= new 	JButton	("5");
		JButton btnSix 			= new 	JButton	("6");
		JButton btnSeven 		= new 	JButton	("7");
		JButton btnEight 		= new 	JButton	("8");
		JButton btnNine 		= new 	JButton	("9");
		JButton btnZero 		= new   JButton	("0");
		JButton btnDivisao		= new	JButton	("/");
		JButton btnPorcentagem	= new	JButton	("%");
		JButton btnMulti		= new 	JButton	("*");
		JButton btnUmX			= new	JButton	("1/χ");
		JButton btnSoma			= new	JButton	("+");
		JButton btnSub			= new	JButton	("-");
		JButton btnVirgula		= new 	JButton (",");
		JButton btnIgual		= new  	JButton	("=");

		public Calculadora() {
			super("Calculadora");
			
			Container paine = this.getContentPane();
			paine.setLayout(null);
			
			setJMenuBar(menu);
			menu.add(exibir);
	        	menu.add(editar);
	        	menu.add(ajuda);
	        
	        	exibir.add(padrao);
	        	exibir.add(cienti);
	        	exibir.add(program);
	        	exibir.add(statis);
	        	exibir.addSeparator();
	        	exibir.add(historico);
	        	exibir.add(agrup);
	        	exibir.addSeparator();
	        	exibir.add(basico);
	        	exibir.add(conversor);
	       	 	exibir.add(data);
	       	 	exibir.add(planilha);
	        
	        	editar.add(copiar);
	        	editar.add(colar);
	        	editar.addSeparator();
	        	editar.add(historico2);
	        
	        	ajuda.add(exibirAjuda);
	        	ajuda.addSeparator();
	        	ajuda.add(sobre); 
			
			
			txtVisor.setBounds(14, 11, 190, 50);
			paine.add(txtVisor);
		
			btnMC.setMargin(new Insets(1,1,1,1));
			btnMC.setFont(new Font("Arial", Font.PLAIN, 12));
			btnMC.setBounds(14, 66, 34, 27);
			paine.add(btnMC);
			
			btnMR.setMargin(new Insets(1,1,1,1));
			btnMR.setFont(new Font("Arial", Font.PLAIN, 12));
			btnMR.setBounds(53, 66, 34, 27);
			paine.add(btnMR);
			
			btnMS.setMargin(new Insets(1,1,1,1));
			btnMS.setFont(new Font("Arial", Font.PLAIN, 12));
			btnMS.setBounds(92, 66, 34, 27);
			paine.add(btnMS);
			
			btnMais.setMargin(new Insets(1,1,1,1));
			btnMais.setFont(new Font("Arial", Font.PLAIN, 12));
			btnMais.setBounds(131, 66, 34, 27);
			paine.add(btnMais);
			
			btnMenos.setMargin(new Insets(1,1,1,1));
			btnMenos.setFont(new Font("Arial", Font.PLAIN, 12));
			btnMenos.setBounds(170, 66, 34, 27);
			paine.add(btnMenos);
			
			
			btnSeta.setMargin(new Insets(1,1,1,1));
			btnSeta.setFont(new Font("Arial",Font.PLAIN,20));
			btnSeta.setBounds(14,99,34,27);
			paine.add(btnSeta);
			
			btnCE.setMargin(new Insets(1,1,1,1));
			btnCE.setFont(new Font("Arial",Font.PLAIN,12));
			btnCE.setBounds(53,99,34,27);
			paine.add(btnCE);
			
			btnC.setMargin(new Insets(1,1,1,1));
			btnC.setFont(new Font("Arial",Font.PLAIN,12));
			btnC.setBounds(92,99,34,27);
			paine.add(btnC);
			
			btnMaisMenos.setMargin(new Insets(1,1,1,1));
			btnMaisMenos.setFont(new Font("Arial",Font.PLAIN,12));
			btnMaisMenos.setBounds(131,99,34,27);
			paine.add(btnMaisMenos);
			
			btnRaiz.setMargin(new Insets(1,1,1,1));
			btnRaiz.setFont(new Font("Arial",Font.PLAIN,12));
			btnRaiz.setBounds(170,99,34,27);
			paine.add(btnRaiz);
			
			
			btnSeven.setMargin(new Insets(1,1,1,1));
			btnSeven.setFont(new Font("Arial",Font.PLAIN,12));
			btnSeven.setBounds(14,132,34,27);
			paine.add(btnSeven);
			
			btnEight.setMargin(new Insets(1,1,1,1));
			btnEight.setFont(new Font("Arial",Font.PLAIN,12));
			btnEight.setBounds(53,132,34,27);
			paine.add(btnEight);
			
			btnNine.setMargin(new Insets(1,1,1,1));
			btnNine.setFont(new Font("Arial",Font.PLAIN,12));
			btnNine.setBounds(92,132,34,27);
			paine.add(btnNine);
			
			btnDivisao.setMargin(new Insets(1,1,1,1));
			btnDivisao.setFont(new Font("Arial",Font.PLAIN,12));
			btnDivisao.setBounds(131,132,34,27);
			paine.add(btnDivisao);
			
			btnPorcentagem.setMargin(new Insets(1,1,1,1));
			btnPorcentagem.setFont(new Font("Arial",Font.PLAIN,12));
			btnPorcentagem.setBounds(170,132,34,27);
			paine.add(btnPorcentagem);
			
		
			btnFour.setMargin(new Insets(1,1,1,1));
			btnFour.setFont(new Font("Arial",Font.PLAIN,12));
			btnFour.setBounds(14,165,34,27);
			paine.add(btnFour);

			btnFive.setMargin(new Insets(1,1,1,1));
			btnFive.setFont(new Font("Arial",Font.PLAIN,12));
			btnFive.setBounds(53,165,34,27);
			paine.add(btnFive);
			
			btnSix.setMargin(new Insets(1,1,1,1));
			btnSix.setFont(new Font("Arial",Font.PLAIN,12));
			btnSix.setBounds(92,165,34,27);
			paine.add(btnSix);
			
			btnMulti.setMargin(new Insets(1,1,1,1));
			btnMulti.setFont(new Font("Arial",Font.PLAIN,12));
			btnMulti.setBounds(131,165,34,27);
			paine.add(btnMulti);
			
			btnUmX.setMargin(new Insets(1,1,1,1));
			btnUmX.setFont(new Font("Arial",Font.PLAIN,12));
			btnUmX.setBounds(170,165,34,27);
			paine.add(btnUmX);
			
			
			btnOne.setMargin(new Insets(1,1,1,1));
			btnOne.setFont(new Font("Arial",Font.PLAIN,12));
			btnOne.setBounds(14,198,34,27);
			paine.add(btnOne);
			
			btnTwo.setMargin(new Insets(1,1,1,1));
			btnTwo.setFont(new Font("Arial",Font.PLAIN,12));
			btnTwo.setBounds(53,198,34,27);
			paine.add(btnTwo);
			
			btnThree.setMargin(new Insets(1,1,1,1));
			btnThree.setFont(new Font("Arial",Font.PLAIN,12));
			btnThree.setBounds(92,198,34,27);
			paine.add(btnThree);
			
			btnSub.setMargin(new Insets(1,1,1,1));
			btnSub.setFont(new Font("Arial",Font.PLAIN,12));
			btnSub.setBounds(131,198,34,27);
			paine.add(btnSub);
			
			btnIgual.setMargin(new Insets(1,1,1,1));
			btnIgual.setFont(new Font("Arial",Font.PLAIN,20));
			btnIgual.setBounds(170,198,34,59);
			paine.add(btnIgual);
			
			
			btnZero.setMargin(new Insets(1,1,1,1));
			btnZero.setFont(new Font("Arial",Font.PLAIN,12));
			btnZero.setBounds(14, 231, 73, 27);
			paine.add(btnZero);
			
			btnVirgula.setMargin(new Insets(1,1,1,1));
			btnVirgula.setFont(new Font("Arial",Font.PLAIN,12));
			btnVirgula.setBounds(92, 231, 34, 27);
			paine.add(btnVirgula);
			
			btnSoma.setMargin(new Insets(1,1,1,1));
			btnSoma.setFont(new Font("Arial",Font.PLAIN,12));
			btnSoma.setBounds(131, 231, 34, 27);
			paine.add(btnSoma);
			
			
			
			
			this.setSize(228, 320);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		public static void main(String args[]) {
			Calculadora calc = new Calculadora();
		}
	}

	


