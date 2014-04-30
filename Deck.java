import java.util.ArrayList;
import java.util.Collections; //using collections for shuffle function

/*
   Jason Lau
   CS 110 
   Deck Class
*/

public class Deck
{
   
   public ArrayList<Card> deck;
   
   public static final int CARDS_IN_PILE = 26;   // two players do each pile has 26 cards (half the deck)


   public Deck()
   {
      deck = new ArrayList<Card>();  //creats a deck of 52 cards
      for(int r = 1; r < 5; r++)
      {
         for(int s = 2; s < 15; s++)
         {
            deck.add(new Card(r, s));
         }
      }
      Collections.shuffle(deck);    //shuffle command, shuffles the numbers in the array
   }

   public ArrayList<Card> getDeck()
   {
      return this.deck;
   }

   public ArrayList pile1()
   {
      ArrayList pile1 = new ArrayList(deck.subList(0,25));
      return pile1;
   }

   public ArrayList pile2()
   {
      ArrayList pile2 = new ArrayList(deck.subList(26,51));
      return pile2;
   }
   
}
