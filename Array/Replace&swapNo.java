
public class swapnumber {
	//if we want swaping of values
	public static void swap (int[]arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=	temp;
	}

	public static void main(String[] args) {
		// vedio92 memory
		//swap number
		
			int [] arr=new int[5];
			
			arr[0]=30;
			arr[1]=31;
			arr[2]=32;
			arr[3]=33;
			arr[4]=34;
			// for replacing value of exact array
			//int[]two=arr;
			//two[2]=599;
			
			swap(arr,0,4);
			
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}

	}

}
