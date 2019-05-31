/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gheorgheproject;

/**
 *
 * @author gheor
 */

import java.util.ArrayList;
import java.sql.*;

public class StaffRepoImpl implements Repo {
    
    private ArrayList<Staff> staffs;
    public ArrayList read(Connection conn){
        
        System.out.println("Reading from database");
        ArrayList list = new ArrayList();
        try{
            
            Statement st = conn.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM STAFF";
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Staff staf = new Staff();
                staf.setRef(rs.getInt("STAFF_ID"));
                staf.setFirstName(rs.getString("FIRSTNAME"));
                staf.setLastName(rs.getString("LASTNAME"));
                staf.setEmail(rs.getString("EMAIL"));
                staf.setMobileNumber(rs.getInt("MOBILENUMBER"));
                staf.setHomeNumber(rs.getInt("HOMENUMBER"));
                staf.setEmergencyNumber(rs.getInt("EMERGENCYNUMBER"));
                staf.setAddress(rs.getString("ADDRESS"));
                staf.setCity(rs.getString("CITY"));
                staf.setPostCode(rs.getString("POSTCODE"));
                staf.setCountry(rs.getString("COUNTRY"));
                staf.setDateOfBirth(rs.getString("DATEOFBIRTH"));
                staf.setDepartment(rs.getString("DEPARTMENT"));
                staf.setSalary(rs.getString("SALARY"));
                staf.setContractType(rs.getString("CONTRACT"));
                list.add(staf);
                System.out.println(rs.getInt("REF")+ "\t" + rs.getString("FIRSTNAME"));
                         
                               
            }//endo while
            rs.close();
            st.close();
        
        }catch(SQLException ex){
            System.out.println("SQLExeption failed !");
        }
        
        staffs = list;
        return staffs;
    }
    
    public void write(Connection conn, ArrayList staffs){
        System.out.println("Writing to the databse...");
        System.out.println("record size" + staffs.size());
        
        Statement st;
        
        try{
            st = conn.createStatement();
            String sql = "DELETE FROM STAFF";
            st.executeUpdate(sql);
            
            st.close();
        }
        catch(SQLException ex){
            System.out.println(" SQLException");                      
        }
        
        
        for(int i = 0; i<staffs.size(); i++){
            Staff staff = (Staff)staffs.get(i);
            try{
                st = conn.createStatement();
                
                String sql = "INSERT INTO STAFF VALUES (" + staff.getRef() + ", '"
                        + staff.getFirstName() + "' , '" + staff.getLasttName() + 
                        " ' , ' " + staff.getEmail() + " ' , " + staff.getMobileNumber()
                        + " , " + staff.getHomeNumber() + " , " + staff.getEmergencyNumber()
                        + " , ' " + staff.getAddress() + "' , ' " + staff.getCity() + 
                        " ' , ' " + staff.getPostCode() + " ' , ' " + staff.getCountry() +
                        " ' , ' " + staff.getDateOfBirth() + " ' , ' " + staff.getDepartment()
                        + "' , ' " + staff.getSalary() + " ' , ' " + staff.getContractType()
                        + " ' )";
                st.executeUpdate(sql);
                
                st.close();
             }
             
            catch(SQLException ex) {
                System.out.println("SQLException error");
            }
        }//end for 
    }
}
