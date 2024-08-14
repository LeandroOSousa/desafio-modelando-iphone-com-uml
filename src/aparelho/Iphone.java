package aparelho;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void tocar() {
		System.out.println("Música tocando");

	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");

	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);

	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligação");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Navegando para " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");

	}

}
