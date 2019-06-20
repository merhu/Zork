import java.util.Scanner;
import java.util.Random;

public class Zork {
    public static void main(String[]args){
        int roomNum = 0;
        int roomsVisited = 0;
        boolean secret = false;
        boolean cont = true;
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        String direction;



        do{
            switch(roomNum) {
                case 0:
                    System.out.println("You're outside the haunted castle type 'Enter' to enter.");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("enter")) {
                        roomNum = 1;
                    }
                    break;

                case 1:
                    System.out.println("You've walked into the foyer. Watch out for the dead scorpion! Type  'North' to enter next room: ");
                    System.out.println("Type 'EXIT' to leave the haunted castle");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("north")) {
                        roomNum = 2;
                        roomsVisited++;
                    } else if (direction.toLowerCase().equals("exit")) {
                        roomNum = 9;
                        roomsVisited++;
                    } else {
                        System.out.println("You tripped on the scorpion.... try again.");
                    }
                    break;

                case 2:
                    System.out.println("You're now in the Front Room with just a dusty piano in the middle of the room. " +
                            "There's a room to your left and right. Type 'EAST' or 'WEST'. Otherwise to go back to the Foyer, enter 'SOUTH'. ");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("east")) {
                        roomNum = 4;
                        roomsVisited++;
                        System.out.println("Leaving Front Room... ");
                    } else if (direction.toLowerCase().equals("west")) {
                        roomNum = 3;
                        roomsVisited++;
                        System.out.println("Leaving Front Room... ");
                    } else if (direction.toLowerCase().equals("south")) {
                        roomNum = 1;
                        roomsVisited++;
                        System.out.println("Leaving Front Room... ");
                    } else {
                        System.out.println("You stubbed your toe on the piano... try again.");
                    }
                    break;

                case 3:
                    System.out.println("You're now in the spider infested library. " +
                            "Continue 'NORTH' to the next room or return 'EAST' to the Front Room.");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("east")) {
                        roomNum = 2;
                        roomsVisited++;
                        System.out.println("Leaving Library... ");
                    } else if (direction.toLowerCase().equals("north")) {
                        roomNum = 5;
                        roomsVisited++;
                        System.out.println("Leaving Library... ");
                    } else {
                        System.out.println("You got trapped in a giant spider web but you escaped.");
                    }
                    break;

                case 4:
                    System.out.println("You are now in the kitchen with vampire bats. " +
                            "Continue 'NORTH' to the next room or return 'WEST' to the Front Room.");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("west")) {
                        roomNum = 2;
                        roomsVisited++;
                        System.out.println("Leaving Kitchen... ");
                    } else if (direction.toLowerCase().equals("north")) {
                        roomNum = 7;
                        roomsVisited++;
                        System.out.println("Leaving Kitchen... ");
                    } else {
                        System.out.println("You passed out from blood loss.... Try again.");
                    }
                    break;

                case 5:
                    System.out.println("You've entered a dusty room filled with empty boxes. " +
                            "There's nothing here for you type 'SOUTH' to return to Library");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("south")) {
                        roomNum = 3;
                        roomsVisited++;
                        System.out.println("Leaving Dining Room... ");
                    } else {
                        System.out.println("You built a cool fort but its time to go.");
                    }
                    break;

                case 6:
                    System.out.println("You've entered Vault with 3 skeletons walking around.");
                    int r = rnd.nextInt(5);
        //If user has found the secret room already, it will still be permanently available
                    if (secret==true) {
                        System.out.println("Type 'ENTER' to go into the secret room or return 'EAST' to the parlor?");
                        direction = keyboard.next();
                        if (direction.toLowerCase().equals("east")) {
                            roomNum = 7;
                            roomsVisited++;
                            System.out.println("Exiting the Vault... ");
                        } else if (direction.toLowerCase().equals("enter")) {
                            roomNum = 8;
                            roomsVisited++;
                            System.out.println("Exiting the Vault... ");
                        } else {
                            System.out.println("You got caught up bonding with  the skeletons over medieval art.");
                        }
        //User successfully found secret room
                    } else if ( r==1) {
                        System.out.println("One of the skeletons stumbles into a statue revealing a secret room! 'ENTER' the secret room? Or return 'EAST' to the parlor?");
                        secret = true;
                        direction = keyboard.next();
                        if (direction.toLowerCase().equals("east")) {
                            roomNum = 7;
                            roomsVisited++;
                            System.out.println("Exiting the Vault... ");
                        } else if (direction.toLowerCase().equals("enter")) {
                            roomNum = 8;
                            roomsVisited++;
                            System.out.println("Exiting the Vault... ");
                        } else {
                            System.out.println("The skeletons chased you around the room. Try again...");
                        }
        //user did not find the secret room
                    } else {
                        System.out.println("Return 'EAST' to the parlor?");
                        direction = keyboard.next();
                        if (direction.toLowerCase().equals("east")) {
                            roomNum = 7;
                            roomsVisited++;
                            System.out.println("Exiting the Vault... ");
                        } else {
                            System.out.println("You wandered around the vault but its already been emptied out. Time to move on. ");
                        }
                    }
                    break;

                case 7:
                    System.out.println("You've entered the parlor and found a HUGE treasure chest!!!");
                    System.out.println("....");
                    System.out.println("But its empty...");
                    System.out.println("Do you want to go 'WEST' to the next room or back 'SOUTH' to the Kitchen?");
                    direction = keyboard.next();
                    if(direction.toLowerCase().equals("west")) {
                        roomNum = 6;
                        roomsVisited++;
                        System.out.println("Leaving the Parlor");
                    } else if (direction.toLowerCase().equals("south")) {
                        roomNum = 4;
                        roomsVisited++;
                        System.out.println("Leaving the Parlor");
                    } else {
                        System.out.println("You fainted in disbelief. Time to move on.");
                    }
                    break;

                case 8:
                    System.out.println("You crawl through a dark tunnel. You fall through the floor landing into giant piles of gold!!");
                    System.out.println("Once you've grabbed all the gold you can carry, type EXIT.");
                    direction = keyboard.next();
                    if (direction.toLowerCase().equals("exit")) {
                        roomNum = 6;
                        roomsVisited++;
                        System.out.println("Leaving with all your gold...");
                    } else {
                        System.out.println("You're swimming in gold but you can't carry anymore. You need more bags.");
                    }
                    break;

                case 9:
                    System.out.println("You've made it out of the haunted castle!");
                    int g = rnd.nextInt(5);
                    if (g == 1) {
                        System.out.println("As you drive away and look back at the castle, the ghost of the castle's court jester is smiling at you in the rearview mirror.");

                    } else {
                        System.out.println("As you drive away and look back at the castle, a bunch of scorpions crawl out of your bag onto your neck....");
                    }

                    System.out.println("GAME OVER");
                    System.out.println("Rooms visited: " + roomsVisited);
                    cont = false;
                    break;


            }
        } while (cont);
    }
}
