package ConnectFour;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
public static void main (String args[]){
    Players playerOne = new Players();
        Players playerTwo = new Players();
        playerOne.setPlayerOne();
        playerTwo.setPlayerTwo();
        String nameOne = playerOne.getOneName();
        String nameTwo = playerTwo.getTwoName();

        Scanner sc = new Scanner(System.in);

        boolean playerOneTurn = true;
        boolean winner = false;


    String board [][]= new String[6][7];
    for(int j = 0; j < 6; j++){
        System.out.println();
        for(int k = 0; k < 7; k++){
            board[j][k] = "- ";
            System.out.print(board[j][k]);
        }
    }
    ArrayList <Integer> row = new ArrayList <Integer> ();
    row.add(5);
	row.add(5);
	row.add(5);
	row.add(5);
	row.add(5);
	row.add(5);
    int r= 0;
    int c= 0;
    String character = "-";
    while(winner == false){
        if(playerOneTurn == true){
            character = "x";
            System.out.println('\n'+ nameOne+ ", choose a column (1-7)");
            c = sc.nextInt();
            c = c -1; 
            r = row.get(c);

            if(c < 0 || c > 7){
                System.out.println("This position is off the bounds of the board! Try again.");
            }
            else if(board[r][c] != "- "){
                System.out.println("Someone has already made a move at this position! Try again.");
            }
            else{
                board[r][c]= "x ";
                for(String[]b:board){
                    System.out.println();
                    for (String a: b){
                        System.out.print(a);
                    }
                }
                for(int j = 0; j<6; j++){
                    int l = 0;
                    int i = l;
                    while (l<4)
                    if (board [j][i].equals(board[j][i+1]) && board[j][i+1].equals(board[j][i+2]) && board[j][i+2].equals(board[j][i+3])&& !board [j][i].equals("- ")){
                        System.out.println('\n'+ nameOne+ ", you win!");
                        winner = true;
                        break;
                    }
                    else{
                        l++;
                    }
                }
                for (int j = 0; j<7; j++){
                    int l=0;
                    int i = l;
                    while(l<3){
                        if (board[i][j].equals(board[i+1][j])&& board[i+1][j].equals(board[i+2][j])&& board[i+2][j].equals(board[i+3][j])&&!board[i][j].equals("- ")){
                            System.out.println("\n"+ nameOne +", you win!");
                            winner = true;
                            break;
                        }
                        else {
                            l++;
                        }
                    }
                }

                //check diagonal (for upwards) this doesn't work help 

                for(int j = 3; j < board.length; j++){
                    for(int k = 0; k < board[0].length - 3; k++){
                        if(board[j][k].equals("x") && board[j-1][k+1].equals("x") && board[j-2][k+2].equals("x") && board[j-3][k+3].equals("x")){
                        System.out.println("\n"+ nameOne +", you win!");
                        winner = true;

                     }
                    }
                }

                 //check diagonal (for downwards) this doesn't work either for now im sorry :)


                for(int j = 3; j < board.length - 3; j++){
                    for(int k = 0; k < board[0].length - 3; k++){
                        if(board[j][k].equals("x") && board[j+1][k+1].equals("x") && board[j+2][k+2].equals("x") && board[j+3][k+3].equals("x")){
                        System.out.println("\n"+ nameOne +", you win!");
                        winner = true;

                     }
                    }
                }
                
                row.set(c, (row.get(c)-1));
                playerOneTurn = false;
                
            }
            
        }
        
        if(playerOneTurn == false){
            character = "O ";
            System.out.println('\n'+ nameTwo+ ", choose a column (1-7)");
            c = sc.nextInt();
            c = c -1; 
            r = row.get(c);

            if(c < 0 || c > 7){
                System.out.println("This position is off the bounds of the board! Try again.");
            }
            else if(board[r][c] != "- "){
                System.out.println("Someone has already made a move at this position! Try again.");
            }
            else{
                board[r][c]= "o ";
                for(String[]b:board){
                    System.out.println();
                    for (String a: b){
                        System.out.print(a);
                    }
                }
                row.set(c, (row.get(c)-1));
                for(int j = 0; j<6; j++){
                    int l = 0;
                    int i = l;
                    while (l<4)
                    if (board [j][i].equals(board[j][i+1].equals(board[j][i+2].equals(board[j][i+3])))){
                        System.out.println("You win!");
                    }
                    else{
                        l++;
                    }
                }
                playerOneTurn = true;
                

        }
    }

    }

}
}