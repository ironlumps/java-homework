import java.util.Scanner;

public class SixTen
{
  public static void main(String[] args)
  {
    boolean win = false;
    int turn = 0;
    char[][] board = { {'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'} };
    Scanner keyboard = new Scanner(System.in);

    //this loop is the game
    while(!win)
    {
      //there can only be a max of ten moves
      if (turn == 10)
      {
        System.out.println("Tie");
        win = true;
        break;
      }
      //even turn indicates player1
      else if(turn % 2 == 0)
      {
          System.out.println("Player 1");

          for (int i = 0; i < 3; i++)
          {
            for (int k = 0; k < 3; k++)
            {
              System.out.print(board[i][k]);
            }
            System.out.println();
          }

          // switches the move based on possible
          System.out.print("Please enter your move: ");
          int move = Integer.parseInt(keyboard.nextLine());
          switch (move)
          {
            case 1:
              board[0][0] = 'X';
              break;
            case 2:
              board[0][1] = 'X';
              break;
            case 3:
              board[0][2] = 'X';
              break;
            case 4:
              board[1][0] = 'X';
              break;
            case 5:
              board[1][1] = 'X';
              break;
            case 6:
              board[1][2] = 'X';
              break;
            case 7:
              board[2][0] = 'X';
              break;
            case 8:
              board[2][1] = 'X';
              break;
            case 9:
              board[2][2] = 'X';
              break;
            }

            //win checking
            for (int i = 0; i < 3; i++)
            {
              if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
              {
                System.out.println("Player 1 wins!");
                win = true;
                break;
              }
              else if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
              {
                System.out.println("Player 1 wins!");
                win = true;
                break;
              }
              else if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1]  == board[2][0]))
              {
                System.out.println("Player 1 wins!");
                win = true;
                break;
              }
              else
              {
                win = false;
                turn +=1;
              }
            }
          }
      else if (turn % 2 == 1)
      {
        System.out.println("Player 2");

        for (int i = 0; i < 3; i++)
        {
          for (int k = 0; k < 3; k++)
          {
            System.out.print(board[i][k]);
          }
          System.out.println();
        }

        System.out.print("Please enter your move: ");
        int move = Integer.parseInt(keyboard.nextLine());
        switch (move)
        {
          case 1:
            board[0][0] = 'O';
            break;
          case 2:
            board[0][1] = 'O';
            break;
          case 3:
            board[0][2] = 'O';
            break;
          case 4:
            board[1][0] = 'O';
            break;
          case 5:
            board[1][1] = 'O';
            break;
          case 6:
            board[1][2] = 'O';
            break;
          case 7:
            board[2][0] = 'O';
            break;
          case 8:
            board[2][1] = 'O';
            break;
          case 9:
            board[2][2] = 'O';
            break;
          }

          for (int i = 0; i < 3; i++)
          {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
              System.out.println("Player 2 wins!");
              win = true;
              break;
            }
            else if (board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
              System.out.println("Player 2 wins!");
              win = true;
              break;
            }
            else if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || board[0][2] == board[1][1] && board[1][1] == board[2][0])
            {
              System.out.println("Player 2 wins!");
              win = true;
              break;
            }
            else
            {
              win = false;
              turn +=1;
            }
          }
        }
      }
      //print board when game ends
      for (int i = 0; i < 3; i++)
      {
        for (int k = 0; k < 3; k++)
        {
          System.out.print(board[i][k]);
        }
        System.out.println();
      }
    }
  }
