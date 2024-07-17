# Testing Automation Web Demoblaze


This project is a technical challenge with serenity BDD screenplay

The challenge was to automate 2 use cases:

## The first was:

Register a new user on the Product Store page.

![image](https://github.com/user-attachments/assets/d65835ce-2805-4be9-a9cc-faf0b73728f1)

## The second:

Make a purchase, adding products to the cart.

![image](https://github.com/user-attachments/assets/2d13d110-5711-47be-8764-496e983f8ee2)



## Tabla de Contenidos
- [Introduction](#Introduction)
- [Prerequisites to install the project](#Prerequisites-to-install-the-project)
- [How to run the tests locally](#How-to-run-the-tests-locally)

# Introduction

The project is about a shopping cart on a website called demoblaze, the serenity bdd testing framework was used with the screenplay design pattern, cucumber to document our tests applying BDD and gradle for our dependency manager

The url of the project that was automated was the following:


## URL:
https://www.demoblaze.com/



## Prerequisites to install the project


The project is developed in Java with Gradle so it will install the following software:


## JDK 17, download link:


https://download.oracle.com/java/17/archive/jdk-17_windows-x64_bin.zip


## Gradle:, download link:

https://gradle.org/


## Your favorite IDE, including :
Intellij IDEA: To run features or scenarios tests it will configure:


## How to run the tests locally?

To run the tests, enter your preferred ide, I highly recommend IntelliJ IDEA, go to your terminal and enter the following command:

./gradlew clean test
