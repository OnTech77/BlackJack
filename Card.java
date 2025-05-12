import java.util.ArrayList;	  	    	  	       		     	       	
import java.util.Collections;	  	    	  	       		     	       	
import java.util.Scanner;	  	    	  	       		     	       	
	  	    	  	       		     	       	
class Card	  	    	  	       		     	       	
{	  	    	  	       		     	       	
  private String suit;	  	    	  	       		     	       	
  private String value;	  	    	  	       		     	       	
  private int numberValue;	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public Card(String suit, String value, int numberValue)	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    this.suit = suit;	  	    	  	       		     	       	
    this.value = value;	  	    	  	       		     	       	
    this.numberValue = numberValue;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public String getValue()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    return value;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public int getNumberValue()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    return numberValue;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
	  	    	  	       		     	       	
  public String toString()	  	    	  	       		     	       	
  {	  	    	  	       		     	       	
    return value + " of " + suit;	  	    	  	       		     	       	
  }	  	    	  	       		     	       	
}