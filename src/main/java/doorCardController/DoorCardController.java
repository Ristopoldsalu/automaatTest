package main.java.doorCardController;

import main.java.doorCard.DoorCard;
import main.java.doorCard.DoorCardStrict;

import java.util.Optional;

public class DoorCardController {

    public static DoorCard getDoorCard(String ownerCode) {
        return new DoorCard(ownerCode);
    }

    public static DoorCardStrict getDoorCardStrict(String ownerCode) {
        return  new DoorCardStrict(ownerCode);
    }

    public static Optional<DoorCard> getDoorCardOptional(String ownerCode) {
        if (("ABC").equals(ownerCode.substring(0, 3))) {
            return Optional.empty();
        } else {
            return Optional.of(new DoorCard(ownerCode));
        }
    }
    public static Optional<DoorCardStrict> getDoorCardStrictOptional(String ownerCode) {
        if (("ABC").equals(ownerCode.substring(0, 3))) {
            return Optional.empty();
        } else {
            return Optional.of(new DoorCardStrict(ownerCode));
        }
    }
}
