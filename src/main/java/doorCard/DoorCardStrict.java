package main.java.doorCard;

public class DoorCardStrict extends DoorCard {

    final String WARNING_MESSAGE_BLOCKED = "See kaart on blokeeritud, palun võta ühendust kellegagi";
    String cardType = "TTÜ versioon";
    boolean cardBlocked = false;

    public DoorCardStrict(String ownerCode) {
        super(ownerCode);
    }

    @Override
    public boolean openDoor() {
        if (isDoorIsOpen()) {
            setCardBlocked();
            System.out.println(WARNING_MESSAGE_BLOCKED);
            return false;
        }
        else return super.openDoor();
    }

    public void setCardBlocked() {
        this.cardBlocked = true;
    }

    @Override
    public void closeDoor() {

        if (isCardBlocked()) {
            System.out.println(WARNING_MESSAGE_BLOCKED);
        }
        else super.closeDoor();
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    public boolean isCardBlocked() {
        return cardBlocked;
    }
}
