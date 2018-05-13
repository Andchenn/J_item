package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class LoginFrame implements ActionListener
{
	JButton btnOk,btnCancel;
	JTextField tfName;
	JPasswordField tpPwd;
	JLabel jl1,jl2;
	
	public LoginFrame()
	{
	
	}
	public void addComponentsToPane(Container pane)
	{
		btnOk =new JButton("确定");
		btnOk.addActionListener(this);
		btnCancel=new JButton("取消");
		btnCancel.addActionListener(this);
		
		jl1=new JLabel("用户名：");
		jl2=new JLabel("密码：");
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton button= (JButton) e.getSource();
		if (button==btnOk)
		{
			checkAccount();
		}else {
			resetAccount();
		}
		
	}
	
	//重置用户账户文本框和密码框
	private void resetAccount()
	{
		tfName.setText("");
		tpPwd.setText("");
		tfName.requestFocusInWindow();
	}
	
	private void checkAccount()
	{
		String userName=tfName.getText().trim();
		char[] password=tpPwd.getPassword();
		String passWord=new String(password).trim();
		if (userName.length()==0)
		{
			JOptionPane.showMessageDialog(null,"账户不能为空，请重新输入！","警告",JOptionPane.WARNING_MESSAGE);
			tfName.requestFocusInWindow();//强制账户文本框获得焦点
		}else if (passWord.length()==0){
			JOptionPane.showMessageDialog(null,"密码不能为空，请重新输入！","警告",JOptionPane.WARNING_MESSAGE);
			tpPwd.requestFocusInWindow();
			
		}else if (!passWord.equals("123456"))
		{
			JOptionPane.showMessageDialog(null,"密码不确定,请重新输入！","警告",JOptionPane.WARNING_MESSAGE);
			tpPwd.setText("");
			tpPwd.requestFocusInWindow();
		}else {
			JOptionPane.showMessageDialog(null,"恭喜你，你已经登录成功！","登录提示",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		new LoginFrame();
	}
	
}
