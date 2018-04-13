package model;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PessoaFisica extends JFrame{
	
	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	JTextField txtNome = new JTextField(); //CAIXA DE TEXTO NOME
	JLabel nominho = new JLabel("NOME: ");
	
	JTextField txtEnd = new JTextField(); //CAIXA DE TEXTO ENDEREÇO
	JLabel end = new JLabel("ENDEREÇO: ");
	
	JTextField txtBairro = new JTextField(); //CAIXA DE TEXTO BAIRRO
	JLabel bairro = new JLabel("BAIRRO: ");
	
	JFormattedTextField txtCep = null; //txt formatado
	JLabel cep = new JLabel("CEP: ");
	
	JTextField txtCidade = new JTextField(); //CAIXA DE TEXTO CIDADE
	JLabel cidade = new JLabel("CIDADE: ");	
	
	JLabel est = new JLabel("ESTADO: ");
	JComboBox cmbEst = new JComboBox(); //COMBO BOX ESTADOS
	
	JFormattedTextField txtTel = null; //CAIXA DE TEXTO TELEFONE FORMATADA
	JLabel tel = new JLabel("TELEFONE: ");
	
	JFormattedTextField txtCel = null; //CAIXA DE TEXTO CELULAR FORMATADA
	JLabel cel = new JLabel("CELULAR: ");
	
	JFormattedTextField txtRg = null; //CAIXA DE TEXTO FORMATADA RG
	JLabel rg = new JLabel("RG: ");
	
	JFormattedTextField txtCpf = null; //CAIXA DE TEXTO FORMATADA CPF
	JLabel cpf = new JLabel("CPF: ");
	
	JButton btnSalvar = new JButton("Salvar"); //BOTÃO SALVAR
	
	JButton btnImprimir = new JButton("Imprimir"); //BOTÃO IMPRIMIR
	
	JLabel sexo = new JLabel("SEXO: "); //LABEL SEXO
	
	JRadioButton[] rdbsexo = new JRadioButton[2]; //botão para opçoes [SEXO]
	ButtonGroup grupo = new ButtonGroup();{ //group impede marcar mais de uma opçao no mesmo objeto
	
	rdbsexo[0] = new JRadioButton("Feminino");
	rdbsexo[1] = new JRadioButton("Masculino");} //fechar chave nos groups
	
	MaskFormatter formatTel = null; //add mascara
	MaskFormatter formatCel = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
	//model.PessoaFisica pessoaFisica = new model.PessoaFisica();

	public PessoaFisica(){
		super("Cadastro PF");
		
		Container paine = this.getContentPane();
		
		paine.add(nominho);
		paine.add(txtNome);	
		nominho.setBounds(10, 15, 45, 30);
		txtNome.setBounds(90, 15, 225, 30);
		
		//ENDEREÇO (mascara e adicionando à janela)
		paine.add(end);
		paine.add(txtEnd);	
		end.setBounds(10, 50, 70, 30);
		txtEnd.setBounds(90, 50, 225, 30);
				
		try { //add mascara antes de tudo!!!
			formatCep = new MaskFormatter("#####-###"); //a mascara
			txtCep = new JFormattedTextField(formatCep);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		paine.add(cep);
		paine.add(txtCep);			
		cep.setBounds(335, 70, 40, 30);
		txtCep.setBounds(400, 70, 120, 30);
		
		paine.add(cidade);
		paine.add(txtCidade);	
		cidade.setBounds(10, 85, 70, 30);
		txtCidade.setBounds(90, 85, 225, 30);
		
		paine.add(est);
		est.setBounds(335, 105, 70, 30);
		paine.add(cmbEst);
		cmbEst.setBounds(400, 105, 70, 30);
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");		
		
		paine.add(bairro);
		paine.add(txtBairro);	
		bairro.setBounds(10, 120, 70, 30);
		txtBairro.setBounds(90, 120, 225, 30);
				
		//TELEFONE (mascara e adicionando à janela)
		try {
			formatTel = new MaskFormatter("(##)####-####"); //a mascara
			txtTel = new JFormattedTextField(formatTel);
		} catch (Exception ext) { //exibir o erro
			ext.printStackTrace();
		}
		paine.add(tel);
		paine.add(txtTel);	
		tel.setBounds(10, 155, 70, 30);
		txtTel.setBounds(90, 155, 155, 30);		
		
		//CELULAR (mascara e adicionando à janela)
		try {
			formatCel = new MaskFormatter("(##)#####-####"); //a mascara
			txtCel = new JFormattedTextField(formatCel);
		} catch (Exception exc) { //exibir o erro
			exc.printStackTrace();
		}
		paine.add(cel);
		paine.add(txtCel);	
		cel.setBounds(335, 155, 70, 30);
		txtCel.setBounds(400, 155, 155, 30);
		
		
		//SEXO(É UM VETOR EM QUE CADA POSIÇÃO É REFERENTE A UM DOS SEXOS (MASCULINO/FEMININO))
		paine.add(sexo);			
		sexo.setBounds(335, 15, 55, 30);		
		grupo.add(rdbsexo[0]); //grupo para o sexo
		grupo.add(rdbsexo[1]);
		paine.add(rdbsexo[0]); //opção para o sexo
		rdbsexo[0].setBounds(375, 15, 85, 30);
		paine.add(rdbsexo[1]);
		rdbsexo[1].setBounds(455, 15, 90, 30);
				
		//RG (mascara e adicionando à janela)
		try {
			formatRg = new MaskFormatter("##.###.###-A"); //a mascara
			txtRg = new JFormattedTextField(formatRg);
		} catch (Exception exr) { //exibir o erro
			exr.printStackTrace();
		}
		paine.add(rg);
		paine.add(txtRg);	
		rg.setBounds(10, 190, 55, 30);
		txtRg.setBounds(90, 190, 155, 30);		
		
		//CPF
		try {
			formatCpf = new MaskFormatter("###.###.###-##"); //a mascara
			txtCpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) { //exibir o erro
			exf.printStackTrace();
		}
		paine.add(cpf);
		paine.add(txtCpf);	
		cpf.setBounds(335, 190, 70, 30);
		txtCpf.setBounds(400, 190, 155, 30);
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(160, 250, 130, 30);
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setNome(txtNome.getText());
				setEndereco(txtEnd.getText());
			}
		});
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(300, 250, 130, 30);
		btnImprimir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
				txtNome.setText(getNome());
				txtEnd.setText(getEndereco());
			}
		});
		
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 330);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		PessoaFisica cadpf = new PessoaFisica();
	}
}
