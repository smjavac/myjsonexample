import com.google.gson.annotations.*;

import java.util.ArrayList;
import java.util.List;


public class CarsList {
    @SerializedName("cars")
    List<Cars> carsList = new ArrayList<Cars>();


    public List<Cars> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Cars> carsList) {
        this.carsList = carsList;
    }

}
