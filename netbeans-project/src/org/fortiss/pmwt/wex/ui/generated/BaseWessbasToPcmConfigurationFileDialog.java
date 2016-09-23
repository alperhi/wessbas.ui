package org.fortiss.pmwt.wex.ui.generated;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class BaseWessbasToPcmConfigurationFileDialog extends javax.swing.JDialog implements ActionListener, ComponentListener
{

	public BaseWessbasToPcmConfigurationFileDialog( JFrame frameOwner )
	{
		super( frameOwner );
		initComponents();
	}

	/**
	 * Creates new form BasePrepareInputDataPage1
	 */
	public BaseWessbasToPcmConfigurationFileDialog()
	{
		super();
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBottom = new JPanel();
        btnSave = new JButton();
        btnSaveAndClose = new JButton();
        tpMain = new JTabbedPane();
        tpMainGeneral = new JPanel();
        chkUseConsoleForOutput = new JCheckBox();
        chkGenerateGuardsAndActions = new JCheckBox();
        chkUseProbabilityFilter = new JCheckBox();
        txtProbabilityFilterAmountOfDigits = new JTextField();
        lblProbabilityFilterAmountOfDigits = new JLabel();
        tpMainSource = new JPanel();
        lblDirectorySource = new JLabel();
        txtDirectorySource = new JTextField();
        btnSelectDirectorySource = new JButton();
        lblResourceModelFile = new JLabel();
        txtResourceModelFile = new JTextField();
        btnSelectResourceModelFile = new JButton();
        lblRepositoryModelFile = new JLabel();
        txtRepositoryModelFile = new JTextField();
        btnSelectRepositoryModelFile = new JButton();
        lblSystemModelFile = new JLabel();
        txtSystemModelFile = new JTextField();
        btnSelectSystemModelFile = new JButton();
        lblSystemProvidedRole = new JLabel();
        cboSystemProvidedRole = new JComboBox();
        btnRefreshSystemProvidedRole = new JButton();
        btnSelectAllocationModelFile = new JButton();
        lblAllocationModelFile = new JLabel();
        txtAllocationModelFile = new JTextField();
        tpMainTarget = new JPanel();
        lblUsageModelFile = new JLabel();
        txtUsageModelFile = new JTextField();
        btnSelectUsageModelFile = new JButton();
        lblDirectoryTarget = new JLabel();
        txtDirectoryTarget = new JTextField();
        btnSelectDirectoryTarget = new JButton();

        setTitle("WESSBAS2PCM extended properties");
        setBounds(new Rectangle(0, 0, 700, 680));
        setMaximumSize(new Dimension(2147483647, 550));
        setMinimumSize(new Dimension(700, 550));
        setName("wndCreateWorkloadPropertiesFile"); // NOI18N
        setPreferredSize(new Dimension(700, 550));
        setResizable(false);
        setType(Type.UTILITY);
        addComponentListener(this);

        pnlBottom.setMaximumSize(new Dimension(680, 32767));
        pnlBottom.setMinimumSize(new Dimension(680, 0));

        btnSave.setText("Save");
        btnSave.setMaximumSize(new Dimension(140, 30));
        btnSave.setMinimumSize(new Dimension(140, 30));
        btnSave.setPreferredSize(new Dimension(140, 30));
        btnSave.addActionListener(this);

        btnSaveAndClose.setText("Save & Close");
        btnSaveAndClose.setMaximumSize(new Dimension(140, 30));
        btnSaveAndClose.setMinimumSize(new Dimension(140, 30));
        btnSaveAndClose.setPreferredSize(new Dimension(140, 30));
        btnSaveAndClose.addActionListener(this);

        GroupLayout pnlBottomLayout = new GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveAndClose, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlBottomLayout.setVerticalGroup(pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveAndClose, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpMain.setMaximumSize(new Dimension(680, 430));
        tpMain.setMinimumSize(new Dimension(680, 430));
        tpMain.setPreferredSize(new Dimension(680, 430));

        chkUseConsoleForOutput.setText("Use console for output");
        chkUseConsoleForOutput.setMaximumSize(new Dimension(200, 30));
        chkUseConsoleForOutput.setMinimumSize(new Dimension(200, 30));
        chkUseConsoleForOutput.setPreferredSize(new Dimension(200, 30));

        chkGenerateGuardsAndActions.setText("Generate guards and actions");
        chkGenerateGuardsAndActions.setMaximumSize(new Dimension(200, 30));
        chkGenerateGuardsAndActions.setMinimumSize(new Dimension(200, 30));
        chkGenerateGuardsAndActions.setPreferredSize(new Dimension(200, 30));

        chkUseProbabilityFilter.setText("Use probability filter");
        chkUseProbabilityFilter.setMaximumSize(new Dimension(200, 30));
        chkUseProbabilityFilter.setMinimumSize(new Dimension(200, 30));
        chkUseProbabilityFilter.setPreferredSize(new Dimension(200, 30));

        txtProbabilityFilterAmountOfDigits.setMaximumSize(new Dimension(200, 30));
        txtProbabilityFilterAmountOfDigits.setMinimumSize(new Dimension(200, 30));
        txtProbabilityFilterAmountOfDigits.setPreferredSize(new Dimension(200, 30));

        lblProbabilityFilterAmountOfDigits.setText("Amount of digits:");
        lblProbabilityFilterAmountOfDigits.setMaximumSize(new Dimension(200, 20));
        lblProbabilityFilterAmountOfDigits.setMinimumSize(new Dimension(200, 20));
        lblProbabilityFilterAmountOfDigits.setPreferredSize(new Dimension(200, 20));

        GroupLayout tpMainGeneralLayout = new GroupLayout(tpMainGeneral);
        tpMainGeneral.setLayout(tpMainGeneralLayout);
        tpMainGeneralLayout.setHorizontalGroup(tpMainGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tpMainGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(tpMainGeneralLayout.createSequentialGroup()
                        .addComponent(chkUseConsoleForOutput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tpMainGeneralLayout.createSequentialGroup()
                        .addGroup(tpMainGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(chkGenerateGuardsAndActions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkUseProbabilityFilter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(tpMainGeneralLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(tpMainGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProbabilityFilterAmountOfDigits, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProbabilityFilterAmountOfDigits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 448, Short.MAX_VALUE))))
        );
        tpMainGeneralLayout.setVerticalGroup(tpMainGeneralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkUseConsoleForOutput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGenerateGuardsAndActions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkUseProbabilityFilter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProbabilityFilterAmountOfDigits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProbabilityFilterAmountOfDigits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        tpMain.addTab("General", tpMainGeneral);

        lblDirectorySource.setText("Directory with PCM models:");
        lblDirectorySource.setMaximumSize(new Dimension(500, 20));
        lblDirectorySource.setMinimumSize(new Dimension(500, 20));
        lblDirectorySource.setPreferredSize(new Dimension(500, 20));

        txtDirectorySource.setEditable(false);
        txtDirectorySource.setMaximumSize(new Dimension(500, 30));
        txtDirectorySource.setMinimumSize(new Dimension(500, 30));
        txtDirectorySource.setPreferredSize(new Dimension(500, 30));

        btnSelectDirectorySource.setText("Select directory...");
        btnSelectDirectorySource.setMaximumSize(new Dimension(140, 30));
        btnSelectDirectorySource.setMinimumSize(new Dimension(140, 30));
        btnSelectDirectorySource.setPreferredSize(new Dimension(140, 30));
        btnSelectDirectorySource.addActionListener(this);

        lblResourceModelFile.setText("PCM resource environment model filename:");
        lblResourceModelFile.setMaximumSize(new Dimension(500, 20));
        lblResourceModelFile.setMinimumSize(new Dimension(500, 20));
        lblResourceModelFile.setPreferredSize(new Dimension(500, 20));

        txtResourceModelFile.setEditable(false);
        txtResourceModelFile.setMaximumSize(new Dimension(500, 30));
        txtResourceModelFile.setMinimumSize(new Dimension(500, 30));
        txtResourceModelFile.setPreferredSize(new Dimension(500, 30));

        btnSelectResourceModelFile.setText("Select file...");
        btnSelectResourceModelFile.setMaximumSize(new Dimension(140, 30));
        btnSelectResourceModelFile.setMinimumSize(new Dimension(140, 30));
        btnSelectResourceModelFile.setPreferredSize(new Dimension(140, 30));
        btnSelectResourceModelFile.addActionListener(this);

        lblRepositoryModelFile.setText("PCM repository model filename:");
        lblRepositoryModelFile.setMaximumSize(new Dimension(500, 20));
        lblRepositoryModelFile.setMinimumSize(new Dimension(500, 20));
        lblRepositoryModelFile.setPreferredSize(new Dimension(500, 20));

        txtRepositoryModelFile.setEditable(false);
        txtRepositoryModelFile.setMaximumSize(new Dimension(500, 30));
        txtRepositoryModelFile.setMinimumSize(new Dimension(500, 30));
        txtRepositoryModelFile.setPreferredSize(new Dimension(500, 30));

        btnSelectRepositoryModelFile.setText("Select file...");
        btnSelectRepositoryModelFile.setMaximumSize(new Dimension(140, 30));
        btnSelectRepositoryModelFile.setMinimumSize(new Dimension(140, 30));
        btnSelectRepositoryModelFile.setPreferredSize(new Dimension(140, 30));
        btnSelectRepositoryModelFile.addActionListener(this);

        lblSystemModelFile.setText("PCM system model filename:");
        lblSystemModelFile.setMaximumSize(new Dimension(500, 20));
        lblSystemModelFile.setMinimumSize(new Dimension(500, 20));
        lblSystemModelFile.setPreferredSize(new Dimension(500, 20));

        txtSystemModelFile.setEditable(false);
        txtSystemModelFile.setMaximumSize(new Dimension(500, 30));
        txtSystemModelFile.setMinimumSize(new Dimension(500, 30));
        txtSystemModelFile.setPreferredSize(new Dimension(500, 30));

        btnSelectSystemModelFile.setText("Select file...");
        btnSelectSystemModelFile.setMaximumSize(new Dimension(140, 30));
        btnSelectSystemModelFile.setMinimumSize(new Dimension(140, 30));
        btnSelectSystemModelFile.setPreferredSize(new Dimension(140, 30));
        btnSelectSystemModelFile.addActionListener(this);

        lblSystemProvidedRole.setText("Provided role of PCM system model:");
        lblSystemProvidedRole.setMaximumSize(new Dimension(500, 20));
        lblSystemProvidedRole.setMinimumSize(new Dimension(500, 20));
        lblSystemProvidedRole.setPreferredSize(new Dimension(500, 20));

        cboSystemProvidedRole.setMaximumSize(new Dimension(500, 30));
        cboSystemProvidedRole.setMinimumSize(new Dimension(500, 30));
        cboSystemProvidedRole.setPreferredSize(new Dimension(500, 30));

        btnRefreshSystemProvidedRole.setText("Refresh");
        btnRefreshSystemProvidedRole.setMaximumSize(new Dimension(140, 30));
        btnRefreshSystemProvidedRole.setMinimumSize(new Dimension(140, 30));
        btnRefreshSystemProvidedRole.setPreferredSize(new Dimension(140, 30));
        btnRefreshSystemProvidedRole.addActionListener(this);

        btnSelectAllocationModelFile.setText("Select file...");
        btnSelectAllocationModelFile.setMaximumSize(new Dimension(140, 30));
        btnSelectAllocationModelFile.setMinimumSize(new Dimension(140, 30));
        btnSelectAllocationModelFile.setPreferredSize(new Dimension(140, 30));
        btnSelectAllocationModelFile.addActionListener(this);

        lblAllocationModelFile.setText("PCM allocation model filename:");
        lblAllocationModelFile.setMaximumSize(new Dimension(500, 20));
        lblAllocationModelFile.setMinimumSize(new Dimension(500, 20));
        lblAllocationModelFile.setPreferredSize(new Dimension(500, 20));

        txtAllocationModelFile.setEditable(false);
        txtAllocationModelFile.setMaximumSize(new Dimension(500, 30));
        txtAllocationModelFile.setMinimumSize(new Dimension(500, 30));
        txtAllocationModelFile.setPreferredSize(new Dimension(500, 30));

        GroupLayout tpMainSourceLayout = new GroupLayout(tpMainSource);
        tpMainSource.setLayout(tpMainSourceLayout);
        tpMainSourceLayout.setHorizontalGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainSourceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(tpMainSourceLayout.createSequentialGroup()
                        .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(tpMainSourceLayout.createSequentialGroup()
                                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSystemModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSystemModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectSystemModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(tpMainSourceLayout.createSequentialGroup()
                                .addComponent(cboSystemProvidedRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefreshSystemProvidedRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(tpMainSourceLayout.createSequentialGroup()
                        .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(tpMainSourceLayout.createSequentialGroup()
                                .addComponent(txtAllocationModelFile, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectAllocationModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, tpMainSourceLayout.createSequentialGroup()
                                    .addComponent(txtRepositoryModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSelectRepositoryModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.LEADING, tpMainSourceLayout.createSequentialGroup()
                                    .addComponent(txtResourceModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSelectResourceModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblRepositoryModelFile, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.LEADING, tpMainSourceLayout.createSequentialGroup()
                                    .addComponent(txtDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSelectDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSystemProvidedRole, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResourceModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAllocationModelFile, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tpMainSourceLayout.setVerticalGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainSourceLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDirectorySource, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResourceModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectResourceModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResourceModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRepositoryModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepositoryModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectRepositoryModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSystemModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSystemModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectSystemModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSystemProvidedRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSystemProvidedRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshSystemProvidedRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAllocationModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainSourceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAllocationModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectAllocationModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(333, 333, 333))
        );

        tpMain.addTab("Input", tpMainSource);

        lblUsageModelFile.setText("Filename of the generated modified PCM usage model:");
        lblUsageModelFile.setMaximumSize(new Dimension(500, 20));
        lblUsageModelFile.setMinimumSize(new Dimension(500, 20));
        lblUsageModelFile.setPreferredSize(new Dimension(500, 20));

        txtUsageModelFile.setMaximumSize(new Dimension(500, 30));
        txtUsageModelFile.setMinimumSize(new Dimension(500, 30));
        txtUsageModelFile.setPreferredSize(new Dimension(500, 30));

        btnSelectUsageModelFile.setText("Select file...");
        btnSelectUsageModelFile.setMaximumSize(new Dimension(140, 30));
        btnSelectUsageModelFile.setMinimumSize(new Dimension(140, 30));
        btnSelectUsageModelFile.setPreferredSize(new Dimension(140, 30));
        btnSelectUsageModelFile.addActionListener(this);

        lblDirectoryTarget.setText("Output directory for the PCM instance:");
        lblDirectoryTarget.setMaximumSize(new Dimension(500, 20));
        lblDirectoryTarget.setMinimumSize(new Dimension(500, 20));
        lblDirectoryTarget.setPreferredSize(new Dimension(500, 20));

        txtDirectoryTarget.setEditable(false);
        txtDirectoryTarget.setMaximumSize(new Dimension(500, 30));
        txtDirectoryTarget.setMinimumSize(new Dimension(500, 30));
        txtDirectoryTarget.setPreferredSize(new Dimension(500, 30));

        btnSelectDirectoryTarget.setText("Select directory...");
        btnSelectDirectoryTarget.setMaximumSize(new Dimension(140, 30));
        btnSelectDirectoryTarget.setMinimumSize(new Dimension(140, 30));
        btnSelectDirectoryTarget.setPreferredSize(new Dimension(140, 30));
        btnSelectDirectoryTarget.addActionListener(this);

        GroupLayout tpMainTargetLayout = new GroupLayout(tpMainTarget);
        tpMainTarget.setLayout(tpMainTargetLayout);
        tpMainTargetLayout.setHorizontalGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainTargetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDirectoryTarget, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsageModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDirectoryTarget, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsageModelFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelectDirectoryTarget, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectUsageModelFile, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tpMainTargetLayout.setVerticalGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tpMainTargetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDirectoryTarget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirectoryTarget, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDirectoryTarget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsageModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tpMainTargetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsageModelFile, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectUsageModelFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 273, Short.MAX_VALUE))
        );

        tpMain.addTab("Output", tpMainTarget);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBottom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tpMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBottom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnSave) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSaveActionPerformed(evt);
        }
        else if (evt.getSource() == btnSaveAndClose) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSaveAndCloseActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectDirectorySource) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectDirectorySourceActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectResourceModelFile) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectResourceModelFileActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectRepositoryModelFile) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectRepositoryModelFileActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectSystemModelFile) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectSystemModelFileActionPerformed(evt);
        }
        else if (evt.getSource() == btnRefreshSystemProvidedRole) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnRefreshSystemProvidedRoleActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectAllocationModelFile) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectAllocationModelFileActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectUsageModelFile) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectUsageModelFileActionPerformed(evt);
        }
        else if (evt.getSource() == btnSelectDirectoryTarget) {
            BaseWessbasToPcmConfigurationFileDialog.this.btnSelectDirectoryTargetActionPerformed(evt);
        }
    }

    public void componentHidden(ComponentEvent evt) {
    }

    public void componentMoved(ComponentEvent evt) {
    }

    public void componentResized(ComponentEvent evt) {
    }

    public void componentShown(ComponentEvent evt) {
        if (evt.getSource() == BaseWessbasToPcmConfigurationFileDialog.this) {
            BaseWessbasToPcmConfigurationFileDialog.this.formComponentShown(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    protected void btnRefreshSystemProvidedRoleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRefreshSystemProvidedRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshSystemProvidedRoleActionPerformed

	protected void btnSaveAndCloseActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSaveAndCloseActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSaveAndCloseActionPerformed

	protected void formComponentShown( ComponentEvent evt )
	{// GEN-FIRST:event_formComponentShown
		// TODO add your handling code here:
	}// GEN-LAST:event_formComponentShown

	protected void btnSaveActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSaveActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSaveActionPerformed

	protected void btnSelectDirectorySourceActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectDirectorySourceActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectDirectorySourceActionPerformed

	protected void btnSelectResourceModelFileActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectResourceModelFileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectResourceModelFileActionPerformed

	protected void btnSelectRepositoryModelFileActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectRepositoryModelFileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectRepositoryModelFileActionPerformed

	protected void btnSelectSystemModelFileActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectSystemModelFileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectSystemModelFileActionPerformed

	protected void btnSelectAllocationModelFileActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectAllocationModelFileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectAllocationModelFileActionPerformed

	protected void btnSelectUsageModelFileActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectUsageModelFileActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectUsageModelFileActionPerformed

	protected void btnSelectDirectoryTargetActionPerformed( ActionEvent evt )
	{// GEN-FIRST:event_btnSelectDirectoryTargetActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnSelectDirectoryTargetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected JButton btnRefreshSystemProvidedRole;
    protected JButton btnSave;
    protected JButton btnSaveAndClose;
    protected JButton btnSelectAllocationModelFile;
    protected JButton btnSelectDirectorySource;
    protected JButton btnSelectDirectoryTarget;
    protected JButton btnSelectRepositoryModelFile;
    protected JButton btnSelectResourceModelFile;
    protected JButton btnSelectSystemModelFile;
    protected JButton btnSelectUsageModelFile;
    protected JComboBox cboSystemProvidedRole;
    protected JCheckBox chkGenerateGuardsAndActions;
    protected JCheckBox chkUseConsoleForOutput;
    protected JCheckBox chkUseProbabilityFilter;
    protected JLabel lblAllocationModelFile;
    protected JLabel lblDirectorySource;
    protected JLabel lblDirectoryTarget;
    protected JLabel lblProbabilityFilterAmountOfDigits;
    protected JLabel lblRepositoryModelFile;
    protected JLabel lblResourceModelFile;
    protected JLabel lblSystemModelFile;
    protected JLabel lblSystemProvidedRole;
    protected JLabel lblUsageModelFile;
    protected JPanel pnlBottom;
    protected JTabbedPane tpMain;
    protected JPanel tpMainGeneral;
    protected JPanel tpMainSource;
    protected JPanel tpMainTarget;
    protected JTextField txtAllocationModelFile;
    protected JTextField txtDirectorySource;
    protected JTextField txtDirectoryTarget;
    protected JTextField txtProbabilityFilterAmountOfDigits;
    protected JTextField txtRepositoryModelFile;
    protected JTextField txtResourceModelFile;
    protected JTextField txtSystemModelFile;
    protected JTextField txtUsageModelFile;
    // End of variables declaration//GEN-END:variables
}