package com.durgasoft.beans;

public class Employee {
    private int eno;
    private String ename;
    private float esal;
    private Address address;
    private Account account;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void getEmployDetails()
    {
        System.out.println("Employ Details");
        System.out.println("-------------------------");
        System.out.println("Employee Id      :"+eno);
        System.out.println("Employee Name    :"+ename);
        System.out.println("Employee Address :"+esal);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("---------------------------");
        System.out.println("Account Id           :"+account.getAccNo());
        System.out.println("Account Holder Name  :"+account.getAccHolderName());
        System.out.println("Account Balance      :"+account.getBalance());
        System.out.println("Account Type         :"+account.getAccType());
        System.out.println();
        System.out.println("Address Details");
        System.out.println("-----------------------------");
        System.out.println("House No.       :"+address.getHno());
        System.out.println("Street          :"+address.getStreet());
        System.out.println("City            :"+address.getCity());
        System.out.println("State           :"+address.getState());
        System.out.println();
    }
}
