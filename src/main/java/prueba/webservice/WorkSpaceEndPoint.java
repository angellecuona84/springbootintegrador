package prueba.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import prueba.dao.FiguraDAO;
import prueba.webservice.AreaTrabajoRequest;
import prueba.webservice.AreaTrabajoResponse;

/**
 * Created by Angel Luis on 11/05/2015.
 */
@Endpoint
public class WorkSpaceEndPoint {

    private static final String NAMESPACE_URI = "http://webservice";

    @Autowired
    @Qualifier("FiguraDAODBImpl")
    private FiguraDAO figuraDAO;



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AreaTrabajoRequest")
    @ResponsePayload
    public AreaTrabajoResponse getCountry(@RequestPayload AreaTrabajoRequest request) {
        AreaTrabajoResponse response = new AreaTrabajoResponse();
        response.setAreaTrabajo(figuraDAO.obtenerAreaTrabajoServicio(request.getId()));

        return response;
    }
}
