/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirrestaurant;

/**
 *
 * @author USER
 */
public class KasirForm extends javax.swing.JFrame {

    /**
     * Creates new form KasirForm
     */
    public KasirForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RBNasiGoreng = new javax.swing.JRadioButton();
        RBAyamBakar = new javax.swing.JRadioButton();
        RBAyamGoreng = new javax.swing.JRadioButton();
        RBLeleGoreng = new javax.swing.JRadioButton();
        RBLeleBakar = new javax.swing.JRadioButton();
        RBSateAyam = new javax.swing.JRadioButton();
        RBSateKambing = new javax.swing.JRadioButton();
        RBSotoAyam = new javax.swing.JRadioButton();
        TXTNasiGoreng = new javax.swing.JTextField();
        TXTAyamBakar = new javax.swing.JTextField();
        TXTAyamGoreng = new javax.swing.JTextField();
        TXTLeleGoreng = new javax.swing.JTextField();
        TXTLeleBakar = new javax.swing.JTextField();
        TXTSateAyam = new javax.swing.JTextField();
        TXTSateKambing = new javax.swing.JTextField();
        TXTSotoAyam = new javax.swing.JTextField();
        JMLNasiGoreng = new javax.swing.JTextField();
        JMLAyamBakar = new javax.swing.JTextField();
        JMLAyamGoreng = new javax.swing.JTextField();
        JMLLeleGoreng = new javax.swing.JTextField();
        JMLLeleBakar = new javax.swing.JTextField();
        JMLSateAyam = new javax.swing.JTextField();
        JMLSateKambing = new javax.swing.JTextField();
        JMLSotoAyam = new javax.swing.JTextField();
        TXTTotalHarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        HITUNG = new javax.swing.JButton();
        HAPUS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RBNasiGoreng.setText("Nasi Goreng");
        RBNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBNasiGorengActionPerformed(evt);
            }
        });
        getContentPane().add(RBNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 132, -1, -1));

        RBAyamBakar.setText("Ayam Bakar+ Nasi");
        RBAyamBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAyamBakarActionPerformed(evt);
            }
        });
        getContentPane().add(RBAyamBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 173, -1, -1));

        RBAyamGoreng.setText("Ayam Goreng+Nasi");
        RBAyamGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAyamGorengActionPerformed(evt);
            }
        });
        getContentPane().add(RBAyamGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 214, -1, -1));

        RBLeleGoreng.setText("Lele Goreng + Nasi");
        RBLeleGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBLeleGorengActionPerformed(evt);
            }
        });
        getContentPane().add(RBLeleGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 255, -1, -1));

        RBLeleBakar.setText("Lele Bakar + Nasi");
        RBLeleBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBLeleBakarActionPerformed(evt);
            }
        });
        getContentPane().add(RBLeleBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 296, -1, -1));

        RBSateAyam.setText("Sate Ayam + Nasi");
        RBSateAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSateAyamActionPerformed(evt);
            }
        });
        getContentPane().add(RBSateAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 337, -1, -1));

        RBSateKambing.setText("Sate Kambing + Nasi");
        RBSateKambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSateKambingActionPerformed(evt);
            }
        });
        getContentPane().add(RBSateKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 385, -1, -1));

        RBSotoAyam.setText("Soto Ayam + Nasi");
        RBSotoAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSotoAyamActionPerformed(evt);
            }
        });
        getContentPane().add(RBSotoAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 436, -1, -1));

        TXTNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNasiGorengActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 133, 69, -1));

        TXTAyamBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAyamBakarActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAyamBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 173, 69, -1));

        TXTAyamGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAyamGorengActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAyamGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 215, 69, -1));

        TXTLeleGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTLeleGorengActionPerformed(evt);
            }
        });
        getContentPane().add(TXTLeleGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 256, 69, -1));

        TXTLeleBakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTLeleBakarActionPerformed(evt);
            }
        });
        getContentPane().add(TXTLeleBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 297, 69, -1));

        TXTSateAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTSateAyamActionPerformed(evt);
            }
        });
        getContentPane().add(TXTSateAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 338, 73, -1));
        getContentPane().add(TXTSateKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 386, 72, -1));
        getContentPane().add(TXTSotoAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 437, 72, -1));

        JMLNasiGoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMLNasiGorengActionPerformed(evt);
            }
        });
        getContentPane().add(JMLNasiGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 133, 79, -1));
        getContentPane().add(JMLAyamBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 173, 77, -1));
        getContentPane().add(JMLAyamGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 214, 77, -1));
        getContentPane().add(JMLLeleGoreng, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 256, 77, -1));
        getContentPane().add(JMLLeleBakar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 297, 77, -1));
        getContentPane().add(JMLSateAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 338, 77, -1));
        getContentPane().add(JMLSateKambing, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 386, 73, -1));
        getContentPane().add(JMLSotoAyam, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 437, 72, -1));
        getContentPane().add(TXTTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 605, 233, 64));

        jLabel1.setText("Total Bayar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 620, -1, -1));

        HITUNG.setText("HITUNG");
        HITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITUNGActionPerformed(evt);
            }
        });
        getContentPane().add(HITUNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 527, -1, -1));

        HAPUS.setText("HAPUS");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });
        getContentPane().add(HAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 527, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("DAFTAR MENU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\downloadwww.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNasiGorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNasiGorengActionPerformed

    private void RBNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBNasiGorengActionPerformed
int nasigoreng = 15000;
        if (RBNasiGoreng.isSelected()){
            
            TXTNasiGoreng.setText("" + RBNasiGoreng.getText());
            TXTNasiGoreng.setText("" + nasigoreng);
        }else{
            
            TXTNasiGoreng.setText("");
        }
    }//GEN-LAST:event_RBNasiGorengActionPerformed

    private void TXTAyamBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAyamBakarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAyamBakarActionPerformed

    private void JMLNasiGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMLNasiGorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMLNasiGorengActionPerformed

    private void TXTAyamGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAyamGorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAyamGorengActionPerformed

    private void TXTLeleGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTLeleGorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTLeleGorengActionPerformed

    private void TXTLeleBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTLeleBakarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTLeleBakarActionPerformed

    private void TXTSateAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTSateAyamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTSateAyamActionPerformed

    private void RBSateAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSateAyamActionPerformed
        // TODO add your handling code here:
                
        int sateayam = 13000;
        if (RBSateAyam.isSelected()){
            TXTSateAyam.setText(""+ RBSateAyam.getText());
            TXTSateAyam.setText(""+ sateayam);
        }else{
            TXTSateAyam.setText("");
        }
    }//GEN-LAST:event_RBSateAyamActionPerformed

    private void RBSateKambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSateKambingActionPerformed
        // TODO add your handling code here:
                       
        int satekambing = 14000;
        if (RBSateKambing.isSelected()){
            TXTSateKambing.setText("" + RBSateKambing.getText());
            TXTSateKambing.setText("" + satekambing);
        }else{
            TXTSateKambing.setText("");
        }  
    }//GEN-LAST:event_RBSateKambingActionPerformed

    private void RBLeleBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBLeleBakarActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        int lelebakar = 14000;
        if (RBLeleBakar.isSelected()){
            TXTLeleBakar.setText("" + RBLeleBakar.getText());
            TXTLeleBakar.setText("" + lelebakar);
        }else{
            TXTLeleBakar.setText("");
        }
        
    }//GEN-LAST:event_RBLeleBakarActionPerformed

    private void RBAyamBakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAyamBakarActionPerformed
        // TODO add your handling code here:
        int ayambakar = 16000;
        if (RBAyamBakar.isSelected()){
            TXTAyamBakar.setText("" + RBNasiGoreng.getText());
            TXTAyamBakar.setText("" + ayambakar);
        }else{
            TXTAyamBakar.setText("");
        }
                                               

    }//GEN-LAST:event_RBAyamBakarActionPerformed

    private void RBAyamGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAyamGorengActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        
        int ayamgoreng = 15000;
        if (RBAyamGoreng.isSelected()){
            TXTAyamGoreng.setText("" + RBAyamGoreng.getText());
            TXTAyamGoreng.setText("" + ayamgoreng);
        }else{
            TXTAyamGoreng.setText("");
        }
    }//GEN-LAST:event_RBAyamGorengActionPerformed

    private void RBLeleGorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBLeleGorengActionPerformed
        // TODO add your handling code here:
         int lelegoreng = 13000;
        if (RBLeleGoreng.isSelected()){
            TXTLeleGoreng.setText("" + RBLeleGoreng.getText());
            TXTLeleGoreng.setText("" + lelegoreng);
        }else{
            TXTLeleGoreng.setText("");
        }
    }//GEN-LAST:event_RBLeleGorengActionPerformed

    private void RBSotoAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSotoAyamActionPerformed
        // TODO add your handling code here:
        
                
        int sotoayam = 14000;
        if (RBSotoAyam.isSelected()){
            TXTSotoAyam.setText("" + RBSotoAyam.getText());
            TXTSotoAyam.setText("" + sotoayam);
        }else{
            TXTSotoAyam.setText("");
        }
    }//GEN-LAST:event_RBSotoAyamActionPerformed

    private void HITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITUNGActionPerformed
        // TODO add your handling code here:
         int total = 0;
        
        if (RBNasiGoreng.isSelected()){
            String NasiGoreng = JMLNasiGoreng.getText();
            int jmlnasigoreng = Integer.parseInt(NasiGoreng);
            
            int harganasigoreng = jmlnasigoreng * 15000;
            
            total = total + harganasigoreng;
            
        }
        
        if (RBAyamBakar.isSelected()){
            String AyamBakar = JMLAyamBakar.getText();
            int jmlayambakar = Integer.parseInt(AyamBakar);
            
            int hargaayambakar = jmlayambakar * 16000;
            
            total = total +  hargaayambakar;
        }
        
//         if (RBAyamGoreng.isSelected()){
//            String AyamGoreng = JMLAyamGoreng.getText();
//            int jmlayamgoreng = Integer.parseInt(AyamGoreng);
//            
//            int hargaayamgoreng = jmlayamgoreng * 15000;
//            
//            total = total + hargaayamgoreng;
//            

         if (RBAyamGoreng.isSelected()){
                String AyamGoreng = JMLAyamGoreng.getText();
                int jmlayamgoreng = Integer.parseInt(AyamGoreng);
                int hargaayamgoreng = jmlayamgoreng * 15000;
                
                total = total + hargaayamgoreng;
         }
         
         if (RBLeleGoreng.isSelected()){
             String LeleGoreng = JMLLeleGoreng.getText();
             int jmllelegoreng = Integer.parseInt(LeleGoreng);
             int hargalelegoreng = jmllelegoreng * 13000;
             
             total = total + hargalelegoreng;
         }
         
         if (RBLeleBakar.isSelected()){
             String LeleBakar = JMLLeleBakar.getText();
             int jmllelebakar = Integer.parseInt(LeleBakar);
             int hargalelebakar = jmllelebakar * 14000;
             
             total = total + hargalelebakar;
         }
         
         if (RBSateAyam.isSelected()){
             String SateAyam = JMLSateAyam.getText();
             int jmlsateayam = Integer.parseInt(SateAyam);
             int hargasateayam = jmlsateayam * 13000;
             
             total = total + hargasateayam;             
         }
         
         if (RBSateKambing.isSelected()){
             String SateKambing = JMLSateKambing.getText();
             int jmlsatekambing = Integer.parseInt(SateKambing);
             int hargasatekambing = jmlsatekambing * 14000;
             
             total = total + hargasatekambing;
         }
         
         if (RBSotoAyam.isSelected()){
             String SotoAyam = JMLSotoAyam.getText();
             int jmlsotoayam = Integer.parseInt(SotoAyam);
             int hargasotoayam = jmlsotoayam * 14000;
             
             total = total + hargasotoayam;
             
         }
         TXTTotalHarga.setText("" + total);
    
        
        
    }//GEN-LAST:event_HITUNGActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        // TODO add your handling code here:
//         JMLNasiGoreng.setText("");
//         JMLAyamBakar.setText("");
//         JMLAyamGoreng.setText("");
//         JMLLeleGoreng.setText("");
//         JMLLeleBakar.setText("");
//         JMLSateAyam.setText("");
//         JMLSateKambing.setText("");
//         JMLSotoAyam.setText("");
//         TXTTotalHarga.setText("");
    }//GEN-LAST:event_HAPUSActionPerformed

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
            java.util.logging.Logger.getLogger(KasirForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton HITUNG;
    private javax.swing.JTextField JMLAyamBakar;
    private javax.swing.JTextField JMLAyamGoreng;
    private javax.swing.JTextField JMLLeleBakar;
    private javax.swing.JTextField JMLLeleGoreng;
    private javax.swing.JTextField JMLNasiGoreng;
    private javax.swing.JTextField JMLSateAyam;
    private javax.swing.JTextField JMLSateKambing;
    private javax.swing.JTextField JMLSotoAyam;
    private javax.swing.JRadioButton RBAyamBakar;
    private javax.swing.JRadioButton RBAyamGoreng;
    private javax.swing.JRadioButton RBLeleBakar;
    private javax.swing.JRadioButton RBLeleGoreng;
    private javax.swing.JRadioButton RBNasiGoreng;
    private javax.swing.JRadioButton RBSateAyam;
    private javax.swing.JRadioButton RBSateKambing;
    private javax.swing.JRadioButton RBSotoAyam;
    private javax.swing.JTextField TXTAyamBakar;
    private javax.swing.JTextField TXTAyamGoreng;
    private javax.swing.JTextField TXTLeleBakar;
    private javax.swing.JTextField TXTLeleGoreng;
    private javax.swing.JTextField TXTNasiGoreng;
    private javax.swing.JTextField TXTSateAyam;
    private javax.swing.JTextField TXTSateKambing;
    private javax.swing.JTextField TXTSotoAyam;
    private javax.swing.JTextField TXTTotalHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
