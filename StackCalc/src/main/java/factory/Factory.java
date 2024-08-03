package factory;
import commands.Command;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Factory {
    // private static final String FILE_PATH = "src/main/resources/commands.properties";
    public Command createCommand(String command) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        InputStream stream;

        try {
            stream = Factory.class.getResourceAsStream("/commands.properties");
            prop.load(stream);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        String path = prop.getProperty(command);

        Class.forName(path);
        return (Command) Class.forName(path).getConstructor().newInstance();
    }
}
