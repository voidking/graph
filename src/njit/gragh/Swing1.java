/*
 * 第31讲实战1
 */
package njit.gragh;
import java.awt.BorderLayout;

import javax.swing.*;


public class Swing1 extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing1 sw1=new Swing1();

	}
	public Swing1(){
		
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("西瓜");
		jb2=new JButton("苹果");
		jb3=new JButton("荔枝");
		jb4=new JButton("葡萄");
		jb5=new JButton("橘子");
		jb6=new JButton("香蕉");
		
		//设置布局管理器
		
		//添加JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		this.setTitle("水果拼盘");
		this.setSize(300,300);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
