package practica1;

public class MainCountPositive {

	/**
	 * 
	 * El defecto se encuentra en que el algoritmo cuenta el valor 0 como positivo
	 * 
	 * */
	
	public static void main(String[] args) {
		int[] array = new int[10];
		array [2] = -1;
		int result = Practica1.countPositive(array);
		System.out.print(result);

	}

}
