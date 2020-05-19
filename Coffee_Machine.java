package machine;
import java.util.*;
public class CoffeeMachine {

    public static void main(String[] args) {
        
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
         
         boolean z = true;
        while(z) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String s1 = scanner.nextLine();
        System.out.println("");
        switch(s1) {
            case "buy" :
               System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
               String s2 = scanner.next();  
            switch(s2) {
                case "1":
                       water -=250;
                       milk -= 0;
                       coffee -= 16;
                       cups--;
                       money += 4;
                       if (water >= 0 && milk >= 0 && coffee >= 0 && cups >= 0 ) {
                           System.out.println("I have enough resources, making you a coffee!");
                       } else {
                           System.out.println("Sorry, not enough water!");
                            water +=250;
                           coffee += 16;
                           cups++;
                           money -= 4;
                       }
                       System.out.println("");
                       continue;
                       
                case "2":
                    water -= 350;
                    milk -= 75;
                    coffee -= 20;
                    cups--;
                    money += 7;
                    if (water >= 0 && milk >= 0 && coffee >= 0 && cups >= 0 ) {
                           System.out.println("I have enough resources, making you a coffee!");
                       } else {
                           System.out.println("Sorry, not enough water!");
                            water +=350;
                            milk += 75;
                           coffee += 20;
                           cups++;
                           money -= 7;
                       }
                       System.out.println("");
                       continue;
                       
                case "3":
                    water -= 200;
                    milk -= 100;
                    coffee -= 12;
                    cups--;
                    money += 6;
                    if (water >= 0 && milk >= 0 && coffee >= 0 && cups >= 0 ) {
                           System.out.println("I have enough resources, making you a coffee!");
                           
                       } else {
                           System.out.println("Sorry, not enough water!");
                            water +=200;
                            milk += 100;
                            coffee += 12;
                            cups++;
                            money -= 6;
                       }
                       System.out.println("");
                       continue;
                       
                case "back" :
                    continue;
                            
            }
            case "fill" : 
                 System.out.println("Write how many ml of water do you want to add: ");
                water += scanner.nextInt();
            
                System.out.println("Write how many ml of milk do you want to add: ");
                milk += scanner.nextInt();
            
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                coffee += scanner.nextInt();
            
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                cups += scanner.nextInt();
                System.out.println("");
continue;
                
            case "take" :
               System.out.println("I gave you $" + money);
               money = 0;
               System.out.println("");
               continue;
            
    
            case "remaining" : 
               
               System.out.println("The coffee machine has: ");
               System.out.println(water + " of water");
               System.out.println(milk + " of milk");
               System.out.println(coffee + " of coffee beans");
               System.out.println(cups + " of disposable cups");
               System.out.println("$" + money + " of money");
               System.out.println("");
                continue;
                 
            case "exit" :
               z=false;
              break;  
        }
    }
  }
}
