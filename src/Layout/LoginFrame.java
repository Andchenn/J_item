package Layout;

import javax.swing.*;
import java.awt.*;

public class LoginFrame
{
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				//关闭粗体字显示
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				new LoginFrame().createAndShowGUI();
			}
		});
	}
	
	public void addComponentsToPane(Container pane)
	{
		JButton buttonOk, buttonCancel;//创建按钮对象
		JLabel labelName, labelPassword;//创建标签对象
		JTextField textFieldName;//创建文本框对象
		JPasswordField textFieldPwd;//创建密码框对象
		JPanel topPane = new JPanel();//放置标签和文本框的面板
		//设为网格包布局（GridBagLayout）
		topPane.setLayout(new GridBagLayout());
		JPanel buttomPane = new JPanel();//放置确定和取消按钮的面板
		FlowLayout flowLayout = new FlowLayout();//创建流动布局管理器对象
		flowLayout.setHgap(20);//设置流动布局中组件间水平间距
		flowLayout.setVgap(10);//设置流动布局中组件间垂直间距
		buttomPane.setLayout(flowLayout);
		//“账户”标签
		GridBagConstraints conLabelName = new GridBagConstraints();
		conLabelName.fill = GridBagConstraints.NONE;
		labelName = new JLabel("账户");
		conLabelName.weightx = 0.2;
		conLabelName.gridx = 0;
		conLabelName.gridy = 0;
		conLabelName.anchor = GridBagConstraints.LINE_END;
		topPane.add(labelName, conLabelName);
		
		//账户文本框
		GridBagConstraints contextFieldName = new GridBagConstraints();
		contextFieldName.fill = GridBagConstraints.HORIZONTAL;
		textFieldName = new JTextField();
		contextFieldName.weightx = 0.8;
		contextFieldName.weighty = 0.5;
		contextFieldName.gridx = 1;
		contextFieldName.gridy = 0;
		contextFieldName.insets = new Insets(10, 0, 10, 20);
		topPane.add(textFieldName, contextFieldName);
		//密码标签
		GridBagConstraints conLabelPassword = new GridBagConstraints();
		conLabelPassword.fill = GridBagConstraints.NONE;
		labelPassword = new JLabel("密码");
		conLabelPassword.gridx = 0;
		conLabelPassword.gridy = 1;
		conLabelPassword.anchor = GridBagConstraints.LINE_END;
		topPane.add(labelPassword, conLabelPassword);
		//密码框
		GridBagConstraints conTextFieldPwd = new GridBagConstraints();
		conTextFieldPwd.fill = GridBagConstraints.HORIZONTAL;
		textFieldPwd = new JPasswordField();
		conTextFieldPwd.weighty = 0.5;
		conTextFieldPwd.gridx = 1;
		conTextFieldPwd.gridy = 1;
		conTextFieldPwd.insets = new Insets(0, 0, 0, 20);
		topPane.add(textFieldPwd, conTextFieldPwd);
		
		buttonOk = new JButton("确定");
		buttonCancel = new JButton("取消");
		buttomPane.add(buttonOk);
		buttomPane.add(buttonCancel);
		pane.add(topPane, BorderLayout.CENTER);
		pane.add(buttomPane, BorderLayout.PAGE_END);
		
	}
	//创建GUI界面并显示
	private void createAndShowGUI()
	{
		//创建并设置窗口
		JFrame frame = new JFrame("LoginFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示窗口
		addComponentsToPane(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
}
