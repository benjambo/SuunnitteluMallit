package com.company;

import java.util.Random;

public abstract class Palkankorotus {
    private Palkankorotus successor;
    protected static final double BASE = 0.02;

    public void setSuccessor(Palkankorotus successor) {
        this.successor = successor;
    }

    public void processRequest(PalkankorotusPyyntö request) {
        if (successor != null)
        successor.processRequest(request);
    }

    public void valinta(PalkankorotusPyyntö pyyntö) {
        Random random = new Random();
        int yes = 1;
        int no = 3;
        int result = random.nextInt(no - yes) + yes;

        switch (result) {
            case 1:
                System.out.println( pyyntö.getNimi() + ": 'Hyväksyn palkankoroituspyyntösi: " + pyyntö.getMäärä() + "€'");
                break;
            case 2:
                System.out.println(pyyntö.getNimi() + ": 'En hyväksy palkankorotuspyyntöäsi!'");
                break;
        }
    }

    public void oikeudet(PalkankorotusPyyntö pyyntö) {
        System.out.println(pyyntö.getNimi() + ": 'Valitettavasti minulla ei ole oikeuksia hyväksyä tuota pyyntöä...'");
    }
}
