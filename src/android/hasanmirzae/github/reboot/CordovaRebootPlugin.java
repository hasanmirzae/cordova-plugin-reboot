package hasanmirzae.github.reboot;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaRebootPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("reboot")) {
            reboot(callbackContext);
            return true;
        }
        return false;
    }

    private void reboot(CallbackContext callbackContext) {
        callbackContext.success("Success");
    }
}
