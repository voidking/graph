/*
 * ��32��ʵս3
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing7 extends JFrame{

	//1.�������
	
	//����
	JLabel jl1;
	
	//�в�
	JTabbedPane jtp;
	JPanel jp2,jp3,jp4;
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	
	//�ϲ�
	JButton jb1,jb2,jb3;
	JPanel jp1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing7 sw7=new Swing7();
	}
	//���캯��
	public Swing7(){
		
		//2.�������
		//����
		jl1=new JLabel(new ImageIcon("images/tou.gif"));
		
		//�в�
		
		jp2=new JPanel();
		jp2.setLayout(new GridLayout(3, 3));
		
		jp3=new JPanel();
		jp3.setBackground(Color.black);
		
		jp4=new JPanel();
		jp4.setBackground(Color.yellow);
		
		jl2=new JLabel("QQ����",JLabel.CENTER);
	    jl3=new JLabel("QQ����",JLabel.CENTER);
	    jl4=new JLabel("��������",JLabel.CENTER);

		jl4.setFont(new Font("����",Font.PLAIN,16));
	    jl4.setForeground(Color.BLUE);//����������ɫ
	    
	    jl5=new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
	    jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//�����������

		
		jtf=new JTextField(10);
		jpf=new JPasswordField(10);
		jb4=new JButton(new ImageIcon("images/clear.gif"));
		jcb1=new JCheckBox("�����½");
		jcb2=new JCheckBox("��ס����");
		
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		
		jtp=new JTabbedPane();
		jtp.add("QQ����",jp2);
	    jtp.add("�ֻ�����",jp3);
	    jtp.add("��������",jp4);

		//�ϲ�
		jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jb2=new JButton(new ImageIcon("images/quxiao.gif"));
		jb3=new JButton(new ImageIcon("images/xiangdao.gif"));
		
		jp1=new JPanel();
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		//������
		
		//�������
		this.add(jl1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		this.add(jtp,BorderLayout.CENTER);
		
		this.setIconImage((new ImageIcon("images/qq.gif")).getImage());
		this.setTitle("����QQ");
		this.setSize(340,240);
		this.setLocation(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
