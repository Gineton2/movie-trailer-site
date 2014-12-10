// This is a slightly modified version CreditCard class from an early assignment
//
// Modify the class so that it implements the Comparable interface. Remember that the
// Comparable interface has one method, compareTo, which "returns a negative integer, zero,
// or a positive integer as this object is less than, equal to, or greater than the
// specified object."
// Creditcards are compared by their balance. If this CreditCard has a bigger balance than
// CreditCard other, then return a positive number
//
// TODO: add the code to make this class implement Comparable interface

/**
   A credit card has a balance that can be changed by
   purchases and payments.
*/
public class CreditCard implements Comparable<CreditCard>
{
   private double balance;

   /**
      Constructs a credit card with a zero balance.
   */
   public CreditCard(double transfer)
   {
      balance = transfer;
   }


   /**
      Makes a payment to  credit card.
      @param amount the amount to pay
   */
   public void payment(double amount)
   {
      balance = balance - amount;
   }

   /**
      Makes a purchase with the credit card
      @param amount the amount of the purchase
   */
   public void purchase(double amount)
   {
      balance = balance + amount;
   }

   /**
      Gets the current balance of the credit card.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
   // Creditcards are compared by their balance. If this CreditCard has a bigger balance than
   // CreditCard other, then return a positive number
   public int compareTo(CreditCard card)
   {
       if (balance > card.getBalance())
       {
           return 1;
       }
       else if (balance < card.getBalance())
       {
           return -1;
        }
        else
        {
            return 0;
        }
    }
}
