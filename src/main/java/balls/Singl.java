package balls;

class Bank {
    private Bank() {
    }
    private static Bank instance = getInstance();
    public static Bank getInstance() {
        if (instance == null)
            instance = new Bank();
        return instance;
    }

    public void someMethod() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Bank.getInstance().someMethod();
    }
}
