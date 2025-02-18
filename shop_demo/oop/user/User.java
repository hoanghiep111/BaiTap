package bu3_training.shop_demo.oop.user;

import java.util.List;

public class User {
//    private String username;
//    private String email;
//    private String password;
//
//    public User(String username, String email, String password) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }
//
//    public boolean checkout(String inputpass){
//        return this.password.equals(inputpass);
//    }
    protected String id;
    protected String username;
    protected String password;
    protected String role;
    protected List<String> permissions;

    public User(String id, String username, String password, String role, List<String> permissions) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.permissions = permissions;
    }

    public boolean kTraPermission(String permission) {
        return permissions.contains(permission);
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

