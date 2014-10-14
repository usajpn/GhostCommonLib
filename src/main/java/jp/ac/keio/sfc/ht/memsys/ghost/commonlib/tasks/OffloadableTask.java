package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.tasks;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by aqram on 10/2/14.
 */
public interface OffloadableTask extends Serializable {
    public void run(HashMap data);
    public String getName();
}
