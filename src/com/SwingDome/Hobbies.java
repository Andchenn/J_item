package com.SwingDome;

import javax.swing.*;
import java.awt.*;

public class Hobbies extends JFrame
{
	JPanel jPanel1,jPanel2,jPanel3;
	JLabel jLabel1,jLabel2;
	JCheckBox jcb1,jcb2,jcb3;
	ButtonGroup bg;
	JRadioButton jrb1,jrb2;
	JButton jButton1,jButton2;
	
	public static void main(String[] args)
	{
		new Hobbies();
	}
	
	public Hobbies()
	{
		jPanel1=new JPanel();
		jPanel2=new JPanel();
		jPanel3=new JPanel();
		
		jLabel1=new JLabel("你喜欢的运动：");
		jLabel2=new JLabel("你的性别：");
		
		jcb1=new JCheckBox("足球");
		jcb2=new JCheckBox("篮球");
		jcb3=new JCheckBox("网球");
		
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		jButton1=new JButton("注册用户");
		jButton2=new JButton("取消用户");
		
		this.setLayout(new GridLayout(3,1));
		this.add(jPanel1);
		this.add(jPanel2);
		this.add(jPanel3);
		
		jPanel1.add(jLabel1);
		jPanel1.add(jcb1);
		jPanel1.add(jcb2);
		jPanel1.add(jcb3);
		
		jPanel2.add(jLabel2);
		jPanel2.add(jrb1);
		jPanel2.add(jrb2);
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		this.setSize(300,150);
		this.setLocation(300,150);
		this.setBackground(Color.pink);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
