package helper;
import model.Car;
import model.Customer;
import java.time.LocalDate;
import static util.InputUtil.inputInteger;
import static util.InputUtil.inputString;

public class ServiceHelper {
    public static Car fillAddCar(){
        try {
            String brand = inputString("Enter the brand: ");
            String engine = inputString("Enter the engine: ");
            String production = inputString("Enter the production: ");
            String bodyType = inputString("Enter the bodyType: ");
            Integer seats = inputInteger("Enter the seats: ");
            Integer doors = inputInteger("Enter the doors: ");
            Integer speed = inputInteger("Enter the speed: ");
            Integer rentAmount = inputInteger("Enter the rentAmount: ");
            return new Car(brand,engine,production,bodyType,seats,doors,speed,rentAmount,1);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Customer filAddCustomer(Integer id){
        try {
            String name = inputString("Enter the name: ");
            String surname = inputString("Enter the surname: ");
            LocalDate birthday = LocalDate.parse(inputString("Enter the birthday: "));
            String fin = inputString("Enter the fin: ");
            String passwordSerial = inputString("Enter the passwordSerial: ");
            return new Customer(name,surname,birthday,fin,passwordSerial,id,1);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
