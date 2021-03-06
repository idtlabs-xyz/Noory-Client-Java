
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of Customer |  [optional]
**name** | **String** | Name of Customer |  [optional]
**externalID** | **String** | External ID of the customer. THis allows applications to associate their own ID with the customer record |  [optional]
**defaultCurrency** | [**DefaultCurrencyEnum**](#DefaultCurrencyEnum) | Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory |  [optional]
**email** | **String** | Email of the customer |  [optional]
**address** | **String** | Customer&#39;s address |  [optional]
**phone** | **String** | Phone Number of the customer |  [optional]
**sources** | [**List&lt;Source&gt;**](Source.md) |  |  [optional]
**locale** | **String** | Locale of the customer. Allows us to present content in the user&#39;s local language |  [optional]
**account** | [**Account**](Account.md) |  |  [optional]
**metadata** | **Object** | Used to store Arbitrary data |  [optional]
**active** | **Boolean** | Customer is active |  [optional]
**deleted** | **Boolean** | Customer record has been soft deleted |  [optional]
**created** | **String** | Date on which customer was created |  [optional]
**modified** | **String** | Date on which customer was modified |  [optional]


<a name="DefaultCurrencyEnum"></a>
## Enum: DefaultCurrencyEnum
Name | Value
---- | -----
SLL | &quot;SLL&quot;



