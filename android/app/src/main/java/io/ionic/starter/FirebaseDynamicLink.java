package io.ionic.starter;


import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class FirebaseDynamicLink extends Plugin {

    private static final String EVENT_FIREBASE_DYNAMIC_LINK = "onOpenWithDynamicLink";

//    Send data to my plugin
    public void sendDynamicLink(String url) {
        JSObject ret = new JSObject();
        ret.put("deeplink", url);
       Log.i("deeplink",url);
        notifyListeners(EVENT_FIREBASE_DYNAMIC_LINK, ret,true);
    }
}