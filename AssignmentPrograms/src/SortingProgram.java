public class SortingProgram {

	public static void main(String[] args) {
		sort();

	}
	public static void sort() {
		int [] arr= {30,10,50,20,80};
		int temp=0;
		System.out.println("Elements of original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Elements of array sorted in ascending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		
	}

}