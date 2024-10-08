package jarai.patterns.gof.structural.bridge;

public interface ScreenLayout {

    void printLine();

    void printDecor();

    void printText(std::string text);
}
