**Get Started**

Appota Payment SDK
是合并Appota支付系统的最为简洁方式。其包括：短信、充值卡、网络银行信用、支付宝以及Google
Play Payment

**合并SDK步骤：**

​1. 给 project 输入SDK

2.配置SDK

​3. 合并

 

**给project 输入SDK**

下载安掉的Appota Payment SDK 然后输入到IDE.

**2. 配置**

**配置\<AndroidMainfest.xml\>**

-在project Android打开 \<AndroidMainfest.xml\> 文件

-加上下面的配置以配置permission

    <uses-permission android:name="android.permission.VIBRATE" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="com.android.vending.BILLING" />

- 若使用短信支付面板，加上以下activity

    <activity android:name="com.appota.payment.SMSPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize" />

- 若使用充值卡支付面板，加上以下 activity:

    <activity android:name="com.appota.payment.CardPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize" android:windowSoftInputMode="adjustPan" />

- 若使用网络银行信用支付面板，加上以下activity：

    <activity android:name="com.appota.payment.BankPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize" android:windowSoftInputMode="adjustPan" />
    <activity android:name="com.appota.payment.ConfirmBankPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize" />

-  若使用支付宝支付面板，加上以下activity：

    <activity android:name="com.appota.payment.PaypalPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize"
    android:windowSoftInputMode="adjustPan" />
    <activity android:name="com.appota.payment.ConfirmPaypalPaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize" />
    <service android:name="com.paypal.android.sdk.payments.PayPalService" android:exported="false" />
    <activity android:name="com.paypal.android.sdk.payments.PaymentActivity" />
    <activity android:name="com.paypal.android.sdk.payments.LoginActivity" />
    <activity android:name="com.paypal.android.sdk.payments.PaymentMethodActivity" />
    <activity android:name="com.paypal.android.sdk.payments.PaymentConfirmActivity" />
    <activity android:name="com.paypal.android.sdk.payments.PaymentCompletedActivity" />

- 若使用Google Play Payment 面板，加上以下activity：

    <activity android:name="com.appota.payment.GooglePaymentActivity" android:configChanges="orientation|keyboardHidden|screenSize"/>

-若想打开或者关上sandbox, 加上以下配置：

    <meta-data android:name="sandbox" android:value="false" />

**3. 合并支付**

给开发商提供包括所有支付方式面板的class
AppotaPayment，想选择其中任何一个面板只要叫出相应的函数。

**4 - 用SDK Samples**

SDK包也提供一个简单的sample以便指导你是用Payment SDK。想用sample,
在SDK文件给IDE输入project sample，
打开com.appota.paymentonlysample.MainActivity.

只要换*Appota以提供的apiKey和sandboxApiKey并式用project,
所有支付方式的面板将出现，看以下图片：*

![](sample.png)  ![](sample_card.png)  ![](sample_sms.png)
