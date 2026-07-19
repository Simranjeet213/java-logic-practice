import java.util.Scanner;

public class StringsPractice {
    public static void main(String[] args) {
        
     //Take an aray of strings input from the user and find the cumulative length.
    //   Scanner sc = new Scanner(System.in);
    //   int size = sc.nextInt();
    //   String array[] = new String[size];
    //  int totalLength = 0;
    //  for(int i=0;i<size; i++){
    //     array[i]= sc.next();
    //     totalLength += array[i].length();
    //  }
    //  System.out.println(totalLength);

//input a string from the user. Create a new string 'result'in which you will replace the letter 'e' with 'l'

// Scanner sc = new Scanner(System.in);
// String str = sc.next();
// String result = "";
// for(int i=0;i<str.length();i++){
//     if(str.charAt(i)=='e'){
//         result += 'i';
//     }else{
//         result +=str.charAt(i);
//     }
// }
// System.out.println(result);

// input an email from the user. you have to create a username from the email.

Scanner sc = new Scanner(System.in);
String str = sc.next();
String username = "";
for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='@'){
        break;
    }else{
        username += str.charAt(i);
    }
}
System.out.println(username);
    }
}
