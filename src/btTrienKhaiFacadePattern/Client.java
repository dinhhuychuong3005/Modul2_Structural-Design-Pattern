package btTrienKhaiFacadePattern;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(50,5,100);
        randomListFacade.printRandomEvenList();
    }
}