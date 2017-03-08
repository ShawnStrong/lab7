package lab7;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MainDirectory {
	LinkedList<Employee> sort = new LinkedList<>();
	void reconstruct(String s){
		Gson g = new Gson();
		ArrayList<Employee> ep = (g.fromJson(s, new TypeToken<Collection<Employee>>(){}.getType()));
		for (Employee pp: ep) {
			
		}

	}
	public ArrayList<Employee> print(){
		return null;
		
	}
}
