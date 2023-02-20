#pragma once

class Ram : public Bauteil {

    int megabytes_;

public:
    Ram(int megabytes, double preis)
        : Bauteil(preis), megabytes_(megabytes)
    {
    }

    void anzeigen() const override
    {
        std::cout << std::to_string( megabytes_ ) + " Megabytes RAM ";
        Bauteil::anzeigen();
    }

};
