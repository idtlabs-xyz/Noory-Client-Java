
# AccountVerification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabledReason** | [**DisabledReasonEnum**](#DisabledReasonEnum) | Reason that account is disabled or will be disabled | 
**dueBy** | [**LocalDate**](LocalDate.md) | If this date is in the future, fields_needed must be provided to ensure the account remains in good standing |  [optional]
**fieldsNeeded** | [****](.md) | Field names that need to be provided for the account to remain in good standing |  [optional]


<a name="DisabledReasonEnum"></a>
## Enum: DisabledReasonEnum
Name | Value
---- | -----
REJECTED_FRAUD | &quot;rejected_fraud&quot;
REJECTED_TERMS_OF_SERVICE | &quot;rejected_terms_of_service&quot;
REJECTED_LISTED | &quot;rejected_listed&quot;
UNDER_REVIEW | &quot;under_review&quot;
REJECTED_OTHER | &quot;rejected_other&quot;
FIELDS_NEEDED | &quot;fields_needed&quot;
LISTED | &quot;listed&quot;
OTHER | &quot;other&quot;



