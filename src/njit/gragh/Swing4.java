/*
 * 第31讲实战4
 */
package njit.gragh;

import java.awt.*;

import javax.swing.*;

public class Swing4 extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox<String> jcb;
	JList<String> jlt;
	JScrollPane jsp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing4 sw4=new Swing4();
	}
	public Swing4(){
		
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("籍贯");
		jl2=new JLabel("旅游地点");
		
		String []jg={"江苏","北京","云南","浙江"};
		jcb=new JComboBox<String>(jg);
		
		String []dd={"九寨沟","西湖","故宫","香格里拉"};
		jlt=new JList<String>(dd);
		jlt.setVisibleRowCount(2);
		jsp=new JScrollPane(jlt);
		
		//组合组件
		jp1.add(jl1);
		jp1.add(jcb);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		//布局组件
		this.setLayout(new GridLayout(2,1));
		
		this.add(jp1);
		this.add(jp2);
		
		this.setTitle("旅游指南");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

}
