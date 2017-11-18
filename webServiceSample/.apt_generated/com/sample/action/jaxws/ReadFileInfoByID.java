
package com.sample.action.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "readFileInfoByID", namespace = "http://action.sample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readFileInfoByID", namespace = "http://action.sample.com/")
public class ReadFileInfoByID {

    @XmlElement(name = "arg0", namespace = "")
    private com.sample.model.FileInfo arg0;

    /**
     * 
     * @return
     *     returns FileInfo
     */
    public com.sample.model.FileInfo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.sample.model.FileInfo arg0) {
        this.arg0 = arg0;
    }

}
