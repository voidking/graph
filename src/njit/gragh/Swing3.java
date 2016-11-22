/*
 * 第31讲实战3
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing3 extends JFrame{

	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	JButton jb1,jb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing3 sw3=new Swing3();
	}
	//构造函数
	public Swing3(){
		
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("运动");
		jl2=new JLabel("性别");
		
		jcb1=new JCheckBox("篮球");
		jcb2=new JCheckBox("足球");
		jcb3=new JCheckBox("网球");
		
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		jb1=new JButton("注册");
		jb2=new JButton("取消");
		
		//组合组件
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		//布局组件
		this.setLayout(new GridLayout(3,1));
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setTitle("注册健身");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

}
