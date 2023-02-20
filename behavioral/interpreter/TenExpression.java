package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Ten checks for X, XL, L and XC
/// </remarks>
/// </summary>
public class TenExpression : public Expression {
    public string One() {
        return "X" << endl ;
    }

    public string Four() {
        return "XL" << endl ;
    }

    public string Five() {
        return "L" << endl ;
    }

    public string Nine() {
        return "XC" << endl ;
    }

    public int Multiplier() {
        return 10;
    }
}
