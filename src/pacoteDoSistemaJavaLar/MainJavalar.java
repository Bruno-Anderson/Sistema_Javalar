package pacoteDoSistemaJavaLar;


public class MainJavalar {
    public static void main(String[] args) {
    	Cabecalho cabecalho = new Cabecalho();
        cabecalho.imprimir();
    	
    	Sistema sistema = new Sistema();
        sistema.iniciar();
    }
}


