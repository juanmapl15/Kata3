
package kata3;

import static java.awt.Adjustable.VERTICAL;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() { 
        super("Kata3: HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    

    private JPanel createPanel(){
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        
        JFreeChart chart;
        chart = ChartFactory.createBarChart(
                "JFrameChart",
                "Dominios email",
                "Nº email",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
                 
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        dataSet.addValue(15,"","ulpgc.es");
        dataSet.addValue(8,"","ull.es");
        dataSet.addValue(2,"","hotmail.com");
        dataSet.addValue(6,"","gmail.com");
        return dataSet;
        
    }

    
    
}
