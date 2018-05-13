package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextFile extends JTextField implements ActionListener
{
	TextFile()
	{
		super();
	}
	
	TextFile(int lenght)
	{
		super(lenght);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JTextField textField= (JTextField) e.getSource();
		this.setText(textField.getText());
	}
}

class TextFileActionEventFrame extends Frame
{
	TextFileActionEventFrame()
	{
		super();
		setSize(300,200);
		setTitle("文本框动作事件实例");
		JTextField t=new JTextField(10);
		TextFile t1=new TextFile(10);
		t.addActionListener(t1);
		JLabel jLabel=new JLabel(">=");
		JPanel panel=new JPanel();
		panel.add(t);
		
		this.pack();
		this.setVisible(true);
	}
	
	private AWTEventMulticaster getContentPane()
	{
		return null;
	}
}
public class TextFileActionDome
{
	public static void main(String[] args)
	{
		TextFileActionEventFrame textFileActionEventFrame=new TextFileActionEventFrame();
	}
}
