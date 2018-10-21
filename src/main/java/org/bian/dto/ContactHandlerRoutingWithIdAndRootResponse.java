package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerRoutingWithIdAndRootResponse
 */
public class ContactHandlerRoutingWithIdAndRootResponse   {
  private String contactHandlingServiceSessionReference = null;

  private String customerContactRoutingSelectionReference = null;

  private Object customerContactRoutingRecord = null;

  private Object customerContactRecord = null;

  private String servicingPositionReference = null;

  private String servicingResourceReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactHandlingServiceSessionReference
  **/

  public String getContactHandlingServiceSessionReference() {
    return contactHandlingServiceSessionReference;
  }

  public void setContactHandlingServiceSessionReference(String contactHandlingServiceSessionReference) {
    this.contactHandlingServiceSessionReference = contactHandlingServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactRoutingSelectionReference
  **/

  public String getCustomerContactRoutingSelectionReference() {
    return customerContactRoutingSelectionReference;
  }

  public void setCustomerContactRoutingSelectionReference(String customerContactRoutingSelectionReference) {
    this.customerContactRoutingSelectionReference = customerContactRoutingSelectionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerContactRoutingRecord
  **/

  public Object getCustomerContactRoutingRecord() {
    return customerContactRoutingRecord;
  }

  public void setCustomerContactRoutingRecord(Object customerContactRoutingRecord) {
    this.customerContactRoutingRecord = customerContactRoutingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains consolidated contact details to drive routing decision to best resource\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Where to route the contact for servicing session\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"expected servicing resource that will handle the servicing session\" 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


}

