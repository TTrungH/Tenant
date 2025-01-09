import java.util.*;

public class Tenant {
    private int userID;
    private List<Integer> listOfContacts = new ArrayList<>();

    public Tenant(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<Integer> getListOfContacts() {
        return listOfContacts;
    }

    public void setListOfContacts(List<Integer> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    public boolean requestCreateRentalContract(int contactID) {
        return true;
    }

public boolean  requestTerminateRentalContract(int contactID){
return true;s
}

}
