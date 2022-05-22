
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
/**
 *
 * @author Jonathan Vasallo
 */
public class Charts extends javax.swing.JFrame {

    /**
     * Creates new form Charts
     */
    private static ArrayList<Graph> bargraph = new ArrayList();
    private static ArrayList<PieChart> piegraph = new ArrayList();
    private static ArrayList<Integer> sumArray;
    private static ArrayList<Integer> trackerSize = new ArrayList();
    private static Panel panel2;
    private static ArrayList<Integer> cntr = new ArrayList();
    private static ArrayList<Integer> cntr2 = new ArrayList();
    private static Boolean checkerBar = false;
    private static Boolean checkerPie = false;
    private static ArrayList<Integer> xSize = new ArrayList();
    private static ArrayList<Integer> ySize = new ArrayList();
    private static ArrayList<JFileChooser> fcArray = new ArrayList();
    private static ArrayList<Integer> valueForInsert = new ArrayList();
    private static ArrayList<CategoryDataset> setCounter = new ArrayList();

    public Charts() {
        initComponents();
    }

    /**
     * I Chose this method to experiment with its attributes, overall I dislike
     * how clunky the specific additions to the panel I wanted to make, however
     * these Methods portray the user with a well designed UI with interactive 
     * buttons and sliders to navigate through.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Chart = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(new java.awt.Dimension(720, 600));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));

        jButton1.setText("Show Bar Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Chart.setBackground(new java.awt.Color(0, 204, 204));
        Chart.setBorder(javax.swing.BorderFactory.createTitledBorder("Welcome to my Bar/Pie Chart Grapher"));
        Chart.setLayout(new javax.swing.BoxLayout(Chart, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setText("Read In Csv File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Customize Axis/Title");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton3KeyReleased(evt);
            }
        });

        jButton4.setText("Save Graph ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Show Pie Chart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(" Quit Program ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("BarChart  Ranges");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(20, 20, 20)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(Chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Chart, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        Chart.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this is for the bar chart button pressed
        if (bargraph.isEmpty() == false) {
            checkerPie = false;
            checkerBar = true;

            JFreeChart jchart = ChartFactory.createBarChart
        (bargraph.get(0).getTitleChart(),
                    bargraph.get(0).getXaxis(), bargraph.get(0).getYaxis(),
                    bargraph.get(0).getDataset(),
                    PlotOrientation.VERTICAL, true, true, false);

            CategoryPlot plot = jchart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.black);

            ChartFrame chartFramee = new ChartFrame("", jchart, true);
            //chartFramee.setVisible(true);
            chartFramee.setSize(500, 400);

            ChartPanel chartPanel = new ChartPanel(jchart);

            Chart.removeAll();
            Chart.add(chartPanel);
            Chart.updateUI();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //This is for the read in button
            JOptionPane.showMessageDialog(null, "Choose the .csv File "
                    + "you wish to graph");
            JFileChooser fc = new JFileChooser();
            int value = fc.showOpenDialog(fc);
            ySize.add(100);
            xSize.add(100);
            getcsvFile(value, fc);
            if (fcArray.isEmpty()) {
                fcArray.add(fc);
            } else if (fcArray.isEmpty() == false) {
                fcArray.remove(0);
                fcArray.add(fc);
            }
            if (valueForInsert.isEmpty()) {
                valueForInsert.add(value);
            } else if (valueForInsert.isEmpty() == false) {
                valueForInsert.remove(0);
                valueForInsert.add(value);
            }
            if (value == 0) {
                JOptionPane.showMessageDialog(fc, "File Has SuccessFully "
                        + "Loaded And Is Ready To Be Displayed");
            }

        } catch (NoSuchElementException ex) {
            JOptionPane.showMessageDialog(null, "You Unsuccessfully Read "
                    + "In the Csv File");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "You Unsuccessfully "
                    + "Read In the Csv File");;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //this is for the pie chart 
        //JFreeChart pchart = ChartFactory.createPieChart(title, dataset);
        if (piegraph.isEmpty() == false) {
            checkerPie = true;
            checkerBar = false;
            JFreeChart pchart = ChartFactory.createPieChart(piegraph.get(0).getTitlechart(), piegraph.get(0).getDataset());
            PiePlot plot = (PiePlot) pchart.getPlot();
            ChartFrame pchartFramee = new ChartFrame("Pie Chart", pchart);
            pchartFramee.setSize(500, 400);
            ChartPanel chartPanel = new ChartPanel(pchart);
            Chart.removeAll();
            Chart.add(chartPanel);
            Chart.updateUI();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // this pops up button for the user so select IF user selects change axis/title button
        panel2 = new java.awt.Panel(new GridLayout(2, 1));
        // purpose is to get them to type something
        

        JButton but = new JButton("Change X-Axis Name");
        JButton but2 = new JButton("Change Y-Axis Name");
        JButton buttonTitleChanger = new JButton("Change Title of Pie Chart");
        if (checkerPie == true) {
            Chart.removeAll();
            panel2.add(buttonTitleChanger);

            Chart.add(panel2);
            validate();
        }

        if (checkerBar == true) {
            Chart.removeAll();
            panel2.add(but);
            panel2.add(but2);
            Chart.add(panel2);
            validate();
        }

        but.addActionListener(new ActionListener() { 
// this should be able to remove the current chart AFTER it asks what user wants
            // to change the x axis title to , then X axis should change BAR CHART 
            //(Yaxis) buttom
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkerBar == true) { 
// then we can confirm the bargraph is what were trying to change 
                    String response = JOptionPane.showInputDialog("Type "
                            + "what you would like to change the X-axis to");
                    Chart.removeAll();
                    Chart.add(panel2); // add after 

                    bargraph.get(0).setXaxis(response);

                    JFreeChart jchart = ChartFactory.createBarChart
        (bargraph.get(0).getTitleChart(),
                            bargraph.get(0).getXaxis(), bargraph.get(0).getYaxis(),
                            bargraph.get(0).getDataset(),
                            PlotOrientation.VERTICAL, true, true, false);

                    CategoryPlot plot = jchart.getCategoryPlot();
                    plot.setRangeGridlinePaint(Color.black);

                    ChartFrame chartFramee = new ChartFrame("", jchart, true);
                    //chartFramee.setVisible(true);
                    chartFramee.setSize(500, 400);

                    ChartPanel chartPanel = new ChartPanel(jchart);
                    Chart.add(chartPanel); // add after 
                    Chart.add(panel2); // 
                    Chart.updateUI();
                }
                if (checkerPie == true) {

                }

            }
        });
        but2.addActionListener(new ActionListener() { // XAxis button for charts 
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkerBar == true) {
                    String response = JOptionPane.showInputDialog("Type "
                            + "what you would like to change the Y-axis to");
                    Chart.removeAll();
                    Chart.add(panel2); // add after 

                    bargraph.get(0).setYaxis(response);

                    JFreeChart jchart = ChartFactory.createBarChart
        (bargraph.get(0).getTitleChart(),
                            bargraph.get(0).getXaxis(), bargraph.get(0).getYaxis(),
                            bargraph.get(0).getDataset(),
                            PlotOrientation.VERTICAL, true, true, false);

                    CategoryPlot plot = jchart.getCategoryPlot();
                    plot.setRangeGridlinePaint(Color.black);

                    ChartFrame chartFramee = new ChartFrame("", jchart, true);
                    //chartFramee.setVisible(true);
                    chartFramee.setSize(500, 400);

                    ChartPanel chartPanel = new ChartPanel(jchart);
                    Chart.add(chartPanel); // add after 
                    Chart.add(panel2); // 
                    Chart.updateUI();
                }
                if (checkerPie == true) {

                }
            }
        });

        buttonTitleChanger.addActionListener(new ActionListener() { // title changer for pie graph 

            @Override
            public void actionPerformed(ActionEvent e) {

                String response = JOptionPane.showInputDialog("Type what "
                        + "you would like to change the Title to");
                piegraph.get(0).setTitlechart(response);

                JFreeChart pchart = ChartFactory.createPieChart
        (piegraph.get(0).getTitlechart(), piegraph.get(0).getDataset());
                PiePlot plot = (PiePlot) pchart.getPlot();
                ChartFrame pchartFramee = new ChartFrame("Pie ChartR", pchart);
                pchartFramee.setSize(500, 400);
                ChartPanel chartPanel = new ChartPanel(pchart);
                Chart.removeAll();
                Chart.add(chartPanel);
                Chart.updateUI();
            }
        });


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Quit Button
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jButton3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // data ranges button 
        if (checkerBar == true) {
            JSlider jSlider1 = new javax.swing.JSlider();
            JSlider jSlider2 = new javax.swing.JSlider();
            JPanel sliderPanel = new JPanel(new GridLayout(4, 4, 5, 5));
            JLabel label1 = new JLabel("Choose Y-Axis Ranges");
            JLabel label2 = new JLabel("Choose X-Axis Ranges");
            JButton confirm = new JButton("Confirm");

            jSlider1.setMinorTickSpacing(1);
            jSlider1.setMajorTickSpacing(10);

            jSlider2.setMinorTickSpacing(1);
            jSlider2.setMajorTickSpacing(10);

            jSlider1.setMinimum(0);
            jSlider1.setMaximum(100);

            jSlider2.setMinimum(0);
            jSlider2.setMaximum(10);

            jSlider1.setPaintTicks(true);
            jSlider1.setPaintLabels(true);

            jSlider2.setPaintTicks(true);
            jSlider2.setPaintLabels(true);
            sliderPanel.add(label1);
            sliderPanel.add(jSlider1);
//            sliderPanel.add(label2);
//            sliderPanel.add(jSlider2);
            //如果横坐标是数字的话会才会用到x轴的限制，这里没有调用slider2
            sliderPanel.add(confirm, BorderLayout.SOUTH);

            Chart.removeAll();
            Chart.add(sliderPanel);
            Chart.updateUI();

            jSlider1.addChangeListener(new ChangeListener() { // slider 1 is Y
                public void stateChanged(ChangeEvent event) {
                    int value = jSlider1.getValue();
                    
                    if (ySize.isEmpty()) {
                        xSize.add(value);
                    } else if (xSize.isEmpty() == false) {
                        ySize.remove(0);
                        ySize.add(value);
                    }

                }
            });
            jSlider2.addChangeListener(new ChangeListener() { // slider 2 is X
                public void stateChanged(ChangeEvent event) {
                    int value = jSlider2.getValue();
                    
                    if (xSize.isEmpty()) {
                        xSize.add(value);
                    } else if (xSize.isEmpty() == false) {
                        xSize.remove(0);
                        xSize.add(value);
                    }

                }
            });
            confirm.addActionListener(new ActionListener() { // confirm button 

                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        getcsvFile(valueForInsert.get(0), fcArray.get(0)); //
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Charts.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            });
        }
        // end of button 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Save Button 
        JOptionPane.showMessageDialog(null, "Save an Image by Right "
                + "Clicking the Chart and Selecting\nSave As "
                + "--> PNG");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Charts.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Charts.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Charts.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Charts.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Charts().setVisible(true);
            }
        });
    }
    /**
     * This Method takes in the return value the user selects when and if they
     * choose a successful file == 1 and takes the specific csv file in order
     * to scan through line by line assigning values to certain attributes of 
     * each pie or bar graph inheriting based on each. 
     */
    public static void getcsvFile(int value, JFileChooser fc) throws FileNotFoundException {

        if (cntr.isEmpty() == false) {

            for (int i = 0; i < cntr.size(); i++) {
                cntr2.remove(i);
            }
        }

        sumArray = new ArrayList();

        // gets the cvs file with file chooser
        // need to figure how to get file chooser to pop up
        // end of if statement
        if (value == 0) { // then user tried opening the file 
            File file = fc.getSelectedFile();
            if (fcArray.isEmpty()) {// should only display first time 

            }
            // tells user its opening
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");
            String firstCol = sc.nextLine();
            String col[] = firstCol.split(","); // for the first fow
            DefaultCategoryDataset set = new DefaultCategoryDataset();
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            //int[] myIntArray = new int[3];
            while (sc.hasNext()) { // so if the file has a next row

                String wholeline;
                // will be the top row
                wholeline = sc.nextLine();
                String arrayFile[] = wholeline.split(",");

                //System.out.println(Arrays.toString(myIntArray));
                if (arrayFile.length <= 2) { 
                // if it is the number book by author csv file 

                    
                    int tempint = Integer.parseInt(arrayFile[1]);
                    if (tempint <= ySize.get(0)) {  // 
                        
                        set.setValue(tempint, arrayFile[0], "");
            // try and add set to an array list and with this array list we can 

                    }

                    createBarGraph(col[0], col[1], set); // creates barchart 

                    pieDataset.setValue(arrayFile[0], tempint);
                    createPieChart("Pie Chart", pieDataset);
                } else if (arrayFile.length > 2) { // if it is the decades data 
                      
// so col[0] will be the decade and arrayFile[] will have all of the decades 

                    for (int i = 1; i < arrayFile.length; i++) { 
// for the size of this particular line of excel commas it should be 6 these 
                      // 6 components are would we need to focus on indiviually 
                        //arrayFile[1] gives a number just like all 1-5 
                        if (sumArray.isEmpty()) {
                            sumArray.add(Integer.parseInt(arrayFile[i]));
                        } else if (sumArray.isEmpty() == false && 
                                sumArray.size() < arrayFile.length - 1) { 
// if the array isnt empty and the first element isnt null 
                            sumArray.add(Integer.parseInt(arrayFile[i])); 
// this will add into array if it doesnt exist already 
                        }
                        if (sumArray.isEmpty() == false && sumArray.size() 
                                >= arrayFile.length - 1) { 
// array isnt empty but the element were targeting does exist -> add them up 
                            int tempsum = sumArray.get(i - 1); // prev value
                            int tempnumber = Integer.parseInt(arrayFile[i]); 
// new value to add
                            sumArray.set(i - 1, tempsum + tempnumber); 
// add them up and make new value

                        }

                        int tempint = Integer.parseInt(arrayFile[i]); 
// this is saying if the value on Y axis is 

// greater than the user selected max size Y - axis range then dont add it , 
//- if smaller then ok to add
                        if (tempint <= ySize.get(0) && i <= xSize.get(0)) { 
// if both y value and x values are met then set values for graph if not nothing happens 
                            set.setValue(tempint, arrayFile[0], col[i]);
                            pieDataset.setValue(col[i], sumArray.get(i - 1));
                        }

                    }

                    createBarGraph(col[0], "Albums", set);

                    createPieChart("Pie Chart", pieDataset);

                }

            } // end of while loop 
            

            // this happens regardless if val == 0 
        } // end of value ==0 
        else if (value == 1) { // then the user tried cancelling the process

        }

    } // end of getcsvFile()

    /**
     * This method takes in 2 Strings from the excel data and incorporates them
     * as Labels for the barGraph, also a Data set is included to fill in the data
     * needed to fill the actual graph in. 
     */
    public static void createBarGraph(String col1, String col2, CategoryDataset set) {
        Graph graph = new Graph("", col1, col2, set); // this is for a BarGraph
        if (bargraph.isEmpty()) {
            bargraph.add(graph);
        } else if (bargraph.isEmpty() == false) {
            bargraph.remove(0);
            bargraph.add(graph);
        }
    }
/**
     * This method takes in 1 String from the excel data and incorporates it
     * as a Label for the PieGraph, also a Pie Data set is included to fill in the data
     * needed to fill the actual Pie graph in. 
     */
    public static void createPieChart(String col1, PieDataset num) {
        PieChart pie = new PieChart(col1, num); // this is for a BarGraph
        if (piegraph.isEmpty()) {
            piegraph.add(pie);
        } else if (piegraph.isEmpty() == false) {
            piegraph.remove(0);
            piegraph.add(pie);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
