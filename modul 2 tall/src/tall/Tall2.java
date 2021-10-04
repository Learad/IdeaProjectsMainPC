package tall;

import javax.swing.*;

public class Tall2 {
    public static void main(String [] args){
            String innStreng1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
            String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall till");
            int tall1 = Integer.parseInt(innStreng1);
            double tall2 = Double.parseDouble(innStreng2);
            double divisjon = tall1 / tall2;
            //JOptionPane.showMessageDialog(null, "Divisjonen ble "+divisjon);
            System.out.println("Summen til de to tallene er "+ divisjon);
    }
}
