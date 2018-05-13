package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassEvent extends JFrame
{
	JButton btn;
	
	public InnerClassEvent()
	{
		super("java事件监听");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn=new JButton("点击");
		btn.addActionListener(new InnerClass());
		getContentPane().add(btn);
		
		setBounds(200,200,300,160);
		setVisible(true);
	}
	
	/*内部类********************************/
	class InnerClass implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Container c=getContentPane();
			c.setBackground(Color.blue);
		
		}
	}
	
	public static void main(String[] args)
	{
		new InnerClassEvent();
	}
	
}
