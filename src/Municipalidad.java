
public class Municipalidad {

	public static void main(String[] args) {
		ejercicio1DC();

	}
	
	private static void ejercicio1DC() {
		int [] array;
		array = new int[12];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		array[6] = 6;
		array[7] = 7;
		array[8] = 7;
		array[9] = 8;
		array[10] = 9;
		array[11] = 10;
		
		int ini = 0;
		int fin = array.length - 1;
		
		
		
		System.out.println(buscarPosicionRepetida(array, ini, fin));
		
	}
	
	private static int buscarPosicionRepetida(int[] array, int ini, int fin) {
		if (fin <= ini) {
			return array[fin];
		}else {
			int mitad = (ini + fin)/2;
			
			if (array[mitad] == mitad) {
				return buscarPosicionRepetida(array, mitad + 1, fin);
			} else {
				return buscarPosicionRepetida(array, ini, mitad);
			}
		}
		
		
		
	}

}
