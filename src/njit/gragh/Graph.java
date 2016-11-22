/*
 * 
 */
package njit.gragh;

import java.awt.*;
import javax.swing.*;


public class Graph extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph gr = new Graph();

	}
	
	JButton jb1 = null;
	public Graph(){
	
		
		JButton jb1=new JButton("Hello! Java world £¡");
		
		this.setTitle("Hello,graph!");
		
		this.setLocation(500,500);
		
		this.setSize(200,200);
		
		this.add(jb1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
