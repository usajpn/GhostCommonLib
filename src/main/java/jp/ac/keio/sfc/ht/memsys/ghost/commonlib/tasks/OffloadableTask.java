package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.tasks;

import jp.ac.keio.sfc.ht.memsys.ghost.commonlib.data.OffloadableData;
import java.io.Serializable;

/**
 * Created by aqram on 10/2/14.
 */
public interface OffloadableTask extends Serializable {
    public OffloadableData run(OffloadableData data);
    public String getName();
}
