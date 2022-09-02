import java.util.Iterator;
import java.util.Random;

public class IndiceIgualValor {

	public static void main(String[] args) {
		ejercicio6DC();
		
	}

	private static void ejercicio6DC() {
		int [] array;
		array = new int[10];
		array[0] = -1;
		array[1] = 0;
		array[2] = 1;
		array[3] = 3;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		int ini = 0;
		int fin = array.length -1;
		System.out.println(existeIndiceIgualValor(array, ini, fin));
	}
	
	private static boolean existeIndiceIgualValor(int[] array, int ini, int fin) {
		int mid = (ini + fin)/2;
		if (array[mid] == mid) {
		     return true;
		} 
		
		if (ini > fin) {
			return false;
		}


		if (array[mid] < mid) {
		   return existeIndiceIgualValor(array, mid + 1, fin);
		} else {
		   return existeIndiceIgualValor(array, ini, mid - 1);
		}
	}

	

	

	

	

	

	
	
	

}
