package Chater3.workshop01;

public class CardCompany {
    private static CardCompany cardCompany;
    private static int serialNumber = 10000;

    private CardCompany() {}

    public static CardCompany getInstance() {
        if(cardCompany == null) {
            cardCompany = new CardCompany();
        }
        return cardCompany;
    }

    public Card createCard() {
        serialNumber++;
        return new Card(serialNumber);
    }
}
