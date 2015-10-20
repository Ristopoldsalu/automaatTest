package main.test.doorCard;

import main.java.doorCardController.DoorCardController;
import main.java.doorCard.DoorCard;
import main.java.doorCard.DoorCardStrict;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DoorCardStrictTest {

    public final String OWNER_CODE = "1234566";

    @Test
    public void shouldBlockCard() {
        DoorCardStrict doorCard = new DoorCardStrict(OWNER_CODE);
        doorCard.openDoor();
        doorCard.openDoor();
        assertEquals(true, doorCard.isCardBlocked());
    }

    @Test
    public void shouldNotAllowToOpenCloseDoorIfCardBlocked() {
        DoorCardStrict doorCard = new DoorCardStrict(OWNER_CODE);
        doorCard.openDoor();
        doorCard.openDoor();
        assertEquals(false, doorCard.openDoor());
        doorCard.closeDoor();
        assertEquals(true, doorCard.isDoorIsOpen());
    }

    @Test
    public void shouldOpenAndCloseDoor() throws Exception {
        DoorCardStrict doorCard = new DoorCardStrict(OWNER_CODE);
        doorCard.openDoor();
        assertEquals(true, doorCard.isDoorIsOpen());
        doorCard.closeDoor();
        assertEquals(false, doorCard.isDoorIsOpen());
    }

    @Test
    public void createCards() {
        ArrayList<DoorCardStrict> doorCards = new ArrayList<>();
        doorCards.add(DoorCardController.getDoorCardStrict(OWNER_CODE));
        doorCards.add(DoorCardController.getDoorCardStrict(OWNER_CODE+"2"));
        doorCards.add(DoorCardController.getDoorCardStrict(OWNER_CODE+"3"));
        doorCards.add(DoorCardController.getDoorCardStrict(OWNER_CODE+"4"));
        for (DoorCard doorCard : doorCards) {
            doorCard.openDoor();
            doorCard.closeDoor();
            doorCard.openDoor();
            doorCard.openDoor();
            doorCard.closeDoor();
            doorCard.openDoor();
            doorCard.getInfo();
        }
    }
}