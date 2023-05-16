package hotel;

public class DataClients{
    
    
    private int clientId;
    private String name;
    private String idproof;
    private String phone;
    private String email;
    
    public DataClients(){
        
    }
    
    public  DataClients(int clientId,String name,String idproof,String phone,String email){
        
        this.clientId = clientId;
        this.name = name;
        this.idproof = idproof;
        this.phone = phone;
        this.email = email;
        
    }
    
    public int getClientId(){
        return clientId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getIdProof(){
        return idproof;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setClient(int clientId){
        this.clientId = clientId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setIdProof(String idproof){
        this.idproof = idproof;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return ("\nClient ID: "+clientId+"\nName: "+name+"\nID proof: "+idproof+"\nPhone: "+phone+"\nEmail: "+email);
    }
}
