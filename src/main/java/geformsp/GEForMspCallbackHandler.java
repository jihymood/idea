/**
 * GEForMspCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package geformsp;


/**
 *  GEForMspCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class GEForMspCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public GEForMspCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public GEForMspCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for reqCustomAccountInfo method
     * override this method for handling normal response from reqCustomAccountInfo operation
     */
    public void receiveResultreqCustomAccountInfo(
        GEForMspStub.ReqCustomAccountInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqCustomAccountInfo operation
     */
    public void receiveErrorreqCustomAccountInfo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqVauAdd method
     * override this method for handling normal response from reqVauAdd operation
     */
    public void receiveResultreqVauAdd(
        GEForMspStub.ReqVauAddResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqVauAdd operation
     */
    public void receiveErrorreqVauAdd(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqUserChannelInfo method
     * override this method for handling normal response from reqUserChannelInfo operation
     */
    public void receiveResultreqUserChannelInfo(
        GEForMspStub.ReqUserChannelInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqUserChannelInfo operation
     */
    public void receiveErrorreqUserChannelInfo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqAuthorization method
     * override this method for handling normal response from reqAuthorization operation
     */
    public void receiveResultreqAuthorization(
        GEForMspStub.ReqAuthorizationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqAuthorization operation
     */
    public void receiveErrorreqAuthorization(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqUserCategoryTreeChannelInfo method
     * override this method for handling normal response from reqUserCategoryTreeChannelInfo operation
     */
    public void receiveResultreqUserCategoryTreeChannelInfo(
        GEForMspStub.ReqUserCategoryTreeChannelInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqUserCategoryTreeChannelInfo operation
     */
    public void receiveErrorreqUserCategoryTreeChannelInfo(
        Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqAuthorizationUserCategoryTree method
     * override this method for handling normal response from reqAuthorizationUserCategoryTree operation
     */
    public void receiveResultreqAuthorizationUserCategoryTree(
        GEForMspStub.ReqAuthorizationUserCategoryTreeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqAuthorizationUserCategoryTree operation
     */
    public void receiveErrorreqAuthorizationUserCategoryTree(
        Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqVauUrl method
     * override this method for handling normal response from reqVauUrl operation
     */
    public void receiveResultreqVauUrl(
        GEForMspStub.ReqVauUrlResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqVauUrl operation
     */
    public void receiveErrorreqVauUrl(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqSearchCustomInfo method
     * override this method for handling normal response from reqSearchCustomInfo operation
     */
    public void receiveResultreqSearchCustomInfo(
        GEForMspStub.ReqSearchCustomInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqSearchCustomInfo operation
     */
    public void receiveErrorreqSearchCustomInfo(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reqCustomInfo method
     * override this method for handling normal response from reqCustomInfo operation
     */
    public void receiveResultreqCustomInfo(
        GEForMspStub.ReqCustomInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reqCustomInfo operation
     */
    public void receiveErrorreqCustomInfo(Exception e) {
    }
}
