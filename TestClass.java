import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(1000,1000);
       
       //hi
       Graphics g = panel.getGraphics();
       Scanner scnr = new Scanner(System.in); 
       
       System.out.println("x?");
       int x = scnr.nextInt();
       System.out.println("y?");
       int y = scnr.nextInt();
       System.out.println("size?");
       int size = scnr.nextInt();
       System.out.println("Please enter in all caps");
       Color color = Color.RED;
       
       Dragon jen = new Dragon(g ,x, y, size, color);
       
       jen.drawDragon(g);
     
       System.out.println(jen);
    }
}
