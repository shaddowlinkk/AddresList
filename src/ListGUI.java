import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGUI {
    private JTextArea output;
    public JPanel main;
    private JTextField dob;
    private JTextField address;
    private JTextField email;
    private JTextField telephone;
    private JTextField name;
    private String _name;
    private JButton isEmptyButton;
    private JButton addToFrontButton;
    private JButton addToBackButton;
    private JButton toStringButton;
    private JButton reverseToStringButton;
    private JButton nameByPhoneNumberButton;
    private JButton emailByNameButton;
    private JButton phoneNumberByNameButton;
    private JButton sizeOfButton;
    private JButton dobByNameButton;
    private JButton reverseButton;
    private AddressList list= new AddressList();

    public ListGUI() {
        isEmptyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(""+list.isEmpty());
            }
        });
        addToFrontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.addToFrount(name.getText(),telephone.getText(),email.getText(),address.getText(),dob.getText());
                name.setText("");
                telephone.setText("");
                email.setText("");
                address.setText("");
                dob.setText("");

            }
        });
        addToBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.addToBack(name.getText(),telephone.getText(),email.getText(),address.getText(),dob.getText());
                name.setText("");
                telephone.setText("");
                email.setText("");
                address.setText("");
                dob.setText("");
            }
        });
        toStringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(list.toString());
                output.setText(list.toString());
            }
        });
        reverseToStringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(list.reversToString());
            }
        });
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.revers();

            }
        });
        sizeOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(""+list.sizeOf());
            }
        });
        phoneNumberByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        emailByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(list.emailByName(name.getText()));
                System.out.println(list.toString());
                name.setText("");
            }
        });
        nameByPhoneNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(list.nameByPhoneNumber(telephone.getText()));
                telephone.setText("");

            }
        });
        dobByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText(list.dobByName(name.getText()));
                name.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
