/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.*;

/**
 *
 * @author cristian
 */
public class GestioMaquinariBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( bean.GestioMaquinari.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_anyFabricacio = 0;
    private static final int PROPERTY_caracTecniques = 1;
    private static final int PROPERTY_categoria = 2;
    private static final int PROPERTY_dataAlta = 3;
    private static final int PROPERTY_denominacio = 4;
    private static final int PROPERTY_fabricant = 5;
    private static final int PROPERTY_numSerie = 6;
    private static final int PROPERTY_preuCost = 7;
    private static final int PROPERTY_propertySupport = 8;
    private static final int PROPERTY_pvp = 9;
    private static final int PROPERTY_sampleProperty = 10;
    private static final int PROPERTY_stockActual = 11;
    private static final int PROPERTY_stockMinim = 12;
    private static final int PROPERTY_ubicacio = 13;
    private static final int PROPERTY_vetoableSupport = 14;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[15];
    
        try {
            properties[PROPERTY_anyFabricacio] = new PropertyDescriptor ( "anyFabricacio", bean.GestioMaquinari.class, "getAnyFabricacio", "setAnyFabricacio" ); // NOI18N
            properties[PROPERTY_caracTecniques] = new IndexedPropertyDescriptor ( "caracTecniques", bean.GestioMaquinari.class, "getCaracTecniques", "setCaracTecniques", "getCaracTecniques", "setCaracTecniques" ); // NOI18N
            properties[PROPERTY_categoria] = new PropertyDescriptor ( "categoria", bean.GestioMaquinari.class, "getCategoria", "setCategoria" ); // NOI18N
            properties[PROPERTY_dataAlta] = new PropertyDescriptor ( "dataAlta", bean.GestioMaquinari.class, "getDataAlta", "setDataAlta" ); // NOI18N
            properties[PROPERTY_denominacio] = new PropertyDescriptor ( "denominacio", bean.GestioMaquinari.class, "getDenominacio", "setDenominacio" ); // NOI18N
            properties[PROPERTY_fabricant] = new PropertyDescriptor ( "fabricant", bean.GestioMaquinari.class, "getFabricant", "setFabricant" ); // NOI18N
            properties[PROPERTY_numSerie] = new PropertyDescriptor ( "numSerie", bean.GestioMaquinari.class, "getNumSerie", "setNumSerie" ); // NOI18N
            properties[PROPERTY_preuCost] = new PropertyDescriptor ( "preuCost", bean.GestioMaquinari.class, "getPreuCost", "setPreuCost" ); // NOI18N
            properties[PROPERTY_propertySupport] = new PropertyDescriptor ( "propertySupport", bean.GestioMaquinari.class, "getPropertySupport", "setPropertySupport" ); // NOI18N
            properties[PROPERTY_propertySupport].setHidden ( true );
            properties[PROPERTY_pvp] = new PropertyDescriptor ( "pvp", bean.GestioMaquinari.class, "getPvp", "setPvp" ); // NOI18N
            properties[PROPERTY_sampleProperty] = new PropertyDescriptor ( "sampleProperty", bean.GestioMaquinari.class, "getSampleProperty", "setSampleProperty" ); // NOI18N
            properties[PROPERTY_stockActual] = new PropertyDescriptor ( "stockActual", bean.GestioMaquinari.class, "getStockActual", "setStockActual" ); // NOI18N
            properties[PROPERTY_stockMinim] = new PropertyDescriptor ( "stockMinim", bean.GestioMaquinari.class, "getStockMinim", "setStockMinim" ); // NOI18N
            properties[PROPERTY_ubicacio] = new PropertyDescriptor ( "ubicacio", bean.GestioMaquinari.class, "getUbicacio", "setUbicacio" ); // NOI18N
            properties[PROPERTY_vetoableSupport] = new PropertyDescriptor ( "vetoableSupport", bean.GestioMaquinari.class, "getVetoableSupport", "setVetoableSupport" ); // NOI18N
            properties[PROPERTY_vetoableSupport].setHidden ( true );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_propertyChangeListener = 0;
    private static final int EVENT_vetoableChangeListener = 1;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[2];
    
        try {
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( bean.GestioMaquinari.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( bean.GestioMaquinari.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[0];//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
