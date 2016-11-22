/*
 * 第32讲实战4
 */
package njit.gragh;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.im.spi.InputMethodContext;

import javax.swing.*;

public class Swing8 extends JFrame{

	//定义组件
	JMenuBar menuBar;//菜单条组件
	JMenu fileMenu,editMenu,formatMenu,viewMenu,helpMenu;
	JMenuItem newSomething,save,saveAs,interfaceSettings,print,quit;
	JMenu xinjian;//二级菜单
	JMenuItem file,project;
	JTextArea textArea;
	JToolBar toolBar;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing8 sw8=new Swing8();
	}
	
	//构造函数
	public Swing8() {
		
		//创建组件
		toolBar=new JToolBar();
		jb1=new JButton(new ImageIcon("new"));
		jb1.setToolTipText("新建");
		jb2=new JButton(new ImageIcon("open"));
		jb2.setToolTipText("打开");
		jb3=new JButton(new ImageIcon("save"));
		jb4=new JButton(new ImageIcon("copy"));
		jb5=new JButton(new ImageIcon("cut"));
		jb6=new JButton(new ImageIcon("paste"));
		
		menuBar=new JMenuBar();
		
		fileMenu=new JMenu("文件（F）");
		fileMenu.setMnemonic('F');
		editMenu=new JMenu("编辑（E）");
		editMenu.setMnemonic('E');
		formatMenu=new JMenu("格式（O）");
		formatMenu.setMnemonic('O');
		viewMenu=new JMenu("查看（V）");
		viewMenu.setMnemonic('V');
		helpMenu=new JMenu("帮助（H）");
		helpMenu.setMnemonic('H');
		
		xinjian=new JMenu("新建");
		file=new JMenuItem("文件");
		project=new JMenuItem("工程");
		
		newSomething=new JMenuItem("打开",new ImageIcon(""));
		save=new JMenuItem("保存（S）");
		save.setMnemonic('S');
		//给菜单项添加快捷方式
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		saveAs=new JMenuItem("另存为");
		interfaceSettings=new JMenuItem("界面设置");
		print=new JMenuItem("打印");
		quit=new JMenuItem("退出");
		
		textArea=new JTextArea();
		
		//将按钮添加到工具条上
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
		fileMenu.addSeparator();//添加分割线
		fileMenu.add(interfaceSettings);
		fileMenu.add(print);
		fileMenu.addSeparator();
		fileMenu.add(quit);
		
		//将菜单添加到菜单条上
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);

		//将菜单条添加到窗体上
		this.setJMenuBar(menuBar);
		
		//将工具条添加到窗体上
		this.add(toolBar,BorderLayout.NORTH);
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		this.setTitle("记事本");
		this.setSize(500,400);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//组合组件
		
		//布局组件
		
	}

}
