package com.appota.paymentonlysample;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.appota.payment.AppotaPayment;
import com.appota.payment.AppotaPaymentReceiver;
import com.appota.payment.commons.AppotaAction;
import com.appota.payment.core.AppotaPaymentException;
import com.appota.payment.model.InAppPurchaseItem;
import com.appota.payment.model.TransactionResult;

public class MainActivity extends Activity {
	
	private AppotaPayment ap;
	private MyReceiver receiver;
    private String apiKey = "YOUR API KEY";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ap = AppotaPayment.getInstance();
		ap.setContext(this, apiKey);
		receiver = new MyReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction(AppotaAction.PAYMENT_SUCCESS_ACTION);
		filter.addAction(AppotaAction.PAYMENT_ERROR_ACTION);
		registerReceiver(receiver, filter);
	}
	
	public void buySmsOneAmount(View v){
		//ap.makeSMSPayment(500, "", "duydkny", "http://abc.com", "Custom title", "5000 -> 500 coins \n10000 -> 1000 coins \n15000 -> 1500 coins");
        ap.makeDirectSMSPayment(500, "", "duydkny", "http://abc.com", "Custom title", "5000 -> 500 coins \n10000 -> 1000 coins \n15000 -> 1500 coins");
	}
	
	public void buySmsListAmount(View v) throws AppotaPaymentException {
		int[] listAmount = new int[]{500, 1000, 3};
		ap.makeSMSPayment(listAmount, "", "duydkny", "http://abc.com", "Custom title", "5000 -> 500 coins \n10000 -> 1000 coins \n15000 -> 1500 coins");
	}
	
	public void buyCard(View v){
		ap.makeCardPayment("Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins", "http://abc.com", "state", "duydkny");
	}
	
	public void buyBankOneAmount(View v){
		ap.makeBankPayment(20000, "http://abc.com", "", "duydkny", "Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyBankNoAmount(View v){
		ap.makeBankPayment("http://abc.com", "", "duydkny", "Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyBankListAmount(View v){
		int[] amounts = new int[] {20000, 21000, 22000};
		ap.makeBankPayment(amounts, "http://abc.com", "", "duydkny", "Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}

    public void buyGoogleListAmount(View v){
        List<InAppPurchaseItem> listItem = new ArrayList<InAppPurchaseItem>();
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test11", "Test 11"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test12", "Test 12"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test13", "Test 13"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test14", "Test 14"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test15", "Test 15"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test16", "Test 16"));
        listItem.add(new InAppPurchaseItem("appotapaymentsdk_test17", "Test 17"));
        ap.makeGooglePlayPayment(listItem, "http://abc.com", "", "duydkny", "Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
    }

    public void buyGoogleOneAmount(View v){
        InAppPurchaseItem item = new InAppPurchaseItem("appotapaymentsdk_test12", "Test 12");
        ap.makeGooglePlayPayment(item, "http://abc.com", "", "duydkny", "Custom title", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
    }

	public class MyReceiver extends AppotaPaymentReceiver {

        @Override
        public void onPaymentSuccess(TransactionResult result) {
            Toast.makeText(MainActivity.this, "Just for testing: " + result.getTransactionId() + " " + result.getType(), Toast.LENGTH_SHORT).show();
        }

		@Override
		public void onPaymentError() {
			// TODO Auto-generated method stub
			
		}
    }
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		unregisterReceiver(receiver);
	}
}
