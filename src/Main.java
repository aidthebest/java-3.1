public class Main {
    public static void main(String[] args) {

        int ticketPriceInKopecks = 28_652_97;
        int oneBonusMileCoastInKopecks = 20_00;
        int bonusMilesAccrued = ticketPriceInKopecks / oneBonusMileCoastInKopecks;
        System.out.println(bonusMilesAccrued);

    }
}