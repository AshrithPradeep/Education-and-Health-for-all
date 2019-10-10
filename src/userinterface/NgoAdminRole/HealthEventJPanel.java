/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NgoAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.HodApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.HospitalAdminRole.PlanningHealthCheckupCampJPanel;

/**
 *
 * @author Anish Gupta
 */
public class HealthEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthEventJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    NgoAdminOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    
    public HealthEventJPanel(JPanel userProcessContainer, UserAccount account, NgoAdminOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateHealthCampTable();
    }
    
    public void populateHealthCampTable(){
        DefaultTableModel model = (DefaultTableModel)healthCheckupEventJTable.getModel();
        
        model.setRowCount(0);
        
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                                if(request instanceof HealthEventWorkRequest){
                                HealthEventWorkRequest req = (HealthEventWorkRequest) request;
                                Object[] row = new Object[1];
                    //            row[0] = request;
                    //            row[1] = request.getSender().getEmployee().getName();
                    //            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    //            row[3] = request.getStatus();
                                row[0] = req;

                                model.addRow(row);
                                }
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton3 = new javax.swing.JButton();
        removeEducationalEventDetailsJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        healthCheckupEventJTable = new javax.swing.JTable();
        createHealthCheckupCampJButton1 = new javax.swing.JButton();
        viewHealthEventDetailsJButton = new javax.swing.JButton();
        eventRegistrationJButton = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Health Checkup Camp Management");

        backJButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/back.png"))); // NOI18N
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        removeEducationalEventDetailsJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeEducationalEventDetailsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/cancel event.png"))); // NOI18N
        removeEducationalEventDetailsJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeEducationalEventDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEducationalEventDetailsJButtonActionPerformed(evt);
            }
        });

        healthCheckupEventJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        healthCheckupEventJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Health Checkup Camp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(healthCheckupEventJTable);

        createHealthCheckupCampJButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createHealthCheckupCampJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/create health checkup camp.png"))); // NOI18N
        createHealthCheckupCampJButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createHealthCheckupCampJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHealthCheckupCampJButton1ActionPerformed(evt);
            }
        });

        viewHealthEventDetailsJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewHealthEventDetailsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/view details.png"))); // NOI18N
        viewHealthEventDetailsJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewHealthEventDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHealthEventDetailsJButtonActionPerformed(evt);
            }
        });

        eventRegistrationJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eventRegistrationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/check event registration status.png"))); // NOI18N
        eventRegistrationJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eventRegistrationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventRegistrationJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(createHealthCheckupCampJButton1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(backJButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(removeEducationalEventDetailsJButton)
                                    .addGap(10, 10, 10)
                                    .addComponent(viewHealthEventDetailsJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(eventRegistrationJButton))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(createHealthCheckupCampJButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeEducationalEventDetailsJButton)
                    .addComponent(viewHealthEventDetailsJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton3)
                    .addComponent(eventRegistrationJButton))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void removeEducationalEventDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEducationalEventDetailsJButtonActionPerformed
        int selectedRow = healthCheckupEventJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }
        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCheckupEventJTable.getValueAt(selectedRow, 0);

        Organization org = null;
        //Enterprise enterprise =
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof NgoAdminOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().remove(request);
            account.getWorkQueue().getWorkRequestList().remove(request);
            for(Network network : business.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
                            if(req instanceof HodApprovalWorkRequest){
                                HodApprovalWorkRequest hodReq = (HodApprovalWorkRequest) req;
                                if(hodReq.getNgoEventReq() == request){
                                    hodReq.setStatus("Event Cancelled");
                                }
                            }
                        }
                    }
                }
            }
            //            System.out.println(org.getWorkQueue().getWorkRequestList());
        }
        JOptionPane.showMessageDialog(null, "Education Workshop Event Cancelled. Corporates notified!");
        populateHealthCampTable();
    }//GEN-LAST:event_removeEducationalEventDetailsJButtonActionPerformed

    private void createHealthCheckupCampJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHealthCheckupCampJButton1ActionPerformed
        CreateHealthCheckupCampJPanel createHealthEventJPanel = new CreateHealthCheckupCampJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("createHealthEventJPanel", createHealthEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_createHealthCheckupCampJButton1ActionPerformed

    private void viewHealthEventDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHealthEventDetailsJButtonActionPerformed
        int selectedRow = healthCheckupEventJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCheckupEventJTable.getValueAt(selectedRow, 0);
        HealthEventDetailsJPanel viewHealthEventDetailsJPanel = new HealthEventDetailsJPanel(userProcessContainer, request, account, enterprise, business);
        userProcessContainer.add("viewHealthEventDetailsJPanel", viewHealthEventDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHealthEventDetailsJButtonActionPerformed

    private void eventRegistrationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventRegistrationJButtonActionPerformed
        int selectedRow = healthCheckupEventJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HealthEventWorkRequest request = (HealthEventWorkRequest)healthCheckupEventJTable.getValueAt(selectedRow, 0);
        ViewDoctorRegisteredJPanel registeredDoctorsJPanel = new ViewDoctorRegisteredJPanel(userProcessContainer, request, account, enterprise);
        userProcessContainer.add("registeredDoctorsJPanel", registeredDoctorsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_eventRegistrationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton createHealthCheckupCampJButton1;
    private javax.swing.JButton eventRegistrationJButton;
    private javax.swing.JTable healthCheckupEventJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeEducationalEventDetailsJButton;
    private javax.swing.JButton viewHealthEventDetailsJButton;
    // End of variables declaration//GEN-END:variables
}