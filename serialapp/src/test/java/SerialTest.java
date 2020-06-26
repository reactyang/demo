import demo.HelloObject;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerialTest {

    @Test
    public void testObjectSerialization() throws FileNotFoundException, IOException {
        HelloObject hello = new HelloObject("hello tony");
        Path objectToFile = Paths.get(System.getProperty("java.io.tmpdir"), "hello.ser");
        System.out.println(objectToFile);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectToFile.toFile()))) {
            objectOutputStream.writeObject(hello);
        }
    }
}
