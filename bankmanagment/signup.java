import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Image;
import java.util.Random;
import javax.swing.JFrame;


import com.toedter.calendar.JDateChooser;



public class signup extends JFrame {
    
    
    JTextField textName ,textFrame;
    JDataChosser dataChosser;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+ 1000L;
    String first = " " + Math.abs(first4);

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel labe1 = new JLabel("APPLICTAION FORM NO:" + first);
       labe1.setBounds(160,20,600,40);
        labe1.setFont(new Font("Raleway",Font.BOLD,38));
        add(labe1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Detail");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("NAME:  ");
        labelName.setFont(new Font("Raileway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("raileway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelfName = new JLabel("FATHERS NAME:  ");
        labelfName.setFont(new Font("Raileway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFrame = new JTextField();
        textFrame.setFont(new Font("Raileway",Font.BOLD,14));
        textFrame.setBounds(300,240,400,30);
        add(textFrame);

        JLabel DOB = new JLabel("DATE OF BIRTH ");
        DOB .setFont(new Font("Raileway",Font.BOLD,20));
        DOB .setBounds(100,340,200,30);
        add(DOB);


        

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }


    public static void main(String[] args) {
        new signup();
        
    }
    
}
