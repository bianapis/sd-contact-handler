package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerSessionWithIdAndRootResponse
 */
public class ContactHandlerSessionWithIdAndRootResponse   {
  private String contactHandlingServiceSessionReference = null;

  private String servicingSessionReference = null;

  private String inboundContactReference = null;

  private Object customerServicingRequestRecord = null;

  private Object customerContactRecord = null;

  private String servicingPositionReference = null;

  private String servicingResourceReference = null;

  private String customerContactDialogueRecordReference = null;

  private Object customerContactDialogueRecord = null;

  private String customerServicingSessionFromTo = null;

  private String customerServicingSessionResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the active operational session\" 
   * @return contactHandlingServiceSessionReference
  **/

  public String getContactHandlingServiceSessionReference() {
    return contactHandlingServiceSessionReference;
  }

  public void setContactHandlingServiceSessionReference(String contactHandlingServiceSessionReference) {
    this.contactHandlingServiceSessionReference = contactHandlingServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the session within the contact\" 
   * @return servicingSessionReference
  **/

  public String getServicingSessionReference() {
    return servicingSessionReference;
  }

  public void setServicingSessionReference(String servicingSessionReference) {
    this.servicingSessionReference = servicingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the inbound customer contact that the session is contained within\" 
   * @return inboundContactReference
  **/

  public String getInboundContactReference() {
    return inboundContactReference;
  }

  public void setInboundContactReference(String inboundContactReference) {
    this.inboundContactReference = inboundContactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of servicing resource request if provided\" 
   * @return customerServicingRequestRecord
  **/

  public Object getCustomerServicingRequestRecord() {
    return customerServicingRequestRecord;
  }

  public void setCustomerServicingRequestRecord(Object customerServicingRequestRecord) {
    this.customerServicingRequestRecord = customerServicingRequestRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contains consolidated contact details assembled during contact - used to generate servicing screen pop\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing position\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"assigned servicing resource if assisted\" 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"points to record of the session\" 
   * @return customerContactDialogueRecordReference
  **/

  public String getCustomerContactDialogueRecordReference() {
    return customerContactDialogueRecordReference;
  }

  public void setCustomerContactDialogueRecordReference(String customerContactDialogueRecordReference) {
    this.customerContactDialogueRecordReference = customerContactDialogueRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"log of actions or information assembled during the session\" 
   * @return customerContactDialogueRecord
  **/

  public Object getCustomerContactDialogueRecord() {
    return customerContactDialogueRecord;
  }

  public void setCustomerContactDialogueRecord(Object customerContactDialogueRecord) {
    this.customerContactDialogueRecord = customerContactDialogueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime general-info: \"duration of servicing session within the contact\" 
   * @return customerServicingSessionFromTo
  **/

  public String getCustomerServicingSessionFromTo() {
    return customerServicingSessionFromTo;
  }

  public void setCustomerServicingSessionFromTo(String customerServicingSessionFromTo) {
    this.customerServicingSessionFromTo = customerServicingSessionFromTo;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerServicingSessionResult
  **/

  public String getCustomerServicingSessionResult() {
    return customerServicingSessionResult;
  }

  public void setCustomerServicingSessionResult(String customerServicingSessionResult) {
    this.customerServicingSessionResult = customerServicingSessionResult;
  }


}

