package datastructuresproject3;

/**
 *
 * @authors Nouredeen Ahmed Mahmoud Ali HAMMAD
 *          Vildan KAVAKLI
 */

// Used for storing each movie after retrieving them from the CSV file
public class Movie {

    private int id;
    private String title;
    private String genres;

    public Movie(int id, String title, String genres) {
        this.id = id;
        this.title = title;
        this.genres = genres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    // Returns the title of the movie when toString is called (when printed)
    @Override
    public String toString() {
        return this.title;
    }

}
