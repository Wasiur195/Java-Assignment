import java.util.*;

public class CountNotes {
    public static void main(String[] args) {
        int[] notes = {1000,500,200,100,50,20,10,5,2,1}; // array of notes
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt(); // read input amount
        System.out.println("Notes needed to make up " + amount + ":");
        for (int note : notes) {
            if (amount >= note) { // check if current note can be used
                int count = amount / note; // calculate number of notes needed
                System.out.println(note + " x " + count);
                amount %= note; // update the amount
            }
        }
    }
}
