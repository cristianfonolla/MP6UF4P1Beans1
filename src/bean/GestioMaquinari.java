/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cristian
 */
public class GestioMaquinari implements Serializable {

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";

    public static final String PROP_STOCK_ANUAL = "stockActual";

    public static final String PROP_STOCK_MINIM = "stockMinim";

    public static final String PROP_Pvp = "Pvp";

    public static final String PROP_anyFabricacio = "anyFabricacio";

    private String sampleProperty;

    private VetoableChangeSupport vetoableSupport;

    private PropertyChangeSupport propertySupport;

    private String numSerie;

    private String denominacio;

    private String fabricant;

    private int stockActual;

    private int stockMinim;

    private float preuCost;

    private float Pvp;

    private int anyFabricacio;

    private String[] caracTecniques;

    private String categoria;

    private String ubicacio;

    private Date dataAlta;

    public GestioMaquinari() {
        propertySupport = new PropertyChangeSupport(this);
        vetoableSupport = new VetoableChangeSupport(this);
    }

    public String getSampleProperty() {
        return sampleProperty;
    }

    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableSupport.removeVetoableChangeListener(listener);
    }

    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDenominacio() {
        return denominacio;
    }

    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) throws PropertyVetoException {

        vetoableSupport.fireVetoableChange(PROP_STOCK_ANUAL, this.stockActual, stockActual);

        this.stockActual = stockActual;
        propertySupport.firePropertyChange(PROP_STOCK_ANUAL, this.stockActual, this.stockMinim);

    }

    public int getStockMinim() {
        return stockMinim;
    }

    public void setStockMinim(int stockMinim) throws PropertyVetoException {

        vetoableSupport.fireVetoableChange(PROP_STOCK_MINIM, this.stockMinim, stockMinim);

        propertySupport.firePropertyChange(PROP_STOCK_MINIM, this.stockMinim, stockMinim);
        this.stockMinim = stockMinim;

    }

    public float getPreuCost() {
        return preuCost;
    }

    public void setPreuCost(float preuCost) {
        this.preuCost = preuCost;
    }

    public float getPvp() {
        return Pvp;
    }

    public void setPvp(float Pvp) throws PropertyVetoException {
        vetoableSupport.fireVetoableChange(PROP_Pvp, this.Pvp, Pvp);
        this.Pvp = Pvp;
    }

    public int getAnyFabricacio() {
        return anyFabricacio;
    }

    public void setAnyFabricacio(int anyFabricacio) {
        propertySupport.firePropertyChange(PROP_anyFabricacio, this.anyFabricacio, anyFabricacio);
        this.anyFabricacio = anyFabricacio;
    }

    public String[] getCaracTecniques() {
        return caracTecniques;
    }

    public String getCaracTecniques(int index) {
        return caracTecniques[index];
    }

    public void setCaracTecniques(String[] caracTecniques) {
        this.caracTecniques = caracTecniques;
    }

    public void setCaracTecniques(int index, String valor) {
        this.caracTecniques[index] = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public VetoableChangeSupport getVetoableSupport() {
        return vetoableSupport;
    }

    public void setVetoableSupport(VetoableChangeSupport vetoableSupport) {
        this.vetoableSupport = vetoableSupport;
    }

}
