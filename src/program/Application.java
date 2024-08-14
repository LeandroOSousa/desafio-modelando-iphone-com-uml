package program;

import java.util.Scanner;

import aparelho.Iphone;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Iphone iphone = new Iphone();

		// Metodos do ReprodutorMusical
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();

		// Metodos do AparelhoTelefonico
		System.out.println("Digite o número para qual quer ligar: ");
		iphone.ligar(sc.next());
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		// Metodos do NavegadorInternet
		System.out.println("Digite a url do site desejado: ");
		iphone.exibirPagina(sc.next());
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		sc.close();
	}

}
