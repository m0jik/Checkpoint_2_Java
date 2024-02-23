import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
public class Warehouse
{
	private String city;
	private String address;
	private String phoneNumber;
	private String manager;
	private int storageCapacity;
	private int droneCapacity;
	
	public Warehouse()
	{
		city = "City Name";
		address = "Address";
		phoneNumber = "000-000-0000";
		manager = "nobody";
		storageCapacity = 0;
		droneCapacity = 0;
	}
	
	public Warehouse(String city, String addy, String phone, String manage, int storage, int drone)
	{
		this.city = city;
		this.address = addy;
		this.phoneNumber = phone;
		this.manager = manage;
		this.storageCapacity = storage;
		this.droneCapacity = drone;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public int getDroneCapacity() {
		return droneCapacity;
	}

	public void setDroneCapacity(int droneCapacity) {
		this.droneCapacity = droneCapacity;
	}
}