import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaCalculator {
    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        try {
            total1 = total1 + Double.parseDouble(textDisplay.getText());
            b = new BigDecimal(total1);
            textDisplay.setText("");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }
    public JavaCalculator() {

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnTwo.getText();
            textDisplay.setText(btnOneText);
        });
        btnThree.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnThree.getText();
            textDisplay.setText(btnOneText);
        });
        btnFour.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnFour.getText();
            textDisplay.setText(btnOneText);
        });
        btnFive.addActionListener( e -> {
                String btnOneText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnOneText);
        });
        btnSix.addActionListener( e -> {
                String btnOneText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnOneText);
        });
        btnSeven.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnSeven.getText();
            textDisplay.setText(btnOneText);
        });
        btnEight.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnEight.getText();
            textDisplay.setText(btnOneText);
        });
        btnNine.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnNine.getText();
            textDisplay.setText(btnOneText);
        });
        btnZero.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnZero.getText();
            textDisplay.setText(btnOneText);
        });

        btnPoint.addActionListener(e -> {
            if(textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            }
            else if (textDisplay.getText().contains(".")) {
                btnPoint.setEnabled(false);
            }
            else {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
            btnPoint.setEnabled(true);
        });

        btnPlus.addActionListener(e -> {
            String button_text = btnPlus.getText();
            getOperator(button_text);
        });
        btnEquals.addActionListener(e -> {
            switch (math_operator) {
                case '+':
                    b = b.add(new BigDecimal(textDisplay.getText()));
                    break;
                case '-':
                    b = b.subtract(new BigDecimal(textDisplay.getText()));
                    break;
                case '/':
                    b = b.divide(new BigDecimal(textDisplay.getText()),5, RoundingMode.HALF_UP);
                    break;
                case '*':
                    b = b.multiply(new BigDecimal(textDisplay.getText()));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + math_operator);
            }
            textDisplay.setText(b.toString());
            total1 = 0;
        });
        btnClear.addActionListener(e -> {
            total2 = 0;
            textDisplay.setText("");
        });
        btnMinus.addActionListener(e -> {
            String button_text = btnMinus.getText();
            getOperator(button_text);
        });
        btnDivide.addActionListener(e -> {
            String button_text = btnDivide.getText();
            getOperator(button_text);
        });
        btnMultiple.addActionListener(e -> {
            String button_text = btnMultiple.getText();
            getOperator(button_text);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }


    private double total1 = 0.0;
    private double total2 = 0.0;
    private BigDecimal b;
    private char math_operator;
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMultiple;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
}
