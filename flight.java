/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author Hp
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

class Proj extends JFrame implements ActionListener {

    JLabel title;
    JLabel t1;
    JLabel t2;
    JLabel t3;
    JLabel t4;
    JLabel j1;
    JButton b1;
    JFrame fpass;
    Font f, f1;

    public Proj() {
        super("Welcome");
    }

    public void init() {
    }

    public void setup() {
        fpass = new JFrame("Project");
        fpass.getContentPane().setLayout(null);
        title = new JLabel("Project On");
        title.setBounds(300, 50, 250, 30);
        fpass.getContentPane().add(title);

        f = new Font("Times New Roman", Font.BOLD, 29);
        title.setFont(f);
        f1 = new Font("Times New Roman", Font.BOLD, 20);

        fpass.getContentPane().setLayout(null);
        t1 = new JLabel("Airline Reservation System");
        t1.setBounds(200, 90, 350, 30);
        fpass.getContentPane().add(t1);
        t1.setFont(f);

        fpass.getContentPane().setLayout(null);
        t2 = new JLabel("Developed by:");
        t2.setBounds(500, 470, 250, 30);
        fpass.getContentPane().add(t2);
        t2.setFont(f1);

        fpass.getContentPane().setLayout(null);
        t3 = new JLabel("Niharika Chandan");
        t3.setBounds(500, 490, 250, 30);
        fpass.getContentPane().add(t3);
        t3.setFont(f1);

        fpass.getContentPane().setLayout(null);
        t4 = new JLabel("Guru Nanak Dev University");
        t4.setBounds(500, 510, 350, 30);
        fpass.getContentPane().add(t4);
        t4.setFont(f1);

        ImageIcon in1 = new ImageIcon("C:\\Airline\\images.jpg");
        JLabel j1 = new JLabel(" ", in1, JLabel.CENTER);
        j1.setBounds(10, 130, 800, 400);
        fpass.getContentPane().add(j1);
        b1 = new JButton("next");
        b1.setBounds(300, 510, 80, 30);
        fpass.getContentPane().add(b1);
        b1.addActionListener(this);

        fpass.setSize(800, 800);
        fpass.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            fpass.setVisible(false);
            proj2 p2 = new proj2();
            p2.setup();
        }
    }

    public static void main(String args[]) {
        Proj p = new Proj();
        p.setup();
        p.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class proj2 extends JFrame implements ActionListener {

    JLabel l1;
    JLabel u1;
    JLabel p1;
    JTextField u2;
    JPasswordField p2;
    JButton l3;
    JButton e3;
    JButton nu3;
    JFrame fpass2;
    Font f, f1;

    public proj2() {
        super("Login");

    }

    public void init() {
    }

    public void setup() {
        fpass2 = new JFrame("PROJECT");
        fpass2.getContentPane().setLayout(null);
        l1 = new JLabel("LOGIN");
        l1.setBounds(200, 60, 200, 30);
        fpass2.getContentPane().add(l1);
        f = new Font("Times New Roman", Font.BOLD, 29);
        l1.setFont(f);
        f1 = new Font("Times New Roman", Font.BOLD, 20);

        fpass2.getContentPane().setLayout(null);
        u1 = new JLabel("USER NAME");
        u1.setBounds(150, 120, 120, 30);
        fpass2.getContentPane().add(u1);
        u1.setFont(f1);

        fpass2.getContentPane().setLayout(null);
        p1 = new JLabel("PASSWORD");
        p1.setBounds(150, 150, 120, 30);
        fpass2.getContentPane().add(p1);
        p1.setFont(f1);

        fpass2.getContentPane().setLayout(null);
        u2 = new JTextField("");
        u2.setBounds(290, 120, 120, 30);
        fpass2.getContentPane().add(u2);
        u2.setFont(f1);

        fpass2.getContentPane().setLayout(null);
        p2 = new JPasswordField("");
        p2.setBounds(290, 150, 120, 30);
        fpass2.getContentPane().add(p2);
        p2.setFont(f1);



        l3 = new JButton("LOGIN");
        l3.setBounds(270, 300, 170, 30);
        fpass2.getContentPane().add(l3);
        l3.addActionListener(this);


        e3 = new JButton("EXIT");
        e3.setBounds(390, 300, 200, 30);
        fpass2.getContentPane().add(e3);
        e3.addActionListener(this);

        nu3 = new JButton("NEW USER");
        nu3.setBounds(360, 350, 200, 30);
        fpass2.getContentPane().add(nu3);
        nu3.addActionListener(this);


        fpass2.setSize(800, 800);
        fpass2.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == e3) {
            System.exit(0);

        }
        if (ae.getSource() == l3) {
            String str1;
            str1 = u2.getText();
            String str2 = new String(p2.getPassword());
            if (!str1.equals("abc")) {
                JOptionPane.showMessageDialog(null, "Invalid User-ID", "Error", 1);
                u2.setText("");
                p2.setText("");

            }
            if (!str2.equals("123")) {
                JOptionPane.showMessageDialog(null, "Invalid Password", "Error", 1);
                u2.setText("");
                p2.setText("");

            }
            if (str1.equals("abc") && str2.equals("123")) {
                fpass2.setVisible(false);

                proj3 p3 = new proj3();
                p3.setup();

            }
        }
               if (ae.getSource()==nu3) {
                fpass2.setVisible(false);

                proj5 p5 = new proj5();
                p5.setup();

            
 
        }
    }
}
    class proj3 extends JFrame implements ActionListener {

        JFrame fpass3;
        JLabel a1;
        JLabel mm;
        JButton b1;
        JButton b2;
        JButton b3;
        JButton b4;
        JButton b5;
        Font f, f1;

        public proj3() {
            super("Admin Menu");

        }

        public void init() {
        }

        public void setup() {



            fpass3 = new JFrame("Admin Menu");
            fpass3.getContentPane().setLayout(null);
            a1 = new JLabel("Welcome Admin");
            a1.setBounds(20, 40, 150, 30);
            fpass3.getContentPane().add(a1);
            f = new Font("Times New Roman", Font.BOLD, 20);
            a1.setFont(f);
            f1 = new Font("Times New Roman", Font.BOLD, 29);



            fpass3.getContentPane().setLayout(null);
            mm = new JLabel("MAIN MENU");
            mm.setBounds(300, 120, 400, 30);
            fpass3.getContentPane().add(mm);
            mm.setFont(f1);
b1 = new JButton("NEW FLIGHT DETAILS");
            b1.setBounds(270, 170, 200, 30);
            fpass3.getContentPane().add(b1);
            b1.addActionListener(this);

            b2 = new JButton("VIEW OR DELETE");
            b2.setBounds(270, 220, 200, 30);
            fpass3.getContentPane().add(b2);
            b2.addActionListener(this);

            b3 = new JButton("EDIT DETAILS");
            b3.setBounds(270, 270, 200, 30);
            fpass3.getContentPane().add(b3);
            b3.addActionListener(this);
    
            b4 = new JButton("VIEW PASSENGER LIST");
            b4.setBounds(270, 320, 200, 30);        

            fpass3.getContentPane().add(b4);
            b4.addActionListener(this);

            b5 = new JButton("EXIT");
            b5.setBounds(270, 370, 200, 30);
            fpass3.getContentPane().add(b5);
            b5.addActionListener(this);

            fpass3.setSize(800, 800);
            fpass3.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==b1)
            {
                fpass3.setVisible(false);
                proj4 p4=new proj4();
                p4.setup();
            }
           
              }
    }


class proj4 extends JFrame implements ActionListener {

    JFrame fpass4;
    JLabel l1;
    JLabel n1;
    JTextField n2;
    JLabel d1;
    Choice d2;
      Choice d22;  
      Choice d222;
    JLabel t1;
    JTextField t2;
    JLabel s1;
    JTextField s2;
    JLabel des1;
    JTextField des2;
    JLabel ec1;
    JTextField ec2;
    JLabel b1;
    JTextField b2;
    JLabel ex1;
    JTextField ex2;
    JButton s;
    JButton n;
    JButton b;
    Font f, f1;

    public proj4() {
        super("New FLight Details");

    }

    public void init() {
    }

    public void setup() {

        fpass4 = new JFrame("New Flight Details");
        fpass4.getContentPane().setLayout(null);
        l1 = new JLabel("NEW FLIGHT DETAILS");
        l1.setBounds(300, 40, 500, 30);
        fpass4.getContentPane().add(l1);
        f = new Font("Times New Roman", Font.BOLD, 29);
        l1.setFont(f);
        f1 = new Font("Times New Roman", Font.BOLD, 20);
        fpass4.getContentPane().setLayout(null);
        n1 = new JLabel("FLIGHT NUMBER");
        n1.setBounds(150, 120, 300, 30);
        fpass4.getContentPane().add(n1);
        n1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        n2 = new JTextField("");
        n2.setBounds(450, 120, 200, 30);
        fpass4.getContentPane().add(n2);
        n2.setFont(f1);
        d1 = new JLabel("FLIGHT DATE");
        d1.setBounds(150, 170, 300, 30);
        fpass4.getContentPane().add(d1);
        d1.setFont(f1);
        fpass4.getContentPane().setLayout(null);

        
        d2 = new Choice();
        d2.setBounds(450, 170, 50, 30);
        fpass4.getContentPane().add(d2);
        d2.add("1");
        d2.add("2");
        d2.add("3");
        d2.add("4");
        d2.add("5");
        d2.add("6");
        d2.add("7");
        d2.add("8");
        d2.add("9");
        d2.add("10");
        d2.add("11");
        d2.add("12");
        d2.add("13");
        d2.add("14");
        d2.add("15");
        d2.add("16");
        d2.add("17");
        d2.add("18");
        d2.add("19");
        d2.add("20");
        d2.add("21");
        d2.add("22");
        d2.add("23");
        d2.add("24");
        d2.add("25");
        d2.add("26");
        d2.add("27");
        d2.add("28");
        d2.add("29");
        d2.add("30");
        d2.add("31");
        
        d2.setFont(f1);
        d22 = new Choice();
        d22.add("January");
        d22.add("Feburary");
        d22.add("March");
        d22.add("April");
        d22.add("May");
        d22.add("June");
        d22.add("July");
        d22.add("August");
        d22.add("September");
        d22.add("October");
        d22.add("November");
        d22.add("December");
        
        
        
        d22.setBounds(500, 170, 120, 30);
        fpass4.getContentPane().add(d22);
        d22.setFont(f1);
        d222 = new Choice();
        d222.add("2020");
        d222.add("2021");
        d222.setBounds(620, 170,100, 30);
        fpass4.getContentPane().add(d222);
        d222.setFont(f1);
         t1 = new JLabel("FLIGHT TIME (24hrs)");
        t1.setBounds(150, 220, 300, 30);
        fpass4.getContentPane().add(t1);
        t1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        t2 = new JTextField("");
        t2.setBounds(450, 220, 300, 30);
        fpass4.getContentPane().add(t2);
         s1 = new JLabel("SOURCE(From)");
        s1.setBounds(150, 270, 300, 30);
        fpass4.getContentPane().add(s1);
        s1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        s2 = new JTextField("");
        s2.setBounds(450, 270, 300, 30);
        fpass4.getContentPane().add(s2);
         des1 = new JLabel("DESTINATION (To)");
        des1.setBounds(150, 320, 300, 30);
        fpass4.getContentPane().add(des1);
        des1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        des2 = new JTextField("");
        des2.setBounds(450, 320, 300, 30);
        fpass4.getContentPane().add(des2);
         ec1 = new JLabel("ECONOMY CLASS");
        ec1.setBounds(150, 420, 300, 30);
        fpass4.getContentPane().add(ec1);
        ec1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        ec2 = new JTextField("");
        ec2.setBounds(450, 420, 300, 30);
        fpass4.getContentPane().add(ec2);
         b1 = new JLabel("BUSINESS CLASS");
        b1.setBounds(150, 470, 300, 30);
        fpass4.getContentPane().add(b1);
        b1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        b2 = new JTextField("");
        b2.setBounds(450, 470, 300, 30);
        fpass4.getContentPane().add(b2);
         ex1 = new JLabel("EXECUTIVE CLASS");
        ex1.setBounds(150, 520, 300, 30);
        fpass4.getContentPane().add(ex1);
        ex1.setFont(f1);
        fpass4.getContentPane().setLayout(null);
        ex2 = new JTextField("");
        ex2.setBounds(450, 520, 300, 30);
        fpass4.getContentPane().add(ex2);
                s = new JButton("SAVE");
            s.setBounds(270, 590, 100, 30);
            fpass4.getContentPane().add(s);
            s.addActionListener(this);

            n = new JButton("NEW");
            n.setBounds(400, 590, 100, 30);
            fpass4.getContentPane().add(n);
            n.addActionListener(this);

            b = new JButton("BACK");
            b.setBounds(530,590, 100, 30);
            fpass4.getContentPane().add(b);
            b.addActionListener(this);
            fpass4.setSize(800, 800);
            fpass4.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
 if(ae.getSource()==s)
 {
     String s1,s22,s3,s4,s5,s6,s7;
     s1=n2.getText();
     if(s1.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter Flight Number");
         return;
         
     }


     s22=t2.getText();
     if(s22.length()==0 )
     {
         JOptionPane.showMessageDialog(null,"Enter Flight Time (24 hrs)");
         return;
         
     }
     
     s3=s2.getText();
     if(s3.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter Source(From)");
         return;
         
     }
     char x;
     int l=s3.length();
     for(int i=0;i<l;i++)
     {
         x=s3.charAt(i);
         if((x>='0' && x<='9'))
         {
             JOptionPane.showMessageDialog(null,"Enter alphabets in Source ");
            return;
         }
     }
     s4=des2.getText();
     if(s4.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter Destination(To)");
         return;
         
     }
         char x2;
     int l1=s4.length();
     for(int i1=0;i1<l;i1++)
     {
         x2=s4.charAt(i1);
         if((x2>='0' && x2<='9'))
         {
             JOptionPane.showMessageDialog(null,"Enter alphabets in destination");
            return;
         }
     }
     s5=ec2.getText();
     if(s5.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter economy seats");
         return;
         
     }
     int s11;
     try
{
s11=Integer.parseInt(s5);
}
             
catch(Exception e1)
{
JOptionPane.showMessageDialog(null,"Enter economy seats");
ec2.setText("");

return;
}
     if(s11>=75)
     {
       JOptionPane.showMessageDialog(null,"Economy seat number should be less than 75");
       return;
     }
     
     s6=b2.getText();
     if(s6.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter business seats");
         return;
         
     }
          int s12;
     try
{
s12=Integer.parseInt(s6);
}
catch(Exception e2)
{
JOptionPane.showMessageDialog(null,"Enter the numbr of seats in digits");
b2.setText("");

return;
}
     if(s12>=75)
     {
       JOptionPane.showMessageDialog(null,"Bussiness seat number should be less than 75");
       return;
     }
     s7=ex2.getText();
     if(s7.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter executive seats");
         return;
         
     }


 
         int s13;
     try
{
s13=Integer.parseInt(s7);
}
catch(Exception e3)
{
JOptionPane.showMessageDialog(null,"Enter the numbr of seats in digits");
ex2.setText("");

return;
}
     if(s13>=25)
     {
       JOptionPane.showMessageDialog(null,"Executive seat number should be less than 25");
       return;
     } 
      
         float s14;
     try
{
s14=Float.parseFloat(s22);
}
catch(Exception e3)
{
JOptionPane.showMessageDialog(null,"Enter the time in digits");
t2.setText("");

return;
}
     if(s14>=24)
     {
       JOptionPane.showMessageDialog(null,"Time should be less than 24 hrs");
       return;
     } 
              int s15;
     try
{
s15=Integer.parseInt(s1);
}
catch(Exception e3)
{
JOptionPane.showMessageDialog(null,"Enter the flight number in digits");
n2.setText("");

return;
}
     String s8;
     s8=d2.getSelectedItem();
     s8=s8+"/"+d22.getSelectedItem();
     s8=s8+"/"+d222.getSelectedItem();
     
     try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection db = DriverManager.getConnection("jdbc:odbc:data");

Statement st=db.createStatement();

st.executeUpdate("insert into flight(flight_number,date,time,source,destination,economy_seats,business_seats,executive_seats) values ('"+s1+"','"+s8+"','"+s22+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
//st.executeUpdate("insert into table1(ename) values ('"+s2+"')");
JOptionPane.showMessageDialog(null,"Data Submited Successfully");
s.setVisible(false);

	st.close();
 


}
catch(Exception e)
{
    System.out.println(e);
}
 }
     if(ae.getSource()==n)
             {
              n2.setText("");   
               t2.setText("");
                s2.setText("");
                 des2.setText("");
                  ec2.setText("");
                   b2.setText("");
                    ex2.setText("");
                    s.setVisible(true);
             }
       if(ae.getSource()==b){
            fpass4.setVisible(false);
            
          proj3 p33=new proj3();
            p33.setup();
   
       }
        }
}
        class proj5 extends JFrame implements ActionListener {

        JFrame fpass5;
        JLabel l11;
        JLabel l1;
        JTextField t1;
        JLabel l2;
        JPasswordField t2;
        JLabel l3;
        JTextField t3;
        JLabel l4;
        JTextField t4;
        JLabel l5;
        JTextField t5;
        JLabel l6;
        JTextField t6;
        JLabel l7;
        JTextField t7;
        JLabel l8;
        Checkbox male,female;
CheckboxGroup cbg;;
    JButton s;
    JButton n;
    JButton b;     
        Font f, f1;

        public proj5() {
            super("New User");

        }

        public void init() {
        }

        public void setup() {



            fpass5 = new JFrame("New User");
            fpass5.getContentPane().setLayout(null);
            l11 = new JLabel("Welcome User");
            l11.setBounds(20, 40, 150, 30);
            fpass5.getContentPane().add(l11);
            f = new Font("Times New Roman", Font.BOLD, 20);
            l11.setFont(f);
            f1 = new Font("Times New Roman", Font.BOLD, 29);

fpass5.getContentPane().setLayout(null);
        l1 = new JLabel("User ID");
        l1.setBounds(150, 120, 300, 30);
        fpass5.getContentPane().add(l1);
        l1.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t1 = new JTextField("");
        t1.setBounds(450, 120, 200, 30);
        fpass5.getContentPane().add(t1);
        t1.setFont(f1);
        l2 = new JLabel("Password");
        l2.setBounds(150, 170, 300, 30);
        fpass5.getContentPane().add(l2);
        l2.setFont(f1);
        fpass5.getContentPane().setLayout(null);
 fpass5.getContentPane().setLayout(null);
        t2 = new JPasswordField("");
        t2.setBounds(450, 170, 300, 30);
        fpass5.getContentPane().add(t2);
        t2.setFont(f1);
       
         l3 = new JLabel("User's Name");
        l3.setBounds(150, 220, 300, 30);
        fpass5.getContentPane().add(l3);
        l3.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t3 = new JTextField("");
        t3.setBounds(450, 220, 300, 30);
        fpass5.getContentPane().add(t3);
         l4 = new JLabel("Address");
        l4.setBounds(150, 270, 300, 30);
        fpass5.getContentPane().add(l4);
        l4.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t4 = new JTextField("");
        t4.setBounds(450, 270, 300, 30);
        fpass5.getContentPane().add(t4);
         l5 = new JLabel("Mobile Number");
        l5.setBounds(150, 320, 300, 30);
        fpass5.getContentPane().add(l5);
        l5.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t5 = new JTextField("");
        t5.setBounds(450, 320, 300, 30);
        fpass5.getContentPane().add(t5);
         l6 = new JLabel("E-mail ID");
        l6.setBounds(150, 420, 300, 30);
        fpass5.getContentPane().add(l6);
        l6.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t6 = new JTextField("");
        t6.setBounds(450, 420, 300, 30);
        fpass5.getContentPane().add(t6);
         l7 = new JLabel("Age");
        l7.setBounds(150, 470, 300, 30);
        fpass5.getContentPane().add(l7);
        l7.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        t7 = new JTextField("");
        t7.setBounds(450, 470, 300, 30);
        fpass5.getContentPane().add(t7);
         l8 = new JLabel("Gender");
        l8.setBounds(150, 520, 300, 30);
        fpass5.getContentPane().add(l8);
        l8.setFont(f1);
        fpass5.getContentPane().setLayout(null);
        cbg=new CheckboxGroup();

male=new Checkbox("Male",cbg,true);
female=new Checkbox("Female",cbg,false);
 male.setBounds(450,520,100,30);
 female.setBounds(570,520 ,100,30);
        fpass5.getContentPane().add(male);  fpass5.getContentPane().add(female);
        
         s = new JButton("SAVE");
            s.setBounds(270, 590, 100, 30);
            fpass5.getContentPane().add(s);
            s.addActionListener(this);

            n = new JButton("NEW");
            n.setBounds(400, 590, 100, 30);
            fpass5.getContentPane().add(n);
            n.addActionListener(this);

            b = new JButton("BACK");
            b.setBounds(530,590, 100, 30);
            fpass5.getContentPane().add(b);
            b.addActionListener(this);
           fpass5.setSize(800, 800);
        fpass5.setVisible(true);
        }
    public void actionPerformed(ActionEvent ae) 
    {
       
 if(ae.getSource()==s)
 {
     String s1,s22,s3,s4,s5,s6,s7;
     s1=t1.getText();
     if(s1.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter User id");
         return;
         
     }
      if(s1.length()<=4)
     {
         JOptionPane.showMessageDialog(null," User id should be of more than 4 characters");
         return;
         
     }


     s22=t2.getText();
     if(s22.length()==0 )
     {
         JOptionPane.showMessageDialog(null,"Enter password");
         return;
         
     }
      if(s22.length()<=4)
     {
         JOptionPane.showMessageDialog(null,"Password should be of more than 4 characters");
         return;
         
     }
       s3=t3.getText();
     if(s3.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter User Name");
         return;
         
     }
      char x2;
     int l3=s3.length();
     for(int i1=0;i1<l3;i1++)
     {
         x2=s3.charAt(i1);
         if((x2>='0' && x2<='9'))
         {
             JOptionPane.showMessageDialog(null,"Enter alphabets in User Name");
            return;
         }
     }
     s4=t4.getText();
     if(s4.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter Address");
         return;
         
     }
     s5=t5.getText();
     if(s5.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter User Mobile No.");
         return;
         
     }
      if(s5.length()!=10)
     {
         JOptionPane.showMessageDialog(null,"Mobile No. should be of 10 characters");
         return;
         
     }
      
         int s14;
     try
{
s14=Integer.parseInt(s5);
}
catch(Exception e3)
{
JOptionPane.showMessageDialog(null,"Enter mobile no in digits");
t5.setText("");

return;
}      
 s6=t6.getText();
if(s6.length()<3)
{
JOptionPane.showMessageDialog(null,"Enter the Emailid");
return;
}
int p1,p2,p3,p4;
p1=s6.indexOf("@");
p2=s6.indexOf(".");
if((p1==-1)||(p2==-1))
{
JOptionPane.showMessageDialog(null,"Enter the Correct  Emailid");
return;
}
p3=s6.lastIndexOf("@");
p4=s6.lastIndexOf(".");
if((p1!=p3)||(p2!=p4))
{
JOptionPane.showMessageDialog(null,"Enter the Correct Emailid");
return;
}  
 s7=t7.getText();
     if(s7.length()==0)
     {
         JOptionPane.showMessageDialog(null,"Enter Age");
         return;
         
     }
      if(s7.length()>2)
     {
         JOptionPane.showMessageDialog(null,"Age should be less than 2 digits");
         return;
     }
           try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection db = DriverManager.getConnection("jdbc:odbc:data");

Statement st=db.createStatement();
String s8=cbg.getSelectedCheckbox().getLabel();
st.executeUpdate("insert into user(userid,password,username,address,mobile_no,email_id,age,gender) values ('"+s1+"','"+s22+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')");
//st.executeUpdate("insert into table1(ename) values ('"+s2+"')");
JOptionPane.showMessageDialog(null,"Data Submited Successfully");
s.setVisible(false);

	st.close();
 


}
catch(Exception e)
{
    System.out.println(e);
}
 }
    
 
        if(ae.getSource()==b){
            fpass5.setVisible(false);
            
          proj2 p33=new proj2();
            p33.setup();
   
       }
         if(ae.getSource()==n)
             {
              t1.setText("");   
               t2.setText("");
                t3.setText("");
                 t4.setText("");
                  t5.setText("");
                   t6.setText("");
                    t7.setText("");
                    s.setVisible(true);
             }

     
   
    
        }     }


    
                
        
  
        
  
       


 





        // TODO code application logic here

