package design_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class VehicleCollection implements Collection{
    private List<String> vehicles = List.of("Car", "Boat", "Plane", "Train");

    public List<String> getVehicles() {
        return vehicles;
    }

    @Override
    public Iterator getIterator() {
        return new VehicleIterator();
    }

    public class VehicleIterator implements Iterator {

        private int index = 0;

        @Override
        public Boolean hasNext() {
            return vehicles.size() > index;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                int currentIndex = index;
                index++;
                return vehicles.get(currentIndex);
            }

            return null;
        }

        @Override
        public void reset() {
            this.index = 0;
        }
    }
}
