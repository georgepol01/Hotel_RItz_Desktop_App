package hotel;

public class DataReservations{
    
    private int resId;
    private DataClients cl;
    private DataRooms rm;
    private String checkIn;
    private String checkOut;
    private int daysNo;    
    private int totalPrice;
    
    public DataReservations(){
        
    }
    
    public  DataReservations(int resId,DataClients cl,DataRooms rm,String checkIn,String checkOut,int daysNo,int totalPrice){
        
        this.resId = resId;
        this.cl=cl;
        this.rm=rm;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.daysNo = daysNo;
        this.totalPrice = totalPrice;
        
    }
    
    public int getResId(){
        return resId;
    }
    
    public DataClients getClient(){
        return cl;
    }
    
    public DataRooms getRoom(){
        return rm;
    }
  
    public String getCheckIn(){
        return checkIn;
    }
    
    public String getCheckOut(){
        return checkOut;
    }
    
    public int getDaysNo(){
        return daysNo;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }
    
    public void setResId(int resId){
        this.resId = resId;
    }
    
    public void setClient(DataClients client){
        this.cl = cl;
    }
    
    public void setRoom(DataRooms room){
        this.rm = rm;
    }
    
    public void setCheckIn(String checkIn){
        this.checkIn = checkIn;
    }
    
    public void setCheckOut(String checkOut){
        this.checkOut = checkOut;
    }

    public void setDaysNo(int daysNo){
        this.daysNo = daysNo;
    }
    
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public String toString(){
        return ("\nReservation ID: "+resId+"\n"+cl.toString()+"\n"+rm.toString()+"\nCheck In: "+checkIn+"\nCheck Out: "+checkOut+"\nDays Stayed: "+daysNo+"\nTotal Price: "+totalPrice);
    }
}
