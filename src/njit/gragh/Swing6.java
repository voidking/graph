/*
 * ��32��ʵս2
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing6 extends JFrame{

	//�������
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
	
	//���캯��
	public Swing6(){
		
		//�������
		jta=new JTextArea();
		
		jsp=new JScrollPane(jta);
		
		jp=new JPanel();
		
		String []name={"�߸�˧","С��","С��","�Ϻ�","С��"};
		jcb=new JComboBox<String>(name);
		
		jtf=new JTextField(10);
		
		jbt=new JButton("����");
		
		//������
		jp.add(jcb);
		jp.add(jtf);
		jp.add(jbt);
		
		//�������
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
