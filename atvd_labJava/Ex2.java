import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex2 extends JFrame {
    // private static final long SerialVersionUID = 1L;
    private JButton btn, btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8;
    private JTextField dados;
    private JPanel jPanel1, jPanel2;

    public Ex2(){
        super("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        dados = new JTextField(20);
        btn = new JButton("7");
        btn1 = new JButton("8");
        btn2 = new JButton("9");
        btn3 = new JButton("/");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("*");

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();

        Container janela;
        janela = getContentPane();

        janela.setLayout(new BorderLayout());

        jPanel1.setLayout(new FlowLayout());
        jPanel2.setLayout(new GridLayout(4,4));

        jPanel1.add(dados);

        jPanel2.add(btn);
        jPanel2.add(btn1);
        jPanel2.add(btn2);
        jPanel2.add(btn3);
        jPanel2.add(btn4);
        jPanel2.add(btn5);
        jPanel2.add(btn6);
        jPanel2.add(btn7);
      

        janela.add(jPanel1, BorderLayout.NORTH);
        janela.add(jPanel2, BorderLayout.SOUTH);
        pack();
    }
    public static void main(String[] args) {
        Ex2 ex = new Ex2();
        ex.setVisible(true);
    }
}