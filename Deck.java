import java.util.ArrayList;	  	    	  	       		     	       	
import java.util.Collections;	  	    	  	       		     	       	
import java.util.Scanner;	  	    	  	       		     	       	
	  	    	  	       		     	       	
public class Deck	  	    	  	       		     	       	
{	  	    	  	       		     	       	
  private ArrayList<Card> cards;	  	    	  	       		     	       	
  private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};	  	    	  	       		     	       	
  private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public Deck()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    cards = new ArrayList();	  	    	  	       		     	       	
    for (String suit: suits)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      for (int i = 0; i < values.length; i++)	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        int numberValue;	  	    	  	       		     	       	
        if (i < 9)	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          numberValue = i + 2;	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        else if (i < 12)	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          numberValue = 10;	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        else	  	    	  	       		     	       	
        {	  	    	  	       		     	       	
          numberValue = 11;	  	    	  	       		     	       	
        }	  	    	  	       		     	       	
        cards.add(new Card(suit, values[i], numberValue));	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public void shuffle()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    Collections.shuffle(cards);	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public Card drawCard()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    if (cards.size() == 0)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      shuffle();	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    return cards.remove(0);	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
}