package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components2;
    private int index;

    public Medicine2() {
        this.components2 = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components2.add(component);
        return this;
    }


//    @Override
//    public boolean hasNext() {
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedicineComponent next() {
////        return components.iterator().next();
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Medicine: " + components2.toString();
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
    @Override
    public boolean hasNext() {
                return index < components2.size();
            }

    @Override
    public MedicineComponent next() {
                return components2.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Medicine o) {
        int powerComponents1 = 0;
        int powerComponents2 = 0;
        for(MedicineComponent component : this.components2) {
            powerComponents1 += (int) component.getPower();
        }
        for(MedicineComponent component : o.components) {
            powerComponents2 += (int) component.getPower();
        }

        return Integer.compare(powerComponents1, powerComponents2);

    }
}
