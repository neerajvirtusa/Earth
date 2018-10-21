package earth.utility;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class JsonReader {

	/*public static void main(String[] args) throws IOException {

		String name = getJsonValue("$.AdminCredentials.username");
		System.out.println(name);	
*/
	
	
	
	public static String getJsonValue(String jsonPath) {
		String value=null;
		try {
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Data"+"\\TestData.JSON";
			String jsonString = new String(Files.readAllBytes(Paths.get(path)));
			 value = JsonPath.read(jsonString, jsonPath);		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	return value;
	}
}
