package com.app;
import javax.swing.*;
import java.awt.*;

/**
* kjo klase krijon nje dritare dhe shfaqe listen e pacienteve dhe te dhenat e tyre
 */
public class PatientWritter extends JPanel{
    PatientArrays c;
    public PatientWritter (PatientArrays c)
    {   this.c=c;
        JFrame frame=new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(850,600);
        frame.setVisible(true);
        frame.setTitle("Lista e pacienteve");
    }

    public void paintComponent(Graphics g)
    {   g.setColor(Color.white);
        g.fillRect(0,0,850,600);
        g.setColor(Color.black);

        for (int i=0;i<c.users.length;i++)
        {   Patient a=c.users[i];
               int rez=0;
             for (int j=0;j<c.id.length;j++)
             {
                if (a.getId()==c.id[j]){rez++;}

             }
            g.drawString("Pacienti: "+i+ " Emri: "+a.getEmri()+"  Mbiemri: "+a.getMbiemri()+"  Nr personal: "+a.getId()+
                    "  Datelindja: "+a.getDatelindja()+ "  Termini: "+ a.getData()+ "  Ora: "+a.getOra()+"  Regjisruar: "
                   +rez+" here" ,20,20+20*i);
        }

    }

}