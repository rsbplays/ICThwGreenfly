import javax.swing.*;
import java.awt.*;

public class RGraph extends JPanel{
    float localXScale;
    float localYScale;

    @Override
    protected void paintComponent(Graphics g) {
        localXScale=getBounds().width/100;
        localYScale=getBounds().height/100;
    }
    private void drawline(Graphics graphics,float x1,float y1,float x2, float y2){
        graphics.drawLine((int) (x1*localXScale), (int) (y1*localYScale), (int) (x2*localXScale), (int) (y2*localYScale));
    }
}
