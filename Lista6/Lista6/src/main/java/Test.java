import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Test {

    public static void main(String[] args){

        Employee e1 = new Employee("John", "Wayne");
        Employee e2 = new Employee("Maria", "Calas");

        Employee [] database={e1, e2};
        ArrayList<Employee> database2 = new ArrayList(Arrays.asList(database));

        Gson gson= new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String test1=gson.toJson(e1);
        System.out.println("json: "+test1);
        Employee e3 = gson.fromJson(test1, Employee.class);
        System.out.println("From Json: "+e3+ '\n');

        System.out.println("Konwencja tablicy obiektów do formatu Json");
        System.out.println(gson.toJson(database));
        System.out.println(gson.toJson(database2));


        File file = new File("C:\\Users\\Student.DESKTOP-VNR47RU\\Desktop\\grfvd\\cfgh.json");
        try (FileWriter fileWriter=new FileWriter(file)) {
            gson.toJson(database,fileWriter); //zapis tablicy obiektów
            //gson.toJson(database2,fileWriter); //zapis do tablicy obiektów
            //gson.toJson(e1, fileWriter); //zapis pojedyńczego obiektu
        } catch (IOException e) {
            e.printStackTrace();
        } ;

        Employee [] testDatabase=null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            testDatabase = gson.fromJson(bufferedReader, Employee[].class);
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("From Json: "+Arrays.toString(testDatabase)+'\n');


        //Pokaż wszystkie atrybuty obiektu JSON
        Map m=gson.fromJson(test1, Map.class);
        System.out.println("Obiekt ma: "+m.size()+" atrybuty");

        for(Object key:m.keySet()){
            System.out.println("key: "+key);
        }

        //Odczytanie pól
        System.out.println(m.get("firstName"));
        System.out.println(m.get("lastName"));
    }
}
