package com.docker.demo;

import java.util.ArrayList;
import java.util.Iterator;



public class DemoDB {
	
	  public String server;
	  public int requests_total;
	  public int requests_sec;
	  public int response;
	  public String traffic_sent;
	  public String traffic_rec;
	  public String server_check;
	  public DemoDB(String server, int requests_total, int requests_sec, int response, String traffic_sent, String traffic_rec, String server_check) {
	     this.server=server;
	     this.requests_total=requests_total;
	     this.requests_sec=requests_sec;
	     this.response=response;
		 this.traffic_sent=traffic_sent;
	     this.traffic_rec=traffic_rec;
	     this.server_check=server_check;
	  }
	  
	public static ArrayList<DemoDB> dbUpdate() {
	ArrayList<DemoDB> arr = new ArrayList<DemoDB>();
	arr.add(new DemoDB("127.0.0.1:8001",2064581,40,18,"1.50 KiB","29.9 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8002",2054370,10,28,"0.30 KiB","27.9 KiB","Passed"));
	arr.add(new DemoDB("127.0.0.1:8003",1682121,40,18,"1.76 KiB","37.0 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8004",3184272,80,24,"5.69 KiB","10.9 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8005",1677550,10,28,"2.45 KiB","80.8 KiB","Passed"));
	arr.add(new DemoDB("127.0.0.1:8006",6452081,40,16,"2.50 KiB","25.6 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8007",2810645,60,80,"5.50 KiB","23.3 KiB","Passed"));
	arr.add(new DemoDB("127.0.0.1:8008",4520681,40,14,"7.00 KiB","14.5 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8009",2645801,12,10,"3.20 KiB","11.2 KiB","Passed"));
	arr.add(new DemoDB("127.0.0.1:8010",2506481,80,18,"2.00 KiB","19.9 KiB","Failed"));
	arr.add(new DemoDB("127.0.0.1:8011",3240681,40,12,"4.50 KiB","34.1 KiB","Passed"));
	
	return arr;
	  }	
	
	public static void main(String args[]){
		
		ArrayList <DemoDB> list=dbUpdate();
		  Iterator <DemoDB> it=list.iterator();
       while(it.hasNext()){
    	   DemoDB s1=it.next();
       	System.out.println(s1.server);

}
	}
}
