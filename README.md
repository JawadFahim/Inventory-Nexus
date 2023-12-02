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
    ```
- Used [twilio](https://www.twilio.com/en-us) api for text message service.

    go to [TwillioHandler](https://github.com/JawadFahim/Inventory-gui/blob/master/src/main/java/com/mycompany/inventory/TwilioHandler.java) class. See there are ACCOUNT_SID, AUTH_TOKEN , TWILIO_PHONE_NUMBER, toPhoneNumber variables. Try to learn how twilio api works on. Setup an account and put all the necessary account information.

    Initially, Admin Login has otp system, you can bypass it just type 1

    CheckInProducts and CheckOutProducts class has this line of code which controls if text message will be sent
    ```
    TwilioHandler.sendMessage(message);
    ```
    This is by default turned off, after you have finished setting up twilio, turn this on to intialize the text messaging service.

    
- The whole code is written using netbeans, the design and form can all be processed by netbeans so I would suggest you use that IDE. Vscode or any other will do fine too, but you can't customize the design. Install [Netbeans](https://netbeans.apache.org/front/main/download/nb20/). 

- Download this [Executable JAR](https://github.com/JawadFahim/Inventory-gui/blob/master/Inventory_Nexus.jar](https://github.com/JawadFahim/Inventory-Nexus/blob/master/Inventory_Nexus.jar) to directly start using the application. You don't need to manually run classes.


## Usage
Class description   
 
- UserTypeSelection- Selects user type (Admin/Worker)    
- UserLogin->UserHome : Performs Admin login and opens up admin home page
- WorkerLogin -> WorkerHome : Perfroms Worker Login and opens Worker Home page 

Actions:
```
Admin:
 - Create new product
 - Search products
 - View Statistics
```
```
Worker:
 - View products
 - Check In Products
 - Check out Products
```



## Project Screenshots
- Login page

    ![Login page](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Login%20page.png?raw=true)
- Admin Home page

    ![Admin home png](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Admin%20Home.png?raw=true)
- Worker Home page
    ![worker home png](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/Worker%20home.png?raw=true)
- Statistics
    ![Stat png](https://github.com/JawadFahim/Inventory-gui/blob/master/Screenshots/image.png?raw=true)


## Contribution
This project was made by [Me](https://github.com/JawadFahim) & 
[Ruponti Muin Nova](https://github.com/rupontinova).    
We didn't really plan to make a really big project. Ended up planning a lot of things, but actually could not implement many more things on the way. There are visible design flaws, with many bugs and so on, but hey, I guess not that bad for two noob 3rd semester students. 

