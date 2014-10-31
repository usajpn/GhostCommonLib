package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.datatypes;

import java.io.Serializable;

/**
 * Created by aqram on 10/15/14.
 */
public class GhostResponseTypes implements Serializable{
    public static final String SUCCESS = "success";
    public static final String FINISH = "finish"; //MEMBER to HEAD
    public static final String FAIL = "fail";
    public static final String INPROGRESS = "inprogress";
    public static final String SUSPENDED = "suspended";
    public static final String UNKNOWN = "unknown";
}
