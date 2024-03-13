package datastructuresproject3;

/**
 *
 * @authors Nouredeen Ahmed Mahmoud Ali HAMMAD
 *          Vildan KAVAKLI
 */
public class Position {

    int row;
    int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Checks if two Position objects are equal based on their row and col values
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return row == position.row && col == position.col;
    }

    // Computes a hash code value for a Position object based on its row and col values
    @Override
    public int hashCode() {
        return 37 * row + col;
    }

}
