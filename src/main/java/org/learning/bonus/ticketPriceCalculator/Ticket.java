package org.learning.bonus.ticketPriceCalculator;

public class Ticket {

    // ATTRIBUTES
    private static final double PRICE_PER_KM = 0.21;
    private static final double UNDERAGE_DISCOUNT = 0.2;
    private static final double OVER_65_DISCOUNT = 0.4;
    private final double distance;
    private final int age;

    // CONSTRUCTORS
    public Ticket(double distance, int age) throws IllegalArgumentException {
        if (distance >= 0 && age >= 0) {
            this.distance = distance;
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // GETTER
    public double getDistance() {
        return this.distance;
    }

    public int getAge() {
        return this.age;
    }

    // METHODS
    public double ticketPriceCalculator() {
        double ticketPrice;

        if (this.age < 18) {
            ticketPrice = (this.distance * Ticket.PRICE_PER_KM) * (1 - Ticket.UNDERAGE_DISCOUNT);
        } else if (this.age >= 65) {
            ticketPrice = (this.distance * Ticket.PRICE_PER_KM) * (1 - Ticket.OVER_65_DISCOUNT);
        } else {
            ticketPrice = this.distance * Ticket.PRICE_PER_KM;
        }

        return ticketPrice;
    }
}
