public class LoopsPractice {
    public static void main(String[] args) {
        
      /*
      ****
      ****
      ****
      ****
       */

    //   for(int i=0; i<4; i++){
    //     for(int j=0; j<4; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

/*
*****
  *
  * 
  * 
  * 

*/
// for(int i =0; i<5; i++)
// {
    

    
//     for(int j=0; j<5; j++){
        
//         if(i==0 || j==2){
//         System.out.print("*");
//     }
//     else{
//         System.out.print(" ");
//     } 
//     }
//     System.out.println();
   
     
//     }


/*
*
**
***
****
*****

*/

// for(int i=0;i<5;i++){
//     for(int j=0;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

/*
*****
****
***
**
*


*/
// for(int i=0;i<5;i++){
//     for(int j=5-i;j>0;j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

/*
1111
2222
3333
4444

*/
// for(int i=0;i<4;i++){
//     for(int j=0;j<4;j++){
//         System.out.print(1+i);
//     }
//     System.out.println();
// }

/*
1
12
123
1234
12345

*/
// for(int i=0;i<5;i++){
//     for(int j=0;j<=i;j++){
//         System.out.print(1+j);
//     }
//     System.out.println();
// }

/*
1
23
456
78910
*/
// int k=1;
// for(int i=1;i<5;i++){
//     for(int j=0;j<i;j++){
        
//         System.out.print(k+j);
        
//     }
//     k=k+i;
//     System.out.println();
// }


/*
   *
  ***
 *****
*******


*/
// for(int i=1;i<=4;i++){
//     for(int j=0;j<4-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=0;k<2*i-1;k++){
//     System.out.print("*");

// }
// System.out.println();




/*
Inverted pyramid */
// for(int i=0;i<4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(" ");
//     }
//         for(int k=0;k<7-(i*2);k++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
   /*
   1
   22
   333
   4444
   55555
   
   
   */
//   for(int i=1;i<=5;i++){
//     for(int j=0;j<i;j++){
//         System.out.print(i);
//     }
//     System.out.println();
//   }

/*
1
01
101
0101
10101


*/

// for(int i=0;i<5;i++){
//     int k=1;
    
//         if(i%2==0){
//             for(int j=0;j<=i;j++){
//         System.out.print(k);
//         if(k==1){
//             k=0;
//         }
//         else{
//             k=1;
//         }
//     }
//     }
//     else
//     { k=0;
//          for(int j=0;j<=i;j++){
//         System.out.print(k);
//         if(k==1){
//             k=0;
//         }
//         else{
//             k=1;
//         }
//     }

  

//     }
//     System.out.println();

// }
// for(int i=0;i<5;i++){

//     int k = (i%2==0) ? 1 : 0;

//     for(int j=0;j<=i;j++){
//         System.out.print(k);
//         k = 1 - k;
//     }

//     System.out.println();
// }

/*
Diamond pattern
    *
   ***
  ***** 
 *******
*********
 *******
  *****
   ***
    *

*/

//  for(int i=1;i<=4;i++){
//      for(int j=0;j<4-i;j++){
//          System.out.print(" ");
//      }
//      for(int k=0;k<2*i-1;k++){
//      System.out.print("*");

//  }
//  System.out.println();
// }
// for( int i=0;i<4;i++){
//     for(int j=1;j<=i;j++){
//          System.out.print(" ");
//      }
//          for(int k=0;k<7-(i*2);k++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }

/*
    1
   1 1 
  1 2 1
 1 3 3 1
1 4 6 4 1

  


*/
for(int i=1;i<=5;i++){
    for(int j=0;j<(5-(i));j++){
        System.out.print(" ");

    }
    for(int j=0;j<(i);j++){
        
        System.out.print(1+j);
    }
    System.out.println();
}



}
}














    

