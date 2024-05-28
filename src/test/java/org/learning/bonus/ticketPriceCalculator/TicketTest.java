package org.learning.bonus.ticketPriceCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void generateValidTicket() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-1, -5));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(134.43, -4));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-134.43, 44));
        Ticket t = new Ticket(67.32, 34 );
        assertEquals(34, t.getAge());
        assertEquals(67.32, t.getDistance());
    }

    @Test
    void ticketPriceCalculator() {
        Ticket t1 = new Ticket(67.32, 34);
        assertEquals(14.14, t1.ticketPriceCalculator(), 0.05);
        Ticket t2 = new Ticket(67.32, 14);
        assertEquals(11.31, t2.ticketPriceCalculator(), 0.05);
        Ticket t3 = new Ticket(67.32, 74);
        assertEquals(8.48, t3.ticketPriceCalculator(), 0.05);
    }
}