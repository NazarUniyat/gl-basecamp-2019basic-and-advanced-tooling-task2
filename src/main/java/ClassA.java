import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


@AllArgsConstructor
@NoArgsConstructor
@Log4j
public class ClassA {
    Logger logger = Logger.getLogger(ClassA.class);

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
