package bu3_training.shop_demo.collection.models;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User {
    protected String id;
    protected String username;
    protected String email;
    protected String password;
    protected String role;
    protected List<String> permissions;
    private Set<Product> favoriteProducts;

    public User(String id, String username, String email, String password, String role, List<String> permissions) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.permissions = permissions;
        this.favoriteProducts = favoriteProducts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public Set<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(Set<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public boolean kTraPermission(String permission) {
        return permissions.contains(permission);
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    // Kiểm tra 1 sp có trong danh sách yêu thích
    public boolean isFavorite(Product product) {
        return favoriteProducts.contains(product);
    }
}
