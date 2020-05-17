package com.yathushan;

import com.yathushan.PhoneBulider;
import com.yathushan.PhoneTelescopic;
import com.yathushan.PhoneTelescopic2;

public class Application {
    public static void main(String[] args) {

        PhoneTelescopic phoneTelescopic = new PhoneTelescopic("Android");
        System.out.println(phoneTelescopic);

        PhoneTelescopic2 phoneTelescopic2 = new PhoneTelescopic2("Android");
        System.out.println(phoneTelescopic2);

        PhoneBulider.Builder builder = new PhoneBulider.Builder("Android");

        PhoneBulider phoneBulider = builder.screenSize(5.5).battery("3000mAh").build();
        System.out.println(phoneBulider);

    }
}
