package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;

import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.datatypes.GhostResponseTypes;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostResponse {

    public final String APPID;
    public final String REQUESTID;
    public final GhostResponseTypes STATUS;
    public final String MESSAGE;

    public GhostResponse(GhostResponseTypes type, String mes, String appId, String reqId){
        STATUS = type;
        MESSAGE = mes;
        APPID = appId;
        REQUESTID = reqId;
    }

}
