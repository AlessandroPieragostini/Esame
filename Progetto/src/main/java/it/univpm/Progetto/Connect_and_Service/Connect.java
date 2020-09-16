package it.univpm.Progetto.Connect_and_Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import it.univpm.Progetto.Modelli.Folder;



public class Connect {
	
	private ArrayList<Folder> data= new ArrayList<>();
	
	public ArrayList<Folder> Display_Folders_JSON () throws org.apache.tomcat.util.json.ParseException, IOException {

	
			
		String url = "https://api.dropboxapi.com/2/files/list_folder";
		
		try {
			HttpURLConnection openConnection = (HttpURLConnection) new URL(url).openConnection();
			openConnection.setRequestMethod("POST");
			openConnection.setRequestProperty("Authorization",
					"Bearer hvXA3rfUmIUAAAAAAAAAAbYaII9ZHTxStzsPJooKBC1ewgZ7MoKxLCW527CtfPim");
			openConnection.setRequestProperty("Content-Type","application/json");
			openConnection.setRequestProperty("Accept","application/json");
			openConnection.setDoOutput(true);
			
			//Richiede tutte le cartelle e sottocartelle, comprese quelle cancellate
			// DIMENSIONI???? (size?)
			
			String jsonBody = "{\r\n" + 
					"    \"path\": \"\",\r\n" + 
					"    \"recursive\": true,\r\n" + 
					"    \"include_media_info\": false,\r\n" + 
					"    \"include_deleted\": true,\r\n" + 
					"    \"include_has_explicit_shared_members\": false,\r\n" + 
					"    \"include_mounted_folders\": true,\r\n" + 
					"    \"include_non_downloadable_files\": true\r\n" + 
					"}";
			
			try (OutputStream os = openConnection.getOutputStream()) {
				byte[] input = jsonBody.getBytes("utf-8");
				os.write(input, 0, input.length);
			}	
			
		
			InputStream in = openConnection.getInputStream();
			
			String data = "";
			String line = "";
			
		
				InputStreamReader inR = new InputStreamReader(in);
				BufferedReader buf = new BufferedReader(inR);
			try {	
				while ((line = buf.readLine()) != null) {
					data += line;
					System.out.println(line);
				}
			}finally {
					in.close();
			}
			
			JSONObject json = (JSONObject) JSONValue.parseWithException(data);
			JSONArray obj= (JSONArray) json.get("entries");
			
			for(Object o: obj) {
				Folder f1 = new Folder();
				
				f1.setName((String) ((JSONObject)o).get("name"));
				f1.setTag((String)((JSONObject)o).get(".tag"));
				
				if(f1.getTag().equals("file"))				
				f1.setSize((Long)((JSONObject)o).get("size"));
				
				this.data.add(f1);	
			}
			
			}catch (IOException | ParseException e) {
				e.printStackTrace();			
			}catch (Exception e) {
				e.printStackTrace();	
			}
		return data;
	}
	
}



