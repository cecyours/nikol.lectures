public class CH11_P01_AbstractClass {
    public static void main(String[] args) {

        User s = new User();
        s.givePassword();

        Rules r = new Rules() {
            
            @Override
            void givePassword() {
                
                System.out.println("I am u");
            }
        };
        r.givePassword();

    }
}

abstract class Rules{

    abstract void givePassword();

}

class User extends Rules{


    @Override
    void givePassword() {
        
        System.out.println("hii me..");
    }
    
}