
public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Navegador internet");
		iphone.exibirPagina("www.iphone.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		System.out.println();
		
		System.out.println("Aparelho telefônico");
		iphone.ligar(" 98406235");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println();
		
		System.out.println("Reprodutor musical");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Bon Jovi - Always ");


		
		
		
	
	}

}
