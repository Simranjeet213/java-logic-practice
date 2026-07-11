public class ConditionalPrac {
    public static void main(String[] args) {

        //Practice 7
        //program that checks whether the number is positive.
        int i=7;
        if(i%2 == 0){
            System.out.println("the number is even");
        } 
        else
        {
            System.out.println("The number is odd.");
        }


        //program that checks whether the number is positive.
          int j= -78;
          if(j<0){
            System.out.println("The number is negative.");

          }
          else 
          {
            System.out.println("The number is positive.");
          }



          // a java program that takes age as input and checks whether the person is eligible to vote.
          int k= 13;
          if(k>=18){
            System.out.println("Eligible to vote");

          }else{
            System.out.println("Not eligible to vote");
          }

//java program that takes 2 integers and prints which is greater
 int a=10;
 int b=20;
 if(a>b){
    System.out.println(a +" is greater than "+ b);
 }
 else{
    System.out.println(b +" is greater than "+ a);
 }

 // java program to classify temperature into categories

  int temp = 25;
  if(temp<10){
    System.out.println("Very cold");
  }
  else if(temp>=10 && temp <25){
    System.out.println("Moderate");
  }
  else 
  {
    System.out.println("Hot");
  }
  
  //Student grade calculator
  int grade =82;
  if(grade>=90){
    System.out.println("Grade A");
  }
  else if(grade >=75){
    System.out.println("Grade B");
  }
  else if(grade >=60){
    System.out.println("Grade C");
  }
  else if(grade >=40){
    System.out.println("Grade D");
  }
  else{
    System.out.println("Fail");
  }
// largest of three numbers
int x = 10;
int y = 25;
int z= 15;
if(x>y && x>z){
    System.out.println(x + " is the greatest");
}
else if(y>x && y>z){
    System.out.println(y + " is the greatest");
}
else if(z>x && z>y){
    System.out.println(z + " is the greatest");
}
else if(x==y || y==z || x==z){
    System.out.println("Two number are equal.");
}
//Number sign check
 int m = -5;
 if(m<0){
    System.out.println("Negative");
 }
 else if(m>0){
    System.out.println("Positive");
 }
 else if(m==0){
    System.out.println("Zero");
 }

 //Days of week
 int h =5;
 switch(h){
    case 1 -> System.out.println("Monday");
     case 2 -> System.out.println("Tuesday");
     case 3 -> System.out.println("Wednesday");
     case 4 -> System.out.println("Thursday");
     case 5 -> System.out.println("Friday");
     case 6 -> System.out.println("Saturday");
     case 7 -> System.out.println("Sunday");
      default -> System.out.println("Put right number");                  
 }

 //Simple Calculator
 int s = 2;
 int t = 5;
 char ch = '*';
 switch(ch){
    case '+': System.out.println("addition result:" + (s+t));
    break;
     case '-': System.out.println("subtraction result:" + (s-t));
    break;
     case '*': System.out.println("multiplication result:" + (s*t));
    break;
     case '/': System.out.println("division result:" + (s/t));
    break;
 }

 //Program that checks whether a year is a leap year
 int year = 2024;
 if(year % 4 == 0  || (year % 4 == 0 && year % 100 != 0)){
    System.out.println("Leap year");
 }
 else{
    System.out.println("Not a leap year");
 }









    }
}