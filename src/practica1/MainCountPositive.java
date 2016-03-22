package practica1;

public class MainCountPositive {

	/**
	 * El defecto se encuentra en que el algoritmo cuenta el valor 0 como positivo
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
			System.out.println(Practica1.countPositive(case1));
		}catch (Exception e){
			System.out.println("Entrada que no alcanza el defecto (array=null)");
		}
		int[] case2 = new int[]{1, 2, -1, -2, 5};
		System.out.println("Caso 2: salida esperada 3, salida: "+ Practica1.countPositive(case2));
		int[] case3 = new int[]{1, 2, -1, -2, 0};
		System.out.println("Caso 3: salida esperada 2, salida: "+ Practica1.countPositive(case3));
	}

}
