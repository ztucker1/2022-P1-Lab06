// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.nio.channels.Pipe;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        for (int k=0; k<100; k++) {
            Random rand = new Random();
            int x1 = rand.nextInt(400) + 10;
            int y1 = rand.nextInt(275) + 10;
            int x2 = rand.nextInt(375) + 10;
            int y2 = rand.nextInt(275) + 10;
            g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
            g.drawLine(x1, y1, x2, y2);

        }



            // Draw Random Squares
        for (int k=0; k<100; k++){
            Random rand = new Random();
            int x1 = rand.nextInt(300) +410;
            int y1 = rand.nextInt(200)+10;
            g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
            g.fillRect(x1, y1, 50, 50);

        }




        // Draw Random Circles
        for (int k=0; k<100; k++){
            Random rand = new Random();
            int x1 = rand.nextInt(200) +10;
            int width = rand.nextInt(200);
            int y1 = rand.nextInt(100)+300;
            g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
            g.drawOval(x1, y1, width, width);

        }




        // Draw 3-D Box
        g.setColor(Color.yellow);
        g.fillRect(550, 400, 100, 100);

        g.setColor(Color.red);
        g.fillRect(600, 450, 100, 100);

        g.setColor(Color.blue);
        Polygon b = new Polygon();
        b.addPoint(650, 400);
        b.addPoint(650, 450);
        b.addPoint(700, 450);
        g.fillPolygon(b);

        g.setColor(Color.green);
        Polygon gr = new Polygon();
        gr.addPoint(550, 400);
        gr.addPoint(600, 450);
        gr.addPoint(600, 550);
        gr.addPoint(550, 500);
        g.fillPolygon(gr);

    }

}



    
 