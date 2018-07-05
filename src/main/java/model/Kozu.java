package model;

/**
 *
 * @author g16950yi
 */
public class Kozu {
    private String recommend;
	//private String msg1;
    
    public Kozu(){}
    public Kozu(String recommend){
        
        this.recommend=recommend;
    }
//    public Kozu(String msg1){
//        
//        this.msg1=msg1;
//    }
    
    public String getRecommend(){ return recommend; }
    //public String getRecommend(){ return msg1; }
}
