package com.SwingDome;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import sun.print.SunMinMaxPage;
import sun.security.provider.Sun;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class J509 extends Applet implements ActionListener
{
	JTextArea textA;
	JTextField textF;
	JButton btn1,btn2;
	public void run()
	{
		setSize(250,150);
		textA=new JTextArea("",5,10);
		textA.setBackground(Color.cyan);
		textF=new JTextField("",10);
		textF.setBackground(Color.pink);
		
		btn1=new JButton("求和");
		btn2=new JButton("重新启动");
		textF.setEditable(false);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		add(textA);
		add(textF);
		add(btn1);
		add(btn2);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btn1)
		{
			String s=textA.getText();
			StringTokenizer token=new StringTokenizer(s);
			//使用默认的分隔符集合：空格、换行、tab符号回车作分隔符
			int n=token.countTokens(),sum=0,i;
			for (int j = 0; j < n-1; j++)
			{
				String temp=token.nextToken();//从文本区取下一个数据
				sum+=Integer.parseInt(temp);
				
			}
			textF.setText(""+sum);
			
		}
		else if (e.getSource()==btn2)
		{
			textA.setText(null);
			textF.setText(null);
		}
	
	}
	
	public static void main(String[] args)
	{
		J509 j509=new J509();
		j509.run();
	}
}
