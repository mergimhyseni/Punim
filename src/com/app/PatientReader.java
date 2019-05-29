package com.app;
import javax.swing.*;
/**
 * Kjo klase ka metoden per leximin e komandes te dhene nga shfrytezuesi
 */
public class PatientReader {

    PatientArrays a;
    PatientWritter  v;

     public PatientReader(PatientWritter v,PatientArrays a)
     {this.v=v;
      this.a=a;}
    public void proceso()
    {   String input=JOptionPane.showInputDialog("Komanda(R,N,F,Q)"+"\nR - Regjistro \nN - Ndrysho \nF - fshije \nQ - quit");
        if (input==null || input.length()==0){}
        else { char komanda=readCommand(input);
            if (komanda == 'Q') {
            } else {
                switch (komanda) {
                    case 'R': {
                        String emri = JOptionPane.showInputDialog("Emri:");
                        String mbiemri = JOptionPane.showInputDialog("Mbiemri:");
                        long id = Long.parseLong(JOptionPane.showInputDialog("Numri Personal:"));
                          if (a.kontrolloId(id)){JOptionPane.showMessageDialog(null,"Personi eshte i regjistruar");}
                        else {a.addId(id);
                               int ditaELindjes = Integer.parseInt(JOptionPane.showInputDialog("Dita e Lindjes:"));
                              if (ditaELindjes>31 || ditaELindjes <1)
                              {JOptionPane.showMessageDialog(null,"Dita e dhene eshte gabim");}
                              else {
                              int muajIILindjes = Integer.parseInt(JOptionPane.showInputDialog("Muaji i lindjes:"));
                               if (muajIILindjes>12 || muajIILindjes<0)
                               {JOptionPane.showMessageDialog(null,"Muaji i dhene eshte gabim");}
                              else {int vitiILindjes = Integer.parseInt(JOptionPane.showInputDialog("Viti i lindjes:"));
                              int ditaETerminit = Integer.parseInt(JOptionPane.showInputDialog("Dita e Terminit"));
                                   if (ditaETerminit>31 || ditaETerminit <1)
                                   {JOptionPane.showMessageDialog(null,"Dita e dhene eshte gabim");}
                                   else { int muajITerminit = Integer.parseInt(JOptionPane.showInputDialog("Muaji i Terminit:"));
                                       if (muajITerminit>12 || muajITerminit<0)
                                       {JOptionPane.showMessageDialog(null,"Muaji i dhene eshte gabim");}
                                       else { int vitiITerminit = Integer.parseInt(JOptionPane.showInputDialog("Viti i Terminit:"));
                        int ora =Integer.parseInt( JOptionPane.showInputDialog("Ora:"));
                                           if (ora>23 || ora <0)
                                           {JOptionPane.showMessageDialog(null,"Ora e dhene eshte gabim");}
                                           else { int minutat=Integer.parseInt(JOptionPane.showInputDialog("Minutat:"));
                                               if (minutat>59 || minutat <0)
                                               {JOptionPane.showMessageDialog(null,"Minutat e dhene jane gabim");}
                                               else {


                        a.add(new Patient(emri, mbiemri, id,ditaELindjes+"/"+muajIILindjes+"/"+vitiILindjes, ditaETerminit+"/"+muajITerminit+"/"+vitiITerminit, ora+":"+minutat));
                        v.repaint();}}}}}}}
                        proceso();
                        break;
                    }
                    case 'N': {
                        int index = new Integer(JOptionPane.showInputDialog("Zgjedh sipas indeksit  pacientin ku do te beni ndryshime"));
                        if (index >=0 && index<a.users.length) {
                            String s = JOptionPane.showInputDialog("Komanda (D,O) \nD - Data e Terminit \nO - Ora e Terminit");
                            char c = readCommand(s);
                            Patient b = a.users[index];
                            switch (c) {
                                case 'D': {
                                    String data = JOptionPane.showInputDialog("Data E Terminit: (Dita/Muaji/Viti)");
                                    b.setData(data);
                                    v.repaint();
                                    proceso();
                                    break;
                                }
                                case 'O': {
                                    String ora = JOptionPane.showInputDialog("Ora E Terminit: (Ora:Minutat)");
                                    b.setOra(ora);
                                    v.repaint();
                                    proceso();
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                                    proceso();
                                }
                            }
                        }
                        else {JOptionPane.showMessageDialog(null,"Pacienti nuk gjendet ne liste");
                              proceso();}
                        break;
                    }
                    case 'F': {
                        int index = new Integer(JOptionPane.showInputDialog("Zgjedh sipas indeksit  pacientin per ta fshire nga lista"));
                        if (index >=0 && index<a.users.length)
                        {a.delete(index);}
                        else {JOptionPane.showMessageDialog(null,"Pacienti nuk gjendet ne liste");}
                        v.repaint();
                        proceso();
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                        proceso();
                    }

                }

            }

        }
    }

    public char readCommand(String s)
    {
      return s.toUpperCase().trim().charAt(0);
    }

}