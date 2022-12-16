import java.awt.*;
import javax.swing.*;

public class Greenfly {
    static JLabel Juviniles;
    static JLabel Adults;
    static JLabel Seniors;

    static Simulation simulation;

    private static void createAndShowResultsGUI() {
        JFrame jFrame = new JFrame("Hello World Swing Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(1,2));

        jFrame.setVisible(true);

        JPanel dataPanel = new JPanel();
        jFrame.add(dataPanel);
        dataPanel.setLayout(new GridLayout(3,0));

        Juviniles = new JLabel("Juviniles");
        Juviniles.setFont(new Font("Courier", Font.BOLD,30));

        Adults = new JLabel("Adults");
        Adults.setFont(new Font("Courier", Font.BOLD,30));

        Seniors = new JLabel("Seniors");
        Seniors.setFont(new Font("Courier", Font.BOLD,30));

        dataPanel.add(Juviniles);
        dataPanel.add(Adults);
        dataPanel.add(Seniors);

        Seniors.setText("Seniors: "+simulation.getOld());
        Adults.setText("Adults: "+simulation.getAdult());
        Juviniles.setText("Juviniles: "+simulation.getYoung());

        RGraph rGraph= new RGraph();
        jFrame.add(rGraph);


    }
    private void createAndShowConfigureGui(){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridLayout(2,2));
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        simulation= new Simulation(12,new SimulationProperties());
        createAndShowResultsGUI();
    }


}
