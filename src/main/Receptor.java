/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Receptor implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        if (evt.getPropertyName().equals("stockActual")) {
            try {

                if (Integer.valueOf(evt.getOldValue().toString()) < Integer.valueOf(evt.getNewValue().toString())) {

                    System.out.println("Atencio el valor introduit nou '" + evt.getOldValue() + "' és mes menut que el stock mínim '"
                            + evt.getNewValue() + "'.");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }
        if (evt.getPropertyName().equals("anyFabricacio")) {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int cincAnysMenos = year - 5;

            if (Integer.valueOf(evt.getNewValue().toString()) < cincAnysMenos || Integer.valueOf(evt.getNewValue().toString()) > year) {
                System.out.println("Atencio, el any introduït és "
                        + "més gran a l'any actual o de fa 5 anys");
            }
        }

    }

}
