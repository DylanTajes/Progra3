
public class ArregloInfinito {

	public static void main(String[] args) {
		arregloInfinito();

	}

	private static void arregloInfinito() {
		int [] array;
		array = new int[40];
		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i;
//		}
		array[0] = -20;
		array[1] = -15;
		array[2] = -5;
		array[3] = -1;
		array[4] = 0;
		array[5] = 22;
		array[6] = 32;
		array[7] = 42;
		array[8] = 50;
		array[9] = 53;
		array[10] = 60;
		
		int valor = -5;
		
		
		int x = buscarRango(array, valor);
		int ini = x/2;
		int fin = x;
		int posicion = buscarPosicion(array,valor,ini, fin);
		
		System.out.println(posicion);
		
	}

	private static int buscarRango(int[] array, int i) {
		
		int x= 1;
		while (array[x]<i) {
			x = 2*x;
		}

	    return x;
	}
	
	private static int buscarPosicion(int[] array, int valor,int ini, int fin) {
		int mid = (ini + fin)/2;
		if (ini > fin){
	         return -999;
	     }
		
		if (array[mid] == valor){
	         return mid;
	     } else if (array[mid] > valor){
	    	 return buscarPosicion(array, valor, ini, mid - 1);
	     } else {
	    	 return buscarPosicion(array, valor, mid + 1, fin);
	     }
		
	}
	
	

}
