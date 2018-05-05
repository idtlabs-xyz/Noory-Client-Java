
# PayoutSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | [**Schedule**](Schedule.md) |  |  [optional]
**monthlyAnchor** | **Integer** | The day of the month funds will be paid out. Only if interval is monthly. Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.  |  [optional]
**weeklyAnchor** | **Integer** | The day of the week funds will be paid out, of the style  1 for ‘monday’,  2 ‘tuesday’, etc. Only shown if interval is weekly.  |  [optional]
**source** | [**Source**](Source.md) |  |  [optional]



