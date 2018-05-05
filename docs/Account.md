
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of Account |  [optional]
**name** | **String** | Display name of an account. Is expected to be unique across Noory and URL Safe so can not contain spaces or any other characters not suitable in URLS. This value is not only required but has to be lot less than 3 chars in length and not more than 10.  |  [optional]
**businessName** | **String** | The publicly visible, human readable name of the business running this account. |  [optional]
**businessEmail** | **String** | Business Email address. |  [optional]
**businessPhone** | **String** | Business phone number. |  [optional]
**businessAddress** | **String** | Business Address |  [optional]
**businessUrl** | **String** | Website of the business running the account if available |  [optional]
**businessLogo** | **String** | Base64 encoded logo of the business if available |  [optional]
**country** | [**CountryEnum**](#CountryEnum) | Two letter ISO country code of the country that the account is allowed to operate in e.g SL. |  [optional]
**defaultCurrency** | [**DefaultCurrencyEnum**](#DefaultCurrencyEnum) | Three-letter ISO code for the default currency to associate with this Account. If charges or payments requests are created and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory |  [optional]
**sources** | [**List&lt;Source&gt;**](Source.md) | Payment sources, banks/mobile money, associated with this account. Used to push payouts to account. |  [optional]
**timezone** | **String** | Timezone associated with account. |  [optional]
**hookEndpoint** | **String** | Endpoint to which to send event notifications.  Depending on the value of hookDeliveryMediumcan be either a valid phone identifier, https url, or email address  |  [optional]
**hookEndpointSecret** | **String** | Authorization token included as the Authorization Header if delivery medium is URL |  [optional]
**hookDeliveryMedium** | [**HookDeliveryMediumEnum**](#HookDeliveryMediumEnum) | Medium via which events are sent to account |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Event types that user wishes to be notified of. For a list of valid values call GET /events/types  |  [optional]
**verification** | [**AccountVerification**](AccountVerification.md) |  |  [optional]
**locale** | **String** | Locale for the account, important for providing information in the local language of the account. |  [optional]
**payoutSchedule** | [**PayoutSchedule**](PayoutSchedule.md) |  |  [optional]
**metadata** | **Object** | Used to store Arbitrary data |  [optional]
**active** | **Boolean** | Account is active |  [optional]
**deleted** | **Boolean** | Account record has been soft deleted |  [optional]
**created** | **String** | Date on which account was created |  [optional]
**modified** | **String** | Date on which account was modified |  [optional]


<a name="CountryEnum"></a>
## Enum: CountryEnum
Name | Value
---- | -----
SL | &quot;SL&quot;


<a name="DefaultCurrencyEnum"></a>
## Enum: DefaultCurrencyEnum
Name | Value
---- | -----
SLL | &quot;SLL&quot;


<a name="HookDeliveryMediumEnum"></a>
## Enum: HookDeliveryMediumEnum
Name | Value
---- | -----
SMS | &quot;sms&quot;
WEBHOOK | &quot;webhook&quot;
EMAIL | &quot;email&quot;


<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
TRANSACTION_RECEIVED | &quot;transaction.received&quot;
CHARGE_SUCCEEDED | &quot;charge.succeeded&quot;
CHARGE_SUCCEEDED_PARTIAL | &quot;charge.succeeded.partial&quot;
CHARGE_FAILED | &quot;charge.failed&quot;
CHARGE_CANCELED | &quot;charge.canceled&quot;
CHARGE_CREATED | &quot;charge.created&quot;
CHARGE_REQUEUE | &quot;charge.requeue&quot;
CHARGE_REQUESTED | &quot;charge.requested&quot;
CHARGE_REFUNDED | &quot;charge.refunded&quot;
CUSTOMER_CREATED | &quot;customer.created&quot;
CUSTOMER_DELETED | &quot;customer.deleted&quot;
CUSTOMER_UPDATED | &quot;customer.updated&quot;
CUSTOMER_SUBSCRIPTION_CREATED | &quot;customer.subscription.created&quot;
CUSTOMER_SUBSCRIPTION_DELETED | &quot;customer.subscription.deleted&quot;
CUSTOMER_SUBSCRIPTION_CHARGED | &quot;customer.subscription.charged&quot;
CUSTOMER_SUBSCRIPTION_UPDATED | &quot;customer.subscription.updated&quot;
CUSTOMER_SUBSCRIPTION_ENDED | &quot;customer.subscription.ended&quot;
PAYOUT_CANCELED | &quot;payout.canceled&quot;
PAYOUT_CREATED | &quot;payout.created&quot;
PAYOUT_FAILED | &quot;payout.failed&quot;
PAYOUT_PAID | &quot;payout.paid&quot;
PAYMENT_UPDATED | &quot;payment.updated&quot;
PAYMENT_CANCELED | &quot;payment.canceled&quot;
PAYMENT_CREATED | &quot;payment.created&quot;
PAYMENT_FAILED | &quot;payment.failed&quot;
PAYMENT_SUCCEEDED | &quot;payment.succeeded&quot;
ACCOUNT_CASHIN | &quot;account.cashin&quot;
ACCOUNT_CASHOUT | &quot;account.cashout&quot;
ACCOUNT_DEACTIVATED | &quot;account.deactivated&quot;
ACCOUNT_ACTIVATED | &quot;account.activated&quot;



