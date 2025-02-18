package bu3_training.shop_demo.homework.Bai2;

public class Userr {
    private String username;
    private String email;
    private String password;

    public Userr(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean checkout(String inputpass){
        return this.password.equals(inputpass);
    }
}
