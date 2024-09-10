import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex04 extends JFrame {
    private JTextArea textArea, textArea2;
    private JButton btnCopy;
    private JPanel panel1, panel2, panel3, panel4, panelTxt2;
    private JPanel p1;

    public Ex04() {
        super("TextArea Demo");
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        textArea = new JTextArea("Este é um demo para ilustrar a utilização de textarea");
        panel1.add(textArea);
    
        panel2 = new JPanel();
        btnCopy = new JButton("Copy>>>");
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,0 ,300));
        panel2.add(btnCopy);

      p1 = new JPanel();
      textArea2 = new JTextArea(20, 10);
      p1.setLayout(new BorderLayout());
      p1.add(textArea2);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(panel1, BorderLayout.WEST);
        panel3.add(panel2, BorderLayout.CENTER);
        panel3.add(p1, BorderLayout.EAST);
        add(panel3);

        pack();

    

      /*  panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        panel4.add(panel3);
        add(panel4); */

     
    }

    public static void main(String[] args) {
        Ex04 teste = new Ex04();
        teste.setDefaultCloseOperation(EXIT_ON_CLOSE);
        teste.setVisible(true);
     //   teste.setSize(300, 500);
      
    }
}