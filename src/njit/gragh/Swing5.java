/*
 * ��32��ʵս1
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing5 extends JFrame{

	public static void main(String[] args) {

		Swing5 sw5=new Swing5();
	}
	//�������
	JLabel jlb;
	JList<String> jlt;
	JSplitPane jsp;
		
	//���캯��
	public Swing5(){
		
		//�������
		jlb=new JLabel(new ImageIcon("images/00.jpg"));
		
		String []words={"love","you","me","I"};
		jlt=new JList<String>(words);
		
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlb,jlt);
		jsp.setOneTouchExpandable(true);

		//������
		
		//�������
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
