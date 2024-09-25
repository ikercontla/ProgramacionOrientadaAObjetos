package mx.iteso.example;

public class TestStatic {

	public static void main(String[] args) {
		
		//imprimimos el atributo s de la clase Static
		//como es un atributo de tipo static si lo podemos imprimir ya que esta definido aunque no hayamos creado ningun objeto
		System.out.println(Static.s);
		
		//si queremos imrpimir el atributo n de la clase Static
		//no podemos ya que este no es un atributo de tipo static y no hemos creado un objeto de la clase
		//System.out.println(Static.n);
		
		//creamos un objeto de tipo Static  
		Static s1 = new Static();
		//imprimimos los atributos
		System.out.println("Valor del atributo n: " + s1.n); //esta vez si nos deja ya que ya definimos un objeto de tipo Static
	    System.out.println("Valor del atributo s: "+ s1.s);

        Static s2 = new Static();

        System.out.println("Valor del atributo n: " + s2.n);
        System.out.println("Valor del atributo s: "+ s2.s);

        Static s3 = new Static();

        System.out.println("Valor del atributo n: " + s3.n);
        System.out.println("Valor del atributo s: " + s3.s);
        
        //como el atributo s siempre existe en la clase
        //cada vez que creo un objeto de tipo Static, hace la instruccion de "s+=2" 
        //por lo tanto va sumando 2 al atributo static		// TODO Auto-generated method stub

	}

}
