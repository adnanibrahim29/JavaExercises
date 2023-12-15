import java.io.*;

public class FileIO {
    public String[] load(String file) {
        File aFile = new File(file);
        StringBuilder contents = new StringBuilder();
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(aFile));
            String line;
            while ((line = input.readLine()) != null) {
                contents.append(line);
                contents.append(System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find the file - are you sure the file is in this location: " + file);
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Input output exception while processing file");
            ex.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }
        }
        String[] array = contents.toString().split(System.getProperty("line.separator"));
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }

    public void save(String file, String[] array) {
        File aFile = new File(file);
        Writer output = null;
        try {
            output = new BufferedWriter(new FileWriter(aFile));
            for (String s : array) {
                output.write(s);
                output.write(System.getProperty("line.separator"));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (output != null)
                    output.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

