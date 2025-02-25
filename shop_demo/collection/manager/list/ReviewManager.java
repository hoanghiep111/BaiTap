package bu3_training.shop_demo.collection.manager.list;

import bu3_training.shop_demo.collection.models.User;
import bu3_training.shop_demo.oop.product.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReviewManager {
    private HashMap<User, List<Review>> reviewsByUser ;

    public ReviewManager(){
        reviewsByUser = new HashMap<>();
    }

    // Thêm đánh giá của người dùng
    public void addReview(User user, Review review) {
        if (!reviewsByUser.containsKey(user)) {
            reviewsByUser.put(user, new ArrayList<>());  // user chưa có danh sách review, tạo danh sách mới
        }
        reviewsByUser.get(user).add(review); // Thêm review vào danh sách của user
    }

    // Danh sách đánh giá từng người
    public List<Review> getReviewsByUser(User user) {
        if (reviewsByUser.containsKey(user)) {
            return reviewsByUser.get(user);
        } else {
            return new ArrayList<>(); // Trả về danh sách rỗng
        }
    }

    public void displayAllReviews() {
        if (reviewsByUser.isEmpty()) {
            System.out.println("Chưa có đánh giá nào!");
            return;
        }
        for (User user : reviewsByUser.keySet()) {
            System.out.println("Người dùng: " + user.getUsername());

            // Lấy danh sách đánh giá của người dùng
            List<Review> reviews = reviewsByUser.get(user);
            if (reviews.isEmpty()) {
                System.out.println("  (Không có đánh giá nào)");
            } else {
                // Hiển thị từng đánh giá
                for (Review review : reviews) {
                    review.hienThiComment();
                }
            }
        }
    }

}
