class InsertionSort{
	
	void sort(int a1[]){
		int n = a1.length;
		for(int i=1; i<n; i++){
			int key = a1[i];
			int j = i-1;
			while(j >= 0 && a1[j] > key){
				a1[j+1] = a1[j];
				j = j-1;
			}
			a1[j+1] = key;
		}
	}
	
	void print(int a1[]){
		int n = a1.length;
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
		}
	}
	public static void main(String[] args){
		InsertionSort o = new InsertionSort();
		int a1[] = {1,2,4,5,3};
		
		o.sort(a1);
		System.out.println("Sorted Array : ");
		o.print(a1);
	}
}