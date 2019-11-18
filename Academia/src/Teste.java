import java.util.Date;

public class Teste {

	public static void main(String[] args) {
	
		Ginasio gin1 = new Ginasio(1, 1);
		Ginasio gin2 = new Ginasio(2, 1);
		Ginasio gin3 = new Ginasio(3, 2);
		
		Futebol time1 = new Futebol();
		time1.addIntegrante("Diego");
		time1.addIntegrante("Edmilson");
		time1.addIntegrante("Pedrinho");
		
		Date d = new Date();
		
		gin1.addReserva(time1, d, "Braga", "13 991930075");
		
		
		
		
	}

}
