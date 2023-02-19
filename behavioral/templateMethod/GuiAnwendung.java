package jarai.patterns.gof.behavioral.templateMethod;

import javax.swing.*;


public class GuiAnwendung extends Anwendung {

    void einlesenDaten() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Bitte x eingeben"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Bitte y eingeben"));
    }

    void ausgebenDaten(int z) {
        JOptionPane.showMessageDialog(null, x + " + " + y + " = " + z);
    }

}
