/*
   Jason Lau
   CS110
   Card Class
*/


import javax.swing.*;

public class Card 
{     
      // suits set to constants
    public final static int SPADES = 0,HEARTS = 1,DIAMONDS = 2,CLUBS = 3;
    
      // face card ranks set to constants
    public final static int ACE = 1,JACK = 11,QUEEN = 12,KING = 13;
    
    //instance variables
    private int rank, suit;
    private String image;
    
   /**
   *constructer accepts two ints to determine the card rank and suit
   *@param suit the suit value of this card.
   *@param rank the rank rank of this card.
   *@param image the image of this card
   */
    public Card(int rank, int suit, String image) 
    {
        this.rank = rank;
        this.suit = suit;
        this.image = image
    }
    
   /**
   * copy constructer - makes another copy of the card made
   * @param otherCar the card to be copied
   */
    public Card(Card otherCard) 
    {
         this.rank = otherCard.rank;
         this.suit = otherCard.suit;
         this.image = otherCard.image;
    }
    
   /**
   * getSuit method returns the suit of the card
   * @return a Suit constant representing the suit value of the card.
   */
  
    public int getSuit() 
    {
      return suit;
    }
   /**
   * getRank method returns the rank of the card
   * @return a Rank constant representing the rank value of the card.
   */

    public int getRank() 
    {
            
        return rank;
    }
    
    /**
    * getImage method returns the image of the card
    *@return a image as a string
    */
    
    public String getImage()
    {
      return image;
    }
    
   /**
   * Returns a description of the suit of this card.
   * @return the suit value of the card as a string.
   */
    public String getSuitAsString() 
    {
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "Invalid";
        }
    }
   /**
   * Returns a description of the rank of this card.
   * @return the rank value of the card as a string.
   */
   public String getRankAsString() 
   {
        switch ( rank ) {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "??";
        }
    }
   /**
   * Returns a description of this card.
   * @return the name of the card.
   */

    public String toString() 
    {
        return getRankAsString() + " of " + getSuitAsString();
    }
    
   /**
   * Compares two cards to determine if they have the same value.
   * @param card the other card
   * @return true if the two cards have the same rank and suitvalues,
   * falseotherwise.
   */
   public boolean equals(Card otherCard ) 
   {
      if ( ( rank != otherCard.rank ) || ( suit != otherCard.suit ) )
         return false;
      else
         return true;
   }

}
 
