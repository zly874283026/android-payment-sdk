package com.appota.paymentonlysample;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.appota.payment.AppotaPayment;
import com.appota.payment.AppotaPaymentReceiver;
import com.appota.payment.callback.TransactionStatusCallback;
import com.appota.payment.commons.AlertDialogManager;
import com.appota.payment.commons.AppotaAction;
import com.appota.payment.core.AppotaPaymentException;
import com.appota.payment.model.CardPaymentResult;
import com.appota.payment.model.InAppPurchaseItem;
import com.appota.payment.model.TransactionResult;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
	
	private AppotaPayment ap;
	private AlertDialogManager am;
	private MyReceiver receiver;
    private String apiKey = "123593a5f93eac19e26baee408f9928f0525e6a18";
    private String sandboxApiKey = "c144dc212ff247d3daef97f97c5ea2a40525e6957";
    //private String apiKey = "955185c78bb2f20dffabe2fb281c633a0525bba1a";
    //private String sandboxApiKey = "41d586a1c2729666a22570a743f1610f0525bba1a";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ap = AppotaPayment.getInstance();
		ap.setContext(this, apiKey, sandboxApiKey);
		am = new AlertDialogManager(this);
		
		receiver = new MyReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction(AppotaAction.BANK_PAYMENT_SUCCESS_ACTION);
		filter.addAction(AppotaAction.SMS_PAYMENT_SUCCESS_ACTION);
		filter.addAction(AppotaAction.CARD_PAYMENT_SUCCESS_ACTION);
		filter.addAction(AppotaAction.PAYPAL_PAYMENT_SUCCESS_ACTION);
        filter.addAction(AppotaAction.GOOGLE_PAYMENT_SUCCESS_ACTION);
		registerReceiver(receiver, filter);
	}
	
	public void buySmsOneAmount(View v){
        ap.setContext(this, apiKey, sandboxApiKey);
		ap.makeSMSPayment(500, "", "duydkny", "http://abc.com", "Nap tien vao de em lay doanh thu", "5000 -> 500 coins \n10000 -> 1000 coins \n15000 -> 1500 coins", new TransactionStatusCallback() {
			
			@Override
			public void onTransactionSuccess(TransactionResult result) {
				// TODO Auto-generated method stub
				am.showPositiveDialog("Success", result.toString(), null);
			}
			
			@Override
			public void onTransactionError(String message) {
				// TODO Auto-generated method stub
				am.showPositiveDialog("Error", message, null);
			}
		});
	}
	
	public void buySmsListAmount(View v) throws AppotaPaymentException {
		int[] listAmount = new int[]{500, 1000, 3};
		ap.makeSMSPayment(listAmount, "", "duydkny", "http://abc.com", "Nap tien vao de em lay doanh thu", "5000 -> 500 coins \n10000 -> 1000 coins \n15000 -> 1500 coins");
	}
	
	public void buyCard(View v){
		ap.makeCardPayment("Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins", "http://abc.com", "state", "duydkny");
	}
	
	public void buyBankOneAmount(View v){
		ap.makeBankPayment(20000, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyBankNoAmount(View v){
		ap.makeBankPayment("http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyBankListAmount(View v){
		int[] amounts = new int[] {20000, 21000, 22000};
		ap.makeBankPayment(amounts, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyPaypalOneAmount(View v){
		ap.makePaypalPayment(1.00, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyPaypalNoAmount(View v){
		ap.makePaypalPayment("http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
	}
	
	public void buyPaypalListAmount(View v){
		double[] amounts = new double[] {1.00, 2.99, 5.99};
		ap.makePaypalPayment(amounts, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
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
        ap.makeGooglePlayPayment(listItem, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
    }

    public void buyGoogleOneAmount(View v){
        InAppPurchaseItem item = new InAppPurchaseItem("appotapaymentsdk_test12", "Test 12");
        ap.makeGooglePlayPayment(item, "http://abc.com", "", "duydkny", "Nap tien vao game", "10000 -> 500 coins \n20000 -> 1000 coins \n50000 -> 1500 coins");
    }

	public class MyReceiver extends AppotaPaymentReceiver {

		@Override
		public void onBankPaymentSuccess(TransactionResult result) {
			// TODO Auto-generated method stub
			//do whatever you want
			Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onSMSPaymentSuccess(TransactionResult result) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onCardPaymentSuccess(CardPaymentResult result) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onPaypalPaymentSuccess(TransactionResult result) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
		}

        @Override
        public void onGooglePaymentSuccess(TransactionResult result) {
            Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
        }

    }
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		unregisterReceiver(receiver);
	}
}
