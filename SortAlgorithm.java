public class SortAlgorithm{
public class BucketSort{
	public static void main(String[] args) {
		
	
int [] a = {2,1,2,100};
1.便利原数组，
2.创建一个新的数组，使他的长度与原数组里最大的数的数值+1一样。
3.对应新的数组下标，然后与原数组数相同，将此下标的数组内+1；
4.返回新的数组。

		int temp=a[0];
	      for(int i=1;i<a.length;i++){
	      if(a[i]>temp){
	      temp=a[i];
	       }
	      }
	      
	    int []b = new int [temp+1];
	    for(int k=0; k<b.length;k++){
	          for(int j=0;j<a.length;j++){
	                if(k==a[j]){
	                    System.out.print(k);
	                 }
               }
		   }
		}
	}
public class BubbleSort{
    int []a = {5,1,2,4,3};//11
  int b = a.length;
  while(b!=0){
    for(int i = 0;i<a.length-1;i++){
      if(a[i]>a[i+1]){
         int temp =a[i];
         a[i] = a[i+1];
         a[i]=temp;
        
      }
      b--;
      
    }
    return a;
  }
}
public class Selectionsort{
  int [] a = {1,3,2,4};
  for(int i=0 ; i<a.length; i++){
    int min = a[0];
    int index = 0;
    for(int j=i; j<a.length; j++){
        if (a[i]<min){
          min=a[i];   
    }
  }
          int temp = 0;
          temp=a[i];
          a[i]=a[j];
          temp=a[j];
          index=j;
 }  
}
 public class Mergesort {
    public static void Mergesorts(int[] ints, int start, int end) {
        if (start == (end - start) / 2 + start) {
            return;
        }
    }

    public static void merge(int[] ints, int leftStart, int leftEnd, int rightEnd) {
        int[] temp = new int[rightEnd - leftStart + 1];
        int l = leftStart;
        int r = leftEnd + 1;
        int index = 0;
        while (l <= leftEnd && r <= rightEnd) {
            if (ints[leftStart] < ints[leftEnd + 1]) {
                temp[index] = ints[leftStart];
                index++;
                l++;
            } else if (ints[r] < ints[l]) {
                temp[index] = ints[r];
                index++;
                r++;
            } else {
                temp[index] = ints[l];
                index++;
                l++;
            }
            while (l <= leftEnd) {
                temp[index] = ints[l];
                index++;
                l++;
            }
            while (r <= rightEnd) {
                temp[index] = ints[r];
                index++;
                r++;
            }
            for (int i = 0; i < temp.length; i++) {
                ints[leftStart + i] = temp[i];
            }
        }

    }

    public static void print(int[] ints) {
        for (int e : ints) {
            System.out.println(e + "");
        }
    }

    public static void main(String[] args) {
        int[] ints = { 1, 3, -1, 5 };
        merge(ints, 0, 1, 3);
        print(ints);
    }
}

  

}
