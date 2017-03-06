package br.edu.impacta.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class AgendaApp {
	private static Scanner entrada = new Scanner(System.in);
	private static List<Contato> contatos = new ArrayList<>();
	public static void main(String[] args){
		boolean sair = false;
		while (!sair){
			int opcao = apresentarMenuPrincipal();
			switch (opcao){
			case 1: inserirContato(); break;
			case 2: buscarContato(); break;
			case 3: sair = true; break;
			default: out.println("Erro: opção invalida");
			}
		}
		out.println("\n fim do programa");
	}
	private static int apresentarMenuPrincipal(){
		boolean inteiro = false;
		int opcao= 0;
		while(!inteiro){
			out.println("\nAgenda Telefonica");
			out.println("(1) Inserir");
			out.println("(2) Buscar");
			out.println("(3) Sair");
			out.println("Escolha Opção");
			String s= entrada.nextLine();
			try{
				opcao = Integer.parseInt(s);
				inteiro = true;
			}catch(Exception e){
				out.println("Erro: opção de ser valor inteiro!");
			}
		}
		return opcao;
	}
	private static void inserirContato(){
		out.println("\nInserção de ovo contato: "); 
		String nome = lerNome();
		String telefone = lerTeleforne();
		Contato c = new Contato(nome, telefone);
		if(contatos.contains(c)){
			out.println("Esse contato ja esta cadastrado");
		}else{
				contatos.add(c);
				out.println("Contatos inserir");
			}
		}
	private 
		
	}

}
