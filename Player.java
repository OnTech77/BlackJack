import java.util.ArrayList;	  	    	  	       		     	       	
import java.util.Collections;	  	    	  	       		     	       	
import java.util.Scanner;	  	    	  	       		     	       	
	  	    	  	       		     	       	
class Player	  	    	  	       		     	       	
{	  	    	  	       		     	       	
  private ArrayList<Card > hand;	  	    	  	       		     	       	
  private boolean hasStuck;	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public Player()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    hand = new ArrayList();	  	    	  	       		     	       	
    hasStuck = false;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public void addCard(Card card)	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    hand.add(card);	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public int getHandValue()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    int totalValue = 0;	  	    	  	       		     	       	
    int aceCount = 0;	  	    	  	       		     	       	
	  	    	  	       		     	       	
    for (Card card: hand)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      totalValue += card.getNumberValue();	  	    	  	       		     	       	
      if (card.getValue().equals("Ace"))	  	    	  	       		     	       	
      {	  	    	  	       		     	       	
        aceCount++;	  	    	  	       		     	       	
      }	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
	  	    	  	       		     	       	
    while (totalValue > 21 && aceCount > 0)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      totalValue -= 10;	  	    	  	       		     	       	
      aceCount--;	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
	  	    	  	       		     	       	
    return totalValue;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public boolean hasStuck()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    return hasStuck;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public void stick()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    hasStuck = true;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public void showHand()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    for (Card card: hand)	  	    	  	       		     	       	
    {	  	    	  	       		     	       	
      System.out.println(card);	  	    	  	       		     	       	
    }	  	    	  	       		     	       	
    System.out.println("Total value: " + getHandValue());	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
}