interface Vehicle {
    void accelerate();
    void brake();
}


class Car implements Vehicle {

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}

class Bicycle implements Vehicle {

    public void accelerate() {
        System.out.println("Bicycle is speeding up");
    }

    public void brake() {
        System.out.println("Bicycle is slowing down");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
    }
}

