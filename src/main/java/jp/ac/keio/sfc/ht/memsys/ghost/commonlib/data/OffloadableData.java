package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aqram on 10/2/14.
 */
public class OffloadableData implements Serializable{

    public final String NAME_SPACE;
    private HashMap<String, Object> mData;

    public OffloadableData(String ID, String seq){
        NAME_SPACE = ID + ":" + seq + "/";
        mData = new HashMap<String, Object>();
    }

    public OffloadableData(String nameSpace){
        NAME_SPACE = nameSpace;
        mData = new HashMap<String, Object>();
    }

    public HashMap<String, Object> getAllData(){
        return mData;
    }

    public void debugData(){

        for(Map.Entry<String, Object> e : mData.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }


    public void putData(String name, Object body){
        mData.put(NAME_SPACE + name, body);
    }

    public Object getData(String name){
        return mData.get(NAME_SPACE + name);
    }
}
