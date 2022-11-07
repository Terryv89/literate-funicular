package kjellgren.linus.cleancodeprojekt;

public class Press {

    double x, y;
    int c;
    boolean clear = true;
    IFrameComponents ifc;

    public Press(IFrameComponents ifc) {
        this.ifc = ifc;
        off();
    }

    public void connectButtons() {
        ifc.getRb2().addActionListener(this::offButton);
        ifc.getRb1().addActionListener(this::onButton);
        ifc.getBack().addActionListener(this::backButton);
        ifc.getC().addActionListener(this::pressClear);
        ifc.getPlus().addActionListener(this::plusButton);
        ifc.getSeven().addActionListener(this::button7);
        ifc.getEight().addActionListener(this::button8);
        ifc.getNine().addActionListener(this::button9);
        ifc.getFour().addActionListener(this::button4);
        ifc.getFive().addActionListener(this::button5);
        ifc.getSix().addActionListener(this::button6);
        ifc.getOne().addActionListener(this::button1);
        ifc.getTwo().addActionListener(this::button2);
        ifc.getThree().addActionListener(this::button3);
        ifc.getMinus().addActionListener(this::minusButton);
        ifc.getMulti().addActionListener(this::buttonMultiply);
        ifc.getDiv().addActionListener(this::divisionButton);
        ifc.getDot().addActionListener(this::pressDot);
        ifc.getZero().addActionListener(this::buttonZero);
        ifc.getEqual().addActionListener(this::pressEqualsButton);

    }

    public void math() {
        System.out.println(ifc.getT().getText());
        if (c == 1) {
            y = CalculatorFormulas.addition(x, ifc);
        } else {
            if (c == 2) {
                y = CalculatorFormulas.subtraction(x, ifc);
            } else {
                if (c == 3) {
                    y = CalculatorFormulas.multiplication(x, ifc);
                } else {
                    if (c == 4) {
                        y = CalculatorFormulas.division(x, ifc);
                    }
                }
            }
        }
        System.out.println("=");
        System.out.println(y);
    }

    protected void using0_9Numbers(javax.swing.JButton button) {     //Nummer 0-9
        ifc.getT().setText(ifc.getT().getText() + button.getText());
        eNN();
    }

    public void onButton() {
        ifc.getT().setEnabled(true);
        ifc.getBack().setEnabled(true);
        ifc.getC().setEnabled(true);
        ifc.getPlus().setEnabled(true);
        ifc.getSeven().setEnabled(true);
        ifc.getEight().setEnabled(true);
        ifc.getNine().setEnabled(true);
        ifc.getFour().setEnabled(true);
        ifc.getFive().setEnabled(true);
        ifc.getSix().setEnabled(true);
        ifc.getOne().setEnabled(true);
        ifc.getTwo().setEnabled(true);
        ifc.getThree().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMulti().setEnabled(true);
        ifc.getDiv().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getZero().setEnabled(true);
        ifc.getEqual().setEnabled(true);
        ifc.getRb1().setEnabled(false);
        ifc.getRb2().setEnabled(true);
    }

    public void offButton() {
        ifc.getT().setEnabled(false);
        ifc.getBack().setEnabled(false);
        ifc.getC().setEnabled(false);
        ifc.getPlus().setEnabled(false);
        ifc.getSeven().setEnabled(false);
        ifc.getEight().setEnabled(false);
        ifc.getNine().setEnabled(false);
        ifc.getFour().setEnabled(false);
        ifc.getFive().setEnabled(false);
        ifc.getSix().setEnabled(false);
        ifc.getOne().setEnabled(false);
        ifc.getTwo().setEnabled(false);
        ifc.getThree().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMulti().setEnabled(false);
        ifc.getDiv().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getZero().setEnabled(false);
        ifc.getEqual().setEnabled(false);
        ifc.getRb1().setEnabled(true);
        ifc.getRb2().setEnabled(false);
    }

    public void off() {
        ifc.getBack().setEnabled(false);
        ifc.getPlus().setEnabled(false);
        ifc.getMinus().setEnabled(false);
        ifc.getMulti().setEnabled(false);
        ifc.getDiv().setEnabled(false);
        ifc.getDot().setEnabled(false);
        ifc.getEqual().setEnabled(false);
    }

    public void eNN() {      // Alla sifrror + kommatecken
        ifc.getBack().setEnabled(true);
        ifc.getPlus().setEnabled(true);
        ifc.getMinus().setEnabled(true);
        ifc.getMulti().setEnabled(true);
        ifc.getDiv().setEnabled(true);
        ifc.getDot().setEnabled(true);
        ifc.getEqual().setEnabled(true);
    }

    protected void buttonMultiply(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(ifc.getT().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            ifc.getT().setText("");
            ifc.getL().setText("Multiplication By Zero");
            off();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getT().getText());
            System.out.println("*");
            clear = false;
            x = Double.parseDouble(ifc.getT().getText());
            c = 3;
            ifc.getT().setText("");
            ifc.getL().setText(x + "*");
        }
    }

    protected void buttonZero(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getZero());
    }
    protected void button1(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getOne());
    }
    protected void button2(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getTwo());
    }
    protected void button3(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getThree());
    }
    protected void button4(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getFour());
    }
    protected void button5(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getFive());
    }
    protected void button6(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getSix());
    }
    protected void button7(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getSeven());
    }
    protected void button8(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getEight());
    }
    protected void button9(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getNine());
    }
    protected void plusButton(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(ifc.getT().getText());
        System.out.println("+");
        clear = false;
        x = Double.parseDouble(ifc.getT().getText());
        c = 1;
        ifc.getT().setText("");
        ifc.getL().setText(x + "+");
    }
    protected void minusButton(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(ifc.getT().getText());
        System.out.println("-");
        clear = false;
        x = Double.parseDouble(ifc.getT().getText());
        c = 2;
        ifc.getT().setText("");
        ifc.getL().setText(x + "-");
    }
    protected void divisionButton(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(ifc.getT().getText()) == 0.0) {
            System.out.println("Division By Zero");
            ifc.getT().setText("");
            ifc.getL().setText("Division By Zero");
            off();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(ifc.getT().getText());
            System.out.println("/");
            clear = false;
            x = Double.parseDouble(ifc.getT().getText());
            c = 4;
            ifc.getT().setText("");
            ifc.getL().setText(x + "/");

        }
    }
    protected void pressDot(java.awt.event.ActionEvent evt) {
        using0_9Numbers(ifc.getDot());
    }
    protected void pressClear(java.awt.event.ActionEvent evt) {
        ifc.getT().setText("");
        off();
    }
    protected void onButton(java.awt.event.ActionEvent evt) {
        onButton();
    }
    protected void offButton(java.awt.event.ActionEvent evt) {
        offButton();
    }
    protected void backButton(java.awt.event.ActionEvent evt) {
        int length = ifc.getT().getText().length();
        int number = ifc.getT().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(ifc.getT().getText());
            back.deleteCharAt(number);
            store = back.toString();
            ifc.getT().setText(store);
        }
        if (ifc.getT().getText().length() == 0) {
            off();
        }
    }
    protected void pressEqualsButton(java.awt.event.ActionEvent evt) {
        math();
        clear = true;
        ifc.getL().setText("");
    }
}
