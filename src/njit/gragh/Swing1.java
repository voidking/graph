/*
 * ��31��ʵս1
 */
package njit.gragh;
import java.awt.BorderLayout;

import javax.swing.*;


public class Swing1 extends JFrame{

	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing1 sw1=new Swing1();

	}
	public Swing1(){
		
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("����");
		jb2=new JButton("ƻ��");
		jb3=new JButton("��֦");
		jb4=new JButton("����");
		jb5=new JButton("����");
		jb6=new JButton("�㽶");
		
		//���ò��ֹ�����
		
		//���JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		this.setTitle("ˮ��ƴ��");
		this.setSize(300,300);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
