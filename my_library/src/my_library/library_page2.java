package my_library;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class library_page2 {
    public static void main(String[] args) {
         JFrame frame = new JFrame();
            frame.setSize(500, 500);
            frame.setTitle("Librarian registration");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel pane = new JPanel (new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            JLabel label = new JLabel("First Name: ");
            c.gridx = 0;
            c.gridy = 1;
            pane.add(label,c);
            JTextField FName = new JTextField(20);
            c.gridx = 1;
            c.gridy = 1;
            pane.add(FName,c);
            JLabel label1 = new JLabel("Last Name: ");
            c.gridx = 0;
            c.gridy = 2;
            pane.add(label1,c);
            JTextField LName = new JTextField(20);
            c.gridx = 1;
            c.gridy = 2;
            pane.add(LName,c);
            JLabel label2 = new JLabel("Address1: ");
            c.gridx = 0;
            c.gridy = 3;
            pane.add(label2,c);
            JTextField Address1 = new JTextField(20);
            c.gridx = 1;
            c.gridy = 3;
            pane.add(Address1,c);
            JLabel label3 = new JLabel("City: ");
            c.gridx = 0;
            c.gridy = 4;
            pane.add(label3,c);
            JTextField City = new JTextField(20);
            c.gridx = 1;
            c.gridy = 4;
            pane.add(City,c);
            JLabel label4 = new JLabel("Country: ");
            c.gridx = 0;
            c.gridy = 5;
            pane.add(label4,c);
            JTextField Country = new JTextField(20);
            c.gridx = 1;
            c.gridy = 5;
            pane.add(Country,c);
            JLabel label5 = new JLabel("Postcode: ");
            c.gridx = 0;
            c.gridy = 6;
            pane.add(label5,c);
            JTextField Postcode = new JTextField(20);
            c.gridx = 1;
            c.gridy = 6;
            pane.add(Postcode,c);
            JLabel label6 = new JLabel("Telephone: ");
            c.gridx = 0;
            c.gridy = 7;
            pane.add(label6,c);
            JTextField Telephone = new JTextField(20);
            c.gridx = 1;
            c.gridy = 7;
            pane.add(Telephone,c);
//          JLabel label1 = new JLabel("Email Address: ");
//          c.gridx = 0;
//          c.gridy = 2;
//          pane.add(label1,c);
//          
//          JTextField EmailAddress = new JTextField(20);
//          c.gridx = 0;
//          c.gridy = 3;
//          pane.add(EmailAddress,c);
            JButton submit = new JButton("Confirm");
            ActionListener al = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            };
            JButton Clear = new JButton("Cancel");
            ActionListener al1 = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
//                  System.out.println("User  Name Is "+FName.getText());
//                  System.out.println("Hello "+LName.getText());
//                  System.out.println("Hello "+Address1.getText());
//                  System.out.println("Hello "+City.getText());
//                  System.out.println("Hello "+Country.getText());
//                  System.out.println("Hello "+Postcode.getText());
//                  System.out.println("Hello "+Telephone.getText());
                }
            };
            submit.addActionListener(al);
            c.gridx =4 ;
            c.gridy =9;
            c.gridwidth = 1;
            c.fill = GridBagConstraints.HORIZONTAL;
            pane.add(submit,c);
            Clear.addActionListener(al);
            c.gridx =0 ;
            c.gridy =9;
            c.gridwidth = 1;
            c.fill = GridBagConstraints.HORIZONTAL;
            pane.add(Clear,c);
            frame.add(pane);
            frame.pack();
            submit.addActionListener(al);
            frame.setVisible(true);
}
}