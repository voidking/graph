/*
 * 第32讲实战2
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing6 extends JFrame{

	//定义组件
	JTextArea jta=null;
	JScrollPane jsp=null;
	JPanel jp=null;
	JComboBox<String> jcb=null;
	JTextField jtf=null;
	JButton jbt=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing6 sw6=new Swing6();
	}
	
	//构造函数
	public Swing6(){
		
		//创建组件
		jta=new JTextArea();
		
		jsp=new JScrollPane(jta);
		
		jp=new JPanel();
		
		String []name={"高富帅","小黑","小杰","老胡","小胖"};
		jcb=new JComboBox<String>(name);
		
		jtf=new JTextField(10);
		
		jbt=new JButton("发送");
		
		//组合组件
		jp.add(jcb);
		jp.add(jtf);
		jp.add(jbt);
		
		//布局组件
		this.add(jsp);
		this.add(jp,BorderLayout.SOUTH);
		
		this.setIconImage((new ImageIcon("images/qq.gif")).getImage());
		this.setTitle("QQ");
		this.setSize(500,400);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
