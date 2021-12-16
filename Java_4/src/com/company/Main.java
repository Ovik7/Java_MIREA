package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Main extends JFrame {
    int [] array = {0,0};
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JButton button3 = new JButton("End match");
    JLabel result = new JLabel("Result 0 X 0");
    JLabel last_scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    Main() {
        super("Match score"); // Название окна
        Container c = getContentPane();
        c.setLayout(null);
        button1.setBounds(40, 20, 120, 40);
        c.add(button1);
        button2.setBounds(200, 20, 120, 40);
        c.add(button2);
        button3.setBounds(120, 80, 120, 40);
        c.add(button3);
        result.setBounds(145, 110, 110,40);
        c.add(result);
        last_scorer.setBounds(135, 150, 200,40);
        c.add(last_scorer);
        winner.setBounds(140, 190, 200,40);
        c.add(winner);
        setSize(360, 300); // Размер окна
        setVisible(true); // Видимость окна
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                array[0] ++;
                result.setText("Result: " + array[0] + " X " + array[1]);
                last_scorer.setText("Last Scorer: AC Milan");
            }
        });
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                array[1] ++;
                result.setText("Result: " + array[0] + " X " + array[1]);
                last_scorer.setText("Last Scorer: Real Madrid");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(array[0] > array[1])
                {
                    winner.setText("Winner: AC Milan");
                }
                if(array[0] == array[1])
                {
                    winner.setText("Winner: Tie");
                }
                if(array[1] > array[0])
                {
                    winner.setText("Winner: Real Madrid");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}