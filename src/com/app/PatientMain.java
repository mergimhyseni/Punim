package com.app;

/*
 * Kjo klase bene lidhjen e klasave paraprake dhe ekzekutimin e aplikacionit
 */
public class PatientMain {
    public static void main(String[] args) {
        PatientArrays a = new PatientArrays();
        PatientWritter v = new PatientWritter(a);
        PatientReader c = new PatientReader(v, a);
        c.proceso();
    }
}