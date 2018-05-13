package com.SwingDome;

import javax.swing.*;
import java.awt.*;

public class Place extends JFrame
{
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox jcb;
	JList jList;
	JScrollPane jsp;
	
	public static void main(String[] args)
	{
		new Place();
	}
	
	public Place()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("你的籍贯");
		jl2=new JLabel("旅游地点");
		
		String[] jg={"上海","北京","深圳","广州"};
		jcb=new JComboBox(jg);
		
		
		String[] s={"九寨沟","故宫","长城","天安门"};
		jList=new JList(s);
		
		
		jList.setVisibleRowCount(1);
		jsp=new JScrollPane(jList);
		
		this.setLayout(new GridLayout(2,1));
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		this.setSize(200,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
