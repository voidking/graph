/*
 * 第32讲实战1
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing5 extends JFrame{

	public static void main(String[] args) {

		Swing5 sw5=new Swing5();
	}
	//定义组件
	JLabel jlb;
	JList<String> jlt;
	JSplitPane jsp;
		
	//构造函数
	public Swing5(){
		
		//创建组件
		jlb=new JLabel(new ImageIcon("images/00.jpg"));
		
		String []words={"love","you","me","I"};
		jlt=new JList<String>(words);
		
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlb,jlt);
		jsp.setOneTouchExpandable(true);

		//组合组件
		
		//布局组件
		//this.add(jlb);
		//this.add(jlt);
		this.add(jsp);
		
		this.setTitle("QQLOVE");
		this.setSize(500,400);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

}
