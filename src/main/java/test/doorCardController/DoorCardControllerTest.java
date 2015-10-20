package main.java.test.doorCardController;
import main.java.doorCardController.DoorCardController;
import main.java.doorCard.DoorCard;
import main.java.doorCard.DoorCardStrict;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class DoorCardControllerTest {



    public final String OWNER_CODE = "1234566";
    public final String OWNER_CODE_ABC = "ABC123456";

    @Test
    public void shouldReturnOptionalDoorCard() {
        assertEquals(true, DoorCardController.getDoorCardOptional(OWNER_CODE).isPresent());
    }

    @Test
    public void shouldReturnEmptyOptional() {
        assertEquals(false, DoorCardController.getDoorCardOptional(OWNER_CODE_ABC).isPresent());
    }

    @Test
    public void shouldReturnOptionalDoorCardStrict() {
        assertEquals(true, DoorCardController.getDoorCardStrictOptional(OWNER_CODE).isPresent());
    }

    @Test
    public void shouldReturnEmptyOptionalStrict() {
        assertEquals(false, DoorCardController.getDoorCardStrictOptional(OWNER_CODE_ABC).isPresent());
    }

    @Test
    public void shouldReturnDoorCard() {
        DoorCard doorCard = new DoorCard(OWNER_CODE);
        DoorCard doorCardGet = DoorCardController.getDoorCard(OWNER_CODE);
        assertEquals(doorCard.getCardType(), doorCardGet.getCardType());
    }

    @Test
    public void shouldReturnDoorCardStrict() {
        DoorCardStrict doorCard = new DoorCardStrict(OWNER_CODE);
        DoorCardStrict doorCardGet = DoorCardController.getDoorCardStrict(OWNER_CODE);
        assertEquals(doorCard.getCardType(), doorCardGet.getCardType());
    }

}
