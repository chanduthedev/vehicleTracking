package com.product.vehicleTracking.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {

    @Id
    Integer id;
    String name;
    String mobileNo;
    String aadharNo;
    String email;
    String licenceNo;
    
    
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Users(Integer id, String name, String mobileNo, String aadharNo, String email, String licenceNo) {
        super();
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.aadharNo = aadharNo;
        this.email = email;
        this.licenceNo = licenceNo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getAadharNo() {
        return aadharNo;
    }
    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLicenceNo() {
        return licenceNo;
    }
    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }
    
    
    
}
