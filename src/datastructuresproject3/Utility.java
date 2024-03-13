package datastructuresproject3;

import java.io.File;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @authors Nouredeen Ahmed Mahmoud Ali HAMMAD
 *          Vildan KAVAKLI
 */

public class Utility {

    // Calculates the cosine similarity between two users using their IDs
    public static UserSimilarity cosineSimilarity(Map map, int id1, int id2) {
        double dotProduct = 0.0;
        double norm1 = 0.0;
        double norm2 = 0.0;

        // Iterates over the columns from 1 to 9018
        for (int i = 1; i <= 9018; i++) {
            // Get the ratings for user1 and user2 for the current column
            // .getOrDefault function functions like .get function but returns 0 instead of null
            int user1 = (int) map.getOrDefault(new Position(id1, i), 0);
            int user2 = (int) map.getOrDefault(new Position(id2, i), 0);

            // Calculates the dot product
            dotProduct += user1 * user2;

            // Calculates the norms
            norm1 += Math.pow(user1, 2);
            norm2 += Math.pow(user2, 2);
        }

        // Calculates the cosine similarity
        double result = dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));

        // Creates and return a UserSimilarity object
        return new UserSimilarity(id2, result);
    }

    public static File getFile(String message) {
        // Creates a new file chooser
        JFileChooser fileChooser = new JFileChooser();

        // Sets the dialog title
        fileChooser.setDialogTitle(message);

        // Limits selectable file types to CSV files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(filter);

        // Shows the file chooser dialog and get the return value
        int returnValue = fileChooser.showOpenDialog(null);

        // Check if the user selected a file
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Return the selected file
            return fileChooser.getSelectedFile();
        } else {
            // Return null if no file was selected
            return null;
        }
    }

}
