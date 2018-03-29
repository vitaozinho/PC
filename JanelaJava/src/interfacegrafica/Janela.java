package interfacegrafica;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	 JLabel lblinfo = new JLabel ("Preencha os Campos e Cliquei em Gravar Dados");	
	 JLabel lblnome = new JLabel("Nome: ");
	 JLabel lblende = new JLabel("Endereço: ");
	 JLabel lblbairro = new JLabel("Bairro: ");
	 JLabel lblestado = new JLabel("Estado: ");
	 JLabel lbltelefone = new JLabel("Telefone: ");
	 JLabel lblcelular = new JLabel("Celular: ");
	 JLabel lblemail = new JLabel("Email: ");
	 
	 
	 JTextField txtnome= new JTextField();
	 JTextField txtende= new JTextField();
	 JTextField txtbairro= new JTextField();
	 JTextField txttelefone= new JTextField();
	 JTextField txtcelular= new JTextField();
	 JTextField txtemail= new JTextField();
	 
	 JComboBox cboEstado= new JComboBox();
	 
	 JButton cadastro = new JButton("Gravar Cadastro");
	 JButton novoCadastro = new JButton("Novo Cadastro");
	 JButton verCadastro = new JButton("Ver Cadastros");
	 
	 public Janela() {

		 super("Cadastro de Clientes");
		 
		 
		 Container paine = this.getContentPane();
		 paine.setLayout(null);
		 
		 lblinfo.setBounds(125, 15, 300, 25);
		 paine.add(lblinfo);
		 lblnome.setBounds(40, 40, 250, 25);
		 paine.add(lblnome);
		 lblende.setBounds(40, 70, 250, 25);
		 paine.add(lblende);
		 lblbairro.setBounds(40, 100, 250, 25);
		 paine.add(lblbairro);
		 lblestado.setBounds(40, 128, 250, 25);
		 paine.add(lblestado);
		 lbltelefone.setBounds(40, 160, 250, 25);
		 paine.add(lbltelefone);
		 lblcelular.setBounds(40, 190, 250, 25);
		 paine.add(lblcelular);
		 lblemail.setBounds(40, 220, 250, 25);
		 paine.add(lblemail);
		 
		 
		 txtnome.setBounds(150, 40, 200, 25);
		 paine.add(txtnome);
		 txtende.setBounds(150, 70, 200, 25);
		 paine.add(txtende);
		 txtbairro.setBounds(150, 100, 200, 25);
		 paine.add(txtbairro);
		 txttelefone.setBounds(150, 160, 100, 25);
		 paine.add(txttelefone); 
		 txtcelular.setBounds(150, 190, 100, 25);
		 paine.add(txtcelular);
		 txtemail.setBounds(150, 220, 200, 25);
		 paine.add(txtemail);
		 
		 cboEstado.setBounds(150, 130, 50, 25);
		 paine.add(cboEstado);
		 cboEstado.addItem("SP");
		 cboEstado.addItem("RJ");
		 cboEstado.addItem("MG");
		 cboEstado.addItem("RS");
		 
		 
		 cadastro.setBounds(60, 270, 130, 30);
		 paine.add(cadastro);
		 novoCadastro.setBounds(200, 270, 130, 30);
		 paine.add(novoCadastro);
		 verCadastro.setBounds(340, 270, 130, 30);
		 paine.add(verCadastro);
		 
		 this.setResizable(false);
		 this.setVisible(true);
		 this.setSize(520, 355);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 
		 
	 }
	 


	public static void main (String[] args) {
		Janela janela = new Janela();
		}
	}
		