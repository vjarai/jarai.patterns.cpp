package jarai.patterns.gof.behavioral.state.pattern.tests;

import jarai.patterns.gof.behavioral.state.pattern.Abgehoben;
import jarai.patterns.gof.behavioral.state.pattern.Aufgelegt;
import jarai.patterns.gof.behavioral.state.pattern.Telefon;
import jarai.patterns.gof.behavioral.state.pattern.Verbunden;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefonTests {

    @Test
    public void Kann_abheben_waehlen_sprechen_sprechen_auflegen() {
        // Arrange
        var telefon = new Telefon();

        // Act
        telefon.Abheben();
        telefon.Waehlen();
        telefon.Sprechen();
        telefon.Sprechen();
        telefon.Auflegen();
    }


    @Test
    public void Kann_annehmenAnruf_auflegen() {
        // Arrange
        var telefon = new Telefon();

        // Act
        telefon.AnnehmenAnruf();
        telefon.Auflegen();

    }

    @Test
    public void Kann_abheben_auflegen() {
        // Arrange
        var telefon = new Telefon(new Abgehoben());

        // Act
        telefon.Auflegen();

    }

    @Test
    public void Kann_NICHT_im_Zustand_Abgehoben_sprechen() {
        // Arrange
        var telefon = new Telefon(new Abgehoben());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Sprechen);
    }


    @Test
    public void Kann_NICHT_im_Zustand_Verbunden_waehlen() {
        // Arrange
        var telefon = new Telefon(new Verbunden());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Waehlen);
    }

    @Test
    public void Kann_NICHT_im_Zustand_Verbunden_abheben() {
        // Arrange
        var telefon = new Telefon(new Verbunden());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Abheben);
    }

    @Test
    public void Kann_NICHT_im_Zustand_Verbunden_annehmenAnruf() {
        // Arrange
        var telefon = new Telefon(new Verbunden());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::AnnehmenAnruf);
    }


    @Test
    public void Kann_NICHT_im_Zustand_Abgehoben_annehmenAnruf() {
        // Arrange
        var telefon = new Telefon(new Abgehoben());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::AnnehmenAnruf);
    }

    @Test
    public void Kann_NICHT_im_Zustand_Aufgelegt_waehlen() {
        // Arrange
        var telefon = new Telefon(new Aufgelegt());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Waehlen);
    }

    @Test
    public void Kann_NICHT_im_Zustand_Aufgelegt_sprechen() {
        // Arrange
        var telefon = new Telefon(new Aufgelegt());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Sprechen);

    }

    @Test
    public void Kann_NICHT_im_Zustand_Aufgelegt_auflegen() {
        // Arrange
        var telefon = new Telefon(new Aufgelegt());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Auflegen);
    }


    @Test
    public void Kann_NICHT_im_Zustand_Abgehoben_abheben() {
        // Arrange
        var telefon = new Telefon(new Abgehoben());

        // Act

        // Assert
        assertThrows(IllegalStateException.class, telefon::Abheben);
    }
}