import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    JTextField tfield;
    double temp, temp1, result, a;
    static double m1, m2;
    int k = 1, x = 0, y = 0, z = 0;
    char ch = ' ', op;
    boolean sciOpPerformed = false;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp, pi,
            fac, plus, min, div, log, rec, mul, eq, addSub, dot, mr, mc, mp,
            mm, sqrt, sin, cos, tan, mod;
    Container cont;
    JPanel textPanel, buttonpanel;

    ScientificCalculator() {
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        JPanel textpanel = new JPanel();
        tfield = new JTextField(43);
        tfield.setBackground(Color.DARK_GRAY);
        tfield.setForeground(Color.white);
        tfield.setHorizontalAlignment(SwingConstants.RIGHT);
        tfield.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent keyevent) {
                char c = keyevent.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    keyevent.consume();
                }
            }
        });
        textpanel.add(tfield);
        buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(8, 5, 2, 2));
        boolean t = true;
        mr = new JButton("MR");
        mr.setBackground(Color.black);
        mr.setForeground(Color.blue);
        buttonpanel.add(mr);
        mr.addActionListener(this);
        mc = new JButton("MC");
        mc.setForeground(Color.blue);
        mc.setBackground(Color.black);
        buttonpanel.add(mc);
        mc.addActionListener(this);

        mp = new JButton("M+");
        mp.setBackground(Color.black);
        mp.setForeground(Color.blue);
        buttonpanel.add(mp);
        mp.addActionListener(this);

        mm = new JButton("M-");
        mm.setForeground(Color.blue);
        mm.setBackground(Color.black);
        buttonpanel.add(mm);
        mm.addActionListener(this);


        clr = new JButton("C");
        clr.setForeground(Color.white);
        clr.setBackground(Color.red);
        buttonpanel.add(clr);
        clr.addActionListener(this);


        addSub = new JButton("+/-");
        buttonpanel.add(addSub);
        addSub.setForeground(Color.white);
        addSub.setBackground(Color.black);

        addSub.addActionListener(this);


        rec = new JButton("1/x");
        rec.setForeground(Color.white);
        rec.setBackground(Color.black);
        buttonpanel.add(rec);
        rec.addActionListener(this);
        sqrt = new JButton("Sqrt");
        buttonpanel.add(sqrt);
        sqrt.setForeground(Color.white);
        sqrt.setBackground(Color.black);
        sqrt.addActionListener(this);
        log = new JButton("log");
        log.setForeground(Color.white);
        log.setBackground(Color.black);

        buttonpanel.add(log);

        log.addActionListener(this);

        sin = new JButton("SIN");
        buttonpanel.add(sin);

        sin.addActionListener(this);
        sin.setForeground(Color.white);
        sin.setBackground(Color.black);

        cos = new JButton("COS");
        buttonpanel.add(cos);
        cos.addActionListener(this);
        cos.setForeground(Color.white);
        cos.setBackground(Color.black);

        tan = new JButton("TAN");
        buttonpanel.add(tan);
        tan.addActionListener(this);
        tan.setForeground(Color.white);
        tan.setBackground(Color.black);

        pow2 = new JButton("x^2");
        buttonpanel.add(pow2);
        pow2.addActionListener(this);
        pow2.setForeground(Color.white);
        pow2.setBackground(Color.black);

        pow3 = new JButton("x^3");
        buttonpanel.add(pow3);
        pow3.addActionListener(this);
        pow3.setForeground(Color.white);
        pow3.setBackground(Color.black);
        pi = new JButton("pi");
        pi.setForeground(Color.white);
        pi.setBackground(Color.black);
        pi.addActionListener(this);
        buttonpanel.add(pi);

        b7 = new JButton("7");
        buttonpanel.add(b7);
        b7.addActionListener(this);
        b7.setForeground(Color.white);
        b7.setBackground(Color.GRAY);
        b8 = new JButton("8");
        buttonpanel.add(b8);
        b8.addActionListener(this);
        b8.setForeground(Color.white);
        b8.setBackground(Color.GRAY);
        b9 = new JButton("9");
        buttonpanel.add(b9);
        b9.addActionListener(this);
        b9.setForeground(Color.white);
        b9.setBackground(Color.GRAY);

        fac = new JButton("n!");
        fac.setForeground(Color.white);
        fac.setBackground(Color.black);
        fac.addActionListener(this);
        buttonpanel.add(fac);
        exp = new JButton("Exp");
        exp.setForeground(Color.white);
        exp.setBackground(Color.black);
        exp.addActionListener(this);
        buttonpanel.add(exp);
        b4 = new JButton("4");
        buttonpanel.add(b4);
        b4.addActionListener(this);
        b4.setForeground(Color.white);
        b4.setBackground(Color.GRAY);
        b5 = new JButton("5");
        buttonpanel.add(b5);
        b5.addActionListener(this);
        b5.setForeground(Color.white);
        b5.setBackground(Color.GRAY);
        b6 = new JButton("6");
        buttonpanel.add(b6);
        b6.addActionListener(this);
        b6.setForeground(Color.white);
        b6.setBackground(Color.GRAY);
        mul = new JButton("*");
        buttonpanel.add(mul);
        mul.addActionListener(this);
        mul.setForeground(Color.white);
        mul.setBackground(Color.black);

        div = new JButton("/");
        div.addActionListener(this);
        div.setForeground(Color.white);
        div.setBackground(Color.black);
        buttonpanel.add(div);
        b1 = new JButton("1");
        b1.setForeground(Color.white);
        b1.setBackground(Color.GRAY);
        buttonpanel.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("2");
        buttonpanel.add(b2);
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        b2.setBackground(Color.GRAY);
        b3 = new JButton("3");
        buttonpanel.add(b3);
        b3.addActionListener(this);
        b3.setForeground(Color.white);
        b3.setBackground(Color.GRAY);
        plus = new JButton("+");
        buttonpanel.add(plus);
        plus.addActionListener(this);
        plus.setForeground(Color.white);
        plus.setBackground(Color.black);
        min = new JButton("-");

        min.setForeground(Color.white);
        min.setBackground(Color.black);
        min.addActionListener(this);

        buttonpanel.add(min);
        zero = new JButton("0");
        buttonpanel.add(zero);
        zero.addActionListener(this);
        zero.setForeground(Color.white);
        zero.setBackground(Color.GRAY);
        dot = new JButton(".");
        dot.setForeground(Color.white);
        dot.setBackground(Color.black);
        buttonpanel.add(dot);
        dot.addActionListener(this);
        mod = new JButton("%");
        mod.setForeground(Color.white);
        mod.setBackground(Color.black);
        mod.addActionListener(this);
        buttonpanel.add(mod);

        eq = new JButton("=");
        eq.setSize(500, 200);
        buttonpanel.add(eq);
        eq.addActionListener(this);
        eq.setForeground(Color.white);
        eq.setBackground(Color.black);


        cont.add("Center", buttonpanel);
        cont.add("North", textpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("1")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "1");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "1");
                z = 0;
            }
        }
        if (s.equals("2")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "2");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "2");
                z = 0;
            }
        }
        if (s.equals("3")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "3");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "3");
                z = 0;
            }
        }
        if (s.equals("4")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "4");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "4");
                z = 0;
            }
        }
        if (s.equals("5")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "5");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "5");
                z = 0;
            }
        }
        if (s.equals("6")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "6");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "6");
                z = 0;
            }
        }
        if (s.equals("7")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "7");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "7");
                z = 0;
            }
        }
        if (s.equals("8")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "8");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "8");
                z = 0;
            }
        }
        if (s.equals("9")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "9");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "9");
                z = 0;
            }
        }
        if (s.equals("0")) {
            if (z == 0) {
                tfield.setText(tfield.getText() + "0");
            } else {
                tfield.setText("");
                tfield.setText(tfield.getText() + "0");
                z = 0;
            }
        }
        if (s.equals("C")) {
            tfield.setText("");
            x = 0;
            y = 0;
            z = 0;
            ch = ' ';
            sciOpPerformed  = false;
        }
        if (s.equals("log")) {
           if(!sciOpPerformed){
               if (tfield.getText().equals("")) {
                   tfield.setText("");
               } else {
                   a = Math.log(Double.parseDouble(tfield.getText()));
                   tfield.setText("");
                   tfield.setText(tfield.getText() + a);
                   sciOpPerformed = true;
                   ch = ' ';
               }
           }else{
               JOptionPane.showMessageDialog(this,"Error");
           }
        }
        if (s.equals("1/x")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = 1 / Double.parseDouble(tfield.getText());
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("Exp")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.exp(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("x^2")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.pow(Double.parseDouble(tfield.getText()), 2);
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("x^3")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.pow(Double.parseDouble(tfield.getText()), 3);
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("+/-")) {
            if(!sciOpPerformed){
                if (x == 0) {
                    tfield.setText("-" + tfield.getText());
                    x = 1;
                } else {
                    tfield.setText(tfield.getText());
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals(".")) {
            if(!sciOpPerformed){
                if (y == 0) {
                    tfield.setText(tfield.getText() + ".");
                    y = 1;
                } else {
                    tfield.setText(tfield.getText());
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("pi")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("3.14");

                } else {
                    temp = Double.parseDouble(tfield.getText());
                    a = temp * 3.14;
                    tfield.setText(" ");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
                tfield.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("+")) {
            if(ch  == ' '){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                    temp = 0;
                    ch = '+';
                } else {
                    temp = Double.parseDouble(tfield.getText());
                    tfield.setText("");
                    ch = '+';
                    y = 0;
                    x = 0;
                }
                tfield.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("-")) {
           if(ch == ' '){
               if (tfield.getText().equals("")) {
                   tfield.setText("");
                   temp = 0;
                   ch = '-';
               } else {
                   x = 0;
                   y = 0;
                   temp = Double.parseDouble(tfield.getText());
                   tfield.setText("");
                   ch = '-';
               }
               tfield.requestFocus();
           }else{
               JOptionPane.showMessageDialog(this,"Error");
           }
        }
        if (s.equals("/")) {
            if(ch == ' '){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                    temp = 1;
                    ch = '/';
                } else {
                    x = 0;
                    y = 0;
                    temp = Double.parseDouble(tfield.getText());
                    ch = '/';
                    tfield.setText("");
                }
                tfield.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("*")) {
           if(ch == ' '){
               if (tfield.getText().equals("")) {
                   tfield.setText("");
                   temp = 1;
                   ch = '*';
               } else {
                   x = 0;
                   y = 0;
                   temp = Double.parseDouble(tfield.getText());
                   ch = '*';
                   tfield.setText("");
               }
               tfield.requestFocus();
           }else{
               JOptionPane.showMessageDialog(this,"Error");
           }
        }
//        if (s.equals("*")) {
//            if (tfield.getText().equals("")) {
//                tfield.setText("");
//                temp = 1;
//                ch = '*';
//            } else {
//                x = 0;
//                y = 0;
//                temp = Double.parseDouble(tfield.getText());
//                ch = '*';
//                tfield.setText("");
//            }
//            tfield.requestFocus();
//        }
        if (s.equals("MC")) {
            m1 = 0;
            tfield.setText("");
        }

        if (s.equals("%")) {
            if(ch == ' '){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                    temp = 1;
                    ch = '*';
                } else {
                    x = 0;
                    y = 0;
                    temp = Double.parseDouble(tfield.getText());
                    ch = '%';
                    tfield.setText("");
                }
                tfield.requestFocus();
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
//        if (s.equals("%")) {
//            if (tfield.getText().equals("")) {
//                tfield.setText("");
//                temp = 1;
//                ch = '%';
//            } else {
//                x = 0;
//                y = 0;
//                temp = Double.parseDouble(tfield.getText());
//                ch = '%';
//                tfield.setText("");
//            }
//            tfield.requestFocus();
//        }
        if (s.equals("MC")) {
            m1 = 0;
            tfield.setText("");
        }
        if (s.equals("MR")) {
            tfield.setText("");
            tfield.setText(tfield.getText() + m1);
        }
        if (s.equals("M+")) {
            if (k == 1) {
                m1 = Double.parseDouble(tfield.getText());
                k++;
            } else {
                m1 += Double.parseDouble(tfield.getText());
                tfield.setText("" + m1);
            }
        }
        if (s.equals("M-")) {
            if (k == 1) {
                m1 = Double.parseDouble(tfield.getText());
                k++;
            } else {
                m1 -= Double.parseDouble(tfield.getText());
                tfield.setText("" + m1);
            }
        }
        if (s.equals("Sqrt")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.sqrt(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        if (s.equals("SIN")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.sin(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("COS")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.cos(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("TAN")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = Math.tan(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }

        }
        if (s.equals("=")) {
            if (tfield.getText().equals("")) {
                tfield.setText("");
            } else {
                temp1 = Double.parseDouble(tfield.getText());
                switch (ch) {
                    case '+':
                        result = temp + temp1;
                        break;
                    case '-':
                        result = temp - temp1;
                        break;
                    case '%':
                        result = temp % temp1;
                        break;
                    case '/':


                        try {
                            result = temp / temp1;
                        } catch (ArithmeticException excp) {
                            tfield.setText("Intifity");
                            return;
                        }


                        break;
                    case '*':
                        result = temp * temp1;
                        break;
                }
                tfield.setText("");
                tfield.setText(tfield.getText() + result);
                z = 1;
                ch = ' ';
                sciOpPerformed = false;
            }
        }
        if (s.equals("n!")) {
            if(!sciOpPerformed){
                if (tfield.getText().equals("")) {
                    tfield.setText("");
                } else {
                    a = fact(Double.parseDouble(tfield.getText()));
                    tfield.setText("");
                    tfield.setText(tfield.getText() + a);
                    sciOpPerformed = true;
                    ch = ' ';
                }
            }else{
                JOptionPane.showMessageDialog(this,"Error");
            }
        }
        tfield.requestFocus();
    }

    double fact(double x) {
        int er = 0;
        if (x < 0) {
            er = 20;
            return 0;
        }
        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }

    public static void main(String args[]) {

        ScientificCalculator f = new ScientificCalculator();

        f.setTitle("Scientific Calculator");
        f.setSize(500, 500);
        f.setLocation(400, 200);
        f.setVisible(true);

 /* catch(Exception e)
{  

System.out.println("Some Other Exception");
 }*/
    }
}