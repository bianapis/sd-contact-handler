/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class ContactHandlerApiController {

	@Autowired
	ContactHandlerApiService service;
	
	@Operate.Record
	public BianResponse<ContactHandlerRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactHandlerRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePut
	public BianResponse<ContactHandlerInboundWithIdAndRootResponse> executePutInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactHandlerInboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutInbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePost
	public BianResponse<ContactHandlerInboundWithIdAndRootResponse> executePostInbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactHandlerInboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostInbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePut
	public BianResponse<ContactHandlerOutboundWithIdAndRootResponse> executePutOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactHandlerOutboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePost
	public BianResponse<ContactHandlerOutboundWithIdAndRootResponse> executePostOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactHandlerOutboundRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentications")
	@Operate.RequestPost
	public BianResponse<ContactHandlerAuthenticationWithIdAndRootResponse> requestPostAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactHandlerAuthenticationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostAuthentications(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentications")
	@Operate.RequestPut
	public BianResponse<ContactHandlerAuthenticationWithIdAndRootResponse> requestPutAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactHandlerAuthenticationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutAuthentications(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<ContactHandlerResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("authentications")
	@Operate.Retrieve
	public BianResponse<ContactHandlerAuthenticationWithIdAndRootResponse> retrieveAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentications(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("histories")
	@Operate.Retrieve
	public BianResponse<ContactHandlerHistoryWithIdAndRootResponse> retrieveHistories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveHistories(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("inbounds")
	@Operate.Retrieve
	public BianResponse<ContactHandlerInboundWithIdAndRootResponse> retrieveInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbounds")
	@Operate.Retrieve
	public BianResponse<ContactHandlerOutboundWithIdAndRootResponse> retrieveOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("routing")
	@Operate.Retrieve
	public BianResponse<ContactHandlerRoutingWithIdAndRootResponse> retrieveRouting(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRouting(crReferenceId, bqReferenceId));
	}
	
	@BQ("sessions")
	@Operate.Retrieve
	public BianResponse<ContactHandlerSessionWithIdAndRootResponse> retrieveSessions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSessions(crReferenceId, bqReferenceId));
	}
	
}
