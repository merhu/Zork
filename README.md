Zork is a famous text-only adventure game for the computer. Users would type commands and navigate the rooms of a castle.

Write an application that asks the user what direction they wish to travel in. Once they tell you the direction, move them to the next room and tell them what is in it and what direction the other exits are.

When you develop your program you must include each room in its own method. (Reminder: Creating Methods).  The only role of the main method is to get input from the user and direct the user to the appropriate room.

Your program shall allow the user to move from one room back and forth to any other connected room.

You program should allow the user to find the secret room only 25% of the time. However, once they find the secret room they can always find it.

When the user exits the house or quits there is a 25% chance they will be followed by a ghost. Let them know when they are being followed.

Also let the user know how many rooms they visited after they exit or quit.

room	contains	doors to (direction & room #)
#1	foyer	dead scorpion	room n2
#2	front room	piano	rooms s1,w3, e4
#3	library	spiders	rooms e2 & n5
#4	kitchen	bats	rooms w2 & n7
#5	
dining room

dust

empty box

room s3
#6	vault	3 walking skeletons	
room e7

room e8 (only 25% chance of finding)

#7	parlor	treasure chest	rooms w6, s4
#8	secret room	piles of gold	room w6
