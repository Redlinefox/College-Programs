/* InsertionSort.java demonstrates the Insertion Sort algorithm with an array of integers
*  Joy McQuillan
*  October 2, 2013
*/

import java.util.Arrays;

public class InsertionSort
{
   public static void main(String[] args)
   {
      // create an array of unsorted integers
      int[] arr = {26, 43, 18, 34, 29, 15};
      
      // print the array before sorting
      //System.out.println("Before sorting:\n" + Arrays.toString(arr));
      
      // sort the array
      //sort(arr);
      
      // print the array after sorting
     // System.out.println("\nAfter sorting:\n" + Arrays.toString(arr));
		
		double[] dArr = {5.34, 6.43,2.34,6.34,7.2,1.34,3.26,2.75, 9.4, 8.2};
      // print the array before sorting
      //System.out.println("Before sorting:\n" + Arrays.toString(dArr));
      
      // sort the array
      //sort(dArr);
      
      // print the array after sorting
      //System.out.println("\nAfter sorting:\n" + Arrays.toString(dArr));
		
		double[] myDbls = {7.9, 2.3, 4.5, 1.8, 6.9};
		System.out.println("Before sorting:\n" + Arrays.toString(myDbls));
		System.out.println();
		
		sort(myDbls);
		System.out.println("\nAfter sorting:\n" + Arrays.toString(myDbls));
   }
   
   // sort method implements the insertion sort algorithm for an array of integers
   public static void sort(int[] a)
   {
      System.out.println("\narray \t\t\t   i\tcur \tj \ta[j]\n"); // print statement for info only
      int n = a.length;
      for(int i=1; i<n; i++) // i represents index of element to insert
      {
         int cur = a[i]; // current element to insert
         int j = i-1;
         System.out.println(Arrays.toString(a) + "   " + i + "\t" + cur + "\t" + j + "\t" + a[j]); // print statement for info only
         while(j>=0 && a[j] > cur)
         {
            System.out.println("\n" + Arrays.toString(a) + "   " + i + "\t" + cur + "\t" + j + "\t" + a[j] + " moving " + a[j] + " to the right"); // print statement for info only
            a[j+1] = a[j];
            j--;
         }
         System.out.println(Arrays.toString(a) + "   " + i + "\t" + cur + "\t" + j + "\t"  + " putting " + cur + " in its proper location"); // print statement for info only
         a[j+1] = cur; // put current element in its proper place
         System.out.println("\n" + Arrays.toString(a)); // print statement for info only
      }
   }
 
   // insertion sort for array of doubles
   public static void sort(double[] a)
   {
	   System.out.println("\narray \t\t\t   i\tcur \tj \ta[j]\n"); // print statement for info only

      int n = a.length;
      for(int i=1; i<n; i++) // i represents index of element to insert
      {
         double cur = a[i]; // current element to insert
         int j = i-1;
			System.out.println(Arrays.toString(a) + "   " + i + "\t" + cur + "\t" + j + "\t" + a[j]); // print statement for info only

         while(j>=0 && a[j] > cur)
         {
				System.out.println("\n" + Arrays.toString(a) + "   " + i + "\t" + cur + "\t" + j + "\t" + a[j] + " moving " + a[j] + " to the right"); // print statement for info only

            a[j+1] = a[j];
            j--;
				System.out.println("\n" + Arrays.toString(a)); // print statement for info only

         }
         a[j+1] = cur; // put current element in its proper place
      }
   }
  
}
  
