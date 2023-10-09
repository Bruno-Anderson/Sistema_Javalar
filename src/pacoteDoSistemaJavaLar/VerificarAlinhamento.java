package pacoteDoSistemaJavaLar;
import java.util.List;


	public class VerificarAlinhamento {
	    private int xEstrelaJava;
	    private int yEstrelaJava;
	    private List<Planeta> planetas;

	    public VerificarAlinhamento(int xEstrelaJava, int yEstrelaJava, List<Planeta> planetas) {
	        this.xEstrelaJava = xEstrelaJava;
	        this.yEstrelaJava = yEstrelaJava;
	        this.planetas = planetas;
	    }

	    public void verificar() {
	        int contVertical = 0;
	        int contDiagonal1 = 0;
	        int contDiagonal2 = 0;

	        for (Planeta planeta : planetas) {
	            if (planeta.x == xEstrelaJava) {
	                contVertical++;
	            }
	            if (planeta.x - xEstrelaJava == planeta.y - yEstrelaJava) {
	                contDiagonal1++;
	            }
	            if (planeta.x - xEstrelaJava == yEstrelaJava - planeta.y) {
	                contDiagonal2++;
	            }
	        }

	        if (contVertical == planetas.size()) {
	            System.out.println("Todos os planetas estão alinhados verticalmente com a estrelaJava.");
	        }
	     
	       
	        if (contDiagonal1 == planetas.size() || contDiagonal2 == planetas.size()) {
	            System.out.println("Todos os planetas estão alinhados diagonalmente com a estrelaJava.");
	        }
	    }
	}


