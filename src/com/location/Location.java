 package com.location;
import java.util.*;

 public class Location
 {
     public static String findNearestHub(String city)
     {
         HashMap<String,Integer> madurai = new HashMap<>();
         madurai.put("ariyalur",70);
         madurai.put("chengalpattu",60);
         madurai.put("chennai",80);
         madurai.put("coimbatore",10);
         madurai.put("cuddalore",50);
         madurai.put("dharmapuri",8);
         madurai.put("dindigul",0);
         madurai.put("erode",30);
         madurai.put("kallakurichi",42);
         madurai.put("kanchipuram",50);
         madurai.put("kanyakumari",60);
         madurai.put("karur",12);
         madurai.put("krishnagiri",45);
         madurai.put("madurai",0);
         madurai.put("nagapattinam",40);
         madurai.put("namakkal",18);
         madurai.put("nilgiris",20);
         madurai.put("perambalur",60);
         madurai.put("pudukkottai",0);
         madurai.put("ramanathapuram",65);
         madurai.put("ranipet",40);
         madurai.put("salem",49);
         madurai.put("sivaganga",0);
         madurai.put("tenkasi",0);
         madurai.put("tanjavur",70);
         madurai.put("theni",0);
         madurai.put("thoothukudi",40);
         madurai.put("thiruchirappalli",50);
         madurai.put("tirunelveli",0);
         madurai.put("tirupathur",60);
         madurai.put("tiruppur",30);
         madurai.put("tiruvallur",30);
         madurai.put("tiruvarur",40);
         madurai.put("vellore",50);
         madurai.put("villuppuram",60);
         madurai.put("virudhunagar",60);


         HashMap<String,Integer> salem = new HashMap<>();
         salem.put("ariyalur",50);
         salem.put("chengalpattu",80);
         salem.put("chennai",30);
         salem.put("coimbatore",0);
         salem.put("cuddalore",90);
         salem.put("dharmapuri",0);
         salem.put("dindigul",50);
         salem.put("erode",0);
         salem.put("kallakurichi",0);
         salem.put("kanchipuram",40);
         salem.put("kanyakumari",90);
         salem.put("karur",0);
         salem.put("krishnagiri",0);
         salem.put("madurai",80);
         salem.put("nagapattinam",30);
         salem.put("namakkal",0);
         salem.put("nilgiris",0);
         salem.put("perambalur",60);
         salem.put("pudukkottai",50);
         salem.put("ramanathapuram",80);
         salem.put("ranipet",30);
         salem.put("salem",0);
         salem.put("sivaganga",90);
         salem.put("tenkasi",60);
         salem.put("tanjavur",50);
         salem.put("theni",80);
         salem.put("thoothukudi",30);
         salem.put("thiruchirappalli",40);
         salem.put("tirunelveli",90);
         salem.put("tirupathur",0);
         salem.put("tiruppur",0);
         salem.put("tiruvallur",80);
         salem.put("tiruvarur",30);
         salem.put("vellore",0);
         salem.put("villuppuram",0);
         salem.put("virudhunagar",60);

         HashMap<String,Integer> ramanathapuram = new HashMap<>();
         ramanathapuram.put("ariyalur",60);
         ramanathapuram.put("chengalpattu",20);
         ramanathapuram.put("chennai",50);
         ramanathapuram.put("coimbatore",40);
         ramanathapuram.put("cuddalore",40);
         ramanathapuram.put("dharmapuri",50);
         ramanathapuram.put("dindigul",60);
         ramanathapuram.put("erode",20);
         ramanathapuram.put("kallakurichi",40);
         ramanathapuram.put("kanchipuram",40);
         ramanathapuram.put("kanyakumari",0);
         ramanathapuram.put("karur",50);
         ramanathapuram.put("krishnagiri",60);
         ramanathapuram.put("madurai",10);
         ramanathapuram.put("nagapattinam",50);
         ramanathapuram.put("namakkal",40);
         ramanathapuram.put("nilgiris",40);
         ramanathapuram.put("perambalur",50);
         ramanathapuram.put("pudukkottai",60);
         ramanathapuram.put("ramanathapuram",0);
         ramanathapuram.put("ranipet",40);
         ramanathapuram.put("salem",40);
         ramanathapuram.put("sivaganga",40);
         ramanathapuram.put("tenkasi",50);
         ramanathapuram.put("tanjavur",60);
         ramanathapuram.put("theni",20);
         ramanathapuram.put("thoothukudi",0);
         ramanathapuram.put("thiruchirappalli",40);
         ramanathapuram.put("tirunelveli",40);
         ramanathapuram.put("tirupathur",50);
         ramanathapuram.put("tiruppur",60);
         ramanathapuram.put("tiruvallur",20);
         ramanathapuram.put("tiruvarur",40);
         ramanathapuram.put("vellore",40);
         ramanathapuram.put("villuppuram",40);
         ramanathapuram.put("virudhunagar",0);

         HashMap<String,Integer> thiruchirappalli = new HashMap<>();
         thiruchirappalli.put("ariyalur",0);
         thiruchirappalli.put("chengalpattu",20);
         thiruchirappalli.put("chennai",30);
         thiruchirappalli.put("coimbatore",40);
         thiruchirappalli.put("cuddalore",0);
         thiruchirappalli.put("dharmapuri",10);
         thiruchirappalli.put("dindigul",20);
         thiruchirappalli.put("erode",20);
         thiruchirappalli.put("kallakurichi",30);
         thiruchirappalli.put("kanchipuram",40);
         thiruchirappalli.put("kanyakumari",40);
         thiruchirappalli.put("karur",10);
         thiruchirappalli.put("krishnagiri",20);
         thiruchirappalli.put("madurai",20);
         thiruchirappalli.put("nagapattinam",0);
         thiruchirappalli.put("namakkal",40);
         thiruchirappalli.put("nilgiris",40);
         thiruchirappalli.put("perambalur",0);
         thiruchirappalli.put("pudukkottai",20);
         thiruchirappalli.put("ramanathapuram",20);
         thiruchirappalli.put("ranipet",30);
         thiruchirappalli.put("salem",40);
         thiruchirappalli.put("sivaganga",40);
         thiruchirappalli.put("tenkasi",10);
         thiruchirappalli.put("tanjavur",0);
         thiruchirappalli.put("theni",20);
         thiruchirappalli.put("thoothukudi",30);
         thiruchirappalli.put("thiruchirappalli",0);
         thiruchirappalli.put("tirunelveli",40);
         thiruchirappalli.put("tirupathur",10);
         thiruchirappalli.put("tiruppur",20);
         thiruchirappalli.put("tiruvallur",20);
         thiruchirappalli.put("tiruvarur",0);
         thiruchirappalli.put("vellore",40);
         thiruchirappalli.put("villuppuram",40);
         thiruchirappalli.put("virudhunagar",10);

         HashMap<String,Integer> chennai = new HashMap<>();
         chennai.put("ariyalur",20);
         chennai.put("chengalpattu",0);
         chennai.put("chennai",0);
         chennai.put("coimbatore",40);
         chennai.put("cuddalore",40);
         chennai.put("dharmapuri",10);
         chennai.put("dindigul",20);
         chennai.put("erode",20);
         chennai.put("kallakurichi",60);
         chennai.put("kanchipuram",0);
         chennai.put("kanyakumari",40);
         chennai.put("karur",10);
         chennai.put("krishnagiri",20);
         chennai.put("madurai",20);
         chennai.put("nagapattinam",30);
         chennai.put("namakkal",40);
         chennai.put("nilgiris",40);
         chennai.put("perambalur",10);
         chennai.put("pudukkottai",20);
         chennai.put("ramanathapuram",20);
         chennai.put("ranipet",0);
         chennai.put("salem",40);
         chennai.put("sivaganga",40);
         chennai.put("tenkasi",10);
         chennai.put("tanjavur",20);
         chennai.put("theni",20);
         chennai.put("thoothukudi",30);
         chennai.put("thiruchirappalli",40);
         chennai.put("tirunelveli",40);
         chennai.put("tirupathur",10);
         chennai.put("tiruppur",20);
         chennai.put("tiruvallur",0);
         chennai.put("tiruvarur",10);
         chennai.put("vellore",0);
         chennai.put("villuppuram",0);
         chennai.put("virudhunagar",0);


         HashMap<String,HashMap<String,Integer>> hashMap = new HashMap<>();
         hashMap.put("madurai",madurai);
         hashMap.put("salem",salem);
         hashMap.put("ramanathapuram",ramanathapuram);
         hashMap.put("thiruchirappalli",thiruchirappalli);
         hashMap.put("chennai",chennai);

         String office = null; // suggestion
         int minDistance = 400;
         for (Map.Entry mapElement : hashMap.entrySet()) {
             String key = (String)mapElement.getKey();
             HashMap<String,Integer> value = (HashMap) mapElement.getValue();
             if(minDistance > value.get(city.toLowerCase())){
                 minDistance =  value.get(city.toLowerCase());
                 office = key;

             }

         }
         office=office.toUpperCase();
         return office;
     }
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your location ");
         String city = sc.next();
         Location myclass = new Location();
         String office = Location.findNearestHub(city);
         System.out.println(office);
     }
 }