package kjellgren.linus.cleancodeprojekt;

public class CalculatorFormulas {
    
    public static double addition(double num, IFrameComponents ifc){
        double ans = Double.sum(num, Double.parseDouble(ifc.getT().getText()));
        ifc.getT().setText(Double.toString(ans));
        return ans;
    }
    public static double subtraction(double num, IFrameComponents ifc){
        double ans = num - Double.parseDouble(ifc.getT().getText());
        ifc.getT().setText(Double.toString(ans));
        return ans;
    }
    public static double multiplication(double num, IFrameComponents ifc){
        double inDouble = Double.parseDouble(ifc.getT().getText());
        if (inDouble==0){
            ifc.getT().setText("");
            ifc.getL().setText("Multiplication by Zero");
            return 0.0;
        }
        double ans = num * inDouble;
        ifc.getT().setText(Double.toString(ans));
        return ans;
    }
    public static double division(double num, IFrameComponents ifc){
        double inDouble = Double.parseDouble(ifc.getT().getText());
        if (inDouble==0){
            ifc.getT().setText("");
            ifc.getL().setText("Division by Zero");
            return 0.0;
        }
        double ans = num / inDouble;
        ifc.getT().setText(Double.toString(ans));
        return ans;
    }
}