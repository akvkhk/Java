import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Raamike4{
public static void main(String argumendid[]) throws Exception{
		
	int x=0, y=150;
	Frame f=new Frame("Esimene");
	f.setSize(200, 200);
	f.setVisible(true);
	while(x<300){
		f.setLocation(x, y);
		Thread.sleep(100);
		x=x+5;
		int R = (int)(Math.random()*256);
		int G = (int)(Math.random()*256);
		int B= (int)(Math.random()*256);
		Color color = new Color(R, G, B);
		f.setBackground(color);
	}
	f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we){
	System.exit(0);
	}
});
}
}
