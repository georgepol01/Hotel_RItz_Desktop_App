package hotel;

public class DataRooms{
    
    private int roomNo;
    private String type;
    private int price;
    private String status;
    
    public DataRooms(){
        
    }
    
    public  DataRooms(int roomNo,String type,int price,String status){
        
        this.roomNo = roomNo;
        this.type = type;
        this.price = price;
        this.status = status;
        
    }
    
    public int getRoomNo(){
        return roomNo;
    }
    
    public String getType(){
        return type;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
   
    public void setType(String type){
        this.type = type;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String toString(){
        return ("\nRoom No: "+roomNo+"\nType: "+type+"\nPrice per Day: "+price+"\nReserved: "+status);
    }
}
