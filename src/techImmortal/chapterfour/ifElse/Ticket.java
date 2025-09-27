package techImmortal.chapterfour.ifElse;

public class Ticket {
    private int age;
    private double price;
    private int movieTime;

    public Ticket(int age, int movieTime) {
        this.age = age;
        this.movieTime = movieTime;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        double standardTicketPrice = 10_000;
        this.price = standardTicketPrice;

        boolean isChildren = this.age < 12;
        if (isChildren) {
            double childrenDiscount = 40/100.0;
            double childrenTicketPrice = childrenDiscount * standardTicketPrice;
            this.price = childrenTicketPrice;
        }

        boolean isSenior = this.age >= 65;
        if (isSenior) {
            double seniorDiscount = 40/100.0;
            double fortyPercent = seniorDiscount * standardTicketPrice;
            double seniorTicketPrice = standardTicketPrice - fortyPercent;
            this.price = seniorTicketPrice;
        }

        boolean isMatinee = movieTime < 17;
        if (isMatinee) {
            double matineeDiscount = 20.0/100;
            double matineeTicketPrice = matineeDiscount * this.price;
            this.price -= matineeTicketPrice;
        }
        return this.price;
    }

    public double getPrice() {
        return this.price;
    }
}
