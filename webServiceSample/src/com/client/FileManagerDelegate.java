package com.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "FileManagerDelegate", targetNamespace = "http://action.sample.com/")
public interface FileManagerDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addFileInfo", targetNamespace = "http://action.sample.com/", className = "com.client.AddFileInfo")
	@ResponseWrapper(localName = "addFileInfoResponse", targetNamespace = "http://action.sample.com/", className = "com.client.AddFileInfoResponse")
	public String addFileInfo(
			@WebParam(name = "arg0", targetNamespace = "") FileInfo arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteFileInfoByID", targetNamespace = "http://action.sample.com/", className = "com.client.DeleteFileInfoByID")
	@ResponseWrapper(localName = "deleteFileInfoByIDResponse", targetNamespace = "http://action.sample.com/", className = "com.client.DeleteFileInfoByIDResponse")
	public String deleteFileInfoByID(
			@WebParam(name = "arg0", targetNamespace = "") FileInfo arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "readFileInfoByID", targetNamespace = "http://action.sample.com/", className = "com.client.ReadFileInfoByID")
	@ResponseWrapper(localName = "readFileInfoByIDResponse", targetNamespace = "http://action.sample.com/", className = "com.client.ReadFileInfoByIDResponse")
	public String readFileInfoByID(
			@WebParam(name = "arg0", targetNamespace = "") FileInfo arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "updateFileInfo", targetNamespace = "http://action.sample.com/", className = "com.client.UpdateFileInfo")
	@ResponseWrapper(localName = "updateFileInfoResponse", targetNamespace = "http://action.sample.com/", className = "com.client.UpdateFileInfoResponse")
	public String updateFileInfo(
			@WebParam(name = "arg0", targetNamespace = "") FileInfo arg0);

}
