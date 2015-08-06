public class Sorting
{

public static void insertionSort (Comparable[] list)
   {
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         //  Shift larger values to the right
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }

}

	public static void quicksort(Comparable[] list) {
		 quickSortRecursive(list, 0, 2999);
	
	}
	private static void quickSortRecursive(Comparable list[], int left, int right){
		int pivot;
		if (left >= right) return;
		pivot = partition(list,left,right);
		quickSortRecursive(list,left,pivot-1);
		quickSortRecursive(list,pivot+1,right);
		
	}
	private static int partition(Comparable[] list, int left, int right){
		while(true){
			while ((left < right) && ((list[left].compareTo(list[right]))<0)) right--;
			if (left < right) swap(list, left++, right);
			else return left;
			while(left< right && ((list[left].compareTo(list[right]))<0)) left++;
			if (left < right) swap(list,left,right--);
			else return right;
		}
	}
	private static void swap(Comparable[] list, int i, int j){
		Comparable temp;
		temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	public static void selectionSort(Comparable[] list){

      Comparable t;
      int menor;

       for (int i = 0; i < list.length-1; i++) {
          menor = i;
         for (int j = i + 1; j < list.length; j++)
       if (list[j].compareTo(list[menor]) < 0)
             menor = j;

          // Swap the values
         t = list[menor];
         list[menor] = list[i];
          list[i] = t;

            //System.out.println("T:"+t);
         }   
   }

}