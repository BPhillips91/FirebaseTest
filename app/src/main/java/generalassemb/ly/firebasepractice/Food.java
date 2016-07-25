package generalassemb.ly.firebasepractice;

/**
 * Created by brendan on 7/18/16.
 */
public class Food {

    protected String foodPic;
    protected String businessName;
    protected String businessId;

    public Food(){}
    public Food(String foodPic, String businessName, String businessId) {
        this.foodPic = foodPic;
        this.businessName = businessName;
        this.businessId = businessId;
    }

    public String getBusinessName() {

        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }




    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic;
    }


}
