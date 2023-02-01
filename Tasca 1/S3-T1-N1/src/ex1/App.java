package ex1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int option;
        Undo undo = Undo.getInstance();
        
        System.out.println("Welcome to our dungeon game! (Type the number for each option!)");
        do {
            System.out.println("What will you do: \n1.- Move \n2.- Search \n3.- Fight \n4.- Eat \n5.- Undo \n0.- exit");
            option = input.nextInt();
            switch(option) {
            case 1:
            	System.out.println("You have moved\n");
            	undo.addToStack(option);
            	break;
            case 2:
            	System.out.println("You found a treasure!\n");
            	undo.addToStack(option);
            	break;
            case 3:
            	System.out.println("You have killed a monster!\n");
            	undo.addToStack(option);
            	break;
            case 4:
            	System.out.println("You ate!\n");
            	undo.addToStack(option);
            	break;
            case 5:
            	System.out.println("Last play was canceled");
            	undo.deleteFromStack();
            }
        } while (option != 0);
        
        input.close();
        
        System.out.println("These are the moves you made");
        undo.showStack();
        
    }
}

 
