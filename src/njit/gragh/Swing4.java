/*
 * ��31��ʵս4
 */
package njit.gragh;

import java.awt.*;

import javax.swing.*;

public class Swing4 extends JFrame{

	//�������
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
		
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("����");
		jl2=new JLabel("���εص�");
		
		String []jg={"����","����","����","�㽭"};
		jcb=new JComboBox<String>(jg);
		
		String []dd={"��կ��","����","�ʹ�","�������"};
		jlt=new JList<String>(dd);
		jlt.setVisibleRowCount(2);
		jsp=new JScrollPane(jlt);
		
		//������
		jp1.add(jl1);
		jp1.add(jcb);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		//�������
		this.setLayout(new GridLayout(2,1));
		
		this.add(jp1);
		this.add(jp2);
		
		this.setTitle("����ָ��");
		this.setSize(300,200);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

}
