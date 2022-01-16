package org.example.Requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class ApiRequest{
    private final String url;
    private int status = 0;
    ApiRequest(String url){
        this.url = url;
    }
    protected String sendRequest(){
        try {
            URL url = new URL(this.url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setInstanceFollowRedirects(true);

            this.status = con.getResponseCode();
            if(this.status==200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                con.disconnect();
                return content.toString();
            }
        }
        catch (MalformedURLException exception){
            System.out.println("Incorrect url: " + url + ".");
        }catch (IOException exception){
            System.out.println("Data from " + url + " couldn't be obtained");
        }
        return "";
    }
    public boolean isReady(){
        if(status == 200)
            return true;
        return false;
    }
}
