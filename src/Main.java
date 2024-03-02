
import pharmacy.*;
import pharmacy.impl.*;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        ArrayList<MedicineComponent> medList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);

        medList.add(asitr);
        medList.add(penicilinium);
        medList.add(vetbic);

        ArrayList<Medicine> medicineList = new ArrayList<>();
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(vetbic);

        Medicine medicine2 = new Medicine();
        medicine2.addComponent(vetbic);

        Medicine medicine3 = new Medicine();
        medicine3.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);

        medicineList.add(medicine1);
        medicineList.add(medicine2);
        medicineList.add(medicine3);

        System.out.println(medicineList);

        Collections.sort(medicineList);
        System.out.println(medicineList);

        medicineList.sort(Comparator.reverseOrder());
        System.out.println(medicineList);

//        for (MedicineComponent companent : medicine1) {
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
//        while (medicine1.hasNext()) {
//            System.out.println(med.next());
//        }
//        for (MedicineComponent component : medicine1) {
//            System.out.println(component);
//        }
        medList.add(asitr);
        medList.add(penicilinium);
        medList.add(vetbic);
//        System.out.println(medList);
//        Collections.sort(medList, (o1, o2) -> 0);
//        System.out.println(medList);

    }
}