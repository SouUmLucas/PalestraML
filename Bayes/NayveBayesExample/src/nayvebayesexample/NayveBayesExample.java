package nayvebayesexample;

import java.util.logging.Level;
import java.util.logging.Logger;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class NayveBayesExample {
    private static Instances instances;
    
    public static void main(String[] args) {
        try {
            DataSource ds = new DataSource("src\\util\\devejogar.arff");
            
            instances = ds.getDataSet();
            instances.setClassIndex(instances.numAttributes() - 1);
            
            System.out.println(instances.toString());
        } catch (Exception ex) {
            Logger.getLogger(NayveBayesExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
