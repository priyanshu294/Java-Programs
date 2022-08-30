import java.awt.*;
import java.applet.*;

public class Demo1 extends Applet
	{
	Button b1,b2,b3,b4,b5;
	Panel p;
	Font f;
	BorderLayout bl;
	public void init()
		{
		f=new Font("Arial",Font.BOLD,22);
		bl=new BorderLayout();
		setLayout(bl);
		b1=new Button("North");
		b1.setFont(f);
		p=new Panel();
	Label l=new Label("Java Technocrat");
		l.setFont(f);
		p.add(l);
		p.add(b1);
		b2=new Button("South");
		b3=new Button("East");
		b4=new Button("West");
		b5=new Button("Center");
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		
		add(p,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		}
	}
/*
<applet code="Demo1" width="400" height="400">
</applet>
*/
		
		
		