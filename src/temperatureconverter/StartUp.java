package temperatureconverter;

import javax.swing.UIManager;

/**
 * StartUp class
 * @author kritterbusch
 */
public class StartUp {

    private final static String LOOK_AND_FEEL_ERR = "Custom look and feel error. Default look and feel will take its place.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Look and Feel
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(LOOK_AND_FEEL_ERR);
        }

        /**
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConverterWindow().setVisible(true);
            }
        });
    }

}
