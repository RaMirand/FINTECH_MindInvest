package br.com.minds.mindinvest;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Bem Vindo ao Sistema MindInvest");		
		System.out.println();
		
		System.out.println("Menu");
		System.out.println();
		System.out.println("1 - Novo Usu�rio");
		System.out.println("2 - Criar Carteira de Investimento");
		System.out.println("3 - Adicionar Investimento a uma Carteira");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Selecione uma op��o: ");
		int selecao = sc.nextInt();
		switch (selecao) {
			case 1:
				//REVER
				Usuario user1 = new Usuario();
				user1.CriarUsuario();
				
				user1.getNomeUsuario();
				user1.getEmailUsuario();
				user1.getSenhaUsuario();
				break;
		}
		
		
		//Cria o objeto usuario1 atrav�s de inputs do usu�rio e do construtor Usuario.
//		System.out.print("Nome do Usu�rio: ");
//		String nome = sc.nextLine();
//		System.out.print("Email do Usu�rio: ");
//		String email = sc.nextLine();
//		System.out.print("Senha de Acesso: ");
//		String senha = sc.nextLine();
//		Usuario usuario1= new Usuario(nome, email, senha);
		
//		//Cria o objeto carteita1 atrav�s de inputs do usu�rio e do construtor Carteira.
//		System.out.println("Informa��es da Carteira");
//		System.out.print("Nome da Carteira: ");
//		String nomeCarteira = sc.nextLine();
//		System.out.print("Tipo da Carteira: ");
//		String tipoCarteira = sc.nextLine();
//		Carteira carteira1 = new Carteira(usuario1, nomeCarteira, tipoCarteira);
		
//		System.out.println("Adicionar Investimento � Carteira " + carteira1.nomeCarteira);
//		System.out.print("Tipo do Investimento: ");
//		String tipoInvest = sc.nextLine();
//		boolean status = true;
//		Investimento invest1 = new Investimento(carteira1, tipoInvest, status);
//		
//		System.out.println("O investimento est� ativo: " + invest1.isStatus());
//		System.out.println(invest1.carteira.usuario.nomeUsuario);
		
		sc.close();
	}

}
