package util;
import static util.InputUtil.inputInteger;
public class MenuUtil {
    public static int entry() {
        System.out.println("\n------ Rent a Car System ------\n" +
                "\n[0] Exit System" +
                "\n[1] ORDER CAR" +
                "\n[2] SHOW ORDERS" +
                "\n[3] ADD CAR"

        );
        return inputInteger("Choose option: ");
    }
}
