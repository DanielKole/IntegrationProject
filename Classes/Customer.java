package model;

public class Customer {
    String fname;
    String lname;
    String email;
    String address;
    String pnum;

    public void setFname( String value )
    {
        fname = value;
    }
    public void setLname( String value )
    {
        lname = value;
    }
    public void setAddress( String value )
    {
        address = value;
    }
        public void setPnum( String value )
    {
        pnum = value;
    }
    public void setEmail( String value )
    {
        email = value;
    }


    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getAddress() { return address; }
    public String getPnum() { return pnum; }
    public String getEmail() { return email; }
    public void reSet(){
        this.fname = null;
        this.lname = null;
        this.email = null;
        this.address = null;
        this.pnum = null;
    }

}