package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactHandlerResponse
 */
public class ContactHandlerResponse   {
  private String contactHandlingServiceSessionReference = null;

  private String contactHandlingServiceConfigurationSetup = null;

  private String contactHandlingServiceReportType = null;

  private Object contactHandlingServiceReport = null;

  private String contactHandlingServiceStatus = null;

  private String eBranchOperatingSessionReference = null;

  private String advancedVoiceServiceOperatingSessionReference = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"supports any dynamic configuration settings\" 
   * @return contactHandlingServiceConfigurationSetup
  **/

  public String getContactHandlingServiceConfigurationSetup() {
    return contactHandlingServiceConfigurationSetup;
  }

  public void setContactHandlingServiceConfigurationSetup(String contactHandlingServiceConfigurationSetup) {
    this.contactHandlingServiceConfigurationSetup = contactHandlingServiceConfigurationSetup;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"maintains session activity statistics\" 
   * @return contactHandlingServiceReportType
  **/

  public String getContactHandlingServiceReportType() {
    return contactHandlingServiceReportType;
  }

  public void setContactHandlingServiceReportType(String contactHandlingServiceReportType) {
    this.contactHandlingServiceReportType = contactHandlingServiceReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return contactHandlingServiceReport
  **/

  public Object getContactHandlingServiceReport() {
    return contactHandlingServiceReport;
  }

  public void setContactHandlingServiceReport(Object contactHandlingServiceReport) {
    this.contactHandlingServiceReport = contactHandlingServiceReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactHandlingServiceStatus
  **/

  public String getContactHandlingServiceStatus() {
    return contactHandlingServiceStatus;
  }

  public void setContactHandlingServiceStatus(String contactHandlingServiceStatus) {
    this.contactHandlingServiceStatus = contactHandlingServiceStatus;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"voice network used to access customer\" 
   * @return advancedVoiceServiceOperatingSessionReference
  **/

  public String getAdvancedVoiceServiceOperatingSessionReference() {
    return advancedVoiceServiceOperatingSessionReference;
  }

  public void setAdvancedVoiceServiceOperatingSessionReference(String advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
  }


}

