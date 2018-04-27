package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class tela extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(45);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(45);
	JLabel lblcep = new JLabel("Cep: ");
	JTextField txtcep = new JTextField(45);
	JLabel lblCT = new JLabel("Carteira de trabalho ");
	JTextField txtCT = new JTextField(45);
	JLabel lblNomeM = new JLabel("Qual o nome da sua mãe? ");
	JTextField txtNomeM = new JTextField(45);
	JLabel lblInfinit = new JLabel("Guerra Infinita? ");
	JTextField txtInfinit = new JTextField(45);
	JLabel lblMes = new JLabel("Mes do ano: ");
	JTextField txtMes = new JTextField(45);
	JLabel lblAno = new JLabel("Ano: ");
	JTextField txtAno = new JTextField(45);
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField(45);
	ButtonGroup grupoLofi 	= new ButtonGroup();
	JRadioButton[] lofi 	= new JRadioButton[2];
	JLabel lblLofi = new JLabel("Você Gosta de Lofi Hip Hop?");
	
	
	public tela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblcep);
		pane.add(txtcep);
		pane.add(lblCT);
		pane.add(txtCT);
		pane.add(lblNomeM);
		pane.add(txtNomeM);
		pane.add(lblInfinit);
		pane.add(txtInfinit);
		pane.add(lblMes);
		pane.add(txtMes);
		pane.add(lblAno);
		pane.add(txtAno);
		pane.add(lblCPF);
		pane.add(txtCPF);
		pane.add(lblLofi);
		
		
		
		lofi[0] 	= new JRadioButton("SIM");
		lofi[1] 	= new JRadioButton("NÃO");
		
		for (int i = 0; i < lofi.length; i++){
			grupoLofi.add(lofi[i]);
			pane.add(lofi[i]);
		}
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tela janela = new tela();
	}

}

