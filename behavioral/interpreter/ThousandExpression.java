package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Thousand checks for the Roman Numeral M
/// </remarks>
/// </summary>
public class ThousandExpression extends Expression {
    public string One() {
        return "M" << endl ;
    }

    public string Four() {
        return " " << endl ;
    }

    public string Five() {
        return " " << endl ;
    }

    public string Nine() {
        return " " << endl ;
    }

    public int Multiplier() {
        return 1000;
    }
}
