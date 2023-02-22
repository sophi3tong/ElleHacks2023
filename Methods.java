package elleHacks;

public class Methods {
    private String name;
    private int householdMembers;
    private int showerMins;
    private int showerSecs;
    private int handwashMins;
    private int handwashSecs;
    private int dishWashMins;
    private int dishWashSecs;
    private int dishWasherMins;
    private int dishWasherSecs;
    private int toothBrushMins;
    private int toothBrushSecs;
    private int numBaths;
    private int numToilet;
    private int numLaundry;
    private int numFoodPrep;

    // Constructor
    public Methods(String name, int householdMembers,
                   int showerMins, int showerSecs,
                   int handwashMins, int handwashSecs,
                   int dishWashMins, int dishWashSecs,
                   int dishWasherMins, int dishWasherSecs,
                   int toothBrushMins, int toothBrushSecs,
                   int numToilet,
                   int numLaundry,
                   int numFoodPrep,
                   int numBaths) {
        this.name = name;
        this.householdMembers = householdMembers;
        this.showerMins = showerMins;
        this.showerSecs = showerSecs;
        this.handwashMins = handwashMins;
        this.handwashSecs = handwashSecs;
        this.dishWashMins = dishWashMins;
        this.dishWashSecs = dishWashSecs;
        this.dishWasherMins = dishWasherMins;
        this.dishWasherSecs = dishWasherSecs;
        this.toothBrushMins = toothBrushMins;
        this.toothBrushSecs = toothBrushSecs;
        this.numToilet = numToilet;
        this.numLaundry = numLaundry;
        this.numFoodPrep = numFoodPrep;
        this.numBaths = numBaths;
    }

    public Methods(String vivian, String zhao) {

    }

    // Getter and Setter methods for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseholdMembers() {
        return householdMembers;
    }

    public void setHouseholdMembers(int householdMembers) {
        this.householdMembers = householdMembers;
    }

    public int getShowerMins() {
        return showerMins;
    }

    public void setShowerMins(int showerMins) {
        this.showerMins = showerMins;
    }

    public int getShowerSecs() {
        return showerSecs;
    }

    public void setShowerSecs(int showerSecs) {
        this.showerSecs = showerSecs;
    }

    public int getHandwashMins() {
        return handwashMins;
    }

    public void setHandwashMins(int handwashMins) {
        this.handwashMins = handwashMins;
    }

    public int getHandwashSecs() {
        return handwashSecs;
    }

    public void setHandwashSecs(int handwashSecs) {
        this.handwashSecs = handwashSecs;
    }

    public int getDishWashMins() {
        return dishWashMins;
    }

    public void setDishWashMins(int dishWashMins) {
        this.dishWashMins = dishWashMins;
    }

    public int getDishWashSecs() {
        return dishWashSecs;
    }

    public void setDishWashSecs(int dishWashSecs) {
        this.dishWashSecs = dishWashSecs;
    }

    public int getDishWasherMins() {
        return dishWasherMins;
    }

    public void setDishWasherMins(int dishWasherMins) {
        this.dishWasherMins = dishWasherMins;
    }

    public int getDishWasherSecs() {
        return dishWasherSecs;
    }

    public void setDishWasherSecs(int dishWasherSecs) {
        this.dishWasherSecs = dishWasherSecs;
    }
    public int getToothBrushMins() {
        return toothBrushMins;
    }

    public void setToothBrushMins(int toothBrushMins) {
        this.toothBrushMins = toothBrushMins;
    }

    public int getToothBrushSecs() {
        return toothBrushSecs;
    }

    public void toothBrushSecs(int toothBrushSecs) {
        this.toothBrushSecs = toothBrushSecs;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public int getNumToilet() {
        return numToilet;
    }

    public void setNumToilet(int numToilet) {
        this.numToilet = numToilet;
    }

    public int getNumLaundry() {
        return numLaundry;
    }

    public void setNumLaundry(int numLaundry) {
        this.numLaundry = numLaundry;
    }

    public int getNumFoodPrep() {
        return numFoodPrep;
    }

    public void setNumFoodPrep(int numFoodPrep) {
        this.numFoodPrep = numFoodPrep;
    }

}
