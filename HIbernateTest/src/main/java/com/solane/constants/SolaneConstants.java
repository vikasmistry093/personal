package com.solane.constants;

import java.io.File;
import java.sql.Timestamp;

public interface SolaneConstants {
	
	public static String FILE_SEPARATOR = File.separator;
	public static String ROOT_DIR = "C:\\Users\\vmistry\\git\\personal\\HIbernateTest\\src\\main\\resources\\static\\uploadedImages";
	public static Timestamp TIMESTAMP = new Timestamp(System.currentTimeMillis());
	
	// Title
	public static String REGISTERED_PRODUCT_TYPE = "REGISTERED PRODUCTS";
	public static String ASSIGNED_PICK_UP_PRODUCTS = "PRODUCTS ASSIGNED FOR PICK UP";
	
	//	Status
	public static String REGISTERED = "REGISTERED";
	public static String FREE = "FREE";
	public static String PICKUP = "PICKUP";
	public static String ACTIVE = "ACTIVE";
	public static String ORDER_PLACED = "ORDER PLACED";
	public static String NOT_AVAILABLE = "NOT AVAILABLE";
	public static String UPLOAD_PATH = ROOT_DIR + FILE_SEPARATOR;

}
