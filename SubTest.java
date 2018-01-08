import java.awt.*;
/**
 * Write a description of class SubTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubTest extends Dragon
{
    // instance variables - replace the example below with your own
    private int si;
    private int con;
    private int x;
    private int y;
    private int heal;
    /**
     * Constructor for objects of class SubTest
     */
    public SubTest(Graphics g, int x1, int y1, int s, String name, double health, String say)
    {
        // initialise instance variables
        super(g, x1,  y1,  s,  name,  health, say);
        si = s;
        con = si * 10;
        this.x = x1;
        this.y = y1;
        heal = (int)((health / 100) * ((double)(con * 5)));
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void MyAge(int s){
        if(s <= 12){
            System.out.println("im an kid");
        }
        else if(s <= 19){
            System.out.println("im a teenager");
        }
        else if(s <= 30){
            System.out.println("im a young adult");
        }
        else if(s > 30){
            System.out.println("im an adult");
        }
        else if(s <= 60){
            System.out.println("im an old chap");
        }
        else{
            System.out.println("something has gone wrong");
        }
    }

    @Override
    public void health(Graphics g)
    {
        // put your code here
        super.health(g, con, x, y, si, heal); 
        MyAge(si);
    }
}
