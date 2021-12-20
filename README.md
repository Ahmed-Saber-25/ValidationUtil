# ValidationUtil

 ValidationUtil class used for validating different types of user inputs such as name , password , email , ksa & egyptian phone number , ip address , egyptian national id ,
 [cvv,master,visa,amex] valid numbers and types and ksa national id based on some regex .

## Usage

### isValidUserName(): Boolean
 this function returns aboolean value based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) for validating user name 
 
 
**Params**

* `userName` **{String}** mandatory input
* `minLength` **{Int}** mandatory input
* `maxLength` **{Int}** mandatory input
* `hasDot` **{Int}** optional input
* `hasUnderScore` **{Int}** optional input
* `hasSpecialCharacter` **{Int}** optional input
* `hasNumbers` **{Int}** optional input
* `hasCapitalLetters` **{Int}** optional input
* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidUserName("ahmed", 5, 7)
//=> true

ValidationUtil.isValidUserName("ahmed.", 5, 7, hasDot = ValidationUtil.RegexAdditionType.MANDATORY.value)
//=> true

ValidationUtil.isValidUserName("ahmed@", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.MANDATORY.value)
//=> true
```

### isValidUserPassword(): Boolean
 this function returns aboolean value based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) for validating user password 
 
 **Example**

```kt
 ValidationUtil.isValidUserPassword("ahmdK9._@", 5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value)//=> true

ValidationUtil.isValidUserPassword("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value)
//=> false
```
 
 ### isValidInput(): Boolean
 this function returns aboolean value based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) for building the required regex to match input string 
 
  ### getInputRegexString(): String
 this function returns astring value which is the required regex based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) 
 
  ### isValidUserEmail(): Boolean
 this function returns aboolean value which that illustrates the input email is valid or not based on used regex
 
  ### isValidKsaPhoneNumber(): Boolean
 this function returns aboolean value which that illustrates the input ksa phone number is valid or not based on used regex
 
  ### isValidEgPhoneNumber(): Boolean
 this function returns aboolean value which that illustrates the input egyptan phone number is valid or not based on used regex
 
   ### isValidIpAddress(): Boolean
 this function returns aboolean value which that illustrates the input ip address number is valid or not based on used regex
 
   ### isValidEgyptianNationalId(): Boolean
 this function returns aboolean value which that illustrates the input egyptian national id number is valid or not based on used regex
 
   ### isValidCvvNumber(): Boolean
 this function returns aboolean value which that illustrates the input cvv number of credit card is valid or not based on used regex
 
   ### isVisa(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid visa credit card number or not based on used regex
 
   ### isMaster(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid master credit card number or not based on used regex
 
   ### isAmex(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid american express credit card number or not based on used regex
 
 ### getCreditCardType(): CreditCardType
 this function returns enum value which that illustrates the type of credit card is VISA OR MASTER OR AMEX OR NOT_VALID type  based on used regex
 
### getKsaNationalIdType(): IdType
 this function returns enum value which that illustrates the type of ksa national id if it is SAUDI OR RESIDENT OR NOT_VALID type  based on used regex
 
  
 ### isKsaCitizen(): Boolean
 this function returns aboolean value which that illustrates the input  number of ksa national id is valid citizen number or not based on used regex
 
  ### isKsaResident(): Boolean
 this function returns aboolean value which that illustrates the input  number of ksa national id is valid resident number or not based on used regex
 
<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find ####ValidationUtilTest.kt
 which contains all valid and invalid test cases for every function

</details>
