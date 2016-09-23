package org.fortiss.pmwt.wex.ui.generated;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class BaseCreateReaderConfigurationFileDialog extends javax.swing.JDialog implements ActionListener, ComponentListener, ChangeListener
{
	public BaseCreateReaderConfigurationFileDialog( JFrame ownerFrame )
	{
		super( ownerFrame );
		initComponents();
	}

	/**
	 * Creates new form BasePrepareInputDataPage1
	 */
	public BaseCreateReaderConfigurationFileDialog()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPathToSourceFile = new JLabel();
        txtPathToSourceFile = new JTextField();
        txtDelimiter = new JTextField();
        lblDelimiter = new JLabel();
        btnPreview = new JButton();
        lblSourceFilePreview = new JLabel();
        spSourceFilePreview = new JScrollPane();
        tabSourceFilePreview = new JTable();
        btnSaveAndClose = new JButton();
        btnSave = new JButton();
        tpMain = new JTabbedPane();
        tabPreCondition = new JPanel();
        lblScript0 = new JLabel();
        spScript0 = new JScrollPane();
        txtScript0 = new JTextArea();
        tabConversion = new JPanel();
        lblTargetField1 = new JLabel();
        cboTargetField1 = new JComboBox();
        lblScript1 = new JLabel();
        spScript1 = new JScrollPane();
        txtScript1 = new JTextArea();
        btnPreviewScript = new JButton();
        txtScriptPreview = new JTextField();
        lblScriptPreview = new JLabel();

        setTitle("Reader configuration");
        setBounds(new Rectangle(0, 0, 800, 650));
        setMinimumSize(new Dimension(800, 650));
        setModalityType(ModalityType.APPLICATION_MODAL);
        setName("wndCreateReaderConfiguration"); // NOI18N
        setResizable(false);
        addComponentListener(this);

        lblPathToSourceFile.setText("Path to source file:");
        lblPathToSourceFile.setMaximumSize(new Dimension(150, 20));
        lblPathToSourceFile.setMinimumSize(new Dimension(150, 20));
        lblPathToSourceFile.setPreferredSize(new Dimension(150, 20));

        txtPathToSourceFile.setEnabled(false);

        txtDelimiter.setText(";");
        txtDelimiter.setMinimumSize(new Dimension(120, 20));
        txtDelimiter.setPreferredSize(new Dimension(120, 20));

        lblDelimiter.setText("Delimiter:");
        lblDelimiter.setMaximumSize(new Dimension(150, 20));
        lblDelimiter.setMinimumSize(new Dimension(150, 20));
        lblDelimiter.setPreferredSize(new Dimension(150, 20));

        btnPreview.setText("Preview file content");
        btnPreview.setActionCommand("");
        btnPreview.setMaximumSize(new Dimension(140, 30));
        btnPreview.setMinimumSize(new Dimension(140, 30));
        btnPreview.setPreferredSize(new Dimension(140, 30));
        btnPreview.addActionListener(this);

        lblSourceFilePreview.setText("Preview of source file content:");
        lblSourceFilePreview.setMaximumSize(new Dimension(200, 20));
        lblSourceFilePreview.setMinimumSize(new Dimension(200, 20));
        lblSourceFilePreview.setPreferredSize(new Dimension(200, 20));

        spSourceFilePreview.setMaximumSize(new Dimension(770, 140));
        spSourceFilePreview.setMinimumSize(new Dimension(770, 140));
        spSourceFilePreview.setPreferredSize(new Dimension(770, 140));

        tabSourceFilePreview.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spSourceFilePreview.setViewportView(tabSourceFilePreview);

        btnSaveAndClose.setText("Save & Close");
        btnSaveAndClose.setMaximumSize(new Dimension(140, 30));
        btnSaveAndClose.setMinimumSize(new Dimension(140, 30));
        btnSaveAndClose.setPreferredSize(new Dimension(140, 30));
        btnSaveAndClose.addActionListener(this);

        btnSave.setText("Save");
        btnSave.setMaximumSize(new Dimension(140, 30));
        btnSave.setMinimumSize(new Dimension(140, 30));
        btnSave.setPreferredSize(new Dimension(140, 30));
        btnSave.addActionListener(this);

        tpMain.addChangeListener(this);

        lblScript0.setText("Script:");
        lblScript0.setMaximumSize(new Dimension(200, 20));
        lblScript0.setMinimumSize(new Dimension(200, 20));
        lblScript0.setPreferredSize(new Dimension(200, 20));

        txtScript0.setColumns(20);
        txtScript0.setRows(5);
        spScript0.setViewportView(txtScript0);

        GroupLayout tabPreConditionLayout = new GroupLayout(tabPreCondition);
        tabPreCondition.setLayout(tabPreConditionLayout);
        tabPreConditionLayout.setHorizontalGroup(tabPreConditionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tabPreConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPreConditionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(tabPreConditionLayout.createSequentialGroup()
                        .addComponent(lblScript0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 555, Short.MAX_VALUE))
                    .addComponent(spScript0))
                .addContainerGap())
        );
        tabPreConditionLayout.setVerticalGroup(tabPreConditionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tabPreConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScript0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spScript0, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMain.addTab("Precondition", tabPreCondition);

        lblTargetField1.setText("Target field:");
        lblTargetField1.setMaximumSize(new Dimension(200, 20));
        lblTargetField1.setMinimumSize(new Dimension(200, 20));
        lblTargetField1.setPreferredSize(new Dimension(200, 20));

        cboTargetField1.setMinimumSize(new Dimension(56, 30));
        cboTargetField1.setPreferredSize(new Dimension(56, 30));
        cboTargetField1.addActionListener(this);

        lblScript1.setText("Script:");
        lblScript1.setMaximumSize(new Dimension(200, 20));
        lblScript1.setMinimumSize(new Dimension(200, 20));
        lblScript1.setPreferredSize(new Dimension(200, 20));

        txtScript1.setColumns(20);
        txtScript1.setRows(5);
        spScript1.setViewportView(txtScript1);

        GroupLayout tabConversionLayout = new GroupLayout(tabConversion);
        tabConversion.setLayout(tabConversionLayout);
        tabConversionLayout.setHorizontalGroup(tabConversionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tabConversionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabConversionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(cboTargetField1, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spScript1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(tabConversionLayout.createSequentialGroup()
                        .addGroup(tabConversionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblScript1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTargetField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabConversionLayout.setVerticalGroup(tabConversionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tabConversionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTargetField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTargetField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScript1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spScript1, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMain.addTab("Conversion", tabConversion);

        btnPreviewScript.setText("Preview script");
        btnPreviewScript.setActionCommand("");
        btnPreviewScript.setMaximumSize(new Dimension(140, 30));
        btnPreviewScript.setMinimumSize(new Dimension(140, 30));
        btnPreviewScript.setPreferredSize(new Dimension(140, 30));
        btnPreviewScript.addActionListener(this);

        lblScriptPreview.setText("Script preview:");
        lblScriptPreview.setMaximumSize(new Dimension(200, 20));
        lblScriptPreview.setMinimumSize(new Dimension(200, 20));
        lblScriptPreview.setPreferredSize(new Dimension(200, 20));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblSourceFilePreview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScriptPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtScriptPreview))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPreviewScript, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSaveAndClose, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPathToSourceFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(287, 287, 287))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPathToSourceFile)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDelimiter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDelimiter, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPreview, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                            .addComponent(tpMain)
                            .addComponent(spSourceFilePreview, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPathToSourceFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelimiter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPathToSourceFile, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDelimiter, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSourceFilePreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spSourceFilePreview, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpMain, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblScriptPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtScriptPreview, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviewScript, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAndClose, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnPreview) {
            BaseCreateReaderConfigurationFileDialog.this.btnPreviewActionPerformed(evt);
        }
        else if (evt.getSource() == btnSaveAndClose) {
            BaseCreateReaderConfigurationFileDialog.this.btnSaveAndCloseActionPerformed(evt);
        }
        else if (evt.getSource() == btnSave) {
            BaseCreateReaderConfigurationFileDialog.this.btnSaveActionPerformed(evt);
        }
        else if (evt.getSource() == cboTargetField1) {
            BaseCreateReaderConfigurationFileDialog.this.cboTargetField1ActionPerformed(evt);
        }
        else if (evt.getSource() == btnPreviewScript) {
            BaseCreateReaderConfigurationFileDialog.this.btnPreviewScriptActionPerformed(evt);
        }
    }

    public void componentHidden(ComponentEvent evt) {
    }

    public void componentMoved(ComponentEvent evt) {
    }

    public void componentResized(ComponentEvent evt) {
    }

    public void componentShown(ComponentEvent evt) {
        if (evt.getSource() == BaseCreateReaderConfigurationFileDialog.this) {
            BaseCreateReaderConfigurationFileDialog.this.formComponentShown(evt);
        }
    }

    public void stateChanged(ChangeEvent evt) {
        if (evt.getSource() == tpMain) {
            BaseCreateReaderConfigurationFileDialog.this.tpMainStateChanged(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    protected void cboTargetField1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cboTargetField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTargetField1ActionPerformed

    protected void btnPreviewScriptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnPreviewScriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreviewScriptActionPerformed

    protected void tpMainStateChanged(ChangeEvent evt) {//GEN-FIRST:event_tpMainStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tpMainStateChanged

	protected void btnSaveActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSaveActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSaveActionPerformed

	protected void btnSaveAndCloseActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSaveAndCloseActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSaveAndCloseActionPerformed

	protected void btnNextActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnNextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnNextActionPerformed

	protected void formComponentShown( ComponentEvent evt )
	{// GEN-FIRST:event_formComponentShown
		// TODO add your handling code here:
	}// GEN-LAST:event_formComponentShown

	protected void btnPreviewActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnPreviewActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnPreviewActionPerformed

	protected void btnPreviewExpressionActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnPreviewExpressionActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnPreviewExpressionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected JButton btnPreview;
    protected JButton btnPreviewScript;
    protected JButton btnSave;
    protected JButton btnSaveAndClose;
    protected JComboBox cboTargetField1;
    protected JLabel lblDelimiter;
    protected JLabel lblPathToSourceFile;
    protected JLabel lblScript0;
    protected JLabel lblScript1;
    protected JLabel lblScriptPreview;
    protected JLabel lblSourceFilePreview;
    protected JLabel lblTargetField1;
    protected JScrollPane spScript0;
    protected JScrollPane spScript1;
    protected JScrollPane spSourceFilePreview;
    protected JPanel tabConversion;
    protected JPanel tabPreCondition;
    protected JTable tabSourceFilePreview;
    protected JTabbedPane tpMain;
    protected JTextField txtDelimiter;
    protected JTextField txtPathToSourceFile;
    protected JTextArea txtScript0;
    protected JTextArea txtScript1;
    protected JTextField txtScriptPreview;
    // End of variables declaration//GEN-END:variables
}