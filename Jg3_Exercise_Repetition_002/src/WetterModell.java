
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
    
}
