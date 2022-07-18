package my_library;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Issued_things {
    private JFrame frame;
    private JTextField txtBktitle;
    private JTextField txtUserpicked;
    private JTextField txtBookid;
    private JTextField txtIssuedate;
    private JTextField txtReturndate;
    private JTextField txtRichDadPoor;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField txtFine;
    private JTextField txtRs;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Issued_things window = new Issued_things();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public Issued_things() {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        txtBktitle = new JTextField();
        txtBktitle.setBounds(118, 13, 195, 35);
        frame.getContentPane().add(txtBktitle);
        txtBktitle.setText("                       LEDGER");
        txtBktitle.setColumns(10);
        txtUserpicked = new JTextField();
        txtUserpicked.setText("Book Issued");
        txtUserpicked.setBounds(82, 59, 96, 20);
        frame.getContentPane().add(txtUserpicked);
        txtUserpicked.setColumns(10);
        txtBookid = new JTextField();
        txtBookid.setText("Book_Id");
        txtBookid.setBounds(82, 90, 96, 20);
        frame.getContentPane().add(txtBookid);
        txtBookid.setColumns(10);
        txtIssuedate = new JTextField();
        txtIssuedate.setText("Issue_date");
        txtIssuedate.setBounds(82, 121, 96, 20);
        frame.getContentPane().add(txtIssuedate);
        txtIssuedate.setColumns(10);
        txtReturndate = new JTextField();
        txtReturndate.setText("Return_Date");
        txtReturndate.setBounds(82, 152, 96, 20);
        frame.getContentPane().add(txtReturndate);
        txtReturndate.setColumns(10);
        txtRichDadPoor = new JTextField();
        txtRichDadPoor.setText("Rich Dad Poor Dad");
        txtRichDadPoor.setBounds(251, 59, 96, 20);
        frame.getContentPane().add(txtRichDadPoor);
        txtRichDadPoor.setColumns(10);
        textField_1 = new JTextField();
        textField_1.setText("123");
        textField_1.setBounds(251, 90, 96, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        textField_2 = new JTextField();
        textField_2.setText("15/06/2022");
        textField_2.setBounds(251, 121, 96, 20);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        textField_3 = new JTextField();
        textField_3.setText("15/07/2022");
        textField_3.setBounds(251, 152, 96, 20);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);
        txtFine = new JTextField();
        txtFine.setText("Fine");
        txtFine.setBounds(82, 183, 96, 20);
        frame.getContentPane().add(txtFine);
        txtFine.setColumns(10);
        txtRs = new JTextField();
        txtRs.setText("Rs-500");
        txtRs.setBounds(251, 186, 96, 20);
        frame.getContentPane().add(txtRs);
        txtRs.setColumns(10);
    }
}





