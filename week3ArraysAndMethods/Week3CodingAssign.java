package week3ArraysAndMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Week3CodingAssign {

  public static void main(String[] args) {
    //1. Create an array of int called ages containing values 3, 9, 23, 64, 2, 8, 28, 93
    int[] ages= {3, 9, 23, 64, 2, 8, 28, 93, 84};
    //a. programmatically subtract first element value, from the last, without using 'ages[7]'
    int firstMinusLast = (ages[ages.length-1]) - ages[0];
    //b. Add a new age (84) to ages and repeat previous step to ensure dynamic behavior
    System.out.println(firstMinusLast);

    //c. Use a loop to iterate through ages and calculate average, print result to console
    int ageSum = 0;
    for (int i=0; i<ages.length; i++) {
      ageSum += ages[i];
    } System.out.println("Avg age: " + ageSum / ages.length); //avg age
    
        
    //2. Create an array of String with names Sam, Tommy, Sally, Buck, Bob
    String[] names = {"Sam", "Tommy", "Sally", "Buck", "Bob"};
    //a. Use a loop to iterate through array and calculate avg number of letters per name, print result
    int totalLetters = 0;
    for (String name: names) {
      totalLetters += name.length();
    } int avgLetters = totalLetters / names.length;
    System.out.println("Avg letters: " + avgLetters);
    
    //b. Use a loop to iterate names again, concat. all names together seperate by spaces, print result
    int i = 0;
    String listedNames = "";
    while (i<names.length) {
      listedNames += names[i];
      i++; if (i == names.length) {
        break;
      } listedNames += ", ";
    } System.out.println("Names w/ spaces: " + listedNames);
      
    //3. How to access last element of any array? 'array.length - 1'
    //4. Access first element? array[0]
    //5. Create new array of nameLengths write loop to iterate prev. names array, add len of each to nameLengths
    int[] nameLengths = new int [names.length];
    int l = 0;
    for (String name: names) {     
      nameLengths[l] = names[l].length();
      //System.out.println(nameLengths[l]);
      l++;
      } System.out.println("Name lengths: " + Arrays.toString(nameLengths));

    //6. Write loop to iterate nameLengths, calculate sum of all elements, print to console
    int nameLenSum = 0;
    for (int t = 0; t < nameLengths.length; t++) {
      nameLenSum += nameLengths[t];
      } System.out.println("Name lenth sum: " + nameLenSum);
      
    //7. Result- concattedWord
      //String word = "Hello";
      //int times = 3;
      String concatWord = concatStringMultInt("Hello", 3);
      System.out.println("Concatted word: " + concatWord);
      
    //8. Result- fullName
      String firstName = "Ada";
      String lastName = "Lovelace";
      String fullName = makeFullName(firstName, lastName);
      System.out.println("Full name: " + fullName);
      
    //9. Result- is array of int > 100
      System.out.println("Is greater than 100: " + arrGreaterThanHundred(ages));
      
    //10. Result- average of all elements in array
      double[] myArr = {23.8, 22.1, 40, 19.1, 20.8, 29.5};
      System.out.println("Arr avg: " + avgDoubleArray(myArr));
      
    //11. Result- arrA average > arrB average
      double[] myArrB = {82.1, 21.9, 32.8, 18.1, 9, 8};
      System.out.println("arrA > arrB: " + isArrAvgGreater(myArr, myArrB));
      
    //12. Result- will we buy a drink?
      boolean isHotOutside = true;
      double moneyInPocket = 10.55;
      System.out.println("Will buy drink: " + willBuyDrink(isHotOutside, moneyInPocket));
      
    //13. Is week 4 complete? Worry no more with a boolean piece of mind to tell you if you have completed your assignments
      //boolean week4IsComplete = false;
      System.out.println("Have you completed the following? y/n");
      getWeek4AssignmentsHashMap();
      
      //String watchedVids = assignmentResponse.nextLine();
      //String attendedClass = assignmentResponse.nextLine();
      //String openClassMastery = assignmentResponse.nextLine();
      //String codingAssignment = assignmentResponse.nextLine();
      //String researchAssignment = assignmentResponse.nextLine();
      //String linkedinPost = assignmentResponse.nextLine();
      
      //System.out.println(makeWeek4AssignmentsArrayList(watchedVids, attendedClass, openClassMastery, codingAssignment, researchAssignment, linkedinPost));
      //isWeek4Complete(watchedVids, attendedClass, openClassMastery, codingAssignment, researchAssignment, linkedinPost);
      
      

        
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
  
  //11. Write a method that takes two arrays of double and returns true if the average of first array > average of second
  private static boolean isArrAvgGreater(double[] arrA, double[] arrB) {
    double arrASum = 0; //calculate sums
    double arrBSum = 0; //calculate sums
    int j = 0;
      
    while (j<arrA.length && j<arrB.length) { //loop while j<arrA && j<arrB
      arrASum += arrA[j];
      arrBSum += arrB[j];
      j++;     
    } if (arrA.length > arrB.length) { //if arrA.length > arrB.length, continue until arrASum complete
      while (j<arrA.length) {
        arrASum += arrA[j];
        j++;
      }
    } else { //else arrB.length > arrA.length, complete arrBSum
      while (j<arrB.length) { 
        arrBSum += arrB[j];
        j++;
      }
    }

    double arrAAvg = arrASum / arrA.length; //arr avgs
    double arrBAvg = arrBSum / arrB.length; //arr avgs
    return arrAAvg > arrBAvg;
    }
  
  //12. Write a method called willBuyDrink that takes boolean isHotOutside and double moneyInPocket. Return true if it is hot outside and moneyInPocket > 10.50
  private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside == true) {
      if (moneyInPocket > 10.50) {
        return true;
      }
    } return false;
  }
  //13. Create a method that solves a problem
  // isWeek4Complete
  public static HashMap<String, String> getWeek4AssignmentsHashMap() {
    //create Assignment list
    HashMap<String, String> week4Assignments = new HashMap<String, String>(); // all assignments
    week4Assignments.put("Watched Videos", null); //Hashmap Assignment key/answer
    week4Assignments.put("Attended Class", null);
    week4Assignments.put("OpenClass Mastery", null);
    week4Assignments.put("Coding Assignment", null);
    week4Assignments.put("Research Assignment", null);
    week4Assignments.put("LinkedIn Post", null);
    
    //String nextInput = new bj.nextLine(System.in);
    for (String key: week4Assignments.keySet()) {
      Scanner assignmentResponse = new Scanner(System.in);
      System.out.println(key + ": "); //key name
      
      String nextResponse = assignmentResponse.nextLine();
      week4Assignments.put(key, nextResponse);
      
      System.out.println(week4Assignments);
      
    
    }
    
    //for (String assignment: week4Assignments) {
    //  System.out.println(assignment  + ": ");
    //  List<String> watchedVids = assignmentResponse.nextLine();
    //}
    System.out.println(week4Assignments.values());
    return week4Assignments;
    
  }
  
  public static HashMap<String, String> isWeek4Complete(String watchedVids, String attendedClass, String openClassMastery, String codingAssignment, String researchAssignment) {
    HashMap<String, String> incomplete = new HashMap<String, String>(); //incomplete to track
    //week4Assignments.put("Watched Videos", watchedVids); //Hashmap Assignment key/answer
    //week4Assignments.put("Attended Class", attendedClass);
    //week4Assignments.put("OpenClass Mastery", openClassMastery);
    //week4Assignments.put("Coding Assignment", codingAssignment);
    //week4Assignments.put("Research Assignment", researchAssignment);

    //for (int i = 0; i < week4Assignments.size(); i++) {
    //    System.out.println(week4Assignments.get("Watched Videos; ", watchedVids));
    //    System.out.println(week4Assignments.values());
    //}
    //for (String assignment: week4Assignments.keySet()) { // for assignment in week4Assignment keyset
        
        //if (week4Assignments.get(assignment).equals("n")) { // if keySet.equals("n") ;          
        //  incomplete.put(assignment, week4Assignments.get(assignment)); // add to incomplete
       // }
        //System.out.print(assignment + ": "); // get assignment name
        //System.out.println(week4Assignments.get(assignment)); // get value
    //}
   // if (incomplete.size() > 0) {      
    //  System.out.println("I N C O M P L E T E: "); //incomplete warning
      
      //for (String incompleteAssignment: incomplete.keySet()) {
       // System.out.println('"' + incompleteAssignment + '"' + " still needs to be completed.");
     // }
    //}

        //for (String assignment: week4Assignments()) {
          
     //   }
    

    
    
    //System.out.println(incomplete);
    return incomplete;
    //if (input.equals("n")
    //for (boolean assignment: week4Complete) {
    //  if (assignment == false) {
    //    return false;
    //  } else {
    //    return true;
     // }
  }
  
  
  }  
//}
