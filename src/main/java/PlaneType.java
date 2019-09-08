public enum PlaneType {
    BOEING747(100),
    BOEING737(15),
    BOEING787(200),
    AIRBUS300(300),
    AIRBUS380(380);

    public int capacity;
    PlaneType(int value){
                this.capacity = value;
            }

            public int getvalue(){
                return this.capacity;
            }

            public int countCapacity() {
               return this.capacity;
    }


    public void addPassenger(Passenger passenger) {
    }

    public void countPassengers() {
    }

}
    
    

