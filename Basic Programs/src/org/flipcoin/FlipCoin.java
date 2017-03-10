package org.flipcoin;

import java.util.Scanner;

public class FlipCoin {
  public FlipCoin() {}
  
  public static double countPerc(double get, double total) { return get / total * 100.0D; }
  

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int cnt = 0;
    double headP = 0.0D;double tailP = 0.0D;
    System.out.println("Enter the count number to flip the coin");
    
    if (scn.hasNextInt()) {
      cnt = scn.nextInt();
      if (cnt < 0) {
        System.err.println("Enter only +ve integer numbers");
      }
      else {
        for (int i = 0; i < cnt; i++)
        {

          if (Math.random() < 0.5D) {
            tailP += 1.0D;
          } else {
            headP += 1.0D;
          }
        }
      }
      
      System.out.println("Percentage of Head :" + countPerc(headP, cnt) + "%");
      System.out.println("Percentage of Tail :" + countPerc(tailP, cnt) + "%");
    } else {
      System.err.println("Enter only +ve integer numbers");
    }
    
    scn.close();
  }
}