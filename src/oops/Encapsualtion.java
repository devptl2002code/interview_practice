package oops;

public class Encapsualtion {

//    2. Encapsulation : data-hiding

    public static class Bank {

        static String bankName = "bank of java";
        private String customerName;

        // getter
        public String getCustomerName(){
            return customerName;
        }

        // setter
        public void setCustomerName(String customerName){
            this.customerName = customerName;
        }

    }

    public static void main(String[] args){
        Bank bank = new Bank(); // object calling by new keyword
        bank.setCustomerName("Mr. Patel");

        System.out.println("Bank Name: " + Bank.bankName);
        System.out.println("Customer Name: " + bank.getCustomerName());
    }
}
