package jarai.patterns.gof.behavioral.interpreter;

public abstract class Expression {
    public void Interpret(Context context) {
        if (context.Input.length() == 0)
            return;

        if (context.Input.startsWith(Nine())) {
            context.Output += (9 * Multiplier());
            context.Input = context.Input.substring(2);
        } else if (context.Input.startsWith(Four())) {
            context.Output += (4 * Multiplier());
            context.Input = context.Input.substring(2);
        } else if (context.Input.startsWith(Five())) {
            context.Output += (5 * Multiplier());
            context.Input = context.Input.substring(1);
        }

        while (context.Input.startsWith(One())) {
            context.Output += (Multiplier());
            context.Input = context.Input.substring(1);
        }
    }

    public abstract std::string One();

    public abstract std::string Four();

    public abstract std::string Five();

    public abstract std::string Nine();

    public abstract int Multiplier();
}
