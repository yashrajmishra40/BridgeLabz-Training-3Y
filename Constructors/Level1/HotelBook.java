package Constructors.Level1;
// 4. HotelBooking class with constructors
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println(guestName + " booked " + roomType + " for " + nights + " nights.");
    }
}