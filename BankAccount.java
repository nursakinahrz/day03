package myapp;

    
    public class BankAccount {

        public static void main(String[] args) {

    
        

        }
        //members of the class
        private String accountName;
        private Integer accountNumber;
        private Double accountBalance;
        private Double accountTransactions;
        private Boolean closed = false;
        private Integer accountStartDate;
        private Integer accountClosingDate;
        
       // private List<String> transaction = new LinkedList<>();
        //

        public BankAccount() {
            accountBalance = 0.00;
            accountTransactions = 0.00;
        
        }

        public BankAccount(Integer accountNum, Double initialBalance, String name) {
            accountBalance = initialBalance;
            accountName = name;
            accountNumber = accountNum;

        }

        public void deposit(Integer amount) {
            accountBalance = accountBalance + amount;

        }

        public void withdraw(Integer amount) {
            accountBalance = accountBalance - amount;
            
        }
    
        public void accountBalance() {
            System.out.println("Your balance is $ %d\n");
        }

       

    
    
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public Double getAccountTransactions() {
        return accountTransactions;
    }
    public void setAccountTransactions(Double accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
    public Boolean isClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
    public Integer getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Integer accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Integer getAccountClosingDate() {
        return accountClosingDate;
    }
    public void setAccountClosingDate(Integer accountClosingDate) {
        this.accountClosingDate = accountClosingDate;
    }
         
    
}