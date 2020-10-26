package library_management;

import library_management.enums.BookFormat;
import library_management.enums.BookStatus;

import java.util.Date;

public class BookItem extends Book{
    private String barCode;
    private double price;
    private Date borrowed;
    private Date dueDate;
    private BookFormat format;
    private BookStatus status;
    private Date publishedDate;
    private Date purchasedDate;
}
