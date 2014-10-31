package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;


import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests.Bundle;

import java.io.Serializable;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostResponse implements Serializable{

    public final String STATUS;
    public final String REQUESTID;
    public final Bundle MESSAGE;

    public GhostResponse(String status, String reqId, Bundle mes){
        STATUS = status;
        REQUESTID = reqId;
        MESSAGE = mes;
    }
}
