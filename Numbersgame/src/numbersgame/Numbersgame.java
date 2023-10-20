
package numbersgame;

import java.util.Scanner;
import java.util.Random;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt( 100);
        System.out.println("Guess the Number From 1 to 100");
    }
    public int computerNo(){return computer;
    }
}
public class Numbersgame {
    static int takeUserInput(){
        int user;
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }
    
    static void isCorrectNumber(int i,int j){
        if(i==j){
            System.out.println("Correct No.Guess");
        }
        else if(i>j){
            System.out.println("Your No. is Big than Computer No.");
        }
        else {
            System.out.println("Your No. is Small than Computer No.");
        }
    }

   
    public static void main(String[] args) {
        
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do{
            user = takeUserInput();
            computer = g.computerNo();
            //System.out.println(user);
            //System.out.println(computer);
            isCorrectNumber(user,computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU GUESS NO IN "+ itteration+"IITERATIONS");
    }
    
}
