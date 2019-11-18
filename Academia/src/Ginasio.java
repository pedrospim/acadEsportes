import java.util.ArrayList;
import java.util.Date;

public class Ginasio {
	
	private int numGinasio;
	private int numAndar;
	
	ArrayList<Reserva> reservas = new ArrayList<Reserva>();

		
	public Ginasio(int numGinasio, int numAndar) {
		super();
		this.numGinasio = numGinasio;
		this.numAndar = numAndar;
	}

	
	public boolean addReserva(Esporte esporte, Date data, String nomeResponsavel, String telefoneResponsavel) {
		
		Reserva r = new Reserva(esporte, data, nomeResponsavel, telefoneResponsavel);
		
		for( Reserva reserva : reservas )
		{
			if(reserva.getData().equals(r.getData())){				
				
				return false;
				
			}
		}
				
		reservas.add(r);
		return true;
		
	}

}
