package week3ArraysAndMethods;

public class Week3ArraysAndMethods {

  public static void main(String[] args) {
    //create array with values 1,5,2,8,13,6
    //print first element in array
    int[] nums= {1, 5, 2, 8, 13, 6};
    System.out.println("First element: " + nums[0] + "\n");
    //print last element without "5"
    int lastIndex = nums.length;
    System.out.println("Last element: " + nums[lastIndex-1] + "\n");
    
    //write traditional for loop that prints each element in the array
    for (int i=0; i<5; i++) {
      System.out.println(nums[i]);
      } System.out.println("Traditional for loop ending.\n"); //add white space
    
     //enchanced for to loop nums[]
    for (int i: nums) {
      System.out.println(i);
      } System.out.println("Enhanced loop ending.\n"); //add white space
    
    // create new variable sum, write loop that adds each element in array to sum
      int sum = 0;
      int i = 0;
      do {
        sum += nums[i];
        System.out.println(sum);
        i++;
      } while (i < nums.length);
      //create variable avg, assign the average value of array to it
      int avg = (sum / nums.length);
      System.out.println(avg + "\n");
      
      //create enhanced for loop that prints out each number in array, only if odd
      for (int myNum: nums) {
        if (myNum % 2 != 0) {
          System.out.println(myNum);
        }
      }
      
    
  
  
  
  
  
  
  
  }

}
