import java.awt.*;
import java.applet.*;

public class Color1 extends Applet
	{
	Panel p1,p2,p3;	
	public void init()	
		{
		setLayout(new GridLayout(3,1));
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.blue);
		
		add(p1);
		add(p2);
		add(p3);
		}
	}
/*
<applet code="Color1" width="400" height="500">
</applet>
*/
		
		