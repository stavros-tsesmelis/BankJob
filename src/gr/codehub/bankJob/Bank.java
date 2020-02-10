package gr.codehub.bankJob;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Account> accounts;
    //public model.TotalBalnce e;

    public Bank(){
   this.accounts = new ArrayList<>();
  }

  public void addAccount (Account a) {
accounts.add(a);
  }

    public void getTotalBalance (TotalBalance tb) {

        accounts.add(tb);
    }
}
