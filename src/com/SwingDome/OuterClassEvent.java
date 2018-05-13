package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 外部类作为事件监听器
 * */
public class OuterClassEvent extends JFrame implements ActionListener
{
	JButton btn;
	
	public OuterClassEvent()
	{
		super("java监听事件");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("点击");
		btn.addActionListener(new OuterClass(this));
		getContentPane().add(btn);
		
		setBounds(200, 200, 300, 160);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new OuterClassEvent();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Container c =getContentPane();
		c.setBackground(Color.blue);
	}
	
}

/*外部类×××××××××××××××××××××××*/
class OuterClass implements ActionListener
{
	OuterClassEvent oce;
	
	public OuterClass(OuterClassEvent oce)
	{
		this.oce = oce;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Container c = new Container();
		c.setBackground(Color.blue);
	}
}

