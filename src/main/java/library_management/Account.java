package library_management;

import library_management.enums.AccountStatus;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword(){
        return false;
    }
}
