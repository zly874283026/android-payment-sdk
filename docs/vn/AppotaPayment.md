<body>

<p class="class_title"><strong class="class_title">AppotaPayment</strong></p>
<p>package com.appota.payment</p>
<p><span class="auto-style1">public class </span> <strong>
<span class="auto-style1">AppotaPayment</span><br />
</strong>extends Object</p>
<p><strong>Tổng quan</strong></p>
<p>AppotaPayment là class thực thi tất cả các chức năng chính của Payment SDK. 
Class này cung cấp các hàm gọi đến các giao diện thanh toán cho từng hình thức 
khác nhau.</p>
<p><strong>Phương thức</strong></p>
<table border="1" class="gridtable">
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#setContext">setContext(Activity context)</a><br />
		<em>Đặt context.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentOneAmount">makeSMSPayment(int amount, String 
		state, String target, String noticeUrl, String title, String 
		description, final TransactionStatusCallback callback)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức SMS với giá tiền 
		cho trước</em>.</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentListAmount">makeSMSPayment(int[] listAmount, 
		String state, String target, String noticeUrl, String title, String 
		description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức SMS với danh sách 
		giá tiền cho trước</em>.</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentNoUI">makeSMSPayment(int amount, String 
		state, String target, String noticeUrl, SMSPaymentCallback callback)</a><br />
		<em>Lấy cú pháp tin nhắn theo số tiền cho trước (dành cho những ứng dụng 
		tự thiết kế giao diện thanh toán, không sử dụng giao diện hiển thị của 
		Appota SDK).</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeCardPaymentUI">makeCardPayment(String title, String 
		description, String noticeUrl, String state, String target)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức thẻ cào.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeCardPaymentNoUI">makeCardPayment(String cardSerial, 
		String cardCode, String vendor, String noticeUrl, String state, String 
		target, CardPaymentCallback callback)</a><br />
		<em>Thanh toán bằng thẻ cào trực tiếp (dành cho những ứng dụng tự thiết 
		kế giao diện thanh toán, không sử dụng giao diện hiển thị của Appota 
		SDK).</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentOneAmount">makeBankPayment(int amount, 
		String noticeUrl, String state, String target, String title, String 
		description)</a><em><br />
		Hiển thị giao diện thanh toán sử dụng phương thức internet banking với 
		giá tiền cho trước.</em><br />
		</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentListAmount">makeBankPayment(int[] amounts, 
		String noticeUrl, String state, String target, String title, String 
		description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức internet banking 
		với danh sách giá tiền cho trước.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentNoAmount">makeBankPayment(String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức internet banking 
		cho phép người dùng tự nhập số tiền.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentOneAmount">makePaypalPayment(double 
		amount, String noticeUrl, String state, String target, String title, 
		String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức Paypal với giá 
		tiền cho trước.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentNoUI">makePaypalPayment(String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức Paypal cho phép 
		người dùng nhập số tiền.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentListAmount">makePaypalPayment(double[] 
		amounts, String noticeUrl, String state, String target, String title, 
		String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức Paypal với danh 
		giá tiền 
		cho trước.&nbsp; </em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeGooglePlayPaymentListItem">
		makeGooglePlayPayment(List&lt;InAppPurchaseItem&gt; items, String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức Google Play 
		Payment với danh 
		sách IAP item cho trước.</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeGooglePlayPaymentOneItem">
		makeGooglePlayPayment(InAppPurchaseItem item, String noticeUrl, String 
		state, String target, String title, String description)</a><br />
		<em>Hiển thị giao diện thanh toán sử dụng phương thức Google Play 
		Payment với một IAP item cho trước.</em></td>
	</tr>
</table>

<p>&nbsp;</p>
<p class="method_detail">public void
<a name="setContext">setContext</a>(Activity context)</p>
<p>Đặt context</p>
<p><strong>Parameters:</strong></p>
<p>- context: Context hiển thị giao diện thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeSMSPaymentOneAmount">makeSMSPayment</a>(int amount, String state, 
String target, String noticeUrl, String title, String description, final
<a href="TransactionStatusCallback.html">TransactionStatusCallback</a> callback)</p>
<p>Sử dụng phương thức SMS với giá tiền 
		cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- amount: Giá tiền<br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán<br />
- callback: Hàm callback được gọi khi kết thúc giao dịch</p> 

<hr />
<p class="method_detail">public void
<a name="makeSMSPaymentListAmount">makeSMSPayment</a>(int[] listAmount, String 
state, String target, String noticeUrl, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức SMS với danh sách 
		giá tiền cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- listAmount: Danh sách giá tiền<br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeSMSPaymentNoUI">makeSMSPayment</a>(int amount, String state, String 
target, String noticeUrl, <a href="SMSPaymentCallback.html">SMSPaymentCallback</a> 
callback)</p>
<p>Lấy cú pháp tin nhắn thanh toán theo giá tiền cho trước, (dành cho những ứng 
dụng tự thiết kế giao diện thanh toán, không sử dụng giao diện hiển thị của 
Appota SDK).</p>
<p><strong>Parameters:</strong></p>
<p>- amount: Giá tiền<br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- callback: Hàm callback được gọi khi kết thúc giao dịch</p>
<p class="method_detail">public void <a name="makeCardPaymentUI">makeCardPayment</a>(String 
title, String description, String noticeUrl, String state, String target)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức thẻ cào cho phép người dùng 
nhập mã thẻ và số sê-ri.</p>
<p><strong>Parameters:</strong></p>
<p>- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên</p>

<hr />
<p class="method_detail">public void <a name="makeCardPaymentNoUI">
makeCardPayment</a>(String cardSerial, String cardCode, String vendor, String 
noticeUrl, String state, String target, <a href="CardPaymentCallback.html">
CardPaymentCallback</a> callback) throws <a href="AppotaPaymentException.html">
AppotaPaymentException</a></p>
<p>Thanh toán bằng thẻ cào trực tiếp, không sử dụng giao diện hiển thị 
		của Appota SDK. Người dùng sẽ được dẫn thẳng ra website của cổng thanh 
toán qua trình duyệt.</p>
<p><strong>Parameters:</strong></p>
<p>- cardSerial: Số sê-ri thẻ<br />
- cardCode: Mã thẻ<br />
- vendor: Nhà cung cấp. Hiện tại hỗ trợ: <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">vinaphone</span>: 
Thẻ Vinaphone<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">mobifone</span>:&nbsp; 
Thẻ Mobifone<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">viettel</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
Thẻ Viettel<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">fpt</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
Thẻ FPT Gate<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">mega</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
Thẻ MegaCard&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br />
- noticeUrl: URL được gọi khi kết thúc giao dịch<br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />- target: Chuỗi target tùy biến cho dev gửi lên<br />
- callback: Hàm callback được gọi khi kết thúc giao dịch</p>

<hr />
<p class="method_detail">public void
<a name="makeBankPaymentOneAmount">makeBankPayment</a>(int amount, String 
noticeUrl, String state, String target, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức internet banking với 
		giá tiền cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- amount: Giá tiền<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeBankPaymentListAmount">makeBankPayment</a>(int[] amounts, String 
noticeUrl, String state, String target, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức internet banking 
		với danh sách giá tiền cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- amounts: Danh sách giá tiền<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeBankPaymentNoAmount">makeBankPayment</a>(String noticeUrl, String 
state, String target, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức internet banking cho phép 
người dùng tự nhập số tiền.</p>
<p><strong>Parameters:</strong></p>
<p>- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makePaypalPaymentOneAmount">makePaypalPayment</a>(double amount, String 
noticeUrl, String state, String target, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức Paypal với giá tiền cho 
trước.</p>
<p><strong>Parameters:</strong></p>
<p>- amount: Giá tiền<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void <a name="makePaypalPaymentNoUI">
makePaypalPayment</a>(String noticeUrl, String state, String target, String 
title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức Paypal cho phép 
		người dùng nhập số tiền.</p>
<p><strong>Parameters:</strong></p>
<p>- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makePaypalPaymentListAmount">makePaypalPayment</a>(double[] amounts, 
String noticeUrl, String state, String target, String title, String description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức Paypal với danh sách giá tiền 
		cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- amounts: Danh sách giá tiền<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeGooglePlayPaymentListItem">makeGooglePlayPayment</a>(List&lt;<a href="InAppPurchaseItem.html">InAppPurchaseItem</a>&gt; 
items, String noticeUrl, String state, String target, String title, String 
description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức Google Play Payment với danh 
		sách IAP item cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- items: Danh sách IAP items<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>

<hr />
<p class="method_detail">public void
<a name="makeGooglePlayPaymentOneItem">makeGooglePlayPayment</a>(<a href="InAppPurchaseItem.html">InAppPurchaseItem</a> 
item, String noticeUrl, String state, String target, String title, String 
description)</p>
<p>Hiển thị giao diện thanh toán sử dụng phương thức Google Play Payment với một 
IAP item cho trước.</p>
<p><strong>Parameters:</strong></p>
<p>- item: IAP item<br />
- noticeUrl: URL được gọi khi kết thúc giao dịch <br />
- state: Chuỗi state tùy biến cho dev gửi lên<br />
- target: Chuỗi target tùy biến cho dev gửi lên<br />
- title: Tiêu đề cửa sổ thanh toán<br />
- description: Mô tả chi tiết cho thanh toán</p>
<p>&nbsp;</p>

</body>

</html>
