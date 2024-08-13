

//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:


public class Program3{
    public static void main(String[] args){
  
        
        //declaring variables 
  int length = 0;
  int width = 0;
  
  
        //create scanner
        Scanner numScanner = new Scanner(System.in);
        //ask for user imput
        System.out.println("enter the length: ");
       length = numScanner.nextInt();
        
       System.out.println("enter the width: ");
        width = numScanner.nextInt();
        //calculate area/width
         int area = length*width;
  int perimeter = 2*length + 2*width; 
        //print results
   
  System.out.println("the perimeter is " + perimeter);
  System.out.println("the area is " + area);
  System.out.println("the length is " + length);
System.out.println("the width is " + width);}
}


//Paste console output below:
/*

enter the length: 
10
enter the width: 
10
the perimeter is 40
the area is 100
the length is 10
the width is 10
*/

