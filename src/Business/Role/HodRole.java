/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HodOraganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HodRole.HodWorkAreaJPanel;

/**
 *
 * @author Anish Gupta
 */
public class HodRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new HrWorkAreaJPanel(userProcessContainer, account, (HrOrganization)organization, enterprise);
        return new HodWorkAreaJPanel(userProcessContainer, account, (HodOraganization)organization, business);
    }
    
}
