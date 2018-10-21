/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactHandlerApiServiceImpl implements ContactHandlerApiService {

	public ContactHandlerRecordResponse record(String crReferenceId, ContactHandlerRecordRequest request){
		return JsonReader.read("record-ContactHandlerRecordResponse.json",new TypeReference<ContactHandlerRecordResponse>(){});
	}
	
	public ContactHandlerInboundWithIdAndRootResponse executePutInbounds(String crReferenceId, String bqReferenceId, ContactHandlerInboundRequest request){
		return JsonReader.read("executePut-ContactHandlerInboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerInboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerInboundWithIdAndRootResponse executePostInbounds(String crReferenceId, ContactHandlerInboundRequest request){
		return JsonReader.read("executePost-ContactHandlerInboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerInboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerOutboundWithIdAndRootResponse executePutOutbounds(String crReferenceId, String bqReferenceId, ContactHandlerOutboundRequest request){
		return JsonReader.read("executePut-ContactHandlerOutboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerOutboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerOutboundWithIdAndRootResponse executePostOutbounds(String crReferenceId, ContactHandlerOutboundRequest request){
		return JsonReader.read("executePost-ContactHandlerOutboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerOutboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerAuthenticationWithIdAndRootResponse requestPostAuthentications(String crReferenceId, ContactHandlerAuthenticationRequest request){
		return JsonReader.read("requestPost-ContactHandlerAuthenticationWithIdAndRootResponse.json",new TypeReference<ContactHandlerAuthenticationWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerAuthenticationWithIdAndRootResponse requestPutAuthentications(String crReferenceId, String bqReferenceId, ContactHandlerAuthenticationRequest request){
		return JsonReader.read("requestPut-ContactHandlerAuthenticationWithIdAndRootResponse.json",new TypeReference<ContactHandlerAuthenticationWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ContactHandlerResponse.json",new TypeReference<ContactHandlerResponse>(){});
	}
	
	public ContactHandlerAuthenticationWithIdAndRootResponse retrieveAuthentications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerAuthenticationWithIdAndRootResponse.json",new TypeReference<ContactHandlerAuthenticationWithIdAndRootResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactHandlerHistoryWithIdAndRootResponse retrieveHistories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerHistoryWithIdAndRootResponse.json",new TypeReference<ContactHandlerHistoryWithIdAndRootResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactHandlerInboundWithIdAndRootResponse retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerInboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerInboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerOutboundWithIdAndRootResponse retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerOutboundWithIdAndRootResponse.json",new TypeReference<ContactHandlerOutboundWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerRoutingWithIdAndRootResponse retrieveRouting(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerRoutingWithIdAndRootResponse.json",new TypeReference<ContactHandlerRoutingWithIdAndRootResponse>(){});
	}
	
	public ContactHandlerSessionWithIdAndRootResponse retrieveSessions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactHandlerSessionWithIdAndRootResponse.json",new TypeReference<ContactHandlerSessionWithIdAndRootResponse>(){});
	}
	
}
