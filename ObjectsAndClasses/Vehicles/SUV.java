public class SUV extends Vehicle { //Update required on this line
    
    private String wheelDrive; // states whether SUV is 4, front, or rear wheel drive
    
    public SUV()
    {
        super();
        wheelDrive="front";
    }
    
    //Write General Constructor here
    public SUV(int doors, String brand, String drive){
        super(doors, brand);
        wheelDrive = drive;
    }
    
    //Write Getter and Setter methods here
    public String getDrive(){
        return wheelDrive;
    }
    public void setDrive(String drive){
        wheelDrive = drive;
    }
}