package practica1;

public class MainNumZero {

	/**
	 * defecto: el algoritmo comienza a recorrer el arreglo desde la segunda posicion
	 * */
	/**
	 * Casos a probar:
	 * case1: Si es posible, ejecute el programa para alguna entrada que no alcance el defecto
	 * case2: Si es posible, ejecute el programa para alguna entrada que alcance el defecto y no resulte en una falla
	 * case3: Si es posible, ejecute el programa para alguna entrada que ejecute el defecto y produzca una falla
	 * 
	 * */
	public static void main(String[] args) {
		int[] case1 = null;
		try {
			System.out.println(Practica1.numZero(case1));
		}catch (Exception e){
			System.out.println("Entrada que no alcanza el defecto (array=null)");
		}
		int[] case2 = new int[]{1, 0, 1, 0};
		System.out.println("Caso 2: salida esperada 2, salida: "+ Practica1.numZero(case2));
		int[] case3 = new int[]{0, 2, -1, -2, 0};
		System.out.println("Caso 3: salida esperada 2, salida: "+ Practica1.numZero(case3));
	
	}

}
