package week12.zachary.id.ac.umn;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {

        try {
            FileWriter Writer
                = new FileWriter("myfile.txt");
            Writer.write(
                "Nama saya John Doe\n");
            Writer.write(
                "Saya dari Universitas Multimedia Nusantara");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }

}
