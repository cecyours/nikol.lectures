class CH13_P04_User_defineException {
    public static void main(String[] args) {

        try {
            System.out.println("Line 1");
            if(2>1)
                throw new MyError("I am the error.");
            System.out.println("Line 2");
        } catch (MyError e) {
            System.out.println(" " + e.getMessage());
        }
    }
}

class MyError extends Exception {

    public MyError(String msg) {
        super(msg);
        System.out.println("There is an error..");
    }
}
