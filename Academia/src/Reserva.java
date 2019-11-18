
import java.util.Date;

public class Reserva {
	
	private Esporte esporte;

	private Date data = new Date();
	private String nomeResponsavel;
	private String telefoneResponsavel;
	
	public Reserva(Esporte esporte, Date data, String nomeResponsavel, String telefoneResponsavel) {
		super();
		this.esporte = esporte;
		this.data = data;
		this.nomeResponsavel = nomeResponsavel;
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public Esporte getEsporte() {
		return esporte;
	}

	public Date getData() {
		return data;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}
	
	

}
