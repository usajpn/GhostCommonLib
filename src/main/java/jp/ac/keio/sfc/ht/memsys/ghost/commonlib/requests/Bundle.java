package jp.ac.keio.sfc.ht.memsys.ghost.commonlib.requests;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Control Channel内でやりとりされるデータ形式
 * Created by aqram on 10/15/14.
 *
 * APPID
 * SEQ
 * MES
 * を格納
 *
 */
public class Bundle implements Serializable{


    private HashMap<String, String> mMap;

    public Bundle(){
        mMap = new HashMap<String,String>();
    }

    public Bundle(HashMap<String, String> data){
        mMap = data;
    }

    public String getData(String key){
        return mMap.get(key);
    }

    public void putData(String key, String value){
        mMap.put(key, value);
    }
}
