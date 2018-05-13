package com.SwingDome;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame
{
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JTextField jtf;
	JPasswordField jpf;
	
	JButton jb1,jb2;
	
	
	public static void main(String[] args)
	{
		new Login();
	}
	
	public Login()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("用户名：");
		jl2=new JLabel("密码：");
		
		jtf=new JTextField(10);
		jpf=new JPasswordField(10);
		
		jb1=new JButton("确定");
		jb2=new JButton("取消");
		
		this.setLayout(new GridLayout(3,1));
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		jp1.add(jl1);
		jp1.add(jtf);
		jp2.add(jl2);
		jp2.add(jpf);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.setTitle("常用组件");
		this.setSize(200,200);
		this.setLocation(200,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
