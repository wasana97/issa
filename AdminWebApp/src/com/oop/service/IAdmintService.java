/**
 * OOP 2018
 * 
 * @author Udara Samaratunge  Department of Software Engineering, SLIIT 
 * 
 * @version 1.0
 * Copyright: SLIIT, All rights reserved
 * 
 */
package com.oop.service;

import com.oop.model.Admin;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

/**
 * Contract for the implementation of Admin Service .
 * 
 * @author Udara Samaratunge, SLIIT
 * @version 1.0
 */
public interface IAdmintService {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(IAdmintService.class.getName());


	/**
	 * Add payments for payment table
	 * @param payment
	 */
	public void addAdmin(Admin admin);

	/**
	 * Get a particular Admin
	 * 
	 * @param empoyeeID
	 * @return Admin
	 */
	public Admin getAdminByID(String indexID);
	
	/**
	 * Get all list of payments
	 * 
	 * @return ArrayList<Admin>
	 */
	public ArrayList<Admin> getAdmins();
	
	/**
	 * Update existing payment
	 * @param paymentID
	 * @param payment
	 * 
	 * @return
	 */
	public Admin updateAdmin(String indexID, Admin admin);

	/**
	 * Remove existing payment
	 * 
	 * @param paymentID
	 */
	public void removeAdmin(String indexID);

	

	

	

}
