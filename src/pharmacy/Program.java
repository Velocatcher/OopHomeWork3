package pharmacy;

import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinium;
import pharmacy.impl.Vetbicid;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Asitromin asitr = new Asitromin("Asitro", 50, 70);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
//        for (MedicineComponent companent : medicine1) {
//
//        }
        Iterator<MedicineComponent> med = medicine1;
        while (med.hasNext()) {
            System.out.println(med.next());
        }
    }

}
