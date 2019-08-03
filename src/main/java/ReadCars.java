import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.reflect.TypeToken;
public class ReadCars {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        CarsList carsList = null;
        Cars car = new Cars();
        List<Cars> carsList1;
        String contents;
        try {
            contents = new String(Files.readAllBytes(Paths.get("carsJson.txt")));
            carsList = GSON.fromJson(contents, CarsList.class);
         //   carsList1 = (List<Cars>) GSON.fromJson(contents, new TypeToken<List<Cars>>(){}.getType());
            car = carsList.getCarsList().get(0);
         //   cars = carsList1.get(0);
        } catch (IOException e) {
            e.getMessage();
        }
        for (Cars cars: carsList.getCarsList()) {
            System.out.println(cars);
        }

    }
}
