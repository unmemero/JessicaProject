import java.util.*; //Includes scanner
import java.io.*; //Includes filewriter

public class Main{
    public static void main(String[] args) throws IOException{

        Scanner scnr = new Scanner(new File("numbers.txt"));
        int n = 0; // Number of elements
        int sum = 0; // sum of all elements
        while(scnr.hasNextLine()){ //Reads all elements, sums all elements, and counts the number of elements
            sum += scnr.nextInt();
            n++;
        }
        double mean = (double)sum / (double)n; //Finds the mean based on the sum and number of elements
        System.out.println(mean); //prints mean to console

        //Create new scanner
        Scanner scnr2 = new Scanner(new File("numbers.txt"));
        //Calculates sum of (xi-mean)^2
        double sigma = 0.0; //sum of all pow
        double sub;
        double pow;
        while(scnr2.hasNextLine()){ 
            sub = ((double)scnr2.nextInt()-mean);
            pow = Math.pow(sub,2);
            sigma += pow;
        }
        double frac = sigma/(n-1);
        double stdev = Math.sqrt(frac);
        System.out.println(stdev);

        Scanner scnr3 = new Scanner(new File("numbers.txt"));
        int largest = scnr3.nextInt();
        int smallest = largest;
        int currentValue;
        while(scnr3.hasNextLine()){
            currentValue = scnr3.nextInt();
            //if currentValue>largest, then swap
            if(currentValue>largest){
                largest = currentValue;
            }
            // if currentValue<smallest, then swap
            if(currentValue<smallest){
                smallest = currentValue;
            }
        }
        System.out.println(largest+"\n"+smallest);
    }
}