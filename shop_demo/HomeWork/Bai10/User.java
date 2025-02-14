package bu3_training.shop_demo.HomeWork.Bai10;

import java.util.List;

public abstract class User {
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

    public abstract void showMenu();
}
