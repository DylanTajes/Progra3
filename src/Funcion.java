
public class Funcion {

	public static void main(String[] args) {
		ejercicioFuncion();

	}
	
	private static void ejercicioFuncion() {
		int [] array;
		array = new int[40];
		array[0] = 5;
		array[1] = 4;
		array[2] = 3;
		array[3] = 2;
		array[4] = 1;
		array[5] = 0;
		array[6] = -1;
		array[7] = -2;
		array[8] = -3;
		
		int x = buscarNegativo(array);
		System.out.println(x);
		int valor = seVuelveNegativo(array,x/2,x);
		System.out.println(valor);
		
	}
	
	private static int buscarNegativo(int[] array) {
		int x = 1;
		while (array[x] > 0) {
			x= 2*x;
		}
		return x;
	}
	
	private static int seVuelveNegativo(int[] array, int i, int x) {
		int mid = (i + x)/2;
		
		if (array[mid] < 0 && array[mid - 1] >= 0) {
			return mid;
		} else if (array[mid] >= 0) {
			return seVuelveNegativo(array,mid+1,x);
		} else {
			return seVuelveNegativo(array,i,mid-1);
		}
		
	}

}
