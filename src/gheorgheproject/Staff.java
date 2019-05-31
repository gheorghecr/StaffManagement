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
public class Staff {
    
    private int ref;
    private String firstName;
    private String lastName;
    private String email;
    private int mobileNumber;
    private int  homeNumber;
    private int emergencyNumber;
    private String address;
    private String city;
    private String postCode;
    private String dateOfBirth;
    private String contractType;
    private String department;
    private String salary;
    
    public Staff(){
    }
    
    public int getRef(){
        return ref;
    }
    public void setRef(int aRef){
        ref = aRef;        
    }
    
    public int getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(int aMobileNumber){
        mobileNumber = aMobileNumber;        
    }
    
    public int getHomeNumber(){
        return homeNumber;
    }
    public void setHomeNumber(int aHomeNumber){
        homeNumber = aHomeNumber;        
    }
    
    public int getEmergencyNumber(){
        return emergencyNumber;
    }
    public void setEmergencyNumber(int aEmergencyNumber){
        emergencyNumber = aEmergencyNumber;        
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String aFirstName){
        firstName = aFirstName;        
    }
    
    public String getLasttName(){
        return lastName;
    }
    public void setLastName(String aLastName){
        lastName = aLastName;        
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String aEmail){
        email = aEmail;        
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String aAddress){
        address = aAddress;        
    }
    
    public String getCity(){
        return city;
    }
    public void setCity(String aCity){
        city = aCity;        
    }
    
    public String getPostCode(){
        return postCode;
    }
    public void setPostCode(String aPostCode){
        postCode = aPostCode;        
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String aDateOfBirth){
        dateOfBirth = aDateOfBirth;        
    }
    
    public String getContractType(){
        return contractType;
    }
    public void setContractType(String aContractType){
        contractType = aContractType;        
    }
    
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String aDepartment){
        department = aDepartment;        
    }
    
    public String getSalary(){
        return salary;
    }
    public void setSalary(String aSalary){
        salary = aSalary;        
    }
    
    
    
    
    
    
    
}
