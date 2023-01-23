package week3ArraysAndMethods;

import java.util.Arrays;

public class Week3CodingAssign {

  public static void main(String[] args) {
    //1. Create an array of int called ages containing values 3, 9, 23, 64, 2, 8, 28, 93
    int[] ages= {3, 9, 23, 64, 2, 8, 28, 93, 84};
    //programmatically subtract first element value, from the last, without using 'ages[7]'
    int firstMinusLast = (ages[ages.length-1]) - ages[0];
    //Add a new age (84) to ages and repeat previous step to ensure dynamic behavior
    System.out.println(firstMinusLast);

    //Use a loop to iterate through ages and calculate average, print result to console
    int ageSum = 0;
    for (int i=0; i<ages.length; i++) {
      ageSum += ages[i];
    } System.out.println("Avg age: " + ageSum / ages.length); //avg age
    
        
    //2. Create an array of String with names Sam, Tommy, Sally, Buck, Bob
    String[] names = {"Sam", "Tommy", "Sally", "Buck", "Bob"};
    //Use a loop to iterate through array and calculate avg number of letters per name, print result
    int totalLetters = 0;
    for (String name: names) {
      totalLetters += name.length();
    } int avgLetters = totalLetters / names.length;
    System.out.println("Avg letters: " + avgLetters);
    
    //Use a loop to iterate names again, concat. all names together seperate by spaces
    int i = 0;
    String listedNames = "";
    while (i<names.length) {
      listedNames += names[i];
      i++; if (i == names.length) {
        break;
      } listedNames += ", ";
    } System.out.println(listedNames);
      
    //3. How to access last element of any array? 'array.length -1'
    //4. Access first element? array[0]
    //5. Create new array of nameLengths write loop to iterate prev. names array, add len of each to nameLengths
    int[] nameLengths = new int [names.length];
    int l = 0;
    for (String name: names) {     
      nameLengths[l] = names[l].length();
      //System.out.println(nameLengths[l]);
      l++;
      } System.out.println(Arrays.toString(nameLengths));

    //6. Write loop to iterate nameLengths, calculate sum of all elements, print to console
    int nameLenSum = 0;
    for (int t = 0; t < nameLengths.length; t++) {
      nameLenSum += nameLengths[t];
      } System.out.println(nameLenSum);
      
    //7. Result- concattedWord
      //String word = "Hello";
      //int times = 3;
      String concatWord = concatStringMultInt("Hello", 3);
      System.out.println(concatWord);
      
    //8. Result- fullName
      String firstName = "Ada";
      String lastName = "Lovelace";
      String fullName = makeFullName(firstName, lastName);
      System.out.println(fullName);
      
    //9. Result- is array of int > 100
      System.out.println("Is greater than 100: " + arrGreaterThanHundred(ages));
      
    //10. Result- average of all elements in array
      double[] myArr = {23.8, 22.1, 40, 19.1, 20.8, 29.5};
      System.out.println("Arr avg: " + avgDoubleArray(myArr));
  }
  //7. Write method that takes a String- word, and int- n. Method returns word*int, eg 'hi', 3="hihihi"
  private static String concatStringMultInt(String word, int times) {
    String concattedWord = "";
    int numOfTimes = 0;
    do {
      concattedWord += word;
      numOfTimes++;
    } while (numOfTimes < times);
    return concattedWord;
  }
  
  //8. Write a method that takes two Strings, firstName, lastName, then returns fullName String, with space.
  private static String makeFullName(String firstName, String lastName) {
    String fullName = firstName + " " + lastName;    
    
    return fullName;
  }
  
  //9. Write a method that takes an array of int and returns true if the sum of all ints are > 100
  private static boolean arrGreaterThanHundred(int[] myArr) {
    int arrSum = 0;
    for (int num: myArr) {
      arrSum += num;
    }
    if (arrSum > 100) {
      return true;
    } return false;
  }
  
  //10. Write a method that takes an array of double and returns the average of all elements in the array.
  private static double avgDoubleArray(double[] arr) {
    double arrSum = 0;
    
    for (double num: arr) {
      arrSum += num;
    } 
    double arrayAvg = arrSum / arr.length ;
    return arrayAvg;
  }
}
