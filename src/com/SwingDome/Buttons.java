package com.SwingDome;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import sun.java2d.Surface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame
{
	JButton btn1,btn2,btn3;
	
	public Buttons()
	{
		super("java事件监听");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1=new JButton("点击1");
		btn2=new JButton("点击2");
		btn3=new JButton("点击3");
		
		btn1.addActionListener(new InnerClass());
		getContentPane().add(btn1);
		
		btn2.addActionListener(new InnerClass1());
		getContentPane().add(btn2);
		
		btn3.addActionListener(new InnerClass2());
		getContentPane().add(btn3);
		
		setBounds(200,200,300,160);
		setVisible(true);
	}
	
	class InnerClass implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Container c=getContentPane();
			c.setBackground(Color.blue);
		
		}
	}
	
	class InnerClass1 implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Container c1=getContentPane();
			c1.setBackground(Color.pink);
			
		}
	}
	
	class InnerClass2 implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Container c2= getContentPane();
			c2.setBackground(Color.red);
			
		}
	}
	public static void main(String[] args)
	{
		new Buttons();
	}
}
