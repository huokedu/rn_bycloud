package com.lawyer;

import com.example.user.androidintent.IntentPackage;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.liuchungui.react_native_umeng_push.UmengPushPackage;
import com.rnfs.RNFSPackage;
import com.theweflex.react.WeChatPackage;

import net.zubricky.AndroidKeyboardAdjust.AndroidKeyboardAdjustPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "BYCloud_RN";
    }

    /**
     * Returns whether dev mode should be enabled.
     * This enables e.g. the dev menu.
     */
    @Override
    protected boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
    }

    /**
     * A list of packages used by the app. If the app uses additional views
     * or modules besides the default ones, add more packages here.
     */
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new WeChatPackage(),
            new AndroidKeyboardAdjustPackage(this),
            new UmengPushPackage(),
            new IntentPackage(),
            new RNFSPackage()
        );
    }
}
