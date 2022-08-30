import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;//step-1
public class Card extends Applet implements ActionListener//step-2
	{	
	Panel p,p1,p2,p3;
	CardLayout cl;
	Font f,ff;
	Label l1,l2,l3;
	Button b1,b2;
	@Override
	public void init()
		{
		p=new Panel();
		cl=new CardLayout();
		p.setLayout(cl);
		p1=new Panel();
		ff=new Font("Verdana",Font.BOLD,30);
		l1=new Label("Java Technocrat");
		l1.setFont(ff);
		l1.setBackground(Color.blue);
		l1.setForeground(Color.white);
		p1.add(l1)	;

		p2=new Panel();
		l2=new Label("A/54,Saheed Nagar.");
		l2.setFont(ff);
		l2.setBackground(Color.black);
		l2.setForeground(Color.white);
		p2.add(l2);

		p3=new Panel();
		l3=new Label("Bhubaneswar.");
		l3.setFont(ff);
		l3.setBackground(Color.orange);
		l3.setForeground(Color.white);
		p3.add(l3);

		p.add("First",p1);
		p.add("Second",p2);
		p.add("Third",p3);
		
		b1=new Button("Next");
		b2=new Button("Previous");
		//step-3
		b1.addActionListener(this);
		b2.addActionListener(this);
		f=new Font("Arial",Font.BOLD,20);
		b1.setFont(f);
		b2.setFont(f);
		
		add(p);
		add(b1);
		add(b2);
		}
	@Override
	public void actionPerformed(ActionEvent we)
		{
		Button bb=(Button)we.getSource();
		if(bb==b1)
			{
			cl.next(p);
			}else{
			cl.previous(p);
			}
		}
	}
/*<applet code="Card" width=500 height=300>
</applet>*/
		

 