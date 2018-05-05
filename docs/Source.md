
# Source

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of Source |  [optional]
**name** | **String** | Human readble name of Source |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Three-letter ISO code for the currency of this payment Source |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Nature of the source. Can be either of Card, Bank Account, Mobile Money |  [optional]
**issuer** | [**IssuerEnum**](#IssuerEnum) | Issuer that supports/issued this payment source. |  [optional]
**identifier** | **String** | Primary account number for source. For mobile money this will be a phone number and for banks an account number  |  [optional]
**address** | **String** | Unique Noory address for the payment source |  [optional]
**defaultSource** | **Boolean** | Marks a source as being default for a customer |  [optional]
**metadata** | **Object** | Used to store Arbitrary data |  [optional]
**active** | **Boolean** | Source is active |  [optional]
**deleted** | **Boolean** | Source record has been soft deleted |  [optional]
**created** | **String** | Date on which source was created |  [optional]
**modified** | **String** | Date on which source was modified |  [optional]


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



