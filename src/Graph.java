
import org.jfree.data.category.CategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jvasa
 */
public class Graph {
    private String titleChart;
    private String xaxis;
    private String yaxis;
    private CategoryDataset dataset;
    public Graph(String title, String xaxis, String yaxis, CategoryDataset dataset) {
        //.createBarChart("Student Record", "Student", "Grade", dataC
        this.titleChart = title;
        this.xaxis = xaxis;
        this.yaxis = yaxis;
        this.dataset = dataset;
    }
    Graph() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitleChart() {
        return titleChart;
    }

    public void setTitleChart(String titleChart) {
        this.titleChart = titleChart;
    }

    public String getXaxis() {
        return xaxis;
    }

    public void setXaxis(String xaxis) {
        this.xaxis = xaxis;
    }

    public String getYaxis() {
        return yaxis;
    }

    public void setYaxis(String yaxis) {
        this.yaxis = yaxis;
    }

    public CategoryDataset getDataset() {
        return dataset;
    }

    public void setDataset(CategoryDataset dataset) {
        this.dataset = dataset;
    }
    
}
