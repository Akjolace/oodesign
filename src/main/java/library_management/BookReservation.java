package library_management;

import library_management.enums.ReservationStatus;

import java.util.Date;

public class BookReservation {
    private Date creationDate;
    private ReservationStatus reservationStatus;
    private String bookItemBarcode;
    private String memberId;

    public static BookReservation fetchReservationDetails(String barcode){
        return null;
    }
}
