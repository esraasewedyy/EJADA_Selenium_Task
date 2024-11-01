package data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataReader {

    public String UserName, Password;

    public void Reader1() throws FileNotFoundException, IOException, ParseException {

        String path = System.getProperty("user.dir") + "\\src\\test\\java\\data\\InvalidLogin.json";
        File srcfile = new File(path);
        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcfile));


        for (Object yobject : jarray) {

            JSONObject person = (JSONObject) yobject;

            UserName = (String) person.get("username");
            Password = (String) person.get("password");
            System.out.println("UserName is :" + UserName);
            System.out.println("Password is :" + Password);

        }


       }
        public void Reader2() throws FileNotFoundException, IOException, ParseException {

            String path2 = System.getProperty("user.dir") + "\\src\\test\\java\\data\\ValidLogin.json";
            File srcfile2 = new File(path2);
            JSONParser parser2 = new JSONParser();
            JSONArray jarray2 = (JSONArray) parser2.parse(new FileReader(srcfile2));


            for (Object sobject : jarray2) {

                JSONObject person2 = (JSONObject) sobject;

                UserName = (String) person2.get("username");
                Password = (String) person2.get("password");
                System.out.println("UserName is :" + UserName);
                System.out.println("Password is :" + Password);

            }
        }
    }



    