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
public class library_swing {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("My_GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel (new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JLabel label = new JLabel("UserName: ");
        c.gridx = 0;
        c.gridy = 1;
        pane.add(label,c);
        JTextField uname = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        pane.add(uname,c);
        JLabel label1 = new JLabel("Password: ");
        c.gridx = 0;
        c.gridy = 2;
        pane.add(label1,c);
        JTextField pssd = new JTextField(20);
        c.gridx = 1;
        c.gridy = 2;
        pane.add(pssd,c);
        JButton submit = new JButton("Login");
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = uname.getText();
                String pass = pssd.getText();
//              System.out.println("Your user name is: "+uname.getText());
//              System.out.println("your password is:"+pssd.getText());
                if (user.equals("username") && pass.equals("password")) {
                    uname.setEnabled(true);
//                  System.out.println("your user name is incorrect ");
                    pssd.setEnabled(true);
//                  System.out.println("your password is incorrect");
                }
    }
    };
        submit.addActionListener(al);
        c.gridx = 1;
        c.gridy = 9;
        c.gridwidth = 5;
        c.fill = GridBagConstraints.HORIZONTAL;
        pane.add(submit, c);
        frame.add(pane);
        frame.pack();
        submit.addActionListener(al);
        frame.setVisible(true);
    }
}
