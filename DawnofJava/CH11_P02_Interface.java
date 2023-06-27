public class CH11_P02_Interface {
    public static void main(String[] args) {
        
        User u = new User();

        Rules r = new Rules() {
            
            @Override
            public void givePassword() {
                System.out.println("you are not me.");
            }
        };

        u.givePassword();
        r.givePassword();
    }
}
interface Rules{
    void givePassword();
}

class User implements Rules{

    @Override
     public void givePassword() {
        
        System.out.println("i am !u");
    }
}
