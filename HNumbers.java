import java.util.*;

/**
 * \brief   This is a Numbers class which contains methods and variable to
 *          observe how computer stores and handle different numbers.
 */
public class HNumbers{
  /**
   * \brief   A Constructor to handle initialisation of member variables.
   */
  public HNumbers(){

  }

  /**
   * \brief   Main function which executes when we run the application.
   */
  public static void main(String args[]) {
    int value = 10000;
    if(args.length > 0){
      value = Integer.parseInt(args[0]);
    }

    float sTotal = 0;
    double dTotal = 0;

    for(int i=1;i<=value;i++){
      float sPrec = 1/(float)i;
      double dPrec = 1/(double)i;
      sTotal += sPrec;
      dTotal += dPrec;
    }
    System.out.println("Ascending Order Ouput of Harmonic Series for n = " + value);
    System.out.println("Single Precision o/p " + sTotal);
    System.out.println("Double Precision o/p " + dTotal);

    float sTotalInv = 0;
    float dTotalInv = 0;

    for(int i=value;i>=1;i--){
      float sPrec = 1/(float)i;
      double dPrec = 1/(double)i;
      sTotalInv += sPrec;
      dTotalInv += dPrec;
    }
    System.out.println("Descending Order Ouput of Harmonic Series for n = " + value);
    System.out.println("Single Precision o/p " + sTotal);
    System.out.println("Double Precision o/p " + dTotal);
  }
}
