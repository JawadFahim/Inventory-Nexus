# Inventory Nexus

Inventory Nexus is a java swing based gui application, intended to manage the basic aspects of a general inventory. This is one of our second year projects. 
## Some key stuffs:
- The whole project is based on mysql database system, so install [MySQL](https://dev.mysql.com/get/Downloads/MySQLInstaller/mysql-installer-community-8.0.35.0.msi)

    
- Used [twilio](https://www.twilio.com/en-us) api for text message service.

    go to [TwillioHandler](https://github.com/JawadFahim/Inventory-gui/blob/master/src/main/java/com/mycompany/inventory/TwilioHandler.java) class. See there are ACCOUNT_SID, AUTH_TOKEN , TWILIO_PHONE_NUMBER, toPhoneNumber variables. Try to learn how twilio api works on. Setup an account and put all the necessary account information.

    Initially, Admin Login has otp system, you can bypass it just type 1
    
## Installation

Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
pip install foobar
```

## Usage

```python
import foobar

# returns 'words'
foobar.pluralize('word')

# returns 'geese'
foobar.pluralize('goose')

# returns 'phenomenon'
foobar.singularize('phenomena')
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
