package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerInboundWithIdAndRootResponse
 */
public class ContactHandlerInboundWithIdAndRootResponse   {
  private String contactHandlingServiceSessionReference = null;

  private String inboundContactReference = null;

  private String customerContactAuthenticationRecordReference = null;

  private String customerContactRoutingSelectionReference = null;

  private String servicingSessionReference = null;

  private String eBranchOperatingSessionReference = null;

  private String advancedVoiceServiceOperatingSessionReference = null;

  private String contactDeviceDetails = null;

  private String customerReference = null;

  private String customerMenuSelection = null;

  private Object customerServicingRequestRecord = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String customerContactRecordCustomerReference = null;

  private String customerContactRecordMenuSelection = null;

  private String customerContactRecordContactDevice = null;

  private String customerContactRecordAuthenticationLevel = null;

  private Object customerContactRecordServicingEventRecord = null;

  private Object customerContactRecordContactDialogueRecord = null;

  private Object customerContactActivityRecord = null;

  private String customerContactFromTo = null;

  private String customerContactResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the inbound customer contact\" 
   * @return inboundContactReference
  **/

  public String getInboundContactReference() {
    return inboundContactReference;
  }

  public void setInboundContactReference(String inboundContactReference) {
    this.inboundContactReference = inboundContactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactAuthenticationRecordReference
  **/

  public String getCustomerContactAuthenticationRecordReference() {
    return customerContactAuthenticationRecordReference;
  }

  public void setCustomerContactAuthenticationRecordReference(String customerContactAuthenticationRecordReference) {
    this.customerContactAuthenticationRecordReference = customerContactAuthenticationRecordReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"network operating session source of customer contact\" 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"voice network source of contact\" 
   * @return advancedVoiceServiceOperatingSessionReference
  **/

  public String getAdvancedVoiceServiceOperatingSessionReference() {
    return advancedVoiceServiceOperatingSessionReference;
  }

  public void setAdvancedVoiceServiceOperatingSessionReference(String advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"detected device properties\" 
   * @return contactDeviceDetails
  **/

  public String getContactDeviceDetails() {
    return contactDeviceDetails;
  }

  public void setContactDeviceDetails(String contactDeviceDetails) {
    this.contactDeviceDetails = contactDeviceDetails;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerMenuSelection
  **/

  public String getCustomerMenuSelection() {
    return customerMenuSelection;
  }

  public void setCustomerMenuSelection(String customerMenuSelection) {
    this.customerMenuSelection = customerMenuSelection;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to contact record assembled during contact\" 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"master record combines listed elements\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"as provided by customer\" 
   * @return customerContactRecordCustomerReference
  **/

  public String getCustomerContactRecordCustomerReference() {
    return customerContactRecordCustomerReference;
  }

  public void setCustomerContactRecordCustomerReference(String customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"as indicated by customer when initiating contact\" 
   * @return customerContactRecordMenuSelection
  **/

  public String getCustomerContactRecordMenuSelection() {
    return customerContactRecordMenuSelection;
  }

  public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"as detected by voice or data network operations\" 
   * @return customerContactRecordContactDevice
  **/

  public String getCustomerContactRecordContactDevice() {
    return customerContactRecordContactDevice;
  }

  public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"as obtained by SD-Contact Handler\" 
   * @return customerContactRecordAuthenticationLevel
  **/

  public String getCustomerContactRecordAuthenticationLevel() {
    return customerContactRecordAuthenticationLevel;
  }

  public void setCustomerContactRecordAuthenticationLevel(String customerContactRecordAuthenticationLevel) {
    this.customerContactRecordAuthenticationLevel = customerContactRecordAuthenticationLevel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"refers to recent servicing activity check by SD-Contact Handler\" 
   * @return customerContactRecordServicingEventRecord
  **/

  public Object getCustomerContactRecordServicingEventRecord() {
    return customerContactRecordServicingEventRecord;
  }

  public void setCustomerContactRecordServicingEventRecord(Object customerContactRecordServicingEventRecord) {
    this.customerContactRecordServicingEventRecord = customerContactRecordServicingEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"any session records created during the contact\" 
   * @return customerContactRecordContactDialogueRecord
  **/

  public Object getCustomerContactRecordContactDialogueRecord() {
    return customerContactRecordContactDialogueRecord;
  }

  public void setCustomerContactRecordContactDialogueRecord(Object customerContactRecordContactDialogueRecord) {
    this.customerContactRecordContactDialogueRecord = customerContactRecordContactDialogueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"records actions performed during contact, including all sessions\" 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime general-info: \"start and duration of contact\" 
   * @return customerContactFromTo
  **/

  public String getCustomerContactFromTo() {
    return customerContactFromTo;
  }

  public void setCustomerContactFromTo(String customerContactFromTo) {
    this.customerContactFromTo = customerContactFromTo;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactResult
  **/

  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }


}

