package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import operations.Operacoes;

public class Calculadora extends JFrame {
	
	JTextField txtVisor = new JTextField();    
	
	JMenuBar menu 			= new JMenuBar();
	JMenu exibir			= new JMenu	("Exibir");
	JMenu editar			= new JMenu	("Editar");
	JMenu ajuda 			= new JMenu	("Ajuda");   
	   
	    
	    
	//Menu exibir
	JMenuItem padrao 		= new JMenuItem	("Padrão");
	JMenuItem cienti 		= new JMenuItem	("Científica");
	JMenuItem program		= new JMenuItem	("Programador");
	JMenuItem statis 		= new JMenuItem	("Estastística");
	JMenuItem historico		= new JMenuItem	("Histórico");
        JMenuItem agrup			= new JMenuItem	("Agrupamento de digítos");
        JMenuItem basico 		= new JMenuItem	("Básico");
        JMenuItem conversor 		= new JMenuItem	("Conversão de Unidades");
        JMenuItem data 			= new JMenuItem	("Cálculo de data");
        JMenu 	  planilha 		= new JMenu	("Planilhas");
        JMenuItem hipoteca  		= new JMenuItem ("Hipoteca");
        JMenuItem leasing	 	= new JMenuItem ("Leasing de veículo");
        JMenuItem eco1			= new JMenuItem ("Economia de combustível (Km/l)");
        JMenuItem eco2			= new JMenuItem ("Economia de combustível (l/100 km)");
        
        
        //Menu editar
        JMenuItem copiar 		= new JMenuItem	("Copiar  CTRL+C");
        JMenuItem colar 		= new JMenuItem	("Colar CTRL+V");
        JMenu 	  historico2 		= new JMenu	("Histórico");
        JMenuItem copiHisto		= new JMenuItem ("Copiar histórico");
        JMenuItem edit			= new JMenuItem ("Editar");
        JMenuItem cancel		= new JMenuItem ("Cancelar edição");
        JMenuItem limpar		= new JMenuItem ("Limpar");
        
        
        
        //Menu ajuda
        JMenuItem exibirAjuda 	= new JMenuItem	("Exibir Ajuda");
        JMenuItem sobre			= new JMenuItem	("Sobre a Calculadora");
        


		JButton btnMC 			= new 	JButton	("MC");
		JButton btnMR 			= new 	JButton	("MR");
		JButton btnMS 			= new 	JButton	("MS");
		JButton btnMais 		= new 	JButton	("M+");
		JButton btnMenos		= new 	JButton	("M-");
		JButton btnSeta 		= new 	JButton	("←");
		JButton btnCE 			= new 	JButton	("CE");
		JButton btnC 			= new 	JButton	("C");
		JButton btnMaisMenos		= new 	JButton	("±");
		JButton btnRaiz 		= new 	JButton	("√");
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
		JButton btnPorcentagem		= new	JButton	("%");
		JButton btnMulti		= new 	JButton	("*");
		JButton btnUmX			= new	JButton	("1/χ");
		JButton btnSoma			= new	JButton	("+");
		JButton btnSub			= new	JButton	("-");
		JButton btnVirgula		= new 	JButton (",");
		JButton btnIgual		= new  	JButton	("=");

	
		String sinal = null;
		double a = 0, b = 0;
		Operacoes operations = new Operacoes();
		
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
	        planilha.add(hipoteca);
	        planilha.add(leasing);
	        planilha.add(eco1);
	        planilha.add(eco2);
	        
	  
	        
	        editar.add(copiar);
	        editar.add(colar);
	        editar.addSeparator();
	        editar.add(historico2);
	        historico2.add(copiHisto);
	        historico2.add(edit);
	        historico2.add(cancel);
	        historico2.add(limpar);
	        
	        
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
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						txtVisor.setText("0");
				}
			});
			
			btnMaisMenos.setMargin(new Insets(1,1,1,1));
			btnMaisMenos.setFont(new Font("Arial",Font.PLAIN,12));
			btnMaisMenos.setBounds(131,99,34,27);
			paine.add(btnMaisMenos);
			
			btnRaiz.setMargin(new Insets(1,1,1,1));
			btnRaiz.setFont(new Font("Arial",Font.PLAIN,12));
			btnRaiz.setBounds(170,99,34,27);
			paine.add(btnRaiz);
			btnRaiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a = Double.parseDouble(txtVisor.getText());
					
					txtVisor.setText(operations.raiz(a)+"");
					
				}
			});
			
			
			btnSeven.setMargin(new Insets(1,1,1,1));
			btnSeven.setFont(new Font("Arial",Font.PLAIN,12));
			btnSeven.setBounds(14,132,34,27);
			paine.add(btnSeven);
			btnSeven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("7");
					}else {
						txtVisor.setText(txtVisor.getText() + "7");
					}
					
					
				}
			});
			
			btnEight.setMargin(new Insets(1,1,1,1));
			btnEight.setFont(new Font("Arial",Font.PLAIN,12));
			btnEight.setBounds(53,132,34,27);
			paine.add(btnEight);
			btnEight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("8");
					}else {
						txtVisor.setText(txtVisor.getText() + "8");
					}
					
					
				}
			});
			
			btnNine.setMargin(new Insets(1,1,1,1));
			btnNine.setFont(new Font("Arial",Font.PLAIN,12));
			btnNine.setBounds(92,132,34,27);
			paine.add(btnNine);
			btnNine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("9");
					}else {
						txtVisor.setText(txtVisor.getText() + "9");
					}
					
					
				}
			});
			
			btnDivisao.setMargin(new Insets(1,1,1,1));
			btnDivisao.setFont(new Font("Arial",Font.PLAIN,12));
			btnDivisao.setBounds(131,132,34,27);
			paine.add(btnDivisao);
			btnDivisao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a = Double.parseDouble(txtVisor.getText());
					sinal = "divisão";
					txtVisor.setText("0");
				}
			});
			
			
			
			btnPorcentagem.setMargin(new Insets(1,1,1,1));
			btnPorcentagem.setFont(new Font("Arial",Font.PLAIN,12));
			btnPorcentagem.setBounds(170,132,34,27);
			paine.add(btnPorcentagem);
			
		
			btnFour.setMargin(new Insets(1,1,1,1));
			btnFour.setFont(new Font("Arial",Font.PLAIN,12));
			btnFour.setBounds(14,165,34,27);
			paine.add(btnFour);
			btnFour.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("4");
					}else {
						txtVisor.setText(txtVisor.getText() + "4");
					}
					
					
				}
			});

			btnFive.setMargin(new Insets(1,1,1,1));
			btnFive.setFont(new Font("Arial",Font.PLAIN,12));
			btnFive.setBounds(53,165,34,27);
			paine.add(btnFive);
			btnFive.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("5");
					}else {
						txtVisor.setText(txtVisor.getText() + "5");
					}
					
					
				}
			});
			
			btnSix.setMargin(new Insets(1,1,1,1));
			btnSix.setFont(new Font("Arial",Font.PLAIN,12));
			btnSix.setBounds(92,165,34,27);
			paine.add(btnSix);
			btnSix.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("6");
					}else {
						txtVisor.setText(txtVisor.getText() + "6");
					}
					
					
				}
			});
			
			btnMulti.setMargin(new Insets(1,1,1,1));
			btnMulti.setFont(new Font("Arial",Font.PLAIN,12));
			btnMulti.setBounds(131,165,34,27);
			paine.add(btnMulti);
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a = Double.parseDouble(txtVisor.getText());
					sinal = "multiplicação";
					txtVisor.setText("0");
				}
			});
			
			btnUmX.setMargin(new Insets(1,1,1,1));
			btnUmX.setFont(new Font("Arial",Font.PLAIN,12));
			btnUmX.setBounds(170,165,34,27);
			paine.add(btnUmX);
			
			
			btnOne.setMargin(new Insets(1,1,1,1));
			btnOne.setFont(new Font("Arial",Font.PLAIN,12));
			btnOne.setBounds(14,198,34,27);
			paine.add(btnOne);
			btnOne.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("1");
					}else {
						txtVisor.setText(txtVisor.getText() + "1");
					}
					
					
				}
			});
			
			btnTwo.setMargin(new Insets(1,1,1,1));
			btnTwo.setFont(new Font("Arial",Font.PLAIN,12));
			btnTwo.setBounds(53,198,34,27);
			paine.add(btnTwo);
			btnTwo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("2");
					}else {
						txtVisor.setText(txtVisor.getText() + "2");
					}
					
					
				}
			});
			
			btnThree.setMargin(new Insets(1,1,1,1));
			btnThree.setFont(new Font("Arial",Font.PLAIN,12));
			btnThree.setBounds(92,198,34,27);
			paine.add(btnThree);
			btnThree.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("3");
					}else {
						txtVisor.setText(txtVisor.getText() + "3");
					}
					
					 
				}
			});
			
			btnSub.setMargin(new Insets(1,1,1,1));
			btnSub.setFont(new Font("Arial",Font.PLAIN,12));
			btnSub.setBounds(131,198,34,27);
			paine.add(btnSub);
			btnSub.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 a = Double.parseDouble(txtVisor.getText());
				 sinal = "subtração";
				 txtVisor.setText("0"); 
			 }
			});
			
			btnIgual.setMargin(new Insets(1,1,1,1));
			btnIgual.setFont(new Font("Arial",Font.PLAIN,20));
			btnIgual.setBounds(170,198,34,59);
			paine.add(btnIgual);
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (sinal.equals("soma")) {
						b = Double.parseDouble(txtVisor.getText());
						txtVisor.setText(operations.soma(a, b)+"");
					}else if (sinal.equals("divisão")){
						b = Double.parseDouble(txtVisor.getText());
						txtVisor.setText(operations.divisao(a, b)+"");
					}else if (sinal.equals("multiplicação")) {
						b = Double.parseDouble(txtVisor.getText());
						txtVisor.setText(operations.multi(a, b)+"");
					}else if (sinal.equals("subtração")) {
						b = Double.parseDouble(txtVisor.getText());
						txtVisor.setText(operations.sub(a, b)+"");
					}
					
					
					
				}
			});
			
			
			btnZero.setMargin(new Insets(1,1,1,1));
			btnZero.setFont(new Font("Arial",Font.PLAIN,12));
			btnZero.setBounds(14, 231, 73, 27);
			paine.add(btnZero);
			btnZero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if(txtVisor.getText().equals("0")) {
						txtVisor.setText("0");
					}else {
						txtVisor.setText(txtVisor.getText() + "0");
					}
					
					
				}
			});
			
			btnVirgula.setMargin(new Insets(1,1,1,1));
			btnVirgula.setFont(new Font("Arial",Font.PLAIN,12));
			btnVirgula.setBounds(92, 231, 34, 27);
			paine.add(btnVirgula);
			
			btnSoma.setMargin(new Insets(1,1,1,1));
			btnSoma.setFont(new Font("Arial",Font.PLAIN,12));
			btnSoma.setBounds(131, 231, 34, 27);
			paine.add(btnSoma);
			btnSoma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a = Double.parseDouble(txtVisor.getText());
					sinal = "soma";
					txtVisor.setText("0");
				}
			});
			
			
			
			
			this.setSize(228, 320);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		public static void main(String args[]) {
			Calculadora calc = new Calculadora();
			
		}
	}

	


