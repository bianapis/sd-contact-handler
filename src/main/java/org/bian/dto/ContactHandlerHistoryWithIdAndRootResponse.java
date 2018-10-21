package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerHistoryWithIdAndRootResponse
 */
public class ContactHandlerHistoryWithIdAndRootResponse   {
  private String contactHandlingServiceSessionReference = null;

  private String customerContactHistoryRecordingReference = null;

  private String inboundContactReference = null;

  private String outboundContactReference = null;

  private String customerReference = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private Object customerContactActivityRecord = null;

  private String customerContactStartEndDate = null;

  private String customerContactResult = null;

  private String channelActivityHistoryRecordReference = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the history recording event\" 
   * @return customerContactHistoryRecordingReference
  **/

  public String getCustomerContactHistoryRecordingReference() {
    return customerContactHistoryRecordingReference;
  }

  public void setCustomerContactHistoryRecordingReference(String customerContactHistoryRecordingReference) {
    this.customerContactHistoryRecordingReference = customerContactHistoryRecordingReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to the outbound customer contact\" 
   * @return outboundContactReference
  **/

  public String getOutboundContactReference() {
    return outboundContactReference;
  }

  public void setOutboundContactReference(String outboundContactReference) {
    this.outboundContactReference = outboundContactReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"Master record combines  all covered activities in the contact\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"Records actions performed during contact, including all sessions\" 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime general-info: \"start and duraction of the contact\" 
   * @return customerContactStartEndDate
  **/

  public String getCustomerContactStartEndDate() {
    return customerContactStartEndDate;
  }

  public void setCustomerContactStartEndDate(String customerContactStartEndDate) {
    this.customerContactStartEndDate = customerContactStartEndDate;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"Returned by the SD-Channel Activity History\" 
   * @return channelActivityHistoryRecordReference
  **/

  public String getChannelActivityHistoryRecordReference() {
    return channelActivityHistoryRecordReference;
  }

  public void setChannelActivityHistoryRecordReference(String channelActivityHistoryRecordReference) {
    this.channelActivityHistoryRecordReference = channelActivityHistoryRecordReference;
  }


}

