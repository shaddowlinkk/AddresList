import javax.swing.*;

public class run {
    public static void main(String[] args){
                JFrame frame = new JFrame("MTPROG");
        ListGUI init = new ListGUI();
        frame.setContentPane(init.main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);

    }

}
