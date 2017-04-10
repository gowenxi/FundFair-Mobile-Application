package android.gowenxi.fundfair.fundfairv1;

/**
 * Created by Wen Xi on 7/4/2017.
 */

public class Stock {

    public Stock(int image_id, String name)
    {
        this.setImage_id(image_id);
        this.setName(name);
    }
    private int image_id;
    private String name;

    public int getImage_id()
    {
        return image_id;
    }

    public void setImage_id(int image_id)
    {
        this.image_id = image_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
