package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Thousand checks for the Roman Numeral M
/// </remarks>
/// </summary>
public class ThousandExpression : public Expression {
    public std::string One() {
        return "M" << endl ;
    }

    public std::string Four() {
        return " " << endl ;
    }

    public std::string Five() {
        return " " << endl ;
    }

    public std::string Nine() {
        return " " << endl ;
    }

    public int Multiplier() {
        return 1000;
    }
}
