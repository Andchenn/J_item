package com.SwingDome;

import javax.swing.*;
import java.awt.*;

public class Student
{
	private JFrame frame=new JFrame("学生表");//框架
	private Container c=frame.getContentPane();  //容器
	private JTextField name=new JTextField();  //文本域
	private JTextField sex=new JTextField();  //文本域
	private JTextField age=new JTextField();  //文本域
	//private JPasswordField password=new JPasswordField();//密码域
	//private JButton ok=new JButton("确定");
	//private JButton cancel=new JButton("取消");
	
	public Student()//构造函数
	{
		frame.setSize(300,200);
		c.setLayout(new BorderLayout());//网格布局
		
		initFrame();//初始化
		frame.setVisible(true);
	}
	
	private void initFrame()
	{
		//顶部
		JPanel titlePanel=new JPanel();
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(new JLabel("学生信息"));
		c.add(titlePanel,"North");
		
		//中部表单
		JPanel filedPanel=new JPanel();
		filedPanel.setLayout(null);
		JLabel l1=new JLabel("姓名：");
		l1.setBounds(50,20,50,20);
		JLabel l2=new JLabel("性别：");
		l2.setBounds(50,60,50,20);
		JLabel l3=new JLabel("年龄：");
		l3.setBounds(50,100,50,20);
		filedPanel.add(l1);
		filedPanel.add(l2);
		filedPanel.add(l3);
		
		name.setBounds(110,20,120,20);
		sex.setBounds(110,60,120,20);
		age.setBounds(110,100,120,20);
		
		filedPanel.add(name);
		filedPanel.add(sex);
		filedPanel.add(age);
		c.add(filedPanel,"Center");
		
		/*//底部按钮
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(ok);
		buttonPanel.add(cancel);
		c.add(buttonPanel,"South");*/
		
	}
	
	public static void main(String[] args)
	{
		new Student();
	}
	
}
