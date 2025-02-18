package bu3_training.shop_demo.oop.product;

import java.util.Date;

public class Review {
    private String user;
    private String products;
    private int rating;
    private String comment;
    private Date createAt;

    public Review(String user, String products, int rating, String comment) {
        this.user = user;
        this.products = products;
        this.rating = rating;
        this.comment = comment;
        this.createAt = new Date();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public void getRating(int rating) {
        if (rating >= 1 && 5 <= rating) {
            this.rating = rating;
        } else {
            System.out.println("Chỉ từ 1 đến 5");
        }
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreate_at() {
        return createAt;
    }

    public void setCreate_at(Date create_at) {
        this.createAt = create_at;
    }
    public void hienThiComment(){
        System.out.println("--Comment--");
        System.out.println("Bình luận bởi: " + user);
        System.out.println(" Bình luận sản phẩm: " + products );
        System.out.println("Đánh giá sản phẩm: " + rating  );
        System.out.println("Lời bình luận: " + comment);
        System.out.println("Ngày: " + createAt);
    }
}
