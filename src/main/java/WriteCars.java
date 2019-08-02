import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCars {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {


        CarsList carsList1 = new CarsList();

        Cars car1 = new Cars("Mercedes-Benz", "2011", "sedan", "V8", "automatic");
        Cars car2 = new Cars("BMW", "2015", "sedan", "V6", "automatic");
        Cars car3 = new Cars("Porsche", "2017", "sedan", "V6", "automatic");
        Cars car4 = new Cars("Audi", "2010", "sedan", "V6", "automatic");
        Cars car5 = new Cars("Ford", "2018", "sedan", "1.6", "manual");
        Cars car6 = new Cars("Lada", "2019", "sedan", "1.6", "manual");
        Cars car7 = new Cars("BMW", "2017", "sedan", "V12", "automatic");
        Cars car8 = new Cars("Toyota", "2019", "sedan", "V6", "automatic");
        Cars car9 = new Cars("Land Rover", "2011", "crossover", "V6", "automatic");
        Cars car10 = new Cars("Kia", "2019", "sedan", "1.6", "manual");

        carsAdd(carsList1.getCarsList(), car1, car2, car3, car4, car5);
        carsAdd(carsList1.getCarsList(), car6, car7, car8, car9, car10);
        String s = GSON.toJson(carsList1);
        System.out.println(s);
        try (FileWriter fileWriter = new FileWriter("carsJson.txt")) {
            fileWriter.write(s);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void carsAdd(List<Cars> carsList, Cars car1, Cars car2, Cars car3, Cars car4, Cars car5) {
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }
}
