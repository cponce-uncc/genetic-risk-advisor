/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poncecristianproject;

/**
 *
 * @author cristian_ponce
 */
public class InfoFrame extends javax.swing.JFrame {

    public InfoFrame() {
    }

    /**
     * Creates new form InfoFrame
     */
    public InfoFrame(Parent father, Parent mother, GeneticDisease disease) {
        initComponents();
        panelTitle.setText("More about " + disease.getDiseaseType() + "...");

        // Fill out description based on the type of disease
        diseaseDescription.setText(disease.diseaseReport(father, mother));

        if (disease instanceof AutosomalDominant) {
            diagramLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poncecristianproject/autoDomDiagram.png")));
            diagramDescriptionLabel.setText("The above diagram shows how a autosomal dominant disorder transfers to offspring.");
        } else {
            diagramLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poncecristianproject/autoRec2.jpg")));
        }
        diagramDescriptionLabel.setText("The above diagram shows how a autosomal recessive disorder transfers to offspring.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        panelBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diseaseDescription = new javax.swing.JTextArea();
        panelTitle = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        diagramLabel = new javax.swing.JLabel();
        diagramDescriptionLabel = new javax.swing.JLabel();
        customInfoLabel = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        diseaseDescription.setEditable(false);
        diseaseDescription.setBackground(new java.awt.Color(204, 204, 255));
        diseaseDescription.setColumns(20);
        diseaseDescription.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        diseaseDescription.setRows(5);
        diseaseDescription.setText("Huntington disease is a ");
        jScrollPane1.setViewportView(diseaseDescription);

        panelTitle.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        panelTitle.setForeground(new java.awt.Color(255, 255, 255));
        panelTitle.setText("More about Huntington's Disease...");

        backButton.setBackground(new java.awt.Color(204, 204, 255));
        backButton.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        backButton.setText("<- Back to Results");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        diagramDescriptionLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        diagramDescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        diagramDescriptionLabel.setText("The above diagram shows how a autosomal recessive disorder transfers to offspring.");

        customInfoLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        customInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        customInfoLabel.setText("More information on your circumstances:");

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(diagramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackgroundLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customInfoLabel)
                            .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelTitle)
                                .addComponent(diagramDescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diagramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diagramDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel customInfoLabel;
    private javax.swing.JLabel diagramDescriptionLabel;
    private javax.swing.JLabel diagramLabel;
    private javax.swing.JTextArea diseaseDescription;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JLabel panelTitle;
    // End of variables declaration//GEN-END:variables
}
