package com.SwingDome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JScrollBarDome implements AdjustmentListener
{
	private JScrollBar scrollBar1;
	private JScrollBar scrollBar2;
	private JPanel panel;
	private JLabel label1 = new JLabel("刻度", JLabel.CENTER);
	
	private JScrollBarDome()
	{
		JFrame frame = new JFrame("JScrollBarDemo");
		Container contentPane = frame.getContentPane();
		
		JLabel label = new JLabel();
		panel = new JPanel();
		panel.add(label);
		//产生一个垂直滚动轴，默认滚动轴位置在10刻度的地方，extent值设10，迷你母女值为0
		//maximan值为100，因此滚动轴一开始在刻度10的位置上。可滚动的区域大小为100-10-0=90刻度，滚动范围在0-90中
		
		scrollBar1 = new JScrollBar(JScrollBar.VERTICAL, 10, 10, 0, 100);
		scrollBar1.setUnitIncrement(1);//设置拖动拽滚动轴时，滚动轴刻度一次的变化量 //单元变量
		scrollBar1.setBlockIncrement(10);//设置当鼠标在滚动轴列按一下是，滚动轴一次所眺的区块大小//块变量
		scrollBar1.addAdjustmentListener(this);//调整监听器
		
		scrollBar2 = new JScrollBar();//建立一个空的JScrollBar
		scrollBar2.setOrientation(JScrollBar.HORIZONTAL);//设置滚动轴方向为水平方向
		scrollBar2.setValue(0);//设置默认滚动轴位置在0刻度的地方
		scrollBar2.setVisibleAmount(20);//extent值设为20
		scrollBar2.setMinimum(10);// minmum值设为10
		scrollBar2.setMaximum(60);//maximan值设为60，因为minmum值设为10，可滚动的区域大小为60-20-10=30
		//个刻度，滚动范围在10=40中
		scrollBar2.setBlockIncrement(5);
		//当鼠标在滚动轴列上按一下时，滚动轴一次所跳的区域大小为5个刻度
		scrollBar2.addAdjustmentListener(this);
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(scrollBar1, BorderLayout.EAST);
		contentPane.add(scrollBar2, BorderLayout.SOUTH);
		contentPane.add(label1, BorderLayout.NORTH);
		
		frame.setSize(new Dimension(200, 200));//Dimension尺寸
		frame.show();
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	// 实现adjustmentValueChanged方法。当用户改变转轴位置时，会将目前的滚动轴刻度写在labe2上。
	
	public static void main(String[] args)
	{
		new JScrollBarDome();
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if (e.getSource() == scrollBar1)
		{
			label1.setText("垂直刻度" + e.getValue());//e.getValue()所得的值与scrollBar1.getValue()所得的值一样。
			
		}
		if (e.getSource() == scrollBar2)
		{
			label1.setText("水平刻度" + e.getValue());
		}
	}
}
