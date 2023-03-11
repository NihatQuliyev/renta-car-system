package query;

public class CarQuery {

    public static String ADD_CAR = "INSERT INTO car(brand, engine, production, bodyType, seats, doors, speed, rent_amount, status)\n" +
            "VALUES (?,?,?,?,?,?,?,?,?)";
    public static String SHOW_CAR = "SELECT * FROM car WHERE status=1";

}
