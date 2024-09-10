import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05 extends JFrame {

    private JComboBox colorJComboBox;
    private JButton btnCancel, btnOk;
    private JCheckBox bgCB, fgCB;
    private JPanel panel1, panel2, panel3, panel4;

    public Ex05(){
        super("ColorSelect");
            setLayout(new BorderLayout());
            colorJComboBox = new JComboBox();
            colorJComboBox.addItem("Red");
            colorJComboBox.addItem("Green");
            colorJComboBox.addItem("Blue");
            add(colorJComboBox, BorderLayout.NORTH);

        bgCB = new JCheckBox("Background");
        fgCB = new JCheckBox("Foreground");
        panel1 = new JPanel();
        panel1.add(bgCB);
        panel1.add(fgCB);
        panel1.setLayout(new FlowLayout());
        
            
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        panel2 = new JPanel();
        panel2.add(btnOk);
        panel2.add(btnCancel);
        panel2.setLayout(new FlowLayout());

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 1));
        panel3.add(panel1);
        panel3.add(panel2);

        add(panel3);
        pack();

        
    }

    public static void main(String[] args) {
        Ex05 ex05 = new Ex05();
        ex05.setVisible(true);
        ex05.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
