/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.GestioMaquinari;
import java.beans.PropertyVetoException;
import java.util.Calendar;

/**
 *
 * @author cristian
 */
public class Main {

    public static void main(String[] args) throws PropertyVetoException {

        GestioMaquinari gM = new GestioMaquinari();
        Receptor receptor = new Receptor();
        Restrictor restrictor = new Restrictor();

        gM.addPropertyChangeListener(receptor);
        gM.addVetoableChangeListener(restrictor);

        //Exercisi 1: Avisar si l'stockAnual es inferior al mínim:
        //
        //
        /**
         * Primer de tot posarem el stockMinim a 10, després posarem el
         * stockActual a 9 (ja que és menor que l'stock mínim ens avisarà).
         */
        //
        //
        System.out.println("EXERCISI 1: ");
        gM.setStockMinim(10);
        gM.setStockActual(9);
        System.out.println("");
        System.out.println("");
        //
        //
        //
        //Exercisi 2: Impedir que siguen negatius:
        //
        //
        /**
         * Primer de tot posarem el stock minim a 25 i el actual a 50 després
         * posarem dos SOUT'S per comprovar el stock minim i actual amb el
         * getter de cadascún, després farem dos trycatch i dintre farem els dos
         * setters de les dos propietats, i tornarem a comprovar si s'han posat
         * els valor negatius o realment s'han restringit.
         */
        //
        //
        System.out.println("EXERCISI 2: ");

        gM.setStockMinim(25);
        gM.setStockActual(50);

        System.out.println("Valor actual STOCKACTUAL: " + gM.getStockActual());
        System.out.println("Valor actual STOCKMINIM: " + gM.getStockMinim() + "\n");

        System.out.println("A continuació fem els dos setters: \n");

        try {
            gM.setStockActual(-25);
        } catch (Exception e) {
            System.out.println("ERROR NO POT SER NEGATIU, STOCKANUAL");
        }

        try {
            gM.setStockMinim(-58);
        } catch (Exception e) {
            System.out.println("ERROR NO POT SER NEGATIU, STOCKMINIM");
        }

        System.out.println("\n" + "Tornem a comprovar el stockActual i hauria de ser el mateix que abans si s'ha"
                + " restringit correctament: " + gM.getStockActual());

        System.out.println("Tornem a comprovar el stockMinim i hauria de ser el mateix que abans si s'ha"
                + " restringit correctament: " + gM.getStockMinim());
        System.out.println(""
                + "\n");
        //
        //
        //
        //Exercisi 3: Impedir Pvp menor o igual a 0
        //
        //
        System.out.println("Exercisi 3: ");
        gM.setPvp(100F);
        System.out.println("Pvp actual: " + gM.getPvp() + "\n");

        System.out.println("Ara canviarem i posarem el Pvp a -15 i a 0, ha de petar amb els dos casos \n");

        try {
            gM.setPvp(-15F);
        } catch (Exception e) {
            System.out.println("Error Pvp = -15, no pot ser negatiu o igual a 0");
        }

        try {
            gM.setPvp(0F);
        } catch (Exception e) {
            System.out.println("Error Pvp = 0, no pot ser negatiu o igual a 0");
        }
        System.out.println(""
                + "\n");
        //
        //
        //
        System.out.println("Exercisi 4: ");
        System.out.println("Li posem al any de fabricació 2017 i comprovem que no peta:\n");
        gM.setAnyFabricacio(2017);

        System.out.println("Ara li posarem un de fa 5 anys (petarà) un de 4 (no petarà) "
                + "i el 2018 (petarà)\n");

        System.out.println("2011");
        gM.setAnyFabricacio(2011);
        System.out.println("");

        System.out.println("2013");
        gM.setAnyFabricacio(2013);
        System.out.println("");

        System.out.println("2018");
        gM.setAnyFabricacio(2018);
    }

}
