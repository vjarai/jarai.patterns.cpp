#pragma once

class Printer {

public:
    Printer() {
    }

    virtual void druckeText(std::string text) {
        std::cout << "Drucke: " + text << std::endl;
    }

};
