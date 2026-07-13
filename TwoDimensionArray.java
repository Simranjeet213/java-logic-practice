import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
        
//creating 2D array. Taking a matrix as an input and printing its elements.
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size of rows");
//   int rows = sc.nextInt();
//   System.out.println("Enter size of columns");
//   int cols = sc.nextInt();
//   int[][] numbers = new int[rows][cols];
//   //Input
//   for(int i=0;i<rows;i++){
//     for(int j=0;j<cols;j++){
//         System.out.println("Enter data");
//         numbers[i][j]=sc.nextInt();
//     }
//   }
//   //output
//   for(int i=0;i<rows;i++){
//     for(int j=0;j<cols;j++){
//         System.out.print(numbers[i][j]+" ");
//     }
//     System.out.println();
//   }


//Searching for an element x in a matrix.
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of rows");
int rows = sc.nextInt();
System.out.println("Enter size of cols");
int cols = sc.nextInt();
int numbers[][] = new int[rows][cols];
//input
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.println("Enter data");
        numbers[i][j]= sc.nextInt();
    }
}
System.out.println("Enter the number you want to find:");
int x = sc.nextInt();

for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        if(numbers[i][j]==x){
            System.out.println("x found at "+ i + "," + j);
        }
    }
}

    }
}
