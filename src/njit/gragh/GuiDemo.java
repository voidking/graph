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
	
	//定义组件
	JMenuBar menuBar;//菜单条组件
	JMenu fileMenu,editMenu,formatMenu,viewMenu;
	JTextArea textArea;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiDemo();
	}
	
	//构造函数
	public GuiDemo() {
		
		//创建组件	
		menuBar=new JMenuBar();
		
		fileMenu=new JMenu("文件（F）");
		fileMenu.setMnemonic('F');
		
		JMenuItem newFile = new JMenuItem("新建");
		newFile.addActionListener(this);
		newFile.setActionCommand("newFile");
		JMenuItem save = new JMenuItem("保存");
		save.addActionListener(this);
		save.setActionCommand("save");
		fileMenu.add(newFile);
		fileMenu.add(save);
		
		editMenu=new JMenu("编辑（E）");
		editMenu.setMnemonic('E');
		formatMenu=new JMenu("格式（O）");
		formatMenu.setMnemonic('O');
		viewMenu=new JMenu("查看（V）");
		viewMenu.setMnemonic('V');
		
		textArea=new JTextArea();
		
		//将菜单添加到菜单条上
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		
		

		//将菜单条添加到窗体上
		this.setJMenuBar(menuBar);
		
		JScrollPane jsp=new JScrollPane(textArea);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		this.setTitle("记事本");
		this.setSize(500,400);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("newFile")){
			textArea.append("新建");
		}else if(e.getActionCommand().equals("save")){
			textArea.append("保存");
		}
	}
}
