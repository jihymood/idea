package zhab.util.appresp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-12T10:31:18.486+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "ProviderService", 
                  wsdlLocation = "http://132.228.26.113/wxweboa/application/abzgpd.nsf/appresp?wsdl",
                  targetNamespace = "urn:DefaultNamespace") 
public class ProviderService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:DefaultNamespace", "ProviderService");
    public final static QName Domino = new QName("urn:DefaultNamespace", "Domino");
    static {
        URL url = null;
        try {
            url = new URL("http://132.228.26.113/wxweboa/application/abzgpd.nsf/appresp?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProviderService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://132.228.26.113/wxweboa/application/abzgpd.nsf/appresp?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProviderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProviderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderService() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns Provider
     */
    @WebEndpoint(name = "Domino")
    public Provider getDomino() {
        return super.getPort(Domino, Provider.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Provider
     */
    @WebEndpoint(name = "Domino")
    public Provider getDomino(WebServiceFeature... features) {
        return super.getPort(Domino, Provider.class, features);
    }

}
