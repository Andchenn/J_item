package com.SwingDome;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Text extends JFrame
{
	private static final long serialVersionUID=1L;
	
	public static void main(String[] args)
	{
		new Text().init();
	}
	
	private void init()
	{
		this.setSize(300,300);
		JPanel jp=new JPanel();
		final JTextField jf1=new JTextField(null,10);
		final JTextField jf2=new JTextField(null,10);
		
		jf1.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				if (e.getKeyChar()==13)
				{
					jf2.setText(jf1.getText());
				}
			}
		});
		jp.add(jf1);
		jp.add(jf2);
		this.add(jp);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
