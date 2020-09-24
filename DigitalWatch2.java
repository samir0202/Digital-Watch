import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class DigitalWatch2 extends JFrame implements Runnable
{
JLabel lb=new JLabel("DIGITAL WATCH");
JLabel lb1=new JLabel("Hours");
JLabel lb2=new JLabel("Minutes");
JLabel lb3=new JLabel("Seconds");
JLabel lb4=new JLabel("DD");
JLabel lb5=new JLabel("MM");
JLabel lb6=new JLabel("YY");
JLabel lb7=new JLabel("CALENDER");
JTextField tf1=new JTextField(10);
JTextField tf2=new JTextField(10);
JTextField tf3=new JTextField(10);
JTextField tf4=new JTextField(10);
JTextField tf5=new JTextField(10);
JTextField tf6=new JTextField(10);
JPanel pn1=new JPanel();
JPanel pn2=new JPanel();
JPanel pn3=new JPanel();
JPanel pn4=new JPanel();
Container con;
Thread th;
Date dt;
int i;
DigitalWatch2()
{
super("Digi C&C");
setLayout(null);
con=getContentPane();
con.setBackground(Color.green);
tf1.setFont(new Font("arial",Font.BOLD,20));
tf2.setFont(new Font("arial",Font.BOLD,20));
tf3.setFont(new Font("arial",Font.BOLD,20));
tf4.setFont(new Font("arial",Font.BOLD,20));
tf5.setFont(new Font("arial",Font.BOLD,20));
tf6.setFont(new Font("arial",Font.BOLD,20));
lb.setFont(new Font("Forte",Font.BOLD,22));
lb7.setFont(new Font("Forte",Font.BOLD,25));
pn1.setBackground(Color.magenta);
pn2.setBackground(Color.magenta);
pn3.setBackground(Color.yellow);
pn4.setBackground(Color.yellow);
setLayout(new GridLayout(4,1));
pn2.setLayout(new GridLayout(2,1,8,8));
pn4.setLayout(new GridLayout(2,1,8,8));
pn1.add(lb);
pn2.add(tf1);pn2.add(tf2);pn2.add(tf3);
pn2.add(lb1);pn2.add(lb2);pn2.add(lb3);
pn3.add(lb7);
pn4.add(tf4);pn4.add(tf5);pn4.add(tf6);
pn4.add(lb4);pn4.add(lb5);pn4.add(lb6);
add(pn1);add(pn2);add(pn3);add(pn4);
setVisible(true);
setResizable(false);
setSize(200,230);
th=new Thread(this);
th.start();
}
public void run()
{
while(true)
{
dt=new Date();
tf1.setText(String.valueOf(dt.getHours()));
tf2.setText(String.valueOf(dt.getMinutes()));
tf3.setText(String.valueOf(dt.getSeconds()));
tf4.setText(String.valueOf(dt.getDate()));
tf5.setText(String.valueOf(dt.getMonth()+1));
tf6.setText(String.valueOf(dt.getYear()+1900));
if(i==0)
{
lb.setForeground(Color.cyan);
lb7.setForeground(Color.blue);
i=1;
}
else if(i==1)
{
lb.setForeground(Color.orange);
lb7.setForeground(Color.black);
i=0;
}
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{}
}
}
public static void main(String k[])
{
new DigitalWatch2();
}
}