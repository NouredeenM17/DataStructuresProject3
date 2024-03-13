package datastructuresproject3;

/**
 *
 * @authors Nouredeen Ahmed Mahmoud Ali HAMMAD
 *          Vildan KAVAKLI
 */

// Objects of this class are used in a max-heap to store results 
// of cosine similarity comparison and the second user's ID
public class UserSimilarity implements Comparable<UserSimilarity> {

    int userId;
    double cosineSimilarity;

    public UserSimilarity(int userId, double cosineSimilarity) {
        this.userId = userId;
        this.cosineSimilarity = cosineSimilarity;
    }

    // Compares the cosineSimilarity value of 2 UserSimilarity objects
    // This overrided method is called within the max-heap for comparison
    @Override
    public int compareTo(UserSimilarity t) {
        return (this.cosineSimilarity > t.cosineSimilarity) ? 1 : 0;
    }

    @Override
    public String toString() {
        return "" + cosineSimilarity;
    }
}
