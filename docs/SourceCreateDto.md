
# SourceCreateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Human readble name of Source | 
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Three-letter ISO code for the currency of this payment Source |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Nature of the source. Can be either of Card, Bank Account, Mobile Money | 
**issuer** | [**IssuerEnum**](#IssuerEnum) | Issuer that supports/issued this payment source. | 
**identifier** | **String** | Primary account number for source. For mobile money this will be a phone number and for banks an account number  | 
**metadata** | **Object** | Used to store Arbitrary data |  [optional]


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
SLL | &quot;SLL&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CARD | &quot;card&quot;
NOORY | &quot;noory&quot;
BANK_ACCOUNT | &quot;bank_account&quot;
MOBILE_MONEY | &quot;mobile_money&quot;


<a name="IssuerEnum"></a>
## Enum: IssuerEnum
Name | Value
---- | -----
AFRIMONEY | &quot;afrimoney&quot;
ORANGEMONEY | &quot;orangeMoney&quot;
NOORY | &quot;noory&quot;



