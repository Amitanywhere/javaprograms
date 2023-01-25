import java.util.*;

public class GuessingNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int totalCount = 0;
        int randomNumber = 1 + random.nextInt(100);
        System.out.println("Enter guessing number ranges 1-100 ------");
        int userInput = takeInput();
        totalCount++;
        if(randomNumber == userInput){
            System.out.println("You guessed the number in -" + totalCount + "chance");
        }
        while(randomNumber != userInput){
            if(randomNumber == userInput){
                break;
            }
            String msg = randomNumber > userInput ? "Enter number greater than " + userInput : "Enter number less than " + userInput;
            System.out.println(msg);
            userInput = takeInput();
            totalCount++;
        }
        System.out.println("You guessed the number in -" + totalCount + " chance");
    }

    public static int takeInput(){
        int userInput=0;
        try {
            Scanner input = new Scanner(System.in);
            userInput = input.nextInt();
        }
        catch (InputMismatchException ip){
            System.out.println(ip.getCause());
        }
        return userInput;
    }

}
