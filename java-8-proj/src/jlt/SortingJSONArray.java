package jlt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class SortingJSONArray {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(new Date());
		
		Scanner sc = new Scanner(System.in);
		String jString = sc.nextLine();
		JSONArray ja = new JSONArray(jString);
		
		
		List<JSONObject> list = new ArrayList<JSONObject>();
		
		for (int i=0; i<ja.length(); i++) {
			list.add(ja.getJSONObject(i));
		}
		
		
		
		Collections.sort(list, new Comparator<JSONObject>() {
			@Override
			public int compare(JSONObject o1, JSONObject o2) {
				String s1 = /*(String)*/ o1.get("id").toString();				
				Integer v1 = Integer.parseInt(o1.get("id").toString());
				Integer v2 = Integer.parseInt(/*(String)*/o2.get("id").toString());
				return v1.compareTo(v2);
			}
		});
		
		for (JSONObject o : list) {
			System.out.println((String)o.get("name"));
		}
		System.out.println(str);

	}

}
