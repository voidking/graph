/*
 * ��31��ʵս3
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;

public class Swing3 extends JFrame{

	//�������
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	JButton jb1,jb2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing3 sw3=new Swing3();
	}
	//���캯��
	public Swing3(){
		
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("�˶�");
		jl2=new JLabel("�Ա�");
		
		jcb1=new JCheckBox("����");
		jcb2=new JCheckBox("����");
		jcb3=new JCheckBox("����");
		
		jrb1=new JRadioButton("��");
		jrb2=new JRadioButton("Ů");
		
		jb1=new JButton("ע��");
		jb2=new JButton("ȡ��");
		
		//������
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
		
		//�������
		this.setLayout(new GridLayout(3,1));
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setTitle("ע�ὡ��");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

}
