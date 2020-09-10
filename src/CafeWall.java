/**
 * Created by YOUR_NAME on DATE
 * You shouldn't use any if-else statements
 * Put comments in your code
 * Follow freedom of information and gilligans island rule specified in the Syllabus
 * Discussed with: XXX
 **/

import java.awt.*;
import java.io.IOException;

public class CafeWall {

    private static final Integer MORTAR = 2; //Your code should work for both cases when MORTAR is 1 or 2

    public static void main(String[] args) throws IOException {
        DrawingPanel panel = new DrawingPanel(650, 420); //Change the pixel dimensions according to spec
        //Write your code here



        panel.save("output" + MORTAR + ".png"); //Do not remove (this code must be the last statement in main)
    }
}
