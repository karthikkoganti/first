package assignment;

public class Sorting {
	public static void main(String[] args) {
		int[] id= new int[]{15,18,1,12,5};
		System.out.println("After sorting: ");
		for(int i=0;i<id.length;i++) {
			for(int j=i+1;j<id.length;j++)
			{
				int temp=0;
				if(id[i]>id[j]) {
				temp=id[i];
				id[i]=id[j];
				id[j]=temp;
			}
		}

		System.out.println(id[i]);
		
	}

}
}

