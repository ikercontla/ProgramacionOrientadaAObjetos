package mx.iteso;

public class TestDateTime {

	public static void main(String[] args) {
		//Ejercicio
//		Sea time1 la fecha/hora actual.
//		Sea time2 la hora 0:26:03 con la fecha actual.
//		Sea time3 la hora 11:59:59 PM con fecha 31-Dic-2017.
//		Sea time4 el segundo siguiente a time3.
//		Sea date5 la fecha 31-Dic-2017.
//		Sea time6 la fecha siguiente de time3 pero su misma hora.

		
		DateTime time1 = new DateTime();
		DateTime time2 = new DateTime(0, 26, 3);
		DateTime time3 = new DateTime(23,59,59,31,12,2017);
		DateTime time4 = time3.clone();
		time4.next();
		Date date5 = new Date(31,12,2017);
		DateTime time6 = new DateTime(23,59,59,1,1,2018);
		
//		Imprimir el resultado de comprar time2 y un clon de time2.
//		Imprimir el resultado de comparar time3 y date5 en ambos sentidos.
//		Imprimir el resultado de comparar la fecha de time3 y date5.
//		Añadir todos objetos a un arreglo e imprimirlos con los tres formatos.
		
		System.out.println(time2.equals(time2.clone()));
		System.out.println(time3.equals(date5));
		System.out.println("time3.equals(date5) -> " + time3.equals(date5) +"\ndate5.equals(time3) -> " + date5.equals(time3));
		
		Date dateArray[] = { time1, time2, time3, time4, date5, time6 };
		
		for (Date d: dateArray) {
			for(int i = 0; i < 3; i++) {
				d.setFormat(i);
				System.out.println(d.toString());
			}
		}
		
		
	
	}
}
