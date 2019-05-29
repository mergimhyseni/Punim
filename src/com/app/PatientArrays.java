package com.app;
/**
 * Kjo klase krijon vargun me pacient pra elemenetet e ketij vargu jane pacientet
 */
public class PatientArrays {
    Patient []users= new Patient[0];
    long []id=new long[0];

    public void add(Patient u)
    {
        Patient []users1=new Patient[users.length+1];

        for (int i=0;i<users.length;i++)
        {
            users1[i]=users[i];
        }
        users1[users1.length-1]=u;
        users=users1;
    }
    public void delete(int index)
    {
        Patient []users1=new Patient[users.length-1];
        for (int i=0;i<index;i++)
        {
            users1[i]=users[i];
        }
        for (int i=index;i<users1.length;i++)
        {
            users1[i]=users[i+1];
        }
        users=users1;
    }
    public void addId(long n)
    {
        long [] id1=new long[id.length+1];
        for (int i=0;i<id.length;i++)
        {
            id1[i]=id[i];
        }
        id1[id1.length-1]=n;
        id=id1;
    }
    public boolean kontrolloId(long u)
    {   boolean ok=false;
        for (int i=0;i<users.length;i++)
        {  Patient a=users[i];
            if (a.getId()==u){ok=true;}

        }
        return ok;
    }



}