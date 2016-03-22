package practica1;

public class MainLastZero {

	/**
	 * El algoritmo devuelve la primera posicion de cero no la ultima,
	 *  que es lo esperado
	 * 
	 * */
	
	
	public static void main(String[] args){
		int[] array = new int[10];
		int result = Practica1.lastZero(array);
		System.out.print(result);
	}
	
}
