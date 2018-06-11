package com.journaldev.retrofitintro.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bruno on 05/06/18.
 */

//PASSO 2
public class Customer {

    @SerializedName("customerID")
    protected String customerID;

    @SerializedName("contactName")
    protected String contactName;

    @SerializedName("companyName")
    protected String companyName;

    public Customer(String customerID, String contactName, String companyName) {
        this.customerID = customerID;
        this.contactName = contactName;
        this.companyName = companyName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", contactName='" + contactName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
