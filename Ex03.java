import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Ex03 extends JFrame {
    private JLabel label1, label2;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9;
    private JPanel p1, p2, p3;
    private JButton btnOk, btnCancel, btnSetup, btnHelp;
    private JTextArea textArea1, textArea2, textArea3;
    private JCheckBox imgCheckBox, txtCheckBox, codeCheckBox, prtCheckBox;
    private JRadioButton btnSelection, btnAll, btnApplet;
    private ButtonGroup bg1;
    private JComboBox select;

    public Ex03() {
        super("Printer");

        label1 = new JLabel("Printer: MyPrinter");
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(label1);
        add(panel1, BorderLayout.NORTH);

        textArea1 = new JTextArea(5, 5);
        textArea2 = new JTextArea(2, 2);
        textArea3 = new JTextArea(3, 3);

        imgCheckBox = new JCheckBox("Image");
        txtCheckBox = new JCheckBox("Text");
        codeCheckBox = new JCheckBox("Code");

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 2));
        panel2.add(imgCheckBox);
        panel2.add(txtCheckBox);
        panel2.add(codeCheckBox);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2));
        p1.add(textArea1);
        p1.add(panel2);

        btnSelection = new JRadioButton();
        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(btnSelection = new JRadioButton("Selection"), BorderLayout.NORTH);
        panel3.add(btnAll = new JRadioButton("All"), BorderLayout.CENTER);
        panel3.add(btnApplet = new JRadioButton("Applet"), BorderLayout.SOUTH);

        bg1 = new ButtonGroup();
        bg1.add(btnSelection);
        bg1.add(btnAll);
        bg1.add(btnApplet);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));
        p2.add(textArea2);
        p2.add(panel3);
        p2.add(textArea3);

        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        panel4.add(p1);
        panel4.add(p2);

        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout());
        panel5.add(label2 = new JLabel("Print Quality: "));
        select = new JComboBox<>();
        select.addItem("High");
        select.addItem("Medium");
        select.addItem("Low");
        panel5.add(select);
        panel5.add(prtCheckBox = new JCheckBox("Print to File"));

        panel6 = new JPanel(new FlowLayout());
        panel6.setLayout(new GridLayout(5, 1,5,5));
        panel6.add(btnOk = new JButton("Ok"));
        panel6.add(btnCancel = new JButton("Cancel"));
        panel6.add(btnSetup = new JButton("Setup..."));
        panel6.add(btnHelp = new JButton("Help"));

        panel7 = new JPanel();
        panel7.setLayout(new BorderLayout());
        panel7.add(panel1, BorderLayout.NORTH);
        panel7.add(panel4, BorderLayout.CENTER);
        panel7.add(panel5, BorderLayout.SOUTH);

        panel8 = new JPanel();
        panel8.setLayout(new FlowLayout());
        panel8.add(panel7);
        panel8.add(panel6);
        add(panel8);
        pack();
    }

    public static void main(String[] args) {
        Ex03 printer = new Ex03();
        printer.setDefaultCloseOperation(EXIT_ON_CLOSE);
        printer.setVisible(true);
        // printer.setSize(800, 200);

    }
}