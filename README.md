# Inventory Nexus

Inventory Nexus is a java swing based gui application, intended to manage the basic aspects of a general inventory. This is one of our second year projects. 
## Key stuffs to setup:
- The whole project is based on mysql database system, so install [MySQL](https://dev.mysql.com/get/Downloads/MySQLInstaller/mysql-installer-community-8.0.35.0.msi)

    download the [Inventory.sql](https://github.com/JawadFahim/Inventory-gui/blob/master/Inventory.sql) file. Import the file using mysql workbench or use this code 
    ```
    mysql -u username -p
    CREATE DATABASE Inventory;
    USE Inventory;
    SOURCE /path/to/file.sql
- Used [twilio](https://www.twilio.com/en-us) api for text message service.

    go to [TwillioHandler](https://github.com/JawadFahim/Inventory-gui/blob/master/src/main/java/com/mycompany/inventory/TwilioHandler.java) class. See there are ACCOUNT_SID, AUTH_TOKEN , TWILIO_PHONE_NUMBER, toPhoneNumber variables. Try to learn how twilio api works on. Setup an account and put all the necessary account information.

    Initially, Admin Login has otp system, you can bypass it just type 1

    CheckInProducts and CheckOutProducts class has this line of code which controls if text message will be sent
    ```
    TwilioHandler.sendMessage(message);
    ```
    This is by default turned off, after you have finished setting up twilio, turn this on to intialize the text messaging service.

    
- The whole code is written using netbeans, the design and form can all be processed by netbeans so I would suggest you use that IDE. Vscode or any other will do fine too, but you can't customize the design. Install [Netbeans](https://netbeans.apache.org/front/main/download/nb20/).  
## Package download

You can download the exe file from here [pip](https://pip.pypa.io/en/stable/) to install foobar.

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

## Project Screenshots
- Login page
![Login page](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Login%20page.png?raw=true)
- Admin Home page
![Admin home png](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Admin%20Home.png?raw=true)
- Worker Home page
![worker home png](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Worker%20home.png?raw=true)
