//Q1.Complete the function printNumber which takes an integer input from the user and prints it on the screen.
// import java.util.*;
// public class Lec1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
//         System.out.println("User input is:" + num);
//     }
// }


//Q2.Given marks of a student, print on the screen:
// Grade A if marks >= 90
// Grade B if marks >= 70
// Grade C if marks >= 50
// Grade D if marks >= 35
// Fail, otherwise.
// public class Lec1 {
//     public static void studentGrade(int marks) {
//         if(marks>=90){
//             System.out.println("Grade A");
//         }
//         else if(marks>=70){
//             System.out.println("Grade B");
//         }
//         else if(marks>=50){
//             System.out.println("Grade C");
//         }
//         else if(marks>=35){
//             System.out.println("Grade D");
//         }else{
//             System.out.println("Fail");
//         }
//     }
//     public static void main(String[]args){
//         int marks=45;
//         studentGrade(marks);
//     }
// }


//Q3.Given the integer day denoting the day number, print on the screen which day of the week it is.
// Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
// Ensure only the 1st letter of the answer is capitalised.
// public class Lec1{
//     public static void whichWeekDay(int day) {
//         switch(day){
//         case 1:
//         System.out.println("Monday");
//         break;
//         case 2:
//         System.out.println("Tuesday");
//         break;
//         case 3:
//         System.out.println("Wednesday");
//         break;
//         case 4:
//         System.out.println("Thursdday");
//         break;
//         case 5:
//         System.out.println("Friday");
//         break;
//         case 6:
//         System.out.println("Saturday");
//         break;
//         case 7:
//         System.out.println("Sunday");
//         break;
//         default:
//         System.out.println("invalid");
//         }
//     }
//     public static void main(String[]args){
//         whichWeekDay(4);
//     }
// }
