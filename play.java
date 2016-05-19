
package polymorphism;


public class play 
{
   public static void main (String[] args)
   {
      random num[] = new random[2];
      num[0] = new playDice();
      num[1] = new playCard();
      
      for(int x=0;x<2;++x)
      {
         num[x].roll();
      }    
   }
}
// How do you know if your program is correct?  Does it function as you expected?
