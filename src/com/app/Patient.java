package com.app;

/**
 * Kjo klase bene modelimin e pacientit
 */
public class Patient {
   private String emri,mbiemri,datelindja,data,ora;
   private long id;
    public Patient(String emri,String mbiemri,long id,String datelindja,String data,String ora)
    {
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.id=id;
        this.datelindja=datelindja;
        this.data=data;
        this.ora=ora;
    }
    public String getEmri() 
    {return emri;}

    public String getMbiemri()
    {return mbiemri;}

    public long getId()
    {return id;}

    public String getDatelindja()
    {return datelindja;}

    public String getData()
    {return data;}

    public String getOra()
    {return ora;}

    public void setData(String i)
    {data=i;}

    public void setOra(String i)
    {ora=i;}
}