package ng.com.techdepo.customspinner;

/**
 * Created by ESIDEM jnr on 5/16/2017.
 */

public class SpinnerModel {

    String text;

    Integer imageId;

    public SpinnerModel(){}
    public SpinnerModel(String text, Integer imageId){
        this.text=text;
        this.imageId=imageId;
    }

    public String getText(){
        return text;
    }

    public Integer getImageId(){
        return imageId;
    }
}
