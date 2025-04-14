package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		int lengthofArraya = a.length;
		int lengthofArrayb = b.length;
		System.out.println("Intersection of two arrays are:" );
		for (int i=0; i<lengthofArraya; i++)
		{
			for (int j=0; j<lengthofArrayb; j++)
			{
				if(a[i] == b[j])
					System.out.println(b[j]);
			}
		}

	}

}
