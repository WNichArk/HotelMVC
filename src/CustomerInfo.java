import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CustomerInfo  extends JFrame {
    private Controller controller;

    public CustomerInfo(Customer c, String roomChoice, Controller controller){
        //layout
        super("Customer Info");
        setLayout(null);
        this.setResizable(false);
        Border pad = BorderFactory.createEmptyBorder(10,10,10,10);
        this.setSize(new Dimension(360,400));
        //buttons
        JButton submit = new JButton("Checkout");
        submit.setBounds(150, 310, 90,30);
        //labels
        JLabel firstNameLabel = new JLabel("First Name");
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
        JLabel balanceLabel = new JLabel("Balance");
        balanceLabel.setBounds(50, 270,80,20);
        //feedback labels
        JLabel custFirstName = new JLabel(c.getFirstName());
        custFirstName.setBounds(135, 35,150,20);
        JLabel custLastName = new JLabel(c.getLastName());
        custLastName.setBounds(135, 65,150,20);
        JLabel custPhone = new JLabel(c.getPhone());
        custPhone.setBounds(135, 95,150,20);
        JLabel custAddress = new JLabel(c.getAddress());
        custAddress.setBounds(135, 125,150,20);
        JLabel custCity = new JLabel(c.getCity());
        custCity.setBounds(135, 155,150,20);
        JLabel custState = new JLabel(c.getState());
        custState.setBounds(135, 185,150,20);
        JLabel custZip = new JLabel(c.getZip());
        custZip.setBounds(135, 215,150,20);
        JLabel custNights = new JLabel(String.valueOf(c.getNights()));
        custNights.setBounds(135, 240,150,20);
        JLabel custBalance = new JLabel("$" + String.valueOf(String.format("%.2f",(c.getNights()*85.00)*1.10)));
        custBalance.setBounds(135, 270,150,20);
        //add labels
        add(firstNameLabel);
        add(lastNameLabel);
        add(phoneLabel);
        add(addressLabel);
        add(cityLabel);
        add(stateLabel);
        add(zipLabel);
        add(nightsLabel);
        add(balanceLabel);
        //add feedback labels
        add(custFirstName);
        add(custLastName);
        add(custPhone);
        add(custAddress);
        add(custCity);
        add(custState);
        add(custZip);
        add(custNights);
        add(custBalance);
        add(submit);

        repaint();
        //button action
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.checkOut(roomChoice, c);
                setVisible(false);
            }
        });
    }

}
