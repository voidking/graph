package njit.gragh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GuiDemo2 extends JFrame implements ActionListener {  
  
    GuiDemo2() {  
        JPanel panel = new JPanel();  
        JButton button1 = new JButton("按钮一");  
        JButton button2 = new JButton("按钮二");  
  
        panel.add(button1);  
        panel.add(button2);  
        this.getContentPane().add(panel);  
        this.setVisible(true);  
          
        button1.addActionListener(this);  
        button2.addActionListener(this);  
  
    }  
  
    public void actionPerformed(ActionEvent e) {  
        String source = e.getActionCommand();  
        if (source.equals("按钮一")) {  
            System.out.println("你按了按钮一");  
        }  
        if (source.equals("按钮二")) {  
            System.out.println("你按了按钮二");  
        }  
    }  
  
    public static void main(String args[]) {  
        new GuiDemo2();  
  
    }  
}  
