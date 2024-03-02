package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }


    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine o) {
        int powerComponents1 = 0;
        int powerComponents2 = 0;
        for(MedicineComponent component : this.components) {
            powerComponents1 += (int) component.getPower();
        }
        for(MedicineComponent component : o.components) {
            powerComponents2 += (int) component.getPower();
        }

        return Integer.compare(powerComponents2, powerComponents1);

//        return components.size() - o.components.size();
    }
}
