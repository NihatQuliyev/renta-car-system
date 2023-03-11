import service.RentManagementService;
import service.impl.RentManagementServiceImpl;

public class Main {
    public static void main(String[] args) {
        RentManagementService rentManagementService = new RentManagementServiceImpl();
        rentManagementService.management();
    }
}