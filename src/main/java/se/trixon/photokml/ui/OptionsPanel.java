/*
 * Copyright 2017 Patrik Karlsson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.trixon.photokml.ui;

import se.trixon.almond.util.Dict;
import se.trixon.photokml.Options;

/**
 *
 * @author Patrik Karlsson
 */
public class OptionsPanel extends javax.swing.JPanel {

    private final Options mOptions = Options.getInstance();

    /**
     * Creates new form OptionsPanel
     */
    public OptionsPanel() {
        initComponents();
        localeComboBox.setSelectedItem(mOptions.getLocale());
        latSpinner.setValue(mOptions.getDefaultLat());
        lonSpinner.setValue(mOptions.getDefaultLon());
        thumbnailSizeSpinner.setValue(mOptions.getThumbnailSize());
        borderSizeSpinner.setValue(mOptions.getThumbnailBorderSize());
    }

    void save() {
        lookAndFeelPanel.save();
        mOptions.setLocale(localeComboBox.getSelectedItem());
        mOptions.setDefaultLat((Double) latSpinner.getModel().getValue());
        mOptions.setDefaultLon((Double) lonSpinner.getModel().getValue());
        mOptions.setThumbnailSize((int) thumbnailSizeSpinner.getModel().getValue());
        mOptions.setThumbnailBorderSize((int) borderSizeSpinner.getModel().getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lookAndFeelPanel = new se.trixon.almond.util.swing.dialogs.LookAndFeelPanel();
        localeLabel = new javax.swing.JLabel();
        localeComboBox = new se.trixon.almond.util.swing.LocaleComboBox();
        nullCoordinatePanel = new javax.swing.JPanel();
        coordinateLabel = new javax.swing.JLabel();
        latLabel = new javax.swing.JLabel();
        latSpinner = new javax.swing.JSpinner();
        lonLabel = new javax.swing.JLabel();
        lonSpinner = new javax.swing.JSpinner();
        thumbnailSizeLabel = new javax.swing.JLabel();
        thumbnailSizeSpinner = new javax.swing.JSpinner();
        borderSizeLabel = new javax.swing.JLabel();
        borderSizeSpinner = new javax.swing.JSpinner();

        localeLabel.setText(Dict.CALENDAR_LANGUAGE.toString());

        nullCoordinatePanel.setLayout(new java.awt.GridBagLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("se/trixon/photokml/ui/Bundle"); // NOI18N
        coordinateLabel.setText(bundle.getString("OptionsPanel.coordinateLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        nullCoordinatePanel.add(coordinateLabel, gridBagConstraints);

        latLabel.setText(Dict.LATITUDE.getString());
        latLabel.setPreferredSize(new java.awt.Dimension(100, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        nullCoordinatePanel.add(latLabel, gridBagConstraints);

        latSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, -90.0d, 90.0d, 0.01d));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        nullCoordinatePanel.add(latSpinner, gridBagConstraints);

        lonLabel.setText(Dict.LONGITUDE.getString());
        lonLabel.setPreferredSize(new java.awt.Dimension(100, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        nullCoordinatePanel.add(lonLabel, gridBagConstraints);

        lonSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, -180.0d, 180.0d, 0.01d));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        nullCoordinatePanel.add(lonSpinner, gridBagConstraints);

        thumbnailSizeLabel.setText(bundle.getString("OptionsPanel.thumbnailSizeLabel.text")); // NOI18N

        thumbnailSizeSpinner.setModel(new javax.swing.SpinnerNumberModel(250, 100, 1200, 10));

        borderSizeLabel.setText(bundle.getString("OptionsPanel.borderSizeLabel.text")); // NOI18N

        borderSizeSpinner.setModel(new javax.swing.SpinnerNumberModel(2, 0, 20, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lookAndFeelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(localeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localeLabel)
                    .addComponent(nullCoordinatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thumbnailSizeLabel)
                    .addComponent(thumbnailSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borderSizeLabel)
                    .addComponent(borderSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lookAndFeelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nullCoordinatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thumbnailSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thumbnailSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borderSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borderSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borderSizeLabel;
    private javax.swing.JSpinner borderSizeSpinner;
    private javax.swing.JLabel coordinateLabel;
    private javax.swing.JLabel latLabel;
    private javax.swing.JSpinner latSpinner;
    private se.trixon.almond.util.swing.LocaleComboBox localeComboBox;
    private javax.swing.JLabel localeLabel;
    private javax.swing.JLabel lonLabel;
    private javax.swing.JSpinner lonSpinner;
    private se.trixon.almond.util.swing.dialogs.LookAndFeelPanel lookAndFeelPanel;
    private javax.swing.JPanel nullCoordinatePanel;
    private javax.swing.JLabel thumbnailSizeLabel;
    private javax.swing.JSpinner thumbnailSizeSpinner;
    // End of variables declaration//GEN-END:variables
}
