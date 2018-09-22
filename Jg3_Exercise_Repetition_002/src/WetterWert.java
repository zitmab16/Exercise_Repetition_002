
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class WetterWert {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM - hh:mm:ss");
    private int temperatur;
    private int luftfeuchtigkeit;
    private LocalDateTime zeitpunkt;

    public WetterWert(int temperatur, int luftfeuchtigkeit, LocalDateTime zeitpunkt) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return String.format("%s - %d° - %d%%",zeitpunkt.format(dtf),temperatur,luftfeuchtigkeit);
    }


    
}
