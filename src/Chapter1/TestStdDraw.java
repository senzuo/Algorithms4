package Chapter1;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * Created by Administrator on 2017/8/27.
 */
public class TestStdDraw {
    public static void main(String[] args) {
        keyBoardMouse();
    }

    public static void keyBoardMouse() {
            StdDraw.isMousePressed();
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            System.out.println("x is " + x);
            System.out.println("y is " + y);
    }

    public static void animations() {
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        for (double t = 0.0; true; t += 0.02) {
            double x = 2 * Math.sin(t);
            double y = Math.cos(t);
            StdDraw.clear();
            StdDraw.filledCircle(x, y, 0.05);
            StdDraw.filledCircle(-x, -y, 0.05);
            StdDraw.show();
            StdDraw.pause(2);
        }
    }
    public static void basic(){
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);

        StdDraw.filledCircle(0.2,0.2,0.2);

//        StdDraw.line(0,1,1,0);
//        StdDraw.line(0,0,1,1);
        StdDraw.ellipse(0.8,0.8,0.2,0.1);

        StdDraw.square(0.8,0.2,0.2);
        StdDraw.rectangle(0.2,0.8,0.2,0.1);

        double[] x = { 0.1, 0.2, 0.3, 0.2 };
        double[] y = { 0.2, 0.3, 0.2, 0.1 };
        StdDraw.filledPolygon(x, y);

        StdDraw.text(0.5,0.8,"center above",45);
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.5, "Hello, World");

        StdDraw.picture(0,0,"test.gif");
    }
}
