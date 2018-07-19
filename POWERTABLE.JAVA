
import java.util.Scanner;


public class POWERTABLE {

    // input scanner 
    private Scanner in;
    
    public POWERTABLE() {
        // create the scanner to scan the inputs
        in = new Scanner(System.in);
    }
    // to take the squares of input numbers
    private int square(int number){
        return (number*number);
    }
    // to take the cube of input numbers
    private int cube(int number){
        return (number*square(number));
    }
    
    public static void main(String[] args) {
        POWERTABLE pt = new POWERTABLE();
        System.out.println("Learn your squares and cubes!");
        // to run continuously
        while (true) {            
            System.out.print("\nEnter an integer:");
            // read the user input number
            int number = pt.in.nextInt();
            // print the topic of table columns
            System.out.println("\nNumber      Squared       Cubed");
            System.out.println("======      =======       ======");
            // print the table
            for (int i = 1; i <=number; i++) {
                // print the data aligning to left
                System.out.printf("%-12d%-14d%-12d\n",i,pt.square(i),pt.cube(i));
            }
            
            System.out.print("\nContinue?(y/n):");
            // read the user input(y or n)
            pt.in.nextLine();
            String option = pt.in.nextLine();
            if(option.equalsIgnoreCase("y")){
                continue;
            }else if(option.equalsIgnoreCase("n")){
                break;
            }
        }
    
    }
    
}