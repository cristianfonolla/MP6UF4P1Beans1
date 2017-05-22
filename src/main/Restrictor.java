/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

/**
 *
 * @author cristian
 */
public class Restrictor implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {

        if (evt.getPropertyName().equals("stockActual") || evt.getPropertyName().equals("stockMinim")) {

            if (Integer.valueOf(evt.getNewValue().toString()) < 0) {
                throw new PropertyVetoException("Error no pot ser negatiu", evt);
            }

        }

        if (evt.getPropertyName().equals("Pvp")) {

            if (Float.valueOf(evt.getNewValue().toString()) <= 0) {
                throw new PropertyVetoException("Error no pot ser negatiu o igual a 0", evt);
            }

        }

    }

}
