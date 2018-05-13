package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* 自身类作为事件监听器
*/
public class ThisClassEvent extends JFrame implements ActionListener
{
	JButton btn;
	
	public ThisClassEvent()
	{
		super("java事件监听机制");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn=new JButton("点击");
		btn.addActionListener(this);
		getContentPane().add(btn);
		setBounds(200,200,300,160);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Container c=getContentPane();
		c.setBackground(Color.red);
	}
	
	public static void main(String[] args)
	{
		new ThisClassEvent();
	}
}
