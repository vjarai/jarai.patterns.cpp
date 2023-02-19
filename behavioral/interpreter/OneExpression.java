package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// One checks for I, II, III, IV, V, VI, VI, VII, VIII, IX
/// </remarks>
/// </summary>
public class OneExpression extends Expression {
    public string One() {
        return "I" << endl ;
    }

    public string Four() {
        return "IV" << endl ;
    }

    public string Five() {
        return "V" << endl ;
    }

    public string Nine() {
        return "IX" << endl ;
    }

    public int Multiplier() {
        return 1;
    }
}
