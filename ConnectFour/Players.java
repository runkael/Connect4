package ConnectFour;
import java.util.Scanner;


public class Players {
    String playerOneName;
    String playerTwoName;

    Scanner sc = new Scanner(System.in);
    public Players(){
        playerOneName = "";
        playerTwoName = "";     
    }

    public void setPlayerOne(){
        System.out.println("What is player one's name?");
        playerOneName = sc.nextLine();
        
        System.out.println("Hello " + playerOneName + ". You are player one. Your chips will be Xs.");
  }

  public void setPlayerTwo(){
     System.out.println("What is player two's name?");
        playerTwoName = sc.nextLine();
     System.out.println("Hello " + playerTwoName + ". You are player two. Your chips will be Os.");

  }

public String getOneName(){
   return playerOneName;
}

public String getTwoName(){
   return playerTwoName;
}
    
}
