package com.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ReadFileInfoByIDResponse_QNAME = new QName(
			"http://action.sample.com/", "readFileInfoByIDResponse");
	private final static QName _UpdateFileInfo_QNAME = new QName(
			"http://action.sample.com/", "updateFileInfo");
	private final static QName _DeleteFileInfoByIDResponse_QNAME = new QName(
			"http://action.sample.com/", "deleteFileInfoByIDResponse");
	private final static QName _AddFileInfo_QNAME = new QName(
			"http://action.sample.com/", "addFileInfo");
	private final static QName _FileInfo_QNAME = new QName(
			"http://action.sample.com/", "fileInfo");
	private final static QName _ReadFileInfoByID_QNAME = new QName(
			"http://action.sample.com/", "readFileInfoByID");
	private final static QName _DeleteFileInfoByID_QNAME = new QName(
			"http://action.sample.com/", "deleteFileInfoByID");
	private final static QName _AddFileInfoResponse_QNAME = new QName(
			"http://action.sample.com/", "addFileInfoResponse");
	private final static QName _UpdateFileInfoResponse_QNAME = new QName(
			"http://action.sample.com/", "updateFileInfoResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ReadFileInfoByID }
	 * 
	 */
	public ReadFileInfoByID createReadFileInfoByID() {
		return new ReadFileInfoByID();
	}

	/**
	 * Create an instance of {@link AddFileInfo }
	 * 
	 */
	public AddFileInfo createAddFileInfo() {
		return new AddFileInfo();
	}

	/**
	 * Create an instance of {@link ReadFileInfoByIDResponse }
	 * 
	 */
	public ReadFileInfoByIDResponse createReadFileInfoByIDResponse() {
		return new ReadFileInfoByIDResponse();
	}

	/**
	 * Create an instance of {@link DeleteFileInfoByID }
	 * 
	 */
	public DeleteFileInfoByID createDeleteFileInfoByID() {
		return new DeleteFileInfoByID();
	}

	/**
	 * Create an instance of {@link FileInfo }
	 * 
	 */
	public FileInfo createFileInfo() {
		return new FileInfo();
	}

	/**
	 * Create an instance of {@link UpdateFileInfo }
	 * 
	 */
	public UpdateFileInfo createUpdateFileInfo() {
		return new UpdateFileInfo();
	}

	/**
	 * Create an instance of {@link AddFileInfoResponse }
	 * 
	 */
	public AddFileInfoResponse createAddFileInfoResponse() {
		return new AddFileInfoResponse();
	}

	/**
	 * Create an instance of {@link UpdateFileInfoResponse }
	 * 
	 */
	public UpdateFileInfoResponse createUpdateFileInfoResponse() {
		return new UpdateFileInfoResponse();
	}

	/**
	 * Create an instance of {@link DeleteFileInfoByIDResponse }
	 * 
	 */
	public DeleteFileInfoByIDResponse createDeleteFileInfoByIDResponse() {
		return new DeleteFileInfoByIDResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ReadFileInfoByIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "readFileInfoByIDResponse")
	public JAXBElement<ReadFileInfoByIDResponse> createReadFileInfoByIDResponse(
			ReadFileInfoByIDResponse value) {
		return new JAXBElement<ReadFileInfoByIDResponse>(
				_ReadFileInfoByIDResponse_QNAME,
				ReadFileInfoByIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFileInfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "updateFileInfo")
	public JAXBElement<UpdateFileInfo> createUpdateFileInfo(UpdateFileInfo value) {
		return new JAXBElement<UpdateFileInfo>(_UpdateFileInfo_QNAME,
				UpdateFileInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteFileInfoByIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "deleteFileInfoByIDResponse")
	public JAXBElement<DeleteFileInfoByIDResponse> createDeleteFileInfoByIDResponse(
			DeleteFileInfoByIDResponse value) {
		return new JAXBElement<DeleteFileInfoByIDResponse>(
				_DeleteFileInfoByIDResponse_QNAME,
				DeleteFileInfoByIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddFileInfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "addFileInfo")
	public JAXBElement<AddFileInfo> createAddFileInfo(AddFileInfo value) {
		return new JAXBElement<AddFileInfo>(_AddFileInfo_QNAME,
				AddFileInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FileInfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "fileInfo")
	public JAXBElement<FileInfo> createFileInfo(FileInfo value) {
		return new JAXBElement<FileInfo>(_FileInfo_QNAME, FileInfo.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ReadFileInfoByID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "readFileInfoByID")
	public JAXBElement<ReadFileInfoByID> createReadFileInfoByID(
			ReadFileInfoByID value) {
		return new JAXBElement<ReadFileInfoByID>(_ReadFileInfoByID_QNAME,
				ReadFileInfoByID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteFileInfoByID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "deleteFileInfoByID")
	public JAXBElement<DeleteFileInfoByID> createDeleteFileInfoByID(
			DeleteFileInfoByID value) {
		return new JAXBElement<DeleteFileInfoByID>(_DeleteFileInfoByID_QNAME,
				DeleteFileInfoByID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddFileInfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "addFileInfoResponse")
	public JAXBElement<AddFileInfoResponse> createAddFileInfoResponse(
			AddFileInfoResponse value) {
		return new JAXBElement<AddFileInfoResponse>(_AddFileInfoResponse_QNAME,
				AddFileInfoResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateFileInfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://action.sample.com/", name = "updateFileInfoResponse")
	public JAXBElement<UpdateFileInfoResponse> createUpdateFileInfoResponse(
			UpdateFileInfoResponse value) {
		return new JAXBElement<UpdateFileInfoResponse>(
				_UpdateFileInfoResponse_QNAME, UpdateFileInfoResponse.class,
				null, value);
	}

}
