/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactHandlerApiService {

	ContactHandlerRecordResponse record(String crReferenceId, ContactHandlerRecordRequest request);
	
	ContactHandlerInboundWithIdAndRootResponse executePutInbounds(String crReferenceId, String bqReferenceId, ContactHandlerInboundRequest request);
	
	ContactHandlerInboundWithIdAndRootResponse executePostInbounds(String crReferenceId, ContactHandlerInboundRequest request);
	
	ContactHandlerOutboundWithIdAndRootResponse executePutOutbounds(String crReferenceId, String bqReferenceId, ContactHandlerOutboundRequest request);
	
	ContactHandlerOutboundWithIdAndRootResponse executePostOutbounds(String crReferenceId, ContactHandlerOutboundRequest request);
	
	ContactHandlerAuthenticationWithIdAndRootResponse requestPostAuthentications(String crReferenceId, ContactHandlerAuthenticationRequest request);
	
	ContactHandlerAuthenticationWithIdAndRootResponse requestPutAuthentications(String crReferenceId, String bqReferenceId, ContactHandlerAuthenticationRequest request);
	
	ContactHandlerResponse retrieve(String crReferenceId);
	
	ContactHandlerAuthenticationWithIdAndRootResponse retrieveAuthentications(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ContactHandlerHistoryWithIdAndRootResponse retrieveHistories(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ContactHandlerInboundWithIdAndRootResponse retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	ContactHandlerOutboundWithIdAndRootResponse retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	ContactHandlerRoutingWithIdAndRootResponse retrieveRouting(String crReferenceId, String bqReferenceId);
	
	ContactHandlerSessionWithIdAndRootResponse retrieveSessions(String crReferenceId, String bqReferenceId);
	
}
