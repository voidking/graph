package njit.gragh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GuiDemo2 extends JFrame implements ActionListener {  
  
    GuiDemo2() {  
        JPanel panel = new JPanel();  
        JButton button1 = new JButton("��ťһ");  
        JButton button2 = new JButton("��ť��");  
  
        panel.add(button1);  
        panel.add(button2);  
        this.getContentPane().add(panel);  
        this.setVisible(true);  
          
        button1.addActionListener(this);  
        button2.addActionListener(this);  
  
    }  
  
    public void actionPerformed(ActionEvent e) {  
        String source = e.getActionCommand();  
        if (source.equals("��ťһ")) {  
            System.out.println("�㰴�˰�ťһ");  
        }  
        if (source.equals("��ť��")) {  
            System.out.println("�㰴�˰�ť��");  
        }  
    }  
  
    public static void main(String args[]) {  
        new GuiDemo2();  
  
    }  
}  
