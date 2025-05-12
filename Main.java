import java.util.ArrayList;	  	    	  	       		     	       	
import java.util.Collections;	  	    	  	       		     	       	
import java.util.Scanner;	  	    	  	       		     	       	
	  	    	  	       		     	       	
public class Main	  	    	  	       		     	       	
{	  	    	  	       		     	       	
  public static void main(String[] args)	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    Scanner input = new Scanner(System. in );	  	    	  	       		     	       	
    Deck deck = new Deck();	  	    	  	       		     	       	
    deck.shuffle();	  	    	  	       		     	       	
	  	    	  	       		     	       	
    Player player1 = new Player();	  	    	  	       		     	       	
    Player player2 = new Player();	  	    	  	       		     	       	
	  	    	  	       		     	       	
    player1.addCard(deck.drawCard());	  	    	  	       		     	       	
    player2.addCard(deck.drawCard());	  	    	  	       		     	       	
	  	    	  	       		     	       	
    boolean gameEnded = false;	  	    	  	       		     	       	
    boolean player1Turn = true;	  	    	  	       		     	       	
	  	    	  	       		     	       	
    while (!gameEnded)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      Player currentPlayer;	  	    	  	       		     	       	
      if (player1Turn)	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        currentPlayer = player1;	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
      else	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        currentPlayer = player2;	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
      if (player1Turn)	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        System.out.println("");	  	    	  	       		     	       	
        System.out.println("Player 1's turn");	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
      else	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        System.out.println("");	  	    	  	       		     	       	
        System.out.println("Player 2's turn");	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
	  	    	  	       		     	       	
      if (!currentPlayer.hasStuck())	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        currentPlayer.showHand();	  	    	  	       		     	       	
        System.out.print("Stick or Twist? (S/T): ");	  	    	  	       		     	       	
        String choice = input.nextLine();	  	    	  	       		     	       	
        if (choice.equalsIgnoreCase("T"))	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          Card drawnCard = deck.drawCard();	  	    	  	       		     	       	
          currentPlayer.addCard(drawnCard);	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        else if (choice.equalsIgnoreCase("S"))	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          currentPlayer.stick();	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
	  	    	  	       		     	       	
        if (player1Turn)	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          System.out.println("");	  	    	  	       		     	       	
          System.out.println("Player 1's Hand:");	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        else	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          System.out.println("");	  	    	  	       		     	       	
          System.out.println("Player 2's Hand:");	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        currentPlayer.showHand();	  	    	  	       		     	       	
	  	    	  	       		     	       	
        if (currentPlayer.getHandValue() > 21)	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          if (player1Turn)	  	    	  	       		     	       	
          {	  	    	  	       		     	       	
            System.out.println("Player 1 busts!");	  	    	  	       		     	       	
          }	  	    	  	       		     	       	
          else	  	    	  	       		     	       	
          {	  	    	  	       		     	       	
            System.out.println("Player 2 busts!");	  	    	  	       		     	       	
          }	  	    	  	       		     	       	
          gameEnded = true;	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
	  	    	  	       		     	       	
      if (player1.hasStuck() && player2.hasStuck())	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        gameEnded = true;	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
	  	    	  	       		     	       	
      player1Turn = !player1Turn;	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    System.out.println("");	  	    	  	       		     	       	
    System.out.println("Final Results:");	  	    	  	       		     	       	
    System.out.println("");	  	    	  	       		     	       	
    System.out.println("Player 1's hand:");	  	    	  	       		     	       	
    player1.showHand();	  	    	  	       		     	       	
    System.out.println("");	  	    	  	       		     	       	
    System.out.println("Player 2's hand:");	  	    	  	       		     	       	
    player2.showHand();	  	    	  	       		     	       	
    System.out.println("");	  	    	  	       		     	       	
	  	    	  	       		     	       	
    int player1Score = player1.getHandValue();	  	    	  	       		     	       	
    int player2Score = player2.getHandValue();	  	    	  	       		     	       	
	  	    	  	       		     	       	
    if (player1Score > 21)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println("Player 2 wins!, Player 1 Busts!");	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    else if (player2Score > 21)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println("Player 1 wins!, Player 2 Busts!");	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    else if (player1Score > player2Score)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println("Player 1 wins!");	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    else if (player2Score > player1Score)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println("Player 2 wins!");	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    else	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println("It's a tie!");	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
}