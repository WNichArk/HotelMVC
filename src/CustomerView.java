import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerView extends JFrame {
    private Controller controller;

    CustomerView(Controller c, String roomName){
        //layout
        super("Customer Info");
        this.controller = c;
        setLayout(null);
        this.setSize(new Dimension(360,400));
        this.setResizable(false);
        //buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 280, 90,30);
        this.setResizable(false);
        //labels
        JLabel firstNameLabel = new JLabel("First Name");
        setBackground(Color.YELLOW);
        firstNameLabel.setBounds(50,30,80,20);
        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(50, 60,80,20);
        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(50, 90,80,20);
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 120,80,20);
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(50, 150,80,20);
        JLabel stateLabel = new JLabel("State");
        stateLabel.setBounds(50, 180,80,20);
        JLabel zipLabel = new JLabel("Zip Code");
        zipLabel.setBounds(50, 210,80,20);
        JLabel nightsLabel = new JLabel("No of Nights");
        nightsLabel.setBounds(50, 240,80,20);
        //textfields
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(135, 32,150,20);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(135, 62,150,20);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(135, 92,150,20);
        JTextField addressField = new JTextField();
        addressField.setBounds(135, 122,150,20);
        JTextField cityField = new JTextField();
        cityField.setBounds(135, 152,150,20);
        JTextField stateField = new JTextField();
        stateField.setBounds(135, 182,150,20);
        JTextField zipField = new JTextField();
        zipField.setBounds(135, 212,150,20);
        JTextField nightsField = new JTextField();
        nightsField.setBounds(135, 242,150,20);
        //addlabels
        add(firstNameLabel);
        add(lastNameLabel);
        add(phoneLabel);
        add(addressLabel);
        add(cityLabel);
        add(stateLabel);
        add(zipLabel);
        add(nightsLabel);
        //addtextfields
        add(firstNameField);
        add(lastNameField);
        add(phoneField);
        add(addressField);
        add(cityField);
        add(stateField);
        add(zipField);
        add(nightsField);
        add(submit);
        //button action
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    String f = firstNameField.getText();
                    String l = lastNameField.getText();
                    String p = phoneField.getText();
                    String a = addressField.getText();
                    String c = cityField.getText();
                    String s = stateField.getText();
                    String z = zipField.getText();
                    String q = nightsField.getText();
                    int n = 0;
                    try {
                        n = Integer.parseInt(q);
                    }catch (NumberFormatException nfe){
                        n = 404;
                    }

                    controller.setCustomer(f,l,p,a,c,s,z,n,roomName);
                    setVisible(false);

            }
        });
    }

}
