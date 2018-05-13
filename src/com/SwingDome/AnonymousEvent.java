package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousEvent extends JFrame
{
	JButton button;
	
	public AnonymousEvent()
	{
		super("java监听事件");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button=new JButton("点击");
		/*匿名内部类**********************/
		button.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						Container c=getContentPane();
						c.setBackground(Color.blue);
					
					}
				}
		);
		/*****************************/
		getContentPane().add(button);
		
		setBounds(200,200,300,160);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new AnonymousEvent();
	}
}
