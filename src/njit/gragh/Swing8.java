/*
 * ��32��ʵս4
 */
package njit.gragh;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.im.spi.InputMethodContext;

import javax.swing.*;

public class Swing8 extends JFrame{

	//�������
	JMenuBar menuBar;//�˵������
	JMenu fileMenu,editMenu,formatMenu,viewMenu,helpMenu;
	JMenuItem newSomething,save,saveAs,interfaceSettings,print,quit;
	JMenu xinjian;//�����˵�
	JMenuItem file,project;
	JTextArea textArea;
	JToolBar toolBar;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing8 sw8=new Swing8();
	}
	
	//���캯��
	public Swing8() {
		
		//�������
		toolBar=new JToolBar();
		jb1=new JButton(new ImageIcon("new"));
		jb1.setToolTipText("�½�");
		jb2=new JButton(new ImageIcon("open"));
		jb2.setToolTipText("��");
		jb3=new JButton(new ImageIcon("save"));
		jb4=new JButton(new ImageIcon("copy"));
		jb5=new JButton(new ImageIcon("cut"));
		jb6=new JButton(new ImageIcon("paste"));
		
		menuBar=new JMenuBar();
		
		fileMenu=new JMenu("�ļ���F��");
		fileMenu.setMnemonic('F');
		editMenu=new JMenu("�༭��E��");
		editMenu.setMnemonic('E');
		formatMenu=new JMenu("��ʽ��O��");
		formatMenu.setMnemonic('O');
		viewMenu=new JMenu("�鿴��V��");
		viewMenu.setMnemonic('V');
		helpMenu=new JMenu("������H��");
		helpMenu.setMnemonic('H');
		
		xinjian=new JMenu("�½�");
		file=new JMenuItem("�ļ�");
		project=new JMenuItem("����");
		
		newSomething=new JMenuItem("��",new ImageIcon(""));
		save=new JMenuItem("���棨S��");
		save.setMnemonic('S');
		//���˵�����ӿ�ݷ�ʽ
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		saveAs=new JMenuItem("���Ϊ");
		interfaceSettings=new JMenuItem("��������");
		print=new JMenuItem("��ӡ");
		quit=new JMenuItem("�˳�");
		
		textArea=new JTextArea();
		
		//����ť��ӵ���������
		toolBar.add(jb1);
		toolBar.add(jb2);
		toolBar.add(jb3);
		toolBar.add(jb4);
		toolBar.add(jb5);
		toolBar.add(jb6);
		
		xinjian.add(file);
		xinjian.add(project);
		
		fileMenu.add(xinjian);
		fileMenu.add(newSomething);
		fileMenu.add(save);
		fileMenu.add(saveAs);
		fileMenu.addSeparator();//��ӷָ���
		fileMenu.add(interfaceSettings);
		fileMenu.add(print);
		fileMenu.addSeparator();
		fileMenu.add(quit);
		
		//���˵���ӵ��˵�����
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);

		//���˵�����ӵ�������
		this.setJMenuBar(menuBar);
		
		//����������ӵ�������
		this.add(toolBar,BorderLayout.NORTH);
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		this.setTitle("���±�");
		this.setSize(500,400);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//������
		
		//�������
		
	}

}
