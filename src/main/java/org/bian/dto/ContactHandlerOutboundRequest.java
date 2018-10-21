package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerOutboundRequest
 */
public class ContactHandlerOutboundRequest   {
  private String servicingPositionReference = null;

  private String servicingResourceReference = null;

  private String eBranchOperatingSessionReference = null;

  private String eBranchOperatingSessionConnectionRecord = null;

  private String advancedVoiceServiceOperatingSessionReference = null;

  private Object advancedVoiceServiceOperatingSessionConnectionRecord = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String customerContactDialogueRecordReference = null;

  private Object customerContactDialogueRecord = null;

  private String customerServicingSessionFromTo = null;

  private String customerServicingSessionResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Source of outbound contact request\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"servicing resource initiating contact\" 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"network operating session used to access customer\" 
   * @return eBranchOperatingSessionReference
  **/
  @JsonProperty("eBranchOperatingSessionReference")
  public String getEBranchOperatingSessionReference() {
    return eBranchOperatingSessionReference;
  }

  public void setEBranchOperatingSessionReference(String eBranchOperatingSessionReference) {
    this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of the connection provided\" 
   * @return eBranchOperatingSessionConnectionRecord
  **/
  @JsonProperty("eBranchOperatingSessionConnectionRecord")
  public String getEBranchOperatingSessionConnectionRecord() {
    return eBranchOperatingSessionConnectionRecord;
  }

  public void setEBranchOperatingSessionConnectionRecord(String eBranchOperatingSessionConnectionRecord) {
    this.eBranchOperatingSessionConnectionRecord = eBranchOperatingSessionConnectionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"voice network used to contact customer\" 
   * @return advancedVoiceServiceOperatingSessionReference
  **/

  public String getAdvancedVoiceServiceOperatingSessionReference() {
    return advancedVoiceServiceOperatingSessionReference;
  }

  public void setAdvancedVoiceServiceOperatingSessionReference(String advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"details of the connection provided\" 
   * @return advancedVoiceServiceOperatingSessionConnectionRecord
  **/

  public Object getAdvancedVoiceServiceOperatingSessionConnectionRecord() {
    return advancedVoiceServiceOperatingSessionConnectionRecord;
  }

  public void setAdvancedVoiceServiceOperatingSessionConnectionRecord(Object advancedVoiceServiceOperatingSessionConnectionRecord) {
    this.advancedVoiceServiceOperatingSessionConnectionRecord = advancedVoiceServiceOperatingSessionConnectionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"contact record created to cover outbound contact\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"points to record of the outbound session\" 
   * @return customerContactDialogueRecordReference
  **/

  public String getCustomerContactDialogueRecordReference() {
    return customerContactDialogueRecordReference;
  }

  public void setCustomerContactDialogueRecordReference(String customerContactDialogueRecordReference) {
    this.customerContactDialogueRecordReference = customerContactDialogueRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"log of actions/information assembled during the session\" 
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

