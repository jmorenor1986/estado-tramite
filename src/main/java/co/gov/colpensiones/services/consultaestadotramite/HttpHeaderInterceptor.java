package co.gov.colpensiones.services.consultaestadotramite;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class HttpHeaderInterceptor extends  AbstractPhaseInterceptor<Message> {

	public HttpHeaderInterceptor() {
		super(Phase.POST_PROTOCOL);
		
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Map<String, List> headers = (Map<String, List>) message.get(Message.PROTOCOL_HEADERS);
        try {
            headers.put("Host", Collections.singletonList(message.get("HTTP_HEADER_HOST")));
            headers.put("KD_NR", Collections.singletonList(message.get("HTTP_HEADER_KD_NR")));
            headers.put("X-AUTHORIZE-roles", Collections.singletonList(message.get("HTTP_HEADER_X_AUTHORIZE-ROLES")));
        } catch (Exception ce) {
            throw new Fault(ce);
        }	
		
	}

}
