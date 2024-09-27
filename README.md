# AreaOfRectangle

Area Of Rectangle Program
java
Copy code
import java.util.Scanner;
Explanation: This line imports the Scanner class from the java.util package. The Scanner class is used to read input from the user.

java

    **public class AreaOfRectangle {**

Explanation: This line declares a public class named AreaOfRectangle. In Java, every program must have at least one class, and the class name should match the file name (e.g., AreaOfRectangle.java).

java

    **public static void main(String[] args) {**
    
Explanation: This line declares the main method, which is the entry point of the program. The public keyword means that the method can be accessed from outside the class. The static keyword means that the method belongs to the class rather than an instance of the class. The void keyword means that the method does not return any value. The main method takes an array of strings (String[] args) as a parameter, which can be used to pass command-line arguments to the program.

java

       ** Scanner scanner = new Scanner(System.in);**
        
Explanation: This line creates a new Scanner object named scanner that is used to read input from the standard input (usually the keyboard). The System.in is the standard input stream.

java

        **System.out.print("Enter the length of the rectangle: ");**
        
Explanation: This line prints a prompt to the console asking the user to enter the length of the rectangle. The System.out.print method is used instead of System.out.println to keep the cursor on the same line after printing the prompt.

java

        **double length = scanner.nextDouble();**
        
Explanation: This line reads a double value from the user and assigns it to the variable length. The scanner.nextDouble() method is used to read a floating-point number from the input.

java

        **System.out.print("Enter the width of the rectangle: ");**
        
Explanation: This line prints another prompt to the console asking the user to enter the width of the rectangle.

java

        **double width = scanner.nextDouble();**
        
Explanation: This line reads another double value from the user and assigns it to the variable width.

java

        **double area = length * width;**
        
Explanation: This line calculates the area of the rectangle by multiplying the length and width variables. The result is stored in the area variable.

java

        **System.out.println("The area of the rectangle is: " + area);**
        
Explanation: This line prints the calculated area to the console. The System.out.println method is used to print the string and move the cursor to the next line. The + operator is used to concatenate the string with the value of the area variable.

java

        **scanner.close();**
        


Full Context
The program prompts the user to input the length and width of a rectangle, calculates the area using the formula 
Area
=
length
×
width
Area=length×width, and then prints the result. The Scanner class is used to handle user input, and the System.out.print and System.out.println methods are used to display prompts and results to the user.

How to Run:
Copy the code into a Java file, e.g., AreaOfRectangle.java.

Compile the program using javac AreaOfRectangle.java.

Run the program using java AreaOfRectangle
