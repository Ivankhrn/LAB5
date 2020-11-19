package lab5;

public class Example {
}
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class LabExample extends JFrame {
    JLabel jl = new JLabel("First number", SwingConstants.CENTER);
    JLabel jl1 = new JLabel("Second number", SwingConstants.CENTER);
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("summarize");
    JButton button1 = new JButton("subtraction");
    JButton button2 = new JButton("division");
    JButton button3 = new JButton("multiplication");
    JPanel[] pnl = new JPanel[4];
    Font fnt = new Font("Cabin", Font.BOLD, 16);
    Font jlf = new Font("Cabin", Font.BOLD, 24);

    LabExample() {
        super("My window");
        setLayout(new GridLayout(2, 2));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.YELLOW);
            add(pnl[i]);
        }

        pnl[0].add(jl);
        jl.setAlignmentY(Component.TOP_ALIGNMENT);
        jl.setFont(jlf);
        jl.setPreferredSize(new Dimension(195, 60));
        jl.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnl[0].add(jl1);
        jl1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        jl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl1.setFont(jlf);
        jl1.setPreferredSize(new Dimension(195, 60));
        pnl[1].add(jta1);
        jta1.setPreferredSize(new Dimension(195, 60));
        pnl[1].add(jta2);
        jta2.setPreferredSize(new Dimension(195, 60));
        pnl[2].add(button);
        button.setPreferredSize(new Dimension(120, 35));
        pnl[2].add(button1);
        button1.setPreferredSize(new Dimension(120, 35));
        pnl[3].add(button3);
        button3.setPreferredSize(new Dimension(120, 35));
        pnl[3].add(button2);
        button2.setPreferredSize(new Dimension(120, 35));

        setSize(400, 300);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1, x2, x3;
                    x1 = Double.parseDouble(jta1.getText().trim());
                    x2 = Double.parseDouble(jta2.getText().trim());
                    x3 = x1 + x2;
                    JOptionPane.showMessageDialog(null, "Result of summarize=" + x3, "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                try {
                    double x1, x2, x3;
                    x1 = Double.parseDouble(jta1.getText().trim());
                    x2 = Double.parseDouble(jta2.getText().trim());
                    x3 = x1 - x2;
                    JOptionPane.showMessageDialog(null, "Result of subtraction=" + x3, "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                try {
                    double x1, x2, x3;
                    x1 = Double.parseDouble(jta1.getText().trim());
                    x2 = Double.parseDouble(jta2.getText().trim());
                    x3 = x1 / x2;
                    JOptionPane.showMessageDialog(null, "Result of division=" + x3, "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                try {
                    double x1, x2, x3;
                    x1 = Double.parseDouble(jta1.getText().trim());
                    x2 = Double.parseDouble(jta2.getText().trim());
                    x3 = x1 * x2;
                    JOptionPane.showMessageDialog(null, "Result of multiplication=" + x3, "alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jta1.setBackground(Color.MAGENTA);
        jta1.setForeground(Color.BLACK);
        jta1.setFont(fnt);

        jta2.setBackground(Color.MAGENTA);
        jta2.setForeground(Color.BLACK);
        jta2.setFont(fnt);

        setVisible(true);

    }
}