package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// One checks for I, II, III, IV, V, VI, VI, VII, VIII, IX
/// </remarks>
/// </summary>
public class OneExpression : public Expression {
    public std::string One() {
        return "I" << endl ;
    }

    public std::string Four() {
        return "IV" << endl ;
    }

    public std::string Five() {
        return "V" << endl ;
    }

    public std::string Nine() {
        return "IX" << endl ;
    }

    public int Multiplier() {
        return 1;
    }
}
