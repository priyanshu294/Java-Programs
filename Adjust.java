import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Adjust extends Applet implements AdjustmentListener
	{
	BorderLayout br;
	Scrollbar hb1,hb2,v1,v2;
	TextField tf;
	Font f;
	public void init()
		{
		br=new BorderLayout();
		setLayout(br);
hb1=new Scrollbar(Scrollbar.HORIZONTAL,1,20,1,100);
hb2=new Scrollbar(Scrollbar.HORIZONTAL,1,20,1,100);
v1=new Scrollbar(Scrollbar.VERTICAL,1,20,1,100);
v2=new Scrollbar(Scrollbar.VERTICAL,1,20,1,100);

tf=new TextField(32);
f=new Font("Arial",Font.BOLD,28);
tf.setFont(f);
tf.setEditable(false);
Panel p=new Panel();
p.add(tf);
hb2.addAdjustmentListener(this);
v2.addAdjustmentListener(this);

add(hb1,BorderLayout.NORTH);
add(hb2,BorderLayout.SOUTH);
add(v1,BorderLayout.EAST);
add(v2,BorderLayout.WEST);
add(p);
}

@Override
public void adjustmentValueChanged(AdjustmentEvent ae)
	{
	if(ae.getAdjustable()==hb2)
		{
		hb1.setValue(hb2.getValue());
		tf.setText("Place of Horizontal Scrollbar is "+hb2.getValue());
		}else{
		v1.setValue(v2.getValue());
		tf.setText("Place of Vertical Scroll bar is "+v2.getValue());
		}
	}
			
	}
/*
<applet code="Adjust" width="500" height="400"></applet>*/