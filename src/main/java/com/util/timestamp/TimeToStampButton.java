package com.util.timestamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: lizhu
 * @ClassName: TimeToStampButton
 * @Desciption: Date:2018/12/15
 */
public class TimeToStampButton implements ActionListener {

    private JTextField timeField;
    private JTextField timeStyle;
    private JTextField resultField;

    public TimeToStampButton(JTextField timeField,JTextField timeStyle,JTextField resultField){
        this.timeField = timeField;
        this.timeStyle = timeStyle;
        this.resultField = resultField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String timeText = timeField.getText();
        String timeStyleText = timeStyle.getText();
        if(timeText == null||"".equals(timeText.trim())){
            resultField.setText("请填写时间");
        }else{
            String result = "";
            try{
                result = CommonUtils.time2Stamp(timeText,timeStyleText);
            }catch (DateFormatException ex){
                result = "o my god ,it's a bug ";
            }
            resultField.setText(result);
        }

    }
}
