import controller.Dispositivo;

public class App {
    public static void main(String[] args) throws Exception {
        Dispositivo disp = new Dispositivo();

        disp.navegador.adicionarNovaAba();
        System.out.println(disp.navegador.getStatus());
        disp.navegador.exibirPagina("Google.com");
        System.out.println(disp.navegador.getStatus());
        disp.navegador.atualizarPagina();
        System.out.println(disp.navegador.getStatus());

        disp.reprodutor.selecionarMusica("Sonata ao luar");
        System.out.println(disp.reprodutor.getStatus());
        disp.reprodutor.tocar();
        System.out.println(disp.reprodutor.getStatus());
        disp.reprodutor.pausar();
        System.out.println(disp.reprodutor.getStatus());

        disp.telefone.iniciarCorreioVoz();
        System.out.println(disp.telefone.getStatus());
        disp.telefone.ligar();
        System.out.println(disp.telefone.getStatus());
        disp.telefone.atender();
        System.out.println(disp.telefone.getStatus());

    }
}
