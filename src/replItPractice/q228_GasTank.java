package replItPractice;

public class q228_GasTank {
    double amount=0;
    double capacity;
    public q228_GasTank(double capacity){
        this.capacity=capacity;

    }
    public void addGas(double AddAmount){
        amount+=AddAmount;
        if(amount>capacity){
            this.amount=capacity;
        }
    }
    public void useGas(double UsedAmount){
        amount-=UsedAmount;
        if(amount<0){
            amount=0;
        }
    }
    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(amount>(capacity-0.1))
            return true;
        else
            return false;

    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        return capacity-amount;

    }
}
