import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileProcessor {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.docx";
        int numberOfLines = 10;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineCount = 0;
            StringBuilder textContent = new StringBuilder();

            while ((line = reader.readLine()) != null && lineCount < numberOfLines) {
                System.out.println(line); 
                textContent.append(line).append(System.lineSeparator());
                lineCount++;
            }

            writer.write(textContent.toString());

            System.out.println("Texte lu avec succès depuis '" + inputFile + "', affiché, et écrit dans '" + outputFile + "'");

        } catch (IOException e) {
            System.err.println("Erreur lors du traitement des fichiers : " + e.getMessage());
        }
    }
}
