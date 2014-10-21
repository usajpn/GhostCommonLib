package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostRequest {

    public final String TYPE;
    public final Bundle PARAMS;

    public GhostRequest(String type, Bundle param){
        TYPE = type;
        PARAMS = param;
    }

}
