import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomView extends JFrame implements ActionListener {
        private Controller controller;



        RoomView(Controller c){
            super("Haughlidae Enn®");
            this.controller = c;
            Border pad = BorderFactory.createEmptyBorder(10,10,10,10);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            setSize(new Dimension(400,400));

            JLabel heading = new JLabel("Haughlidae Enn");
            heading.setLocation(65,5);
            heading.setFont(new Font("Monaco", Font.PLAIN, 35));
            heading.setSize(new Dimension(400,60));
            add(heading);

            JLabel heading2 = new JLabel("Room Select");
            heading2.setLocation(154,55);
            heading2.setFont(new Font("Monaco", Font.PLAIN, 12));
            heading2.setSize(new Dimension(400,40));
            add(heading2);

            JLabel footer = new JLabel("©You Got Scammed If You Bought This.");
            footer.setFont(heading.getFont().deriveFont(1).deriveFont(8.0f));
            footer.setLocation(110, 347);
            footer.setSize(new Dimension(400,15));
            add(footer);

            JButton room1 = new JButton("Room 1");
            room1.setBounds(60,100,100,30);
            room1.addActionListener(this);
            JButton room2 = new JButton("Room 3");
            room2.setBounds(60,140,100,30);
            room2.addActionListener(this);
            JButton room3 = new JButton("Room 5");
            room3.setBounds(60,180,100,30);
            room3.addActionListener(this);
            JButton room4 = new JButton("Room 7");
            room4.setBounds(60,220,100,30);
            room4.addActionListener(this);
            JButton room5 = new JButton("Room 9");
            room5.setBounds(60,260,100,30);
            room5.addActionListener(this);
            JButton room6 = new JButton("Room 2");
            room6.setBounds(220,100,100,30);
            room6.addActionListener(this);
            JButton room7 = new JButton("Room 4");
            room7.setBounds(220,140,100,30);
            room7.addActionListener(this);
            JButton room8 = new JButton("Room 6");
            room8.setBounds(220,180,100,30);
            room8.addActionListener(this);
            JButton room9 = new JButton("Room 8");
            room9.setBounds(220,220,100,30);
            room9.addActionListener(this);
            JButton room10 = new JButton("Room 10");
            room10.setBounds(220,260,100,30);
            room10.addActionListener(this);

            add(room1);
            add(room2);
            add(room3);
            add(room4);
            add(room5);
            add(room6);
            add(room7);
            add(room8);
            add(room9);
            add(room10);
            setVisible(true);
        }
@Override
     public void actionPerformed(ActionEvent event) {

            String roomName = event.getActionCommand();
            System.out.println(roomName);
            //todo there's likely something going on with this returning a null?
            if (controller.isEmpty(roomName)){
                controller.roomChoice(roomName);
                CustomerView cv = new CustomerView(controller, roomName);
                cv.setVisible(true);
            }else{
                //controller.roomChoice(roomName);
                CustomerInfo custInfo = new CustomerInfo(controller.getCustomer(roomName), roomName, controller);
                custInfo.setVisible(true);
            }


}

}
