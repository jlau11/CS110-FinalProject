/*
   Jason Lau
   CS110
   War - code for the card game
*/



public class War
{
   private Deck deck;
   private Deck [] p1pile;
   private Deck [] p2pile;
   private int deckSize1 = 26, deckSize2 = 26;
   
   public War();    //creats new deck and assigns piles to players
   {
      deck = new Deck();
      p1pile = pile1;
      p2pile = pile2;
   }
   
   public Deck getp1Pile()     // getters for player piles
   {
      return p1pile;
   }
   
   public Deck getp2Pile()
   {
      return p2pile;
   }
   
   public int getDeckSize1()   // getters for deck size inorder to keep track of index number in an array for each player
   {
      return deckSize1;
   }
   
   public int getDeckSize2()
   {
      return deckSize2;
   }
   
   public Card getFlipCard1()   // Flips the top card in player 1's pile
   {
      if(p1pile.isEmpty())
         return null;
      else
         return p1pile.getCard(deckSize1() - 1);
   }
   
   public Card getFlipCard2()   //Flips the top card in player 2's pile
   {
      if(p2pile.isEmpty())
         return null;
      else
         return p2pile.getCard(deckSize2() - 1);
   }
   
   public void addtoWinner(ArrayList p1, ArrayList p2)    //Adds the cards to who ever played the higher card
   {
      if (p1pile.getCard(deckSize1() - 1) >  p2pile.getCard(deckSize2() - 1))
      {
         p1pile.addCard(0,p1pile.getCard(deckSize1() - 1));
         p1pile.addCard(0,p2pile.getCard(deckSize2() - 1));
      }
      else
      {
         p2pile.addCard(0,p1pile.getCard(deckSize1() - 1));
         p2pile.addCard(0,p2pile.getCard(deckSize2() - 1));
      }
   }
   
   public string winner()   //states winner when one player is out of cards
   {
      if (p1pile = 0)
      {
         System.out.println("Player 1 out of cards, Player 2 wins!")
      }
      if (p2pile = 0)
      {
         System.out.println("Player 2 out of cards, Player 1 wins!")      
      }
   }
   
}
