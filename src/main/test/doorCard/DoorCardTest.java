package main.test.doorCard;

import main.java.doorCardController.DoorCardController;
import org.junit.Test;

import main.java.doorCard.DoorCard;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DoorCardTest {

    public final String OWNER_CODE = "1234566";




    @Test
    public void shouldOpenAndCloseDoor() throws Exception {
        DoorCard doorCard = new DoorCard(OWNER_CODE);
        doorCard.openDoor();
        assertEquals(true, doorCard.isDoorIsOpen());
        doorCard.closeDoor();
        assertEquals(false, doorCard.isDoorIsOpen());
    }
    @Test
    public void shouldNotOpenNewDoor() {
        DoorCard doorCard = new DoorCard(OWNER_CODE);
        doorCard.openDoor();
        assertEquals(false, doorCard.openDoor());
    }
    @Test
    public void shouldOpenNewDoorAfterOldClosed() {
        DoorCard doorCard = new DoorCard(OWNER_CODE);
        doorCard.openDoor();
        doorCard.openDoor();
        doorCard.closeDoor();
        assertEquals(true, doorCard.openDoor());
    }
    @Test
    public void createCards() {
        ArrayList<DoorCard> doorCards = new ArrayList<>();
        doorCards.add(DoorCardController.getDoorCard(OWNER_CODE));
        doorCards.add(DoorCardController.getDoorCard(OWNER_CODE+"2"));
        doorCards.add(DoorCardController.getDoorCard(OWNER_CODE+"3"));
        doorCards.add(DoorCardController.getDoorCard(OWNER_CODE+"4"));
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