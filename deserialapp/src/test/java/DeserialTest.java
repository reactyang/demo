import demo.Hello;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeserialTest {

    @Test
    public void testObjectSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
        Hello hello;
        Path objectToFile = Paths.get(System.getProperty("java.io.tmpdir"), "hello.ser");
        System.out.println(objectToFile);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectToFile.toFile()))) {
            hello = (Hello)objectInputStream.readObject();
            hello.hello();
        }
    }
}
