package main.java.doorCard;

public class DoorCard {

    boolean doorIsOpen;
    String ownerCode;
    String cardType = "õpliaste versioon";

    public String getCardType() {
        return cardType;
    }

    public DoorCard(String ownerCode) {

        this.ownerCode = ownerCode;
    }

    public boolean isDoorIsOpen() {
        return doorIsOpen;
    }

    protected String isDoorOpenAsString() {
        if (doorIsOpen) {
            return "on blokeeritud";
        } else {
            return "ei ole blokeeritud";
        }
    }

    public boolean openDoor() {
        if (isDoorIsOpen()) {
            System.out.println("Vabadust, palun sulgege eelmine uks ja proovige uuesti");
            return false;
        }else {
            System.out.println("kaardiga avati uks");
            setDoorIsOpen();
            return true;
        }
    }

    public void closeDoor() {
        if (isDoorIsOpen()) {
            System.out.println("uks suleti");
            setDoorIsClosed();
        } else {
            System.out.println("Uks on juba suletud");
        }
    }

    public void setDoorIsOpen() {
        this.doorIsOpen = true;
    }

    public void setDoorIsClosed() {
        this.doorIsOpen = false;
    }

    public void getInfo() {
        System.out.println("kasutaja kood on "+ ownerCode + ", kaardi tüüp on " + cardType + " ja kaart " + isDoorOpenAsString());
    }


}
