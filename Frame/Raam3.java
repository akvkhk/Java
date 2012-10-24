import java.awt.*;
public class Raam3{
public static void main(String argumendid[]) throws Exception{
Frame f=new Frame("Esimene");
f.setSize(200, 200);
f.setVisible(true);
Thread.sleep(1000);
f.setLocation(200, 100);
Thread.sleep(1000);
f.setLocation(400, 100);
}
}