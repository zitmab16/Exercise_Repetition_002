
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class WetterModell extends AbstractListModel{
    private ArrayList<WetterWert> werte = new ArrayList();

    @Override
    public int getSize() {
        return werte.size();
    }

    @Override
    public Object getElementAt(int index) {
        return werte.get(index);
    }
    public void add(WetterWert w){
        werte.add(w);
        fireIntervalAdded(this, 0, werte.size()-1);
    }
    public void save(File f){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM - hh:mm:ss");
       try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
                for (WetterWert ww : werte) {
                   bw.write(String.format("%s,%d,%d",ww.getZeitpunkt().format(dtf),ww.getTemperatur(),ww.getLuftfeuchtigkeit()));
                   bw.newLine();
           }
                
            }catch(Exception ex){
                
            }  
    }
    
}
