/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bananawaga
 */
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class changeResolution extends javax.swing.JFrame implements ChangeListener{

    /**
     * Creates new form as
     */
    public changeResolution() {
        initComponents();
        starter();
    }

public void starter(){
        btnVerySmall.addChangeListener(this);
        btnSmall.addChangeListener(this);
        btnNormal.addChangeListener(this);
        btnBig.addChangeListener(this);
}

public void changeResolution(String txtBtn){
        String[] txtButton = txtBtn.split("x");
        String xstr = txtButton[0];
        String ystr = txtButton[1];
        int x = Integer.parseInt(xstr);
        int y = Integer.parseInt(ystr);
        setSize (x,y);
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupRes = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        btnVerySmall = new javax.swing.JRadioButton();
        btnSmall = new javax.swing.JRadioButton();
        btnNormal = new javax.swing.JRadioButton();
        btnBig = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setText("CHOOSE YOUR DESIRED RESOLUTION");

        btnGroupRes.add(btnVerySmall);
        btnVerySmall.setText("640x840");

        btnGroupRes.add(btnSmall);
        btnSmall.setText("800x600");

        btnGroupRes.add(btnNormal);
        btnNormal.setText("1024x768");

        btnGroupRes.add(btnBig);
        btnBig.setText("1920x1080");
        btnBig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBig)
                    .addComponent(btnNormal)
                    .addComponent(btnSmall)
                    .addComponent(btnVerySmall))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(43, 43, 43)
                .addComponent(btnVerySmall)
                .addGap(18, 18, 18)
                .addComponent(btnSmall)
                .addGap(18, 18, 18)
                .addComponent(btnNormal)
                .addGap(18, 18, 18)
                .addComponent(btnBig)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBigActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(changeResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeResolution().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBig;
    private javax.swing.ButtonGroup btnGroupRes;
    private javax.swing.JRadioButton btnNormal;
    private javax.swing.JRadioButton btnSmall;
    private javax.swing.JRadioButton btnVerySmall;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        AbstractButton xButton = (AbstractButton)e.getSource();
        ButtonModel xModel = xButton.getModel();
            if (xModel.isSelected()){
                changeResolution(xButton.getText());
            }
        
    }
}
