package zhab.util.appback;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-12T10:32:32.816+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "urn:DefaultNamespace", name = "Provider")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Provider {

    @WebMethod(operationName = "APPLY", action = "APPLY")
    @WebResult(name = "APPLYReturn", targetNamespace = "urn:DefaultNamespace", partName = "APPLYReturn")
    public java.lang.String apply(
        @WebParam(partName = "PROVIDERINFO", name = "PROVIDERINFO")
        java.lang.String providerinfo,
        @WebParam(partName = "WBGLY", name = "WBGLY")
        java.lang.String wbgly,
        @WebParam(partName = "LIYOU", name = "LIYOU")
        java.lang.String liyou,
        @WebParam(partName = "SHIJIAN", name = "SHIJIAN")
        java.lang.String shijian
    );
}
