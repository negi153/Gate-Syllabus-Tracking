
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author negi
 */
public class dsd extends javax.swing.JPanel {

   
    JCheckBox cb[];
    makeChanges m = new makeChanges("dsd");

    public dsd() {
        initComponents();
        cb = new JCheckBox[]{cb1, cb1, cb2, cb3, cb4, cb5};

        m.show(cb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb2 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        cb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb2.setText("Minimization");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setText("Logic functions");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb4.setText("Sequential Circuits");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb3.setText("Design and Synthesis of Combinational circuits");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb5.setText("Number system");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb1)
                    .addComponent(cb4))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb2)
                        .addGap(66, 66, 66)
                        .addComponent(cb3))
                    .addComponent(cb5))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2)
                    .addComponent(cb3)
                    .addComponent(cb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb4)
                    .addComponent(cb5))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        m.change(cb1, 1);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        m.change(cb2, 2);
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        m.change(cb3, 3);
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        m.change(cb4, 4);
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        m.change(cb5, 5);
    }//GEN-LAST:event_cb5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    // End of variables declaration//GEN-END:variables
}