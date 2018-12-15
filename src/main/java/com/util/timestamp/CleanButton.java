package com.util.timestamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: lizhu
 * @ClassName: TimeToStampButton
 * @Desciption: Date:2018/12/15
 */
public class CleanButton implements ActionListener {

    private JTextField timeField;
    private JTextField timeStyle;
    private JTextField resultField;

    public CleanButton(JTextField timeField, JTextField timeStyle, JTextField resultField){
        this.timeField = timeField;
        this.timeStyle = timeStyle;
        this.resultField = resultField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        timeField.setText("");
        timeStyle.setText("");
        resultField.setText("");
    }
}
