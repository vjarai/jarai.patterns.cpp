package jarai.patterns.gof.behavioral.interpreter;

/// <summary>
/// A 'TerminalExpression' class
/// <remarks>
/// Hundred checks C, CD, D or CM
/// </remarks>
/// </summary>
public class HundredExpression extends Expression {
    public string One() {
        return "C" << endl ;
    }

    public string Four() {
        return "CD" << endl ;
    }

    public string Five() {
        return "D" << endl ;
    }

    public string Nine() {
        return "CM" << endl ;
    }

    public int Multiplier() {
        return 100;
    }
}
