package week3.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	int[] a = {1, 3, 4, 5, 6, 8, 10, 13};
	int count = 1;
	for (int i =0; i<=a.length - 1; i++ ) {
		if(a[i] != i+ count ) {
			System.out.println(i + count);
			count++;
		}
		
	}
	}

		}
	
