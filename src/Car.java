import java.awt.*;

public class Car {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle hitbox;      //a boolean to denote if the hero is alive or dead.
    //a boolean to denote if the hero is alive or dead.


    // METHOD DEFINITION SECTION

    // Constructor Definition
    // A constructor builds the object when called and sets variable values.


    public Car(int pXpos, int pYpos) {
        xpos = pXpos;
        ypos = pYpos;
        dx = 5;
        dy = 5;
        width = 75;
        height = 75;
        isAlive = true;
        hitbox = new Rectangle(xpos, ypos, width, height);


    }// constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {

        if (isAlive) {

            if (xpos < 0) { // bounce off left wall
                dx = -dx;
            }
            if (ypos < 0) {
                dy = -dy;
            }

            if (xpos > 900 - width) {
                dx = -dx;
            }
            if (ypos > 600 - height) {
                dy = -dy;
            }

            xpos = xpos + dx;
            ypos = ypos + dy;

            hitbox = new Rectangle(xpos, ypos, width, height);

        } else {

            hitbox = new Rectangle(0, 0, 0, 0);

        }
    }

}
