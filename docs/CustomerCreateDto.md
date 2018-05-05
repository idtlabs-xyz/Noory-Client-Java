
# CustomerCreateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of Customer | 
**externalID** | **String** | External ID of the customer. THis allows applications to associate their own ID with the customer record |  [optional]
**defaultCurrency** | [**DefaultCurrencyEnum**](#DefaultCurrencyEnum) | Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory |  [optional]
**email** | **String** | Email of the customer |  [optional]
**phone** | **String** | Phone Number of the customer |  [optional]
**address** | **String** | Customer&#39;s address |  [optional]
**locale** | **String** | Locale of the customer. Allows us to present content in the user&#39;s local language |  [optional]
**account** | **String** | Account ID that this customer record belongs to. Only admin can specify this |  [optional]
**autoSource** | **Boolean** | Automatically creates a source from the phone number of customer |  [optional]
**metadata** | **Object** | Used to store Arbitrary data |  [optional]


<a name="DefaultCurrencyEnum"></a>
## Enum: DefaultCurrencyEnum
Name | Value
---- | -----
SLL | &quot;SLL&quot;



