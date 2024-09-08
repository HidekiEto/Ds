import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1 extends JFrame{
    public static final long SerialVersionUID = 1L;
    private JLabel labelNome, labelEnd, labelCid, labelEst;
    private JTextField tFNome, tFEnd, tFCid, tFEst;
    private JButton btn, btnCancel;
    private JPanel jPanel1, jPanel2, jPanel3;

    public Ex1(){
        super("Exercício Borderlayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelNome = new JLabel("Nome:");
        labelEnd = new JLabel("Endereço:");
        labelCid = new JLabel("Cidade:");
        labelEst = new JLabel("Estado: ");
        tFCid = new JTextField(15);
        tFEnd = new JTextField(20);
        tFNome = new JTextField(15);
        tFEst = new JTextField(2);
        btn = new JButton("ok");
        btnCancel = new JButton("Cancelar");

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();

        Container janela;
        janela = getContentPane();

        janela.setLayout(new BorderLayout());

        jPanel1.setLayout(new GridLayout(4,1));
        jPanel2.setLayout(new GridLayout(4,1));
        jPanel3.setLayout(new FlowLayout());

        jPanel1.add(labelNome);
        jPanel1.add(labelEnd);
        jPanel1.add(labelCid);
        jPanel1.add(labelEst);

        jPanel2.add(tFNome);
        jPanel2.add(tFEnd);
        jPanel2.add(tFCid);
        jPanel2.add(tFEst);

        jPanel3.add(btn);
        jPanel3.add(btnCancel);

        janela.add(jPanel1, BorderLayout.WEST);
        janela.add(jPanel2, BorderLayout.CENTER);
        janela.add(jPanel3, BorderLayout.SOUTH);
        pack();
    }
    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        ex.setVisible(true);
    }
}