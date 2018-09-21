import java.awt.*;
import javax.swing.*;
 class Backimage extends Canvas
{
	Image img;
 Backimage()

{
	img=Toolkit.getDefaultToolkit().getImage("6.jpg");
}
public void paint (Graphics g)
{
	int width=getSize().width;
	int height=getSize().height;
Graphics2D g2=(Graphics2D)g;
g2.drawImage(img,0,0,width,height,this);
}
}
class Back
{
public static void main(String args[])
{
Backimage bi= new Backimage();
JFrame f=new JFrame("my graphics");
//JButton b=new JButton("click");
//b.setBounds(10,50,10,40);
ImageIcon icon=new ImageIcon("n.jpg");
JLabel l=new JLabel("hi");
l.setBounds(300,500,600,200);
f.setIconImage(icon.getImage());
f.setSize(600,400);
f.setLocation(360,160);
f.setVisible(true);
f.add(bi);
//f.add(b);
f.add(l);
}
}

