package paypal.payflow;

/**
 * Used for BuyerAuth Status information.
 * <p>Use this class to set the BuyerAuth Status related information.</p>
 */
public class BuyerAuthStatus extends BaseRequestDataObject {

    private String authenticationId;
    private String authenticationStatus;
    private String cavv;
    private String xid;
    private String eci;
    private String dsTransactionId;
    private String threeDSVersion;

    /**
     * Constructor
     */
    public BuyerAuthStatus() {
    }

    /**
     * Gets the authentication_id parameter.
     *
     * @return authenticationId String
     *  <p>Maps to Payflow Parameter: AUTHENTICATION_ID</p>
     */
    public String getAuthenticationId() {
        return authenticationId;
    }

    /**
     * Sets the authentication_id parameter.
     *
     * @param authenticationId String
     *  <p>Maps to Payflow Parameter: AUTHENTICATION_ID</p>
     */
    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    /**
     * Gets the authentication_status parameter.
     *
     * @return authenticationId String
     *  <p>Maps to Payflow Parameter: AUTHENTICATION_STATUS</p>
     */
    public String getAuthenticationStatus() {
        return authenticationStatus;
    }

    /**
     * Sets the authentication_status parameter.
     *
     * @param authenticationStatus String
     *  <p>Maps to Payflow Parameter: AUTHENTICATION_STATUS</p>
     */
    public void setAuthenticationStatus(String authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    /**
     * Gets the CAVV parameter.
     *
     * @return cavv String
     *  <p>Maps to Payflow Parameter: CAVV</p>
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the CAVV parameter.
     *
     * @param cavv String
     *  <p>Maps to Payflow Parameter: CAVV</p>
     */
    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    /**
     * Gets the XID parameter.
     *
     * @return xid String
     *  <p>Maps to Payflow Parameter: XID</p>
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the XID parameter.
     *
     * @param xid String
     *  <p>Maps to Payflow Parameter: XID</p>
     */
    public void setXid(String xid) {
        this.xid = xid;
    }

    /**
     * Gets the ECI parameter.
     *
     * @return eci String
     *  <p>Maps to Payflow Parameter: ECI</p>
     */
    public String getEci() {
        return eci;
    }

    /**
     * Sets the ECI parameter.
     *
     * @param eci String
     *  <p>Maps to Payflow Parameter: ECI</p>
     */
    public void setEci(String eci) { this.eci = eci; }

    /**
     * Gets the DSTRANSACTIONID parameter.
     *
     * @return dsTransactionId String
     *  <p>Maps to Payflow Parameter: DSTRANSACTION</p>
     */
    public String getdsTransactionId() {
        return dsTransactionId;
    }

    /**
     * Sets the DSTRANSACTION parameter.
     *
     * @param dsTransactionId String
     *  <p>Maps to Payflow Parameter: DSTRANSACTION</p>
     */
    public void setDsTransactionId(String dsTransactionId) { this.dsTransactionId = dsTransactionId; }

    /**
     * Gets the THREEDSVERSION parameter.
     *
     * @return threeDSVersion String
     *  <p>Maps to Payflow Parameter: THREEDSVERSION</p>
     */
    public String getThreeDSVersion() {
        return threeDSVersion;
    }

    /**
     * Sets the THREEDSVERSION parameter.
     *
     * @param threeDSVersion String
     *  <p>Maps to Payflow Parameter: THREEDSVERSION</p>
     */
    public void setThreeDSVersion(String threeDSVersion) { this.threeDSVersion = threeDSVersion; }

    protected void generateRequest() {

        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_AUTHENTICATION_ID, this.authenticationId));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_AUTHENICATION_STATUS, this.authenticationStatus));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_CAVV, this.cavv));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_XID, this.xid));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_ECI, this.eci));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_DSTRANSACTIONID, this.dsTransactionId));
        this.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_THREEDSVERSION, this.threeDSVersion));

    }

}
