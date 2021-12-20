# ValidationUtil

 ValidationUtil class used for validating different types of user inputs such as name , password , email , ksa & egyptian phone number , ip address , egyptian national id ,
 [cvv,master,visa,amex] valid numbers and types and ksa national id based on some regex .

## Usage

### isValidUserName(): Boolean
 this function returns aboolean value based on passed values of passed parameters which works as constrains like minLength,maxLength,[hasDot,hasUnderScore,hasSpecialCharacter,hasNumbers,hasCapitalLetters] which have three enum types (NON or OPTIONAL or MANDATORY)
