package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;

import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.datatypes.GhostRequestTypes;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostRequest {

    public final String APPID;
    public final GhostRequestTypes TYPE;
    public final String PARAMS;

    public GhostRequest(GhostRequestTypes type, String param, String appId){
        APPID = appId;
        TYPE = type;
        PARAMS = param;
    }

    public GhostRequest(String appId, GhostRequestTypes type){
        APPID = appId;
        TYPE = type;
        PARAMS = "";
    }
}
