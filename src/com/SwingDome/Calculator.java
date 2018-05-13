package com.SwingDome;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame//自定义类文件，必须继承JFrame框架
{
	//定义组件
	JMenuBar jmb;//菜单栏
	JMenu[] jm;
	JMenuItem[] jmi;
	JTextField jtf;//文本区域
	JButton[] jb;
	
	public static void main(String[] args)
	{
		new Calculator();
	}
	
	public Calculator()//添加构造函数
	{
		//创建组件
		jmb = new JMenuBar();
		jm = new JMenu[3];
		jm[0] = new JMenu("查询（v）");
		jm[1] = new JMenu("编辑（E）");
		jm[2] = new JMenu("帮助（H）");
		
		jmi = new JMenuItem[4];
		jmi[0] = new JMenuItem("标准型（T）");
		jmi[1] = new JMenuItem("复制（C）");
		jmi[2] = new JMenuItem("粘贴（P）");
		jmi[3] = new JMenuItem("关于（A）");
		
		jtf = new JTextField("0");
		
		jb = new JButton[28];
		jb[0] = new JButton("MC");
		jb[1] = new JButton("MR");
		jb[2] = new JButton("MS");
		jb[3] = new JButton("M+");
		jb[4] = new JButton("M-");
		jb[5] = new JButton("Backspace");
		jb[6] = new JButton("CE");
		jb[7] = new JButton("C");
		jb[8] = new JButton("+/-");
		jb[9] = new JButton("sqrt");
		jb[10] = new JButton("7");
		jb[11] = new JButton("8");
		jb[12] = new JButton("9");
		jb[13] = new JButton("/");
		jb[14] = new JButton("%");
		jb[15] = new JButton("4");
		jb[16] = new JButton("5");
		jb[17] = new JButton("6");
		jb[18] = new JButton("*");
		jb[19] = new JButton("1/x");
		jb[20] = new JButton("1");
		jb[21] = new JButton("2");
		jb[22] = new JButton("3");
		jb[23] = new JButton("-");
		jb[24] = new JButton("=");
		jb[25] = new JButton("0");
		jb[26] = new JButton(".");
		jb[27] = new JButton("+");
		
		initGUI();//设置布局，添加按钮去
		
		//设置窗口属性
		this.setTitle("使用Java制作的简易计算器	by毛二");//基础属性
		this.setIconImage(new ImageIcon("熊猫.jpg").getImage());//设置窗口标题
		this.setSize(400,250);//设置大小，按像素
		this.setLocation(200,200);//设置初始化位置，默认是屏幕最左上角
		this.setVisible(true);//让它显示，位置可变
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认到关闭操作，不然Java虚拟机还没关闭
		
	}
	
	//设置布局
	private void initGUI()
	{
		this.setJMenuBar(jmb);
		jmb.add(jm[0]);
		jmb.add(jm[1]);
		jmb.add(jm[2]);
		
		jm[0].add(jmi[0]);
		jm[1].add(jmi[1]);
		jm[1].add(jmi[2]);
		jm[2].add(jmi[3]);
		
		jtf.setEditable(false);//文本框不可编辑
		GridBagLayout gridBag=new GridBagLayout();
		GridBagConstraints c=new GridBagConstraints();//Constraints 约束
		setLayout(gridBag);
		
		c.weightx=0.01;//容器上的计算机各个部件成一个布局，这个参数，可以把容器和窗体合二为一，不会出现窗体过大而容器还留有空隙
		c.weighty=0.01;
		c.fill=GridBagConstraints.BOTH;
		
		//文本框
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=5;
		c.gridheight=2;
		add(jtf,c);
		
		//MC
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;//横占一个单元格
		c.gridheight=1;//列占一个单元格
		addButton(jb[0],gridBag,c);//添加按钮到面板布局
		
		//MR
		c.gridx=1;//换行，放置组件，只需要修改参数就行，其他参数暂时不变
		addButton(jb[1],gridBag,c);
		
		//MS
		c.gridx=2;
		addButton(jb[2],gridBag,c);
		
		//M+
		c.gridx=3;
		addButton(jb[3],gridBag,c);
		
		//M-
		c.gridx=4;
		addButton(jb[4],gridBag,c);
		
		//Backspace
		c.gridx = 0;
		c.gridy = 3;
		addButton(jb[5],gridBag,c);
		//CE
		c.gridx = 1;
		addButton(jb[6],gridBag,c);
		//C
		c.gridx = 2;
		addButton(jb[7],gridBag,c);
		//+/-
		c.gridx = 3;
		addButton(jb[8],gridBag,c);
		//Sqrt
		c.gridx = 4;
		addButton(jb[9],gridBag,c);
		
		//7
		c.gridx = 0;
		c.gridy = 4;
		addButton(jb[10],gridBag,c);
		//8
		c.gridx = 1;
		addButton(jb[11],gridBag,c);
		//9
		c.gridx = 2;
		addButton(jb[12],gridBag,c);
		///
		c.gridx = 3;
		addButton(jb[13],gridBag,c);
		//%
		c.gridx = 4;
		addButton(jb[14],gridBag,c);
		
		//4
		c.gridx = 0;
		c.gridy = 5;
		addButton(jb[15],gridBag,c);
		//5
		c.gridx = 1;
		addButton(jb[16],gridBag,c);
		//6
		c.gridx = 2;
		addButton(jb[17],gridBag,c);
		//*
		c.gridx = 3;
		addButton(jb[18],gridBag,c);
		//1/x
		c.gridx = 4;
		addButton(jb[19],gridBag,c);
		
		//1
		c.gridx = 0;
		c.gridy = 6;
		addButton(jb[20],gridBag,c);
		//2
		c.gridx = 1;
		addButton(jb[21],gridBag,c);
		//3
		c.gridx = 2;
		addButton(jb[22],gridBag,c);
		//-
		c.gridx = 3;
		addButton(jb[23],gridBag,c);
		//=
		c.gridx = 4;
		c.gridy = 6;
		c.gridheight = 2; //重新设置列，列占二个单元格
		addButton(jb[24],gridBag,c);
		
		//0
		c.gridx = 0;
		c.gridy = 7;
		c.gridwidth = 2; // 重新设置横，横占二个单元格
		c.gridheight = 1; // 恢复列，列占一个单元格
		addButton(jb[25],gridBag,c);
		//.
		c.gridx = 2;
		c.gridwidth = 1; // 恢复横，横占一个单元格
		addButton(jb[26],gridBag,c);
		//+
		c.gridx = 3;
		addButton(jb[27],gridBag,c);
	}
	
	//添加按钮到面板布局
	private void addButton(JButton jButton, GridBagLayout gridBag, GridBagConstraints c)
	{
		gridBag.setConstraints(jButton,c);
		add(jButton);
	}
	
	
}
