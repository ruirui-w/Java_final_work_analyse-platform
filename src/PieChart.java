
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvasa
 */
public class PieChart {
    private String titlechart;
    private PieDataset dataset;
    public PieChart(String title, PieDataset dataset){
        this.titlechart = title;
        this.dataset = dataset;
    }

    public String getTitlechart() {
        return titlechart;
    }

    public void setTitlechart(String titlechart) {
        this.titlechart = titlechart;
    }

    public PieDataset getDataset() {
        return dataset;
    }

    public void setDataset(PieDataset dataset) {
        this.dataset = dataset;
    }
    
}
