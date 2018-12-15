package com.util.timestamp;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: lizhu
 * @ClassName: Test
 * @Desciption: Date:2018/12/15
 */
public class TimeUtils {
    public static void main(String[] args){
        // 创建 JFrame 实例
        JFrame frame = new JFrame("时间戳转换工具");
        // Setting the width and height of frame
        frame.setSize(500, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("时间:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /*
         * 创建文本域用于用户输入
         */
        JTextField timeField = new JTextField(30);
        timeField.setBounds(100,20,165,25);
        panel.add(timeField);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("转换格式:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
        JTextField timeStyle = new JTextField(30);
        timeStyle.setBounds(100,50,165,25);
        panel.add(timeStyle);

        JLabel tipLabel = new JLabel("*默认为 yyyy-MM-dd HH:mm:dd*");
        tipLabel.setBounds(268,50,200,25);
        tipLabel.setForeground(Color.RED);
        panel.add(tipLabel);

        JLabel resultLable = new JLabel("结果为：");
        resultLable.setBounds(10,80,80,25);

        JTextField resultText = new JTextField(30);
        resultText.setBounds(100,80,165,25);
        resultText.setEditable(false);

        panel.add(resultLable);
        panel.add(resultText);

        // 创建登录按钮
        JButton timeToStamp = new JButton("时间转时间戳");
        timeToStamp.setBounds(10, 130, 140, 25);
        timeToStamp.addActionListener(new TimeToStampButton(timeField,timeStyle,resultText));
        panel.add(timeToStamp);

        // 创建登录按钮
        JButton stampToTime = new JButton("时间戳转时间");
        stampToTime.setBounds(160, 130, 140, 25);
        stampToTime.addActionListener(new StampToTimeButton(timeField,timeStyle,resultText));
        panel.add(stampToTime);

        JButton cleanButton = new JButton("清除");
        cleanButton.setBounds(310, 130, 70, 25);
        cleanButton.addActionListener(new CleanButton(timeField,timeStyle,resultText));
        panel.add(cleanButton);
    }

}
