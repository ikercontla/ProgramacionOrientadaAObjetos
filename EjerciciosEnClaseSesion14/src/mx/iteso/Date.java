package mx.iteso;


public class Date {

	//atributos enteros privados
	private int day, month, year, format;
	private String monthName; 
	
	//Implementamos 3 constructores
	
	//Constructor por default
	//que no recibe ningun parametro
	
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2017;
		this.format = 0;
		this.monthName = "enero";
	}
	
	//Constructor que recibe 3 valores
	
	public Date(int d, int m, int y) {
		setYear(y);
		setMonth(m);
		setDay(d);
		
		this.format = 0;	
	}
	
	//Constructor que recibe 4 valores
	
	public Date(int d, int m, int y, int f) {
		setFormat(f);
		setYear(y);
		setMonth(m);
		setDay(d);
	
		this.monthName = getMonthName();
	}
	
	//Metodos setters
	
	public void setDay(int d) {
		/*Rango de valores permitidos para day:
		i. [1..30] si month∈{4 , 6 , 9 ,11}
		ii. [1..28] si month=2
		iii. [1..31] si month∈{1 , 3 ,5 , 7 , 8 , 10 ,12}*/
		
		//Caso 1
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if(d >= 1 && d <= 30) {
				this.day = d;
			}
		}
		
		//Caso 2
		else if(month == 2) {
			if(d >= 1 && d <= 28) {
				this.day = d;
			}
		}
		
		//Caso 3
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(d >= 1 && d <= 31) {
				this.day = d;
			}
		}
	}//fin metodo setDay
	
	public void setMonth(int m) {
		//Rango de valores permitidos para month: [1...12]
		if (m >= 1 && m<= 12) {
			this.month = m;
			
			switch (m) {
			case 1 :
				this.monthName = "Enero";
				break;
			case 2 :
				this.monthName = "Febrero";
				break;
			case 3 :
				this.monthName = "Marzo";
				break;
			case 4 :
				this.monthName = "Abril";
				break;
			case 5 :
				this.monthName = "Mayo";
				break;
			case 6 :
				this.monthName = "Junio";
				break;
			case 7 :
				this.monthName = "Julio";
				break;
			case 8 :
				this.monthName = "Agosto";
				break;
			case 9 :
				this.monthName = "Septiembre";
				break;
			case 10 :
				this.monthName = "Octubre";
				break;
			case 11 :
				this.monthName = "Noviembre";
				break;
			case 12 :
				this.monthName = "Diciembre";
				break;
			}
		}
	}//fin metodo setMonth
	
	public void setYear(int y) {
		//Rango de valores permitidos para year: [1900...3000]
		if (y >= 1900 && y <= 3000) {
			this.year = y;
		}
	}//fin metodo setYear
	
	public void setFormat(int f) {
		if (f >= 0 && f <= 2) {
			this.format = f;
		}
	}//fin metodo setFormat
	
	//Metodos getters
	
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public int getFormat() {
		return this.format;
	}
	public String getMonthName() {
		return this.monthName;
	}
	
	//Metodo equals
	
	public boolean equals(Object o) {
		if (!(o instanceof Date)) return false; /*instanceof verifica si alguna vez se creo un objeto o de tipo Date*/
		Date otroObjeto = (Date) o;
		
		return((this.day == otroObjeto.getDay())&&(this.month == otroObjeto.getMonth())&&(this.year == otroObjeto.getYear())&&(this.format==otroObjeto.getFormat()));
	}
	
	//Metodo Clone
	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	//Metodo toString
	public String toString() {
		String mensaje = "";
		if (this.format == 0) {
			mensaje = String.format("%d/%d/%d", this.day, this.month, this.year);
			
		}
		
		if (this.format == 1) {
			 mensaje = String.format("%d-%s-%d", this.day, this.monthName.substring(0,3).toUpperCase(), this.year);
		}
		
		if (this.format == 2) {
			 mensaje = String.format("%d de %s de %d", this.day, this.monthName, this.year);
		}
		
		return mensaje;
	}

	
	//Metodo Next
	//Asigna todos los atributos los valores correspondientes al dia siguiente
	
	public void next() {
		
		//Caso 1 
		//Dia 30 de los meses 4, 6, 9, 11
		if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			if (this.day < 30) {
				this.day++;;
			} else {
				this.day = 1;
				this.month++;;
			}
		}//fin Caso 1
		
		//Caso 2
		else if(this.month == 2) {
			if(this.day < 28) {
				this.day++;
			} else {
				this.day = 1;
				this.month++;
			}
		}//fin caso 2
		
		//Caso 3
	
		else if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10) {
			if(this.day < 31) {
				this.day++;
			}
			else {
				this.day = 1;
				this.month++;
			}
		} else {
	        if (this.day < 31) {
	            this.day += 1;
	        } 
	    else {
	    	this.day = 1;
	    	 this.month = 1;
             this.year++;	          
	        }//fin caso 3

		}
	}//fin metodo next
	
}	
	
	
	

