<p class="class_title"><strong class="class_title">AppotaPayment</strong></p>
<p>package com.appota.payment</p>
<p><span class="auto-style1">public class </span> <strong>
<span class="auto-style1">AppotaPayment</span><br />
</strong>extends Object</p>
<p><strong>概况</strong></p>
<p>AppotaPayment 是实施Payment SDK 的主要功能的class. 这款class 给开发商提供不同支付类型的支付面板所需的函数</p>
<p><strong>方式</strong></p>
<table border="1" class="gridtable">
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#setContext">setContext(Activity context)</a><br />
		输入context</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentOneAmount">makeSMSPayment(int amount, String 
		state, String target, String noticeUrl, String title, String 
		description, final TransactionStatusCallback callback)</a><br />
		&nbsp;显示短信支付方式的支付面板以及价格</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentListAmount">makeSMSPayment(int[] listAmount, 
		String state, String target, String noticeUrl, String title, String 
		description)</a><br />
		&nbsp;显示使用短信支付方式的支付面板以及价格表</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeSMSPaymentNoUI">makeSMSPayment(int amount, String 
		state, String target, String noticeUrl, SMSPaymentCallback callback)</a><br />
		<em>取短信句法 （ 用于自己设计支付面板的应用，不使用 Appota SDK 的面板）</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeCardPaymentUI">makeCardPayment(String title, String 
		description, String noticeUrl, String state, String target)</a><br />
		<em>显示充值卡支付面板</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeCardPaymentNoUI">makeCardPayment(String cardSerial, 
		String cardCode, String vendor, String noticeUrl, String state, String 
		target, CardPaymentCallback callback)</a><br />
		<em>直接使用充值卡（用于自己设计支付面板的应用， 不使用 Appota SDK 的面板）</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentOneAmount">makeBankPayment(int amount, 
		String noticeUrl, String state, String target, String title, String 
		description)</a><em><br />
		</em>显示网络银行信用支付面板以及价格<br />
		</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentListAmount">makeBankPayment(int[] amounts, 
		String noticeUrl, String state, String target, String title, String 
		description)</a><br />
		显示网络银行信用支付面板以及价格表</td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeBankPaymentNoAmount">makeBankPayment(String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>显示网络银行信用支付面板，让用户自己输入要充值的数量</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentOneAmount">makePaypalPayment(double 
		amount, String noticeUrl, String state, String target, String title, 
		String description)</a><br />
		<em>显示支付宝（paypal)面板以及价格</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentNoUI">makePaypalPayment(String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>显示支付宝支付面板，让用户自己输入要充值的数量</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makePaypalPaymentListAmount">makePaypalPayment(double[] 
		amounts, String noticeUrl, String state, String target, String title, 
		String description)</a><br />
		<em>显示支付宝（paypal)面板以及价格表&nbsp; </em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeGooglePlayPaymentListItem">
		makeGooglePlayPayment(List&lt;InAppPurchaseItem&gt; items, String noticeUrl, 
		String state, String target, String title, String description)</a><br />
		<em>显示 Google Play Payment 面板以及IAP 道具表</em></td>
	</tr>
	<tr>
		<td style="width: 122px">void</td>
		<td><a href="#makeGooglePlayPaymentOneItem">
		makeGooglePlayPayment(InAppPurchaseItem item, String noticeUrl, String 
		state, String target, String title, String description)</a><br />
		<em>显示 Google Play Payment 面板以及IAP 道具</em></td>
	</tr>
</table>

<p>&nbsp;</p>
<hr/><strong><p class="method_detail">public void
<a name="setContext">setContext</a>(Activity context)</p></strong>
<p>输入context</p>
<p><strong>Parameters:</strong></p>
<p>- context: 显示支付面板的context</p>
<hr/><strong><p class="method_detail">public void
<a name="makeSMSPaymentOneAmount">makeSMSPayment</a>(int amount, String state, 
String target, String noticeUrl, String title, String description, final
<a href="TransactionStatusCallback.html">TransactionStatusCallback</a> callback)</p></strong>
<p>&nbsp;使用信用支付方式，价格已定</p>
<p><strong>Parameters:</strong></p>
<p>- amount: 价格<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- noticeUrl: 交易结束后的URL<br />
- title: 支付窗口标题<br />
- description: 支付的详细描述<br />
- callback: 交易结束后的callback <br />
</p>
<p>&nbsp;</p>
<hr/><strong><p class="method_detail">public void
<a name="makeSMSPaymentListAmount">makeSMSPayment</a>(int[] listAmount, String 
state, String target, String noticeUrl, String title, String description)</p></strong>
<p>&nbsp;显示短信支付面板以及价格表</p>
<p><strong>Parameters:</strong></p>
<p>- listAmount:价格表<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- noticeUrl: 交易结束后的URL<br />
- title: 支付的详细描述<br />
- description: 交易结束后的callback </p>
<hr/><strong><p class="method_detail">public void
<a name="makeSMSPaymentNoUI">makeSMSPayment</a>(int amount, String state, String 
target, String noticeUrl, <a href="SMSPaymentCallback.html">SMSPaymentCallback</a>
callback)</p></strong>
<p>取短信句法，价格已定 (<em>用于自己设计支付面板的应用， 不使用 Appota SDK 的面板</em>).</p>
<p><strong>Parameters:</strong></p>
<p>- amount: 价格<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- noticeUrl: 交易结束后的URL <br />
- callback: 交易结束后的callback </p>
<hr/><strong><p class="method_detail">public void <a name="makeCardPaymentUI">makeCardPayment</a>(String 
title, String description, String noticeUrl, String state, String target)</p></strong>
<p>显示充值卡支付面板，让用户输入卡号以及卡吗（serial number)</p>
<p><strong>Parameters:</strong></p>
<p>- title: 支付窗口标题<br />
- description: 支付详细描述<br />
- noticeUrl: 交易结束后的URL <br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target</p>
<hr/><strong><p class="method_detail">public void <a name="makeCardPaymentNoUI">
makeCardPayment</a>(String cardSerial, String cardCode, String vendor, String 
noticeUrl, String state, String target, <a href="CardPaymentCallback.html">
CardPaymentCallback</a> callback) throws <a href="AppotaPaymentException.html">
AppotaPaymentException</a></p></strong>
<p>&nbsp;使用充值卡支付方式，不显示Appota SDK 的面板，直接转到支付网关</p>
<p><strong>Parameters:</strong></p>
<p>- cardSerial: 卡吗<br />
- cardCode: 卡号<br />
- vendor: 电信供应商， 目前支持<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">vinaphone</span>: 
Vinaphone 卡<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">mobifone</span>:&nbsp; 
Mobifone 卡<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">viettel</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
Viettel 卡<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">fpt</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
FPT Gate 卡<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="auto-style2">mega</span>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
MegaCard 卡<br />
- noticeUrl: 交易结束后的URL<br />
- state: 开发商输入的 state<br />- target: 开发商输入的target<br />
- callback: 交易结束后的callback </p>
<hr/><strong><p class="method_detail">public void
<a name="makeBankPaymentOneAmount">makeBankPayment</a>(int amount, String 
noticeUrl, String state, String target, String title, String description)</p></strong>
<p>显示网络银行信用支付方式的面板</p>
<p><strong>Parameters:</strong></p>
<p>- amount: 价格<br />
- noticeUrl: 交易结束后的URL<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void
<a name="makeBankPaymentListAmount">makeBankPayment</a>(int[] amounts, String 
noticeUrl, String state, String target, String title, String description)</p></strong>
<p>显示网络银行信用支付面板以及价格表</p>
<p><strong>Parameters:</strong></p>
<p>- amounts: 价格表<br />
- noticeUrl: 交易结束后的URL<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void
<a name="makeBankPaymentNoAmount">makeBankPayment</a>(String noticeUrl, String 
state, String target, String title, String description)</p></strong>
<p>显示网络银行信用支付面板，让用户自己填入数量</p>
<p><strong>Parameters:</strong></p>
<p>- noticeUrl: 交易结束后的 Url<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void
<a name="makePaypalPaymentOneAmount">makePaypalPayment</a>(double amount, String 
noticeUrl, String state, String target, String title, String description)</p></strong>
<p>显示支付宝支付面板以及价格</p>
<p><strong>Parameters:</strong></p>
<p>- amount: 价格<br />
- noticeUrl: 交易结束后的 Url<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void <a name="makePaypalPaymentNoUI">
makePaypalPayment</a>(String noticeUrl, String state, String target, String 
title, String description)</p></strong>
<p>显示支付宝支付面板让用户填入数量</p>
<p><strong>Parameters:</strong></p>
<p>- noticeUrl: 交易结束后的URL <br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void
<a name="makePaypalPaymentListAmount">makePaypalPayment</a>(double[] amounts, 
String noticeUrl, String state, String target, String title, String description)</p></strong>
<p>显示支付宝支付面板以及价格表</p>
<p><strong>Parameters:</strong></p>
<p>- amount: 价格表<br />
- noticeUrl: 交易结束后的 Url<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<hr/><strong><p class="method_detail">public void
<a name="makeGooglePlayPaymentListItem">makeGooglePlayPayment</a>(List&lt;<a href="InAppPurchaseItem.html">InAppPurchaseItem</a>&gt; 
items, String noticeUrl, String state, String target, String title, String 
description)</p></strong>
<p>显示Google Play Payment 支付面板以及 IAP item表</p>
<p><strong>Parameters:</strong></p>
<p>- items: IAP items 表<br />
- noticeUrl: 交易结束后的 Url<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>

<hr/><strong><p>public void
<a name="makeGooglePlayPaymentOneItem">makeGooglePlayPayment</a>(<a href="InAppPurchaseItem.html">InAppPurchaseItem</a> 
item, String noticeUrl, String state, String target, String title, String 
description)</p></strong>
<p>显示Google Play Payment 支付面板以及一个IAP item</p>
<p><strong>Parameters:</strong></p>
<p>- items: IAP items <br />
- noticeUrl: 交易结束后的 Url<br />
- state: 开发商输入的 state<br />
- target: 开发商输入的target<br />
- title: 支付窗口的标题<br />
- description: 支付的详细描述</p>
<p>&nbsp;</p>