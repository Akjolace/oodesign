package library_management;

import java.util.Date;

public class Member extends Account{
    private Date dateOfMembership;
    private int totalBooksCheckedout;

    public int getTotalBooksCheckedout(){
        return this.totalBooksCheckedout;
    }

    private void incrementTotalBooksCheckedout(){
        this.totalBooksCheckedout++;
    }

    public boolean reserveBookItem(BookItem bookItem){
        return false;
    }

    public boolean checkoutBookItem(BookItem bookItem){
        //checking the limit of max check book
        //check if that book is available -> if not able to reserve -> send notification
        //

        this.incrementTotalBooksCheckedout();
        return true;
    }


}
