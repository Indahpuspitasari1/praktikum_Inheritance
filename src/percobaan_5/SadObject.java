package percobaan_5;
public class SadObject extends MoodyObject{
   
    protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
 }
}
