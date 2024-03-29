/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NgoEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Corporate){
            enterprise=new CorporateEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void DeleteEnterprise(Enterprise enterprise) {
       
        enterpriseList.remove(enterprise);
    }
}
