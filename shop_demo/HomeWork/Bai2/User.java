package bu3_training.shop_demo.HomeWork.Bai2;

public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean checkout(String inputpass){
        return this.password.equals(inputpass);
    }
}
