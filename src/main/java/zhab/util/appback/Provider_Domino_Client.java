
package zhab.util.appback;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-12T10:32:32.729+08:00
 * Generated source version: 3.1.10
 * 
 */
public final class Provider_Domino_Client {

    private static final QName SERVICE_NAME = new QName("urn:DefaultNamespace", "ProviderService");

    private Provider_Domino_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ProviderService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ProviderService ss = new ProviderService(wsdlURL, SERVICE_NAME);
        Provider port = ss.getDomino();  
        
        {
        System.out.println("Invoking apply...");
        java.lang.String _apply_providerinfo = "";
        java.lang.String _apply_wbgly = "";
        java.lang.String _apply_liyou = "";
        java.lang.String _apply_shijian = "";
        java.lang.String _apply__return = port.apply(_apply_providerinfo, _apply_wbgly, _apply_liyou, _apply_shijian);
        System.out.println("apply.result=" + _apply__return);


        }

        System.exit(0);
    }

}
