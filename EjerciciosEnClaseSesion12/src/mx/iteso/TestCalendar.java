package mx.iteso;
import java.util.Calendar;
public class TestCalendar {

	public static void main(String[] args) {
		// Veremos como sirve la Clase Calendar (tipo factory)
		
		Calendar calendario1 = Calendar.getInstance();
		Calendar calendario2 = Calendar.getInstance();
		
		System.out.println("calendario 1: " + calendario1);
		System.out.println("Calendario 2: " + calendario2);
		
		
		System.out.println("Calendario 1 == Calendario 2 -> " + (calendario1 == calendario2));
	}

}
