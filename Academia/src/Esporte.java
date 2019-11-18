import java.util.ArrayList;

public abstract class Esporte {
	
	private int numeroIntegrantes;
	private String nomeEsporte;
	private int tempoReservado;

	private ArrayList<String> integrantes = new ArrayList<String>();

	public Esporte(int numeroIntegrantes, String nomeEsporte, int tempoReservado) {
		this.numeroIntegrantes = numeroIntegrantes;
		this.nomeEsporte = nomeEsporte;
		this.tempoReservado = tempoReservado;
	}
	
	public boolean addIntegrante(String nome) {
		if(integrantes.size() < numeroIntegrantes) {
			integrantes.add(nome);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
}
