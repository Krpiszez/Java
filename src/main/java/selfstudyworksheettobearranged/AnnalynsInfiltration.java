package selfstudyworksheettobearranged;

public class AnnalynsInfiltration {
//    static boolean knightIsAwake = true;
//    boolean archerIsAwake = true;
//    boolean prisonerIsAwake = true;
//    boolean petDogIsPresent = true;

    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }else {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }

    public static void main(String[] args){

        AnnalynsInfiltration.canFastAttack(true);

    }
}
