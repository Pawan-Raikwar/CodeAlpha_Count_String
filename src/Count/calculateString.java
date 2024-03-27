package Count;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class calculateString extends JFrame implements ActionListener{
    JLabel label1, label2,label3;
    JTextField textField2,textField3;
    JButton button3;
    calculateString(){
        super("Count");

        label1=new JLabel("WELCOME ");
        label1.setForeground(Color.black);//  color set karne ke liye
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(300,0,450,40);
        add(label1);

        label2=new JLabel("Enter The Word :");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.blue);
        label2.setBounds(5,190,375,30);
        add(label2);

        textField2=new JTextField(0);
        textField2.setBounds(295,190,400,50);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        button3=new JButton("Check");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,305,230,30);
        button3.addActionListener(this);
        add(button3);

        label3=new JLabel("Total Number Of Word :");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.blue);
        label3.setBounds(5,400,375,30);
        add(label3);

        textField3=new JTextField(0);
        textField3.setBounds(340,400,350,50);
        textField3.setFont(new Font("Arial",Font.BOLD,14));
        add(textField3);

        setLayout(null);
        setSize(900,1000);
        setLocation(450,10);
        setBackground(new Color(0, 57, 253, 255));
     // setUndecorated(true);// remove the minimized icon
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String cou = textField2.getText();
            int count = 1;
            for (int i = 0; i < cou.length()-1; i++) {
                char c, d;
                c = cou.charAt(i);
                d = cou.charAt(i + 1);

                if (c == ' ' && d != ' ') {
                    count++;
                }
            }

            if (e.getSource() == button3) {
                textField3.setText(Integer.toString(count));

            }
        }catch (Exception ee){
             ee.printStackTrace();
        }

    }

    public static void main(String[] args) {

        // call the constructor
        new calculateString();
    }
}

