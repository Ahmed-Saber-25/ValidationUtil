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

ValidationUtil.isValidUserName("ahmed@", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.OPTIONAL.value)
//=> true
```

### isValidUserPassword(): Boolean
 this function returns aboolean value based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) for validating user password 
 
 **Params**

* `userPassword` **{String}** mandatory input
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
 ValidationUtil.isValidUserPassword("ahmdK9._@", 5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value)
            //=> true

ValidationUtil.isValidUserPassword("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value)
//=> false
```
 
 ### isValidInput(): Boolean
 this function returns aboolean value based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) for building the required regex to match input string 
 
  **Params**

* `inputString` **{String}** mandatory input
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
 ValidationUtil.isValidInput("ahmdK9._@", 5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value)
            //=> true

ValidationUtil.isValidInput("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value)
//=> false
```
  ### getInputRegexString(): String
 this function returns astring value which is the required regex based on passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY) 
 
   **Params**
* `minLength` **{Int}** mandatory input
* `maxLength` **{Int}** mandatory input
* `hasDot` **{Int}** optional input
* `hasUnderScore` **{Int}** optional input
* `hasSpecialCharacter` **{Int}** optional input
* `hasNumbers` **{Int}** optional input
* `hasCapitalLetters` **{Int}** optional input
* `returns` **{String}**
 **Example**

```kt
 ValidationUtil.getInputRegexString(5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value)
//=> ^(?=.*[a-z])(.*[A-Z]*?)(.*\d*?)(.*[.]*?)(.*[_]*?)(.*[-+!@#$%^&*,?]*?).{5,7}$

ValidationUtil.getInputRegexString(5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value)
//=> ^(?=.*[a-z])(?!.*[A-Z])(?!.*\d)(?!.*[.])(?!.*[_])(?!.*[-+!@#$%^&*,?]).{5,7}$
```
 
  ### isValidUserEmail(): Boolean
 this function returns aboolean value which that illustrates the input email is valid or not based on used regex
 
 **Params**

* `userEmail` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidUserEmail("ahmed8@test5.com")
//=> true
```
 
  ### isValidKsaPhoneNumber(): Boolean
 this function returns aboolean value which that illustrates the input ksa phone number is valid or not based on used regex
 
 **Params**

* `ksaPhoneNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidKsaPhoneNumber("+966544949955")
//=> true
```
 
  ### isValidEgPhoneNumber(): Boolean
 this function returns aboolean value which that illustrates the input egyptan phone number is valid or not based on used regex
 
  **Params**

* `egPhoneNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidEgPhoneNumber("01020713678")
//=> true
 ```
 
   ### isValidIpAddress(): Boolean
 this function returns aboolean value which that illustrates the input ip address number is valid or not based on used regex
 
 **Params**

* `ipAddress` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidIpAddress("192.168.1.1")
//=> true
 ```
 
   ### isValidEgyptianNationalId(): Boolean
 this function returns aboolean value which that illustrates the input egyptian national id number is valid or not based on used regex
 
 **Params**

* `egyptianNationalId` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidEgyptianNationalId("29305021900041")
//=> true
 ```
 
   ### isValidCvvNumber(): Boolean
 this function returns aboolean value which that illustrates the input cvv number of credit card is valid or not based on used regex
 
  **Params**

* `cvvNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isValidCvvNumber("123")
//=> true
 ```
 
   ### isVisa(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid visa credit card number or not based on used regex
 
 **Params**

* `creditNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isVisa("4111111111111111")
//=> true
 ```
 
   ### isMaster(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid master credit card number or not based on used regex
 
 **Params**

* `creditNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isMaster("5105105105105100")
//=> true
 ```
 
   ### isAmex(): Boolean
 this function returns aboolean value which that illustrates the input  number of credit card is valid american express credit card number or not based on used regex
 
  **Params**

* `creditNumber` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isAmex("371449635398431")
//=> true
 ```
 
 ### getCreditCardType(): CreditCardType
 this function returns enum value which that illustrates the type of credit card is VISA OR MASTER OR AMEX OR NOT_VALID type  based on used regex
 
  **Params**

* `creditNumber` **{String}** mandatory input

* `returns` **{CreditCardType}**

**Example**

```kt
ValidationUtil.getCreditCardType("4111111111111111")
//=> VISA
ValidationUtil.getCreditCardType("5105105105105100")
//=> MASTER
ValidationUtil.getCreditCardType("371449635398431")
//=> AMEX
ValidationUtil.getCreditCardType("1635788548")
//=> NOT_VALID
 ```
 
### getKsaNationalIdType(): IdType
 this function returns enum value which that illustrates the type of ksa national id if it is SAUDI OR RESIDENT OR NOT_VALID type  based on used regex
 
   **Params**

* `ksaNationalId` **{String}** mandatory input

* `returns` **{IdType}**

**Example**

```kt
ValidationUtil.getKsaNationalIdType("1635788548")
//=> SAUDI
ValidationUtil.getKsaNationalIdType("2827927043")
//=> RESIDENT
ValidationUtil.getCreditCardType("293050232190031")
//=> AMEX
ValidationUtil.getCreditCardType("1635788548")
//=> NOT_VALID
 ```
  
 ### isKsaCitizen(): Boolean
 this function returns aboolean value which that illustrates the input  number of ksa national id is valid citizen number or not based on used regex
 
  **Params**

* `ksaNationalId` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isKsaCitizen("1635788548")
//=> true
 ```
 
  ### isKsaResident(): Boolean
 this function returns aboolean value which that illustrates the input  number of ksa national id is valid resident number or not based on used regex
 
   **Params**

* `ksaNationalId` **{String}** mandatory input

* `returns` **{Boolean}**

**Example**

```kt
ValidationUtil.isKsaResident("2827927043")
//=> true
 ```
 
<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find [ValidationUtilTest.kt](ValidationUtilTest.kt)
 which contains all valid and invalid test cases for every function

</details>
