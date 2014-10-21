package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;


import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests.Bundle;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostResponse {

    public final String STATUS;
    public final String REQUESTID;
    public final Bundle MESSAGE;

    public GhostResponse(String status, String reqId, Bundle mes){
        STATUS = status;
        REQUESTID = reqId;
        MESSAGE = mes;
    }
}
