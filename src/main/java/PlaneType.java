public enum PlaneType {

    BOEING737(250, 80000),
    AIRBUSA320(150, 60000),
    AIRBUSA380(555, 120000),
    PRIVATEPLANE(2, 500);

    private final int capacity;
    private final int maxWeight;


    PlaneType(int capacity, int maxWeight){
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }
};
