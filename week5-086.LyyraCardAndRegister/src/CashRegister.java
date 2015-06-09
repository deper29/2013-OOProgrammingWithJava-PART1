
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECON_PRICE = 2.50;
    private final double GOURMET_PRICE = 4.00;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens  
        if (cashGiven >= ECON_PRICE){
            this.cashInRegister += ECON_PRICE;
            this.economicalSold++;
            return cashGiven - ECON_PRICE;
        } 
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= GOURMET_PRICE){
            this.cashInRegister += GOURMET_PRICE;
            this.gourmetSold++;
            return cashGiven - GOURMET_PRICE;
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card){
        if (card.balance() >= ECON_PRICE){
            card.pay(ECON_PRICE);
            this.economicalSold++;
            return true;
        }
        return false;
    }
    
    public boolean payGourmet(LyyraCard card){
        if (card.balance() >= GOURMET_PRICE){
            card.pay(GOURMET_PRICE);
            this.gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double amount){
        if(amount > 0){
            card.loadMoney(amount);
            this.cashInRegister += amount;
        }
    }
}