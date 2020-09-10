package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {

    //Declaratie Variabelen
    int M;
    int V;
    int PM;
    int PV;

    //Declaratie Knoppen
    Button BM;
    Button BV;
    Button BPM;
    Button BPV;

    public void init() {
        setSize(800,200);

        //Initalisatie Variabelen
        M = 0;
        V = 0;
        PM = 0;
        PV = 0;

        //Knoppen
        BM = new Button("Mannelijke Studenten");
        BV = new Button("Vrouwelijke Studenten");
        BPM = new Button("Potentiele Mannelijke Studenten");
        BPV = new Button("Potentiele Vrouwlijke Studenten");


        //Functies Knoppen
        BM.addActionListener(new bmL());
        BV.addActionListener(new bvL());
        BPM.addActionListener(new bpotmL());
        BPV.addActionListener(new bpotvL());

        //Knoppen
        add(BM);
        add(BV);
        add(BPM);
        add(BPV);

    }

    public void paint(Graphics g) {
        g.drawString("Mannelijke Studenten: " + V,50,60);
        g.drawString("Potentiele Mannelijke Studenten: " + PM,50,80);
        g.drawString("Potentiele Vrouwelijke Studenten: " + PV,50,100);

    }

    class bmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            M ++;
            repaint();
        }
    }

    class bvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            V ++;
            repaint();
        }
    }

    class bpotmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PM ++;
            repaint();
        }
    }

    class bpotvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PV ++;
            repaint();
        }
    }

}