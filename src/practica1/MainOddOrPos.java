package practica1;

public class MainOddOrPos {

	//Effects: if x==null throw NullPointerException
	// else return the number of elements in x that
	// are either odd or positive (or both)
	
	/**
	 * Defecto, no considera impares negativos
	 * */
	
	public static void main(String[] args) {
		
		
		int[] array = new int[] {1,2,3,-1,-2};
		int result = Practica1.oddOrPos(array);
		System.out.print(result);

	}

}
