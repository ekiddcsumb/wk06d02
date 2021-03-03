package WK06D01;

/**
 * @author Emilie Kidd
 * Concrete implementation of IStone.
 * Will raise the Power of a Person
 */

//TODO: Make this a singleton, may need to update IStone

public class PowerStone implements IStone {

    private final Integer RAISE_POWER = 2;

    private static PowerStone powerStone = null;

    private PowerStone()
    {

    }

    public static PowerStone getPowerStone()
    {
        if (powerStone == null)
        {
            powerStone = new PowerStone();
        }

        return powerStone;
    }

    @Override
    public void special(Person person) {
        System.out.println("Current power " + person.getPower());
        System.out.println("Powering up!");

        Integer power = person.getPower();
        power *= RAISE_POWER;
        person.setPower(power);

        System.out.println("New power " + person.getPower());
    }
}
