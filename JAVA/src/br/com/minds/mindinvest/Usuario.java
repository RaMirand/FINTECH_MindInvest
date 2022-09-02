package br.com.minds.mindinvest;

import java.util.Date;
import java.util.Scanner;

public class Usuario {
	private String idUsuario;
	public String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private Date dataCadastro;
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		System.out.println(nomeUsuario);
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmailUsuario() {
		System.out.println(emailUsuario);
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		System.out.println(senhaUsuario);
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	//REVER
	public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	//REVER
	public void CriarUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do Usuário: ");
		String nome = sc.nextLine();
		System.out.print("Email do Usuário: ");
		String email = sc.nextLine();
		System.out.print("Senha de Acesso: ");
		String senha = sc.nextLine();
		Usuario usuario1= new Usuario(nome, email, senha);
		
		sc.close();
	}
	public Usuario() {
		
	}

}


