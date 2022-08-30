import java.awt.*;

public class Canvas1 extends Canvas
	{
	public Canvas1()
		{
		setBackground(Color.yellow);
		setSize(300,200);
		setVisible(true);
		}
	public void paint(Graphics g)
		{
		g.setColor(Color.red);
		g.fillOval(80,90,100,100);
	Font f=new Font("Arial",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString("!!!Good Morning!!!",150,150);
		}
	}
	
