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
public class SurveyFrame extends javax.swing.JFrame {

    private Parent father;
    private Parent mother;
    boolean enteredFieldOne = false;
    boolean enteredFieldTwo = false;
    boolean enteredFieldThree = false;
    boolean enteredFieldFour = false;
    boolean enteredName = false;
    int[] diseaseCodes = {0, 0, 0, 0};
    boolean isFather;

    public SurveyFrame() {
        initComponents();
    }

    /**
     * Creates new form surveyFrame
     *
     * @param father
     * @param mother
     * @param isFather
     */
    public SurveyFrame(Parent father, Parent mother, boolean isFather) {
        initComponents();
        this.father = father;
        this.mother = mother;
        this.isFather = isFather;

        if (isFather == false) {
            surveyTitle.setText("Mother Survey");
            nameLabel.setText("Mother Name");
            nextSurveyButton.setText("Results ->");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formBackground1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        surveyTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        huntingtonLabel = new javax.swing.JLabel();
        huntingtonAffectedButton = new javax.swing.JRadioButton();
        huntingtonCarrierButton = new javax.swing.JRadioButton();
        huntingtonNeitherButton = new javax.swing.JRadioButton();
        affectedLabel = new javax.swing.JLabel();
        carrierLabel = new javax.swing.JLabel();
        neitherLabel = new javax.swing.JLabel();
        marfanLabel = new javax.swing.JLabel();
        taysachsLabel = new javax.swing.JLabel();
        cysticFibrosisLabel = new javax.swing.JLabel();
        marfanAffectedButton = new javax.swing.JRadioButton();
        marfanCarrierButton = new javax.swing.JRadioButton();
        marfanNeitherButton = new javax.swing.JRadioButton();
        taysachsAffectedButton = new javax.swing.JRadioButton();
        taysachsNeitherButton = new javax.swing.JRadioButton();
        taysachsCarrierButton = new javax.swing.JRadioButton();
        fibrosisAffectedButton = new javax.swing.JRadioButton();
        fibrosisCarrierButton = new javax.swing.JRadioButton();
        fibrosisNeitherButton = new javax.swing.JRadioButton();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nextSurveyButton = new javax.swing.JButton();
        descriptionLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        formBackground1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout formBackground1Layout = new javax.swing.GroupLayout(formBackground1);
        formBackground1.setLayout(formBackground1Layout);
        formBackground1Layout.setHorizontalGroup(
            formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        formBackground1Layout.setVerticalGroup(
            formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        surveyTitle.setFont(new java.awt.Font("Hiragino Sans", 0, 18)); // NOI18N
        surveyTitle.setForeground(new java.awt.Color(255, 255, 255));
        surveyTitle.setText("Father Survey");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        huntingtonLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        huntingtonLabel.setText("Huntington's Disease");

        huntingtonAffectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huntingtonAffectedButtonActionPerformed(evt);
            }
        });

        huntingtonCarrierButton.setEnabled(false);
        huntingtonCarrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huntingtonCarrierButtonActionPerformed(evt);
            }
        });

        huntingtonNeitherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huntingtonNeitherButtonActionPerformed(evt);
            }
        });

        affectedLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        affectedLabel.setText("Affected");

        carrierLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        carrierLabel.setText("Carrier");

        neitherLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        neitherLabel.setText("Neither");

        marfanLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        marfanLabel.setText("Marfan Syndrome");

        taysachsLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        taysachsLabel.setText("Tay-Sach's Disease");

        cysticFibrosisLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        cysticFibrosisLabel.setText("Cystic Fibrosis");

        marfanAffectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marfanAffectedButtonActionPerformed(evt);
            }
        });

        marfanCarrierButton.setEnabled(false);
        marfanCarrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marfanCarrierButtonActionPerformed(evt);
            }
        });

        marfanNeitherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marfanNeitherButtonActionPerformed(evt);
            }
        });

        taysachsAffectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taysachsAffectedButtonActionPerformed(evt);
            }
        });

        taysachsNeitherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taysachsNeitherButtonActionPerformed(evt);
            }
        });

        taysachsCarrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taysachsCarrierButtonActionPerformed(evt);
            }
        });

        fibrosisAffectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibrosisAffectedButtonActionPerformed(evt);
            }
        });

        fibrosisCarrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibrosisCarrierButtonActionPerformed(evt);
            }
        });

        fibrosisNeitherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibrosisNeitherButtonActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        nameLabel.setText("Father Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(huntingtonLabel)
                    .addComponent(marfanLabel)
                    .addComponent(cysticFibrosisLabel)
                    .addComponent(taysachsLabel)
                    .addComponent(nameLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fibrosisAffectedButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fibrosisCarrierButton))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(taysachsAffectedButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(taysachsCarrierButton))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(marfanAffectedButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(marfanCarrierButton))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(huntingtonAffectedButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(huntingtonCarrierButton)))
                                .addGap(83, 83, 83))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(affectedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(carrierLabel)
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(huntingtonNeitherButton)
                            .addComponent(marfanNeitherButton)
                            .addComponent(taysachsNeitherButton)
                            .addComponent(fibrosisNeitherButton)
                            .addComponent(neitherLabel))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(affectedLabel)
                    .addComponent(neitherLabel)
                    .addComponent(carrierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(huntingtonNeitherButton)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(huntingtonCarrierButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(huntingtonLabel))
                                .addComponent(huntingtonAffectedButton)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marfanLabel)
                            .addComponent(marfanAffectedButton)
                            .addComponent(marfanCarrierButton)
                            .addComponent(marfanNeitherButton))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taysachsLabel)
                            .addComponent(taysachsAffectedButton)
                            .addComponent(taysachsCarrierButton)
                            .addComponent(taysachsNeitherButton))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cysticFibrosisLabel)
                                    .addComponent(fibrosisAffectedButton)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fibrosisNeitherButton))))
                    .addComponent(fibrosisCarrierButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        nextSurveyButton.setBackground(new java.awt.Color(153, 153, 255));
        nextSurveyButton.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        nextSurveyButton.setText("Mother Survey ->");
        nextSurveyButton.setEnabled(false);
        nextSurveyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSurveyButtonActionPerformed(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("For each disorder, select one of the buttons to indicate your screening results.");

        errorLabel.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 255, 255));
        errorLabel.setText("Please fill in all fields to continue.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surveyTitle)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descriptionLabel)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextSurveyButton)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(surveyTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextSurveyButton)
                    .addComponent(errorLabel))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huntingtonAffectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huntingtonAffectedButtonActionPerformed
        // TODO add your handling code here:
        if (huntingtonAffectedButton.isSelected()) {
            huntingtonNeitherButton.setEnabled(false);
            huntingtonCarrierButton.setEnabled(false);
            this.enteredFieldOne = true;
            diseaseCodes[0] = 2;

        } else {
            huntingtonNeitherButton.setEnabled(true);

        }
    }//GEN-LAST:event_huntingtonAffectedButtonActionPerformed

    private void marfanAffectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marfanAffectedButtonActionPerformed
        if (marfanAffectedButton.isSelected()) {
            marfanNeitherButton.setEnabled(false);
            marfanCarrierButton.setEnabled(false);
            this.enteredFieldTwo = true;
            diseaseCodes[1] = 2;
        } else {
            marfanNeitherButton.setEnabled(true);

        }

    }//GEN-LAST:event_marfanAffectedButtonActionPerformed

    private void marfanCarrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marfanCarrierButtonActionPerformed


    }//GEN-LAST:event_marfanCarrierButtonActionPerformed

    private void marfanNeitherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marfanNeitherButtonActionPerformed
        if (marfanNeitherButton.isSelected()) {
            marfanAffectedButton.setEnabled(false);
            marfanCarrierButton.setEnabled(false);
            this.enteredFieldTwo = true;
            diseaseCodes[1] = 0;

        } else {
            marfanAffectedButton.setEnabled(true);
        }
    }//GEN-LAST:event_marfanNeitherButtonActionPerformed

    private void taysachsAffectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taysachsAffectedButtonActionPerformed
        if (taysachsAffectedButton.isSelected()) {
            taysachsNeitherButton.setEnabled(false);
            taysachsCarrierButton.setEnabled(false);
            this.enteredFieldThree = true;
            diseaseCodes[2] = 2;
        } else {
            taysachsNeitherButton.setEnabled(true);
            taysachsCarrierButton.setEnabled(true);
        }
    }//GEN-LAST:event_taysachsAffectedButtonActionPerformed

    private void taysachsNeitherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taysachsNeitherButtonActionPerformed
        if (taysachsNeitherButton.isSelected()) {
            taysachsAffectedButton.setEnabled(false);
            taysachsCarrierButton.setEnabled(false);
            this.enteredFieldThree = true;
            diseaseCodes[2] = 0;
        } else {
            taysachsAffectedButton.setEnabled(true);
            taysachsCarrierButton.setEnabled(true);
        }
    }//GEN-LAST:event_taysachsNeitherButtonActionPerformed

    private void taysachsCarrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taysachsCarrierButtonActionPerformed
        if (taysachsCarrierButton.isSelected()) {
            taysachsNeitherButton.setEnabled(false);
            taysachsAffectedButton.setEnabled(false);
            this.enteredFieldThree = true;
            diseaseCodes[2] = 1;
        } else {
            taysachsNeitherButton.setEnabled(true);
            taysachsAffectedButton.setEnabled(true);
        }
    }//GEN-LAST:event_taysachsCarrierButtonActionPerformed

    private void fibrosisAffectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibrosisAffectedButtonActionPerformed
        if (fibrosisAffectedButton.isSelected()) {
            fibrosisCarrierButton.setEnabled(false);
            fibrosisNeitherButton.setEnabled(false);
            this.enteredFieldFour = true;
            diseaseCodes[3] = 2;
        } else {
            fibrosisCarrierButton.setEnabled(true);
            fibrosisNeitherButton.setEnabled(true);
        }

    }//GEN-LAST:event_fibrosisAffectedButtonActionPerformed

    private void fibrosisCarrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibrosisCarrierButtonActionPerformed
        if (fibrosisCarrierButton.isSelected()) {
            fibrosisNeitherButton.setEnabled(false);
            fibrosisAffectedButton.setEnabled(false);
            this.enteredFieldFour = true;
            diseaseCodes[3] = 1;
        } else {
            fibrosisNeitherButton.setEnabled(true);
            fibrosisAffectedButton.setEnabled(true);
        }
    }//GEN-LAST:event_fibrosisCarrierButtonActionPerformed

    private void fibrosisNeitherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibrosisNeitherButtonActionPerformed
        if (fibrosisNeitherButton.isSelected()) {
            fibrosisCarrierButton.setEnabled(false);
            fibrosisAffectedButton.setEnabled(false);
            this.enteredFieldFour = true;
            diseaseCodes[3] = 0;
        } else {
            fibrosisCarrierButton.setEnabled(true);
            fibrosisAffectedButton.setEnabled(true);
        }
    }//GEN-LAST:event_fibrosisNeitherButtonActionPerformed

    private void huntingtonNeitherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huntingtonNeitherButtonActionPerformed
        if (huntingtonNeitherButton.isSelected()) {
            huntingtonAffectedButton.setEnabled(false);
            huntingtonCarrierButton.setEnabled(false);
            this.enteredFieldOne = true;
            diseaseCodes[0] = 0;

        } else {
            huntingtonAffectedButton.setEnabled(true);
        }
    }//GEN-LAST:event_huntingtonNeitherButtonActionPerformed

    private void huntingtonCarrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huntingtonCarrierButtonActionPerformed

    }//GEN-LAST:event_huntingtonCarrierButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void nextSurveyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextSurveyButtonActionPerformed
        if (isFather) {
            father.setName(nameField.getText());
            father.setScreeningResults(this.diseaseCodes);
            SurveyFrame motherSurvey = new SurveyFrame(this.father, this.mother, false);
            motherSurvey.setVisible(true);
            this.dispose();
        } else {
            mother.setName(nameField.getText());
            mother.setScreeningResults(this.diseaseCodes);
            ResultsFrame results = new ResultsFrame(father, mother);
            results.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_nextSurveyButtonActionPerformed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        this.enteredName = true;

        if (((((this.enteredFieldOne) && (this.enteredFieldTwo))
                && (this.enteredFieldThree)) && (this.enteredFieldFour))
                && (this.enteredName)) {
            errorLabel.setVisible(false);
            nextSurveyButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affectedLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel carrierLabel;
    private javax.swing.JLabel cysticFibrosisLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton fibrosisAffectedButton;
    private javax.swing.JRadioButton fibrosisCarrierButton;
    private javax.swing.JRadioButton fibrosisNeitherButton;
    private javax.swing.JPanel formBackground1;
    private javax.swing.JRadioButton huntingtonAffectedButton;
    private javax.swing.JRadioButton huntingtonCarrierButton;
    private javax.swing.JLabel huntingtonLabel;
    private javax.swing.JRadioButton huntingtonNeitherButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton marfanAffectedButton;
    private javax.swing.JRadioButton marfanCarrierButton;
    private javax.swing.JLabel marfanLabel;
    private javax.swing.JRadioButton marfanNeitherButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel neitherLabel;
    private javax.swing.JButton nextSurveyButton;
    private javax.swing.JLabel surveyTitle;
    private javax.swing.JRadioButton taysachsAffectedButton;
    private javax.swing.JRadioButton taysachsCarrierButton;
    private javax.swing.JLabel taysachsLabel;
    private javax.swing.JRadioButton taysachsNeitherButton;
    // End of variables declaration//GEN-END:variables
}
