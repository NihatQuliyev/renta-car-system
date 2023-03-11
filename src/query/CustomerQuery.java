package query;
public class CustomerQuery {
    public static String ADD_CUSTOMER = "INSERT INTO customer(NAME, SURNAME, BIRTHDAY, FIN, PASSWORDSERIAL,CAR_ID,status)\n" +
            "VALUES (?,?,?,?,?,?,?)";
    public static String SHOW_CUSTOMER = "SELECT * FROM customer WHERE status=1";

}
