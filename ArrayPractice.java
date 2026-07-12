import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        //Take an array of names as input from the user and print them on the screen.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter size of the string.");
        // int size = sc.nextInt();
        // String names[]=new String[size];

        // //Input
        // for(int i=0;i<size;i++){
        //     System.out.println("Enter name in the string.");
        //     names[i]=sc.next();

        // }

        // //output
        // for(int i=0;i<names.length;i++){
        //     System.out.println("name "+(i+1)+" is "+names[i]);
        // }

//Find the maximum & minimum number in an array of integers. 

//  Scanner sc= new Scanner(System.in);
//  System.out.println("Enter size of array");
//  int size = sc.nextInt();
//  int numbers[] = new int[size];
//  for(int i=0;i<size;i++){
//     System.out.println("Enter number");
//     numbers[i]=sc.nextInt();

//     }
//     int max = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;

//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]<min){
//             min = numbers[i];
//         }
//         if(numbers[i]>max){
//             max=numbers[i];
//         }
        
//     }
//     System.out.println("Minimum value is "+min);
//         System.out.println("Maximum value is "+max);
    

/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
 */
Scanner sc= new Scanner(System.in);
System.out.println("Enter size of array");
  int size = sc.nextInt();
  //System.out.println("Enter size of array");
  int numbers[]= new int[size];
  for(int i=0;i<size;i++){
    System.out.println("Enter number");
    numbers[i]=sc.nextInt();
  }

  boolean isAscending = true;
  
  for(int i=0;i<(numbers.length-1);i++){
    if(numbers[i]>numbers[i+1]){
        isAscending =false;
    }

  }
  if(isAscending){
    System.out.println("Sorted in ascending");
  }
  else{
    System.out.println("Not sorted");
  }













}


}

