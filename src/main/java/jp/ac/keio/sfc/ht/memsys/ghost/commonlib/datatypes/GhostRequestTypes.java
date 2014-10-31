package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.datatypes;

import java.io.Serializable;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostRequestTypes implements Serializable{
    public static final String INIT = "init";
    public static final String REGISTERTASK = "registertask";
    public static final String EXECUTE = "execute";
    public static final String STOP = "stop";
    public static final String HEALTH = "health";
    public static final String SUSPEND = "suspend";
    public static final String SHUTDOWN = "shutdown";
}
