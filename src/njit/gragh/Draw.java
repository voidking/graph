/*
 * 绘图
 */

package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Draw extends JFrame{


	public static void main(String[] args) {
		Draw draw=new Draw();
	}
	
	MyPanel mp=null;	
	public Draw () {
		
		mp=new MyPanel();
	      
	    this.add(mp);
	    this.setSize(600, 500);
	    this.setLocation(100,100);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);

	}
	

}
	
class MyPanel extends JPanel{
	
	//覆盖JPanel的paint方法
	//Graphics是绘图的重要类，相当于画笔
	public void paint(Graphics g){
		
		super.paint(g);
		System.out.println("paint被调用");
		g.drawOval(30, 30, 30, 30);
		g.drawLine(10, 10, 30, 30);
		g.drawRect(20, 20, 40, 30);
		
		g.setColor(Color.yellow);
		g.fillRect(80, 80, 40, 40);
		
		g.setColor(Color.blue);
		g.fillRect(100, 100, 10,10);
		
		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/00.jpg"));
		g.drawImage(im,300,300,200,150,this);
		
		g.setColor(Color.red);
	    g.setFont(new Font("隶书 ",Font.BOLD,50));
	    g.drawString("祖国万岁", 180, 60);

		
		
	}
}