
public class PicosVector {

	public static void main(String[] args) {
		int [] array;
		array = new int[7];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 3;
		array[3] = 2;
		array[4] = 5;
		array[5] = 1;
		array[6] = 0;
		
		int ini = 0;
		int fin = array.length-1;
		int pico = buscarPicos(array,ini,fin);
		System.out.println(pico);

	}
	
	private static int buscarPicos(int[] array,int ini,int fin) {
		int mid = (ini + fin)/2;
		
		if (ini == fin) {
			return array[fin];
		}
		
		if(array[mid] > array[mid+1] && array[mid] > array[mid-1]) {
			return array[mid];
		} else if (array[mid+1] >= array[mid-1]){
			return buscarPicos(array, mid+1, fin);
		}else {
			return buscarPicos(array, ini, mid-1);
		}
	}

}
