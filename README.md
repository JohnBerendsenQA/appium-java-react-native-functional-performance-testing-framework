# Appium React Native test framework
Project meant for e2e testing of IOS and Android apps. On Android perforance tests can be executed.

The project runs via Maven 3.3.1 of hoger en JDK 1.8.

You can build an apk or app file from this project [https://github.com/JohnBerendsenQA/johnberendsenApp](https://github.com/JohnBerendsenQA/johnberendsenApp)

To run the test on a local simulator the following needs to be done:

###Appium
* Install appium [http://appium.io/getting-started.html](http://appium.io/getting-started.html)
* Add an AVD in AVD manager where the props are the same as an an device in resources/deviceprops/
* Add an Simulator in XCode where the props are the same as an an device in resources/deviceprops/

###Systeem variables
To be able to run locally or in the browserstack cloud you make use of the following variables:

* deviceName
* buildNr
* spring.profiles.active

Buildnr is used to collect the correct app in browserstack and as part of filenames when the performance test is run. 

For uploading to browserstack see: "browserstack upload"

The testlocation property can be provided with a maven profile

The testlocations (profiles) possibilities:

* cloud
* local

The deviceName can be provided as a systeemvariable on the command line. To run locally against a simulator/emulator a deviceprops file can be added. E.g. see:
* properties/deviceprops/Nexus_5X_API_26.properties
* properties/deviceprops/Pixel_API_23.properties

For browserstack examples see:
* bs_pixel8
* bs_iPhoneX

###Maven profile
By spring profile the platform can given:
* android 
* ios

###Cucumber tags
Use cucumber tags to select which tests to run.

* -Dcucumber.options="--tags @nieuws --tags @smoke"

More info:
[https://github.com/cucumber/cucumber/wiki/Tags](https://github.com/cucumber/cucumber/wiki/Tags)

###Mvn comando
Use the following commmand to run the smoketests locally on a nexus 5 emulator
```
mvn clean verify -Plocal -Dspring.profiles.active=android -DdeviceName=nexu5emu -Dcucumber.options="--tags @nieuws --tags @smoke" -DbuildNr=2255
```

###Performance 
build and/or replace the file" src/test/resources/app-debug.apk" in de map /resources/. Connect the device from performance-test-device.properties and run the following command for buildnumr 1234:
```
mvn clean verify -Pperformance -DbuildNr=1234
```
  
###browserstack upload
See [http://browserstack.com](http://browserstack.com)
