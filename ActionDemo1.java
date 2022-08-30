import java.applet.Applet;
import java.awt.*;
//step-1
import java.awt.event.*;
public class ActionDemo1 extends Applet implements ActionListener//step-2	
	{
	Button b1,b2,b3;
	Font f;
	@Override
	public void init()		
		{
		b1=new Button("Red");
		b2=new Button("Green");
		b3=new Button("Blue");
		//step-3
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f=new Font("Arial",Font.BOLD,22);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		add(b1);
		add(b2);
		add(b3);
		}
	//setp-4	
	@Override
	public void actionPerformed(ActionEvent ae)
		{
		Button bb=(Button)ae.getSource();
		if(bb==b1)
			{
			setBackground(Color.red);
			}
		else if(bb==b2)
			{
			setBackground(Color.green);
			}else{
			setBackground(Color.blue);
			}
		}
	}
/*<applet code="ActionDemo1" width=500 height=400>
</applet>*/
	
