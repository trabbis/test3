
package com.designpattern.builder;

/**
 * @author dchoi@nbsps.com
 *
 */
public class Pizza {
    private String dough  = "";
    private String sauce = "";
    private String topping = "";

    /**
     * @return the dough
     */
    public String getDough() {
        return dough;
    }
    /**
     * @param dough the dough to set
     */
    public void setDough(String dough) {
        this.dough = dough;
    }
    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }
    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    /**
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }
    /**
     * @param topping the topping to set
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    @Override
    public String toString() {
        return this.dough + "," +
                this.sauce + "," +
                this.topping;
    }

}
