/*
 * ��31��ʵս2
 */
package njit.gragh;

import java.awt.GridLayout;

import javax.swing.*;

public class Swing2 extends JFrame{

	//�������
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb1,jb2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing2 sw2=new Swing2();
	}
	
	public Swing2(){
		
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("�˺�");
		jl2=new JLabel("����");
		
		jb1=new JButton("ȷ��");
		jb2=new JButton("ȡ��");
		
		jtf=new JTextField(10);
		
		jpf=new JPasswordField(10);
		
		//������
		jp1.add(jl1);
		jp1.add(jtf);
		
		jp2.add(jl2);
		jp2.add(jpf);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//�������
		this.setLayout(new GridLayout(3,1));
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setTitle("VIP��½");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
