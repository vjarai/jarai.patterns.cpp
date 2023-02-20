package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Hundred checks C, CD, D or CM
/// </remarks>
/// </summary>
public class HundredExpression : public Expression {
    public std::string One() {
        return "C" << endl ;
    }

    public std::string Four() {
        return "CD" << endl ;
    }

    public std::string Five() {
        return "D" << endl ;
    }

    public std::string Nine() {
        return "CM" << endl ;
    }

    public int Multiplier() {
        return 100;
    }
}
