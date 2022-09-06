package br.com.minds.mindinvest;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Cria o objeto usuario1 através de inputs do usuário e do construtor Usuario.
		System.out.print("Nome do Usuário: ");
		String nome = sc.nextLine();
		System.out.print("Email do Usuário: ");
		String email = sc.nextLine();
		System.out.print("Senha de Acesso: ");
		String senha = sc.nextLine();
		Usuario usuario1 = new Usuario(nome, email, senha);
		
//		Cria o objeto carteita1 através de inputs do usuário e do construtor Carteira.
		System.out.println("Informações da Carteira");
		System.out.print("Nome da Carteira: ");
		String nomeCarteira = sc.nextLine();
		System.out.print("Tipo da Carteira: ");
		String tipoCarteira = sc.nextLine();
		Carteira carteira1 = new Carteira(usuario1, nomeCarteira, tipoCarteira);
		
//		Cria investimento atráves de inputs do usuário.
		System.out.println("Adicionar Investimento à Carteira " + carteira1.getNomeCarteira());
		System.out.print("Tipo do Investimento: ");
		String tipoInvest = sc.nextLine();
		boolean status = true;
		Investimento invest1 = new Investimento(carteira1, tipoInvest, status);
		 
		if (invest1.getTipoInvestimento().equals("Ação")) {
			System.out.println("Ticker da Ação: ");
			String ticker = sc.nextLine();
			System.out.println("Nome da Ação: ");
			String nomeStock = sc.nextLine();
			Acao stock1 = new Acao(carteira1, invest1.getTipoInvestimento(), invest1.isStatus(), invest1, ticker, nomeStock);
			System.out.println("Investimento " + stock1.getTicker() + " adicionado com sucesso!");
			System.out.println("Qual o valor Investido: R$");
			float vlrInvestido = sc.nextFloat();
			stock1.setValorInvestido(vlrInvestido);
			System.out.println("Nome: " + stock1.getNomeAcao());
			System.out.println("Ticker: " + stock1.getTicker());
			System.out.println("Carteira de Investimento: " + stock1.getCarteira().getNomeCarteira());
			System.out.println("Valor Investido: R$" + stock1.getValorInvestido());
		}else if (invest1.getTipoInvestimento().equals("FII")) {
			System.out.println("Ticker do FII: ");
			String ticker = sc.nextLine();
			System.out.println("Nome do FII: ");
			String nomeFii = sc.nextLine();
			Fii fii1 = new Fii(carteira1, invest1.getTipoInvestimento(), invest1.isStatus(), invest1, ticker, nomeFii);
			System.out.println("Investimento " + fii1.getTicker() + " adicionado com sucesso!");
			System.out.println("Qual o valor Investido: R$");
			float vlrInvestido = sc.nextFloat();
			fii1.setValorInvestido(vlrInvestido);
			System.out.println("Nome: " + fii1.getNomeFII());
			System.out.println("Ticker: " + fii1.getTicker());
			System.out.println("Carteira de Investimento: " + fii1.getCarteira().getNomeCarteira());
			System.out.println("Valor Investido: R$" + fii1.getValorInvestido());
		}
		
		sc.close();		
	}

}
