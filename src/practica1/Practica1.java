package practica1;

public class Practica1 {

	// Para cada programa abajo responda:
	// 1- Implemente un arnés para poder invocar el programa y analizar su ejecución.
	// 2- Cuál es el defecto en el programa?
	// 3- Si es posible, ejecute el programa para alguna entrada que no alcance el defecto
	// 4- Si es posible, ejecute el programa para alguna entrada que alcance el defecto y no resulte en una falla
	// 5- Si es posible, ejecute el programa para alguna entrada que ejecute el defecto y produzca una falla
	

	/**
	 * El defecto es la forma de recorrer la estructura,
	 * el algoritmo devuelve la primera posicion de cero no la ultima
	 * */
	public static int lastZero (int[] x) {
		//Effects: if x==null throw NullPointerException
		// else return the index of the LAST 0 in x.
		// Return -1 if 0 does not occur in x
		for (int i = 0; i < x.length; i++)
		/*for (int i = x.length-1; i <= 0; i--)*/
		{
			if (x[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * El defecto se encuentra la evaluacion del valor, 
	 * aumenta el contador si el valor es 0, lo cual no es esperado 
	 * (solo deberia contar positivos) 
	 * */
	public static int countPositive (int[] x) {
		//Effects: If x==null throw NullPointerException
		// else return the number of
		// 	positive elements in x.
		int count = 0;
		for (int i=0; i < x.length; i++)
		{
			if (x[i] >= 0)
			/*if (x[i]>0)*/
			{
				count++;
			}
		}
		return count;
	}
	
	
	/**
	 * El defecto se encuentra la condicion de evaluacion para saber si el valor
	 * es impar o positivo, ya que no tiene en cuenta el valor absoluto
	 * de la operacion mod, es decir no contempla valores negativos. 
	 * */
	public static int oddOrPos(int[] x) {
		//Effects: if x==null throw NullPointerException
		// else return the number of elements in x that
		// are either odd or positive (or both)
		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i]% 2 == 1 || x[i] > 0 )
			/*if(Math.abs(x[i]% 2 == 1) || x[i] > 0)*/
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * defecto: el ciclo del algoritmo recorre el arreglo desde la segunda posicion
	 * */
	public static int numZero (int[] x) {
		//Effects: if x == null throw NullPointerException
		// else return the number of occurrences of 0 in x
		int count = 0;
		for (int i = 1; i < x.length; i++)
		/*for (int i = 0; i < x.length; i++)*/
		{
			if (x[i] == 0)
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Defecto: El ciclo del algoritmo no recorre correctamente la estructura
	 * */
	public static int findLast (int[] x, int y) {
		//Effects: If x==null throw NullPointerException
		// else return the index of the last element
		// in x that equals y.
		// If no such element exists, return -1
		for (int i=x.length-1; i > 0; i--)
		/*for (int i=x.length-1; i >= 0; i--)*/
		{
			if (x[i] == y)
			{
				return i;
			}
		}
		return -1;
	}

	
	public static void main (String[] args){
		System.out.println("**************************************************");
		System.out.println("Primer algoritmo: lastZero");
		MainLastZero.main(args);
		System.out.println("**************************************************\n");

		System.out.println("**************************************************");
		System.out.println("Segundo algoritmo: countPositive");
		MainCountPositive.main(args);
		System.out.println("**************************************************\n");

		System.out.println("**************************************************");
		System.out.println("Tercer algoritmo: oddOrPos");
		MainOddOrPos.main(args);
		System.out.println("**************************************************\n");
		
		System.out.println("**************************************************");
		System.out.println("Cuarto algoritmo: numZero");
		MainNumZero.main(args);
		System.out.println("**************************************************\n");

		System.out.println("**************************************************");
		System.out.println("Quinto algoritmo: findLast");
		MainFindLast.main(args);
		System.out.println("**************************************************\n");
	}
	
}
