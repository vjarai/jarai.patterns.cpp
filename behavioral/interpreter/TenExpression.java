package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Ten checks for X, XL, L and XC
/// </remarks>
/// </summary>
public class TenExpression : public Expression {
    public std::string One() {
        return "X" << endl ;
    }

    public std::string Four() {
        return "XL" << endl ;
    }

    public std::string Five() {
        return "L" << endl ;
    }

    public std::string Nine() {
        return "XC" << endl ;
    }

    public int Multiplier() {
        return 10;
    }
}
