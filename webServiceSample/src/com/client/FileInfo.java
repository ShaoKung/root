package com.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for fileInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="fileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileInfo", propOrder = { "id", "fileName", "owner",
		"fileSize", "fileType", "isDeleted" })
public class FileInfo {

	protected String id;
	protected String fileName;
	protected String owner;
	protected String fileSize;
	protected String fileType;
	protected int isDeleted;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the owner property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOwner(String value) {
		this.owner = value;
	}

	/**
	 * Gets the value of the fileSize property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the value of the fileSize property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileSize(String value) {
		this.fileSize = value;
	}

	/**
	 * Gets the value of the fileType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * Sets the value of the fileType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileType(String value) {
		this.fileType = value;
	}

	/**
	 * Gets the value of the isDeleted property.
	 * 
	 */
	public int getIsDeleted() {
		return isDeleted;
	}

	/**
	 * Sets the value of the isDeleted property.
	 * 
	 */
	public void setIsDeleted(int value) {
		this.isDeleted = value;
	}

}
