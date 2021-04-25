import java.awt.*;
import java.applet.*;
/<applet code="BallBounce" width=500 height=500> </applet>/
public class BallBounce extends Applet implements Runnable
{
int stpX=200,stpY=200,x=100,y=100,i=0;
Thread t;
public void init()
{
t=new Thread(this);
setForeground(Color.yellow);
setFont(new Font("chiller",Font.BOLD,30));
t.start();
}
public void run()
{
try
{
for(;;)
{
if(stpY==200)
i=0;
repaint();
Thread.sleep(20);
if(stpY==500)
i=1;
}
}
catch(Exception e){}
}
public void paint(Graphics g)
{
if(i==0)
{
g.setColor(Color.orange);
g.drawString("orange",200,100);
g.fillOval(stpX,stpY,x,y);
stpY+=5;
}
if(i==1)
{
g.setColor(Color.pink);
g.drawString("pink",225,650);
g.fillOval(stpX,stpY,x,y);
stpY-=5;
}
}
}
