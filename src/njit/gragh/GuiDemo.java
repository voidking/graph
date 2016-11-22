package njit.gragh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GuiDemo extends JFrame implements ActionListener{
	
	//�������
	JMenuBar menuBar;//�˵������
	JMenu fileMenu,editMenu,formatMenu,viewMenu;
	JTextArea textArea;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiDemo();
	}
	
	//���캯��
	public GuiDemo() {
		
		//�������	
		menuBar=new JMenuBar();
		
		fileMenu=new JMenu("�ļ���F��");
		fileMenu.setMnemonic('F');
		
		JMenuItem newFile = new JMenuItem("�½�");
		newFile.addActionListener(this);
		newFile.setActionCommand("newFile");
		JMenuItem save = new JMenuItem("����");
		save.addActionListener(this);
		save.setActionCommand("save");
		fileMenu.add(newFile);
		fileMenu.add(save);
		
		editMenu=new JMenu("�༭��E��");
		editMenu.setMnemonic('E');
		formatMenu=new JMenu("��ʽ��O��");
		formatMenu.setMnemonic('O');
		viewMenu=new JMenu("�鿴��V��");
		viewMenu.setMnemonic('V');
		
		textArea=new JTextArea();
		
		//���˵���ӵ��˵�����
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		
		

		//���˵�����ӵ�������
		this.setJMenuBar(menuBar);
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		this.setTitle("���±�");
		this.setSize(500,400);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("newFile")){
			textArea.append("�½�");
		}else if(e.getActionCommand().equals("save")){
			textArea.append("����");
		}
	}
}
