
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
public class algo extends javax.swing.JPanel {

   
    JCheckBox cb[];
    makeChanges m = new makeChanges("algo");

    public algo() {
        initComponents();

        cb = new JCheckBox[]{cb1,cb1, cb2, cb3, cb4, cb14, cb6, cb7, cb5, cb9, cb10, cb8, cb12, cb13, cb11, cb15, cb16};

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
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb13 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb14 = new javax.swing.JCheckBox();
        cb16 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb15 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        cb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb2.setText("Sorting Techniques");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setText("Time and Space analysis");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb3.setText("Greedy algorithms");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb4.setText("Searching Algorithms");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb6.setText("Dijkstra Algorithm");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        cb5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb5.setText("Shortest paths in DAGs");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb7.setText("Bellman-ford algorithm");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });

        cb13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb13.setText("Knapsack");
        cb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb13ActionPerformed(evt);
            }
        });

        cb10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb10.setText("Matrix chain multiplication");
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });

        cb8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb8.setText("Longest common subsequence");
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });

        cb12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb12.setText("Multi stage graph");
        cb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb12ActionPerformed(evt);
            }
        });

        cb11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb11.setText("Subset sum");
        cb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb11ActionPerformed(evt);
            }
        });

        cb14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb14.setText("NP completeness");
        cb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb14ActionPerformed(evt);
            }
        });

        cb16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb16.setText("All pairs shortest path -- Floyd Warshall");
        cb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb16ActionPerformed(evt);
            }
        });

        cb9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb9.setText("Dynamic Programming");
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });

        cb15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb15.setText("Travelling salesman");
        cb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb16)
                    .addComponent(cb10)
                    .addComponent(cb13)
                    .addComponent(cb7)
                    .addComponent(cb4)
                    .addComponent(cb1))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb5)
                    .addComponent(cb2)
                    .addComponent(cb8)
                    .addComponent(cb11)
                    .addComponent(cb14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb15)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cb3)
                            .addGap(72, 72, 72))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb6)
                                .addComponent(cb9)
                                .addComponent(cb12))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb4)
                    .addComponent(cb5)
                    .addComponent(cb6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb8)
                    .addComponent(cb9)
                    .addComponent(cb7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb10)
                    .addComponent(cb11)
                    .addComponent(cb12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb13)
                    .addComponent(cb14)
                    .addComponent(cb15))
                .addGap(39, 39, 39)
                .addComponent(cb16)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        m.change(cb6, 6);
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        m.change(cb7, 7);
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        m.change(cb5, 5);
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        m.change(cb9, 9);
    }//GEN-LAST:event_cb9ActionPerformed

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        m.change(cb10, 10);
    }//GEN-LAST:event_cb10ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        m.change(cb8, 8);
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb12ActionPerformed
        m.change(cb12, 12);
    }//GEN-LAST:event_cb12ActionPerformed

    private void cb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb13ActionPerformed
        m.change(cb13, 13);
    }//GEN-LAST:event_cb13ActionPerformed

    private void cb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb11ActionPerformed
        m.change(cb11, 11);
    }//GEN-LAST:event_cb11ActionPerformed

    private void cb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb15ActionPerformed
        m.change(cb15, 15);
    }//GEN-LAST:event_cb15ActionPerformed

    private void cb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb16ActionPerformed
        m.change(cb16, 16);
    }//GEN-LAST:event_cb16ActionPerformed

    private void cb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb14ActionPerformed
        m.change(cb14, 14);
    }//GEN-LAST:event_cb14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb13;
    private javax.swing.JCheckBox cb14;
    private javax.swing.JCheckBox cb15;
    private javax.swing.JCheckBox cb16;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    // End of variables declaration//GEN-END:variables
}