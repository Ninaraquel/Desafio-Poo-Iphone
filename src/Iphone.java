
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
	System.out.println("Nova aba aberta");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("página atualizada");
		
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("ligando para este número" + numero);
		
		
	}

	@Override
	public void atender() {
		System.out.println("Alô!!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
			
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada " + musica);
		
		
	}
	
	

}
