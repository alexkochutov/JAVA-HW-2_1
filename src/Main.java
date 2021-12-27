public class Main {
    public static void main(String[] args) {

        int ticketPrice = 25550;    // Цена билета
        int oneMileCost = 20;       // Рублей за одну милю

        System.out.println("За билет стоимостью " + ticketPrice + " рублей");
        System.out.println("Будет начислено " + (ticketPrice / oneMileCost) + " миль");

    }
}
