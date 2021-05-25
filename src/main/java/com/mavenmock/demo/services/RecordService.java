package com.mavenmock.demo.services;

import com.mavenmock.demo.dao.DatabaseDAO;
import com.mavenmock.demo.dao.NetworkDAO;

public class RecordService 
{
    DatabaseDAO database;
    NetworkDAO network;
     
    
    
    
    
    //setters and getters
 
    public DatabaseDAO getDatabase() {
		return database;
	}





	public void setDatabase(DatabaseDAO database) {
		this.database = database;
	}





	public NetworkDAO getNetwork() {
		return network;
	}





	public void setNetwork(NetworkDAO network) {
		this.network = network;
	}





	public boolean save(String fileName) 
    {
        database.save(fileName);
        System.out.println("Saved in database in Main class");
         
        network.save(fileName);
        System.out.println("Saved in network in Main class");
         
        return true;
    }
}