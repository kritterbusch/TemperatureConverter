package temperatureconverter;

import java.text.DecimalFormat;

/**
 * GUI window class
 * @author kritterbusch
 */
public class TempConverterWindow extends javax.swing.JFrame {

    double num;
    double ansCelsius;
    double ansFahrenheit;
    String msg;
    private final TemperatureConverterService tempConverter;
    
    /**
     * Creates new form TempConverterWindow
     */
    public TempConverterWindow() {
        initComponents();
        tempConverter = new TemperatureConverterService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpSelection = new javax.swing.ButtonGroup();
        txtEnterValue = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        txtConverterTitle = new javax.swing.JLabel();
        slctCtoF = new javax.swing.JRadioButton();
        slctFtoC = new javax.swing.JRadioButton();
        txtInstruction = new javax.swing.JLabel();
        lblOutputMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtEnterValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterValueActionPerformed(evt);
            }
        });

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        txtConverterTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtConverterTitle.setForeground(new java.awt.Color(204, 0, 51));
        txtConverterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConverterTitle.setText("Temperature Converter");

        btnGrpSelection.add(slctCtoF);
        slctCtoF.setText("Celsius to Fahrenheit");
        slctCtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slctCtoFActionPerformed(evt);
            }
        });

        btnGrpSelection.add(slctFtoC);
        slctFtoC.setText("Fahrenheit to Celsius");
        slctFtoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slctFtoCActionPerformed(evt);
            }
        });

        txtInstruction.setText("Enter Value to Convert");

        lblOutputMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(slctCtoF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(slctFtoC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(txtInstruction)
                        .addGap(18, 18, 18)
                        .addComponent(txtEnterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOutputMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtConverterTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtConverterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slctCtoF)
                    .addComponent(slctFtoC))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstruction)
                    .addComponent(txtEnterValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOutputMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvert)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterValueActionPerformed
        String number = txtEnterValue.getText();
        double num = Double.valueOf(number);
    }//GEN-LAST:event_txtEnterValueActionPerformed

    private void slctCtoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slctCtoFActionPerformed
        slctCtoF.isSelected();
    }//GEN-LAST:event_slctCtoFActionPerformed

    private void slctFtoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slctFtoCActionPerformed
        slctFtoC.isSelected();
    }//GEN-LAST:event_slctFtoCActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        DecimalFormat formatter = new DecimalFormat("#0.0");
        num = Double.valueOf(txtEnterValue.getText());

        if (slctFtoC.isSelected()) {
            ansCelsius = ((num - 32) * (.555555556));
            msg = num + " degrees Fahrenheit is " + formatter.format(ansCelsius) + " degrees Celsius.";
            lblOutputMessage.setText(msg);
            
        } else if (slctCtoF.isSelected()){
            ansFahrenheit = (num * 1.8) + 32;
            msg = num + " degrees Celsius is " + formatter.format(ansFahrenheit) + " degrees Fahrenheit.";
            lblOutputMessage.setText(msg);
    }//GEN-LAST:event_btnConvertActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup btnGrpSelection;
    private javax.swing.JLabel lblOutputMessage;
    private javax.swing.JRadioButton slctCtoF;
    private javax.swing.JRadioButton slctFtoC;
    private javax.swing.JLabel txtConverterTitle;
    private javax.swing.JTextField txtEnterValue;
    private javax.swing.JLabel txtInstruction;
    // End of variables declaration//GEN-END:variables
}
